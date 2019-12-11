package com.sp.papago.service.impl;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.remoting.support.RemoteInvocationResult;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sp.papago.dao.impl.PapagoInfoDAOImpl;
import com.sp.papago.service.PapagoService;
import com.sp.papago.test.PapagoTest;
import com.sp.papago.vo.Message;
import com.sp.papago.vo.PapagoInfoVO;
import com.sp.papago.vo.Result;
import com.sp.papago.vo.TransVO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PapagoServiceImpl implements PapagoService {
	
	@Resource
	PapagoInfoDAOImpl pidao;
	
	@Value("${client.id}")
	private String id;
	@Value("${client.secret}")
	private String secret;
	@Value("${client.api.url}")
	private String apiUrl;
	
	//@표시 무시하는 거 map 에서 무시해라
	private ObjectMapper om =
			new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	
	@Override
	public Message doTranslate(TransVO tvo) {
		//DB에서 값을 찾아서 
			try {
				PapagoInfoVO pi = new PapagoInfoVO();
				pi.setPiSource(tvo.getSource());
				pi.setPiTarget(tvo.getTarget());
				pi.setPiText(tvo.getText());
				pi =pidao.selectPapagoInfo(pi);
				if(pi!=null) {
					Result r = new Result();
					r.setSrcLangType(pi.getPiSource());
					r.setTarLangType(pi.getPiTarget());
					r.setTranslatedText(pi.getPiResult());
					Message m = new Message();
					m.setResult(r);
					pidao.updatePapagoInfoForCnt(pi);
					return m;
				}
					
						
				String text = URLEncoder.encode(tvo.getText(), "UTF-8");
				URL url = new URL(apiUrl);
				HttpURLConnection hc =(HttpURLConnection) url.openConnection();
				//여기서 연결이 일어나는 부분 
				hc.setRequestMethod("POST");
				hc.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
				hc.setRequestProperty("X-Naver-Client-Id", id);
				hc.setRequestProperty("X-Naver-Client-Secret", secret);
				
				String param ="source=" +tvo.getSource() +"&target="+ tvo.getTarget() +"&text=" + text;
	
				hc.setDoOutput(true); 
				
				DataOutputStream dos = new DataOutputStream(hc.getOutputStream());
				dos.writeBytes(param);
				dos.flush();
				dos.close();
				
				int status = hc.getResponseCode();
				/*if(status!=200) {
					System.out.println("에러남!!");
					return;
				}*/
				InputStreamReader isr = new InputStreamReader(hc.getInputStream());
				BufferedReader br = new BufferedReader(isr);
				StringBuffer res = new StringBuffer();
				String str = null;
				while((str=br.readLine())!=null) {
					res.append(str);
				}
				br.close();
				
				
				TransVO resultTvo = om.readValue(res.toString(), TransVO.class);
				log.info(res.toString());
				log.info("tvo=>{}",resultTvo);
				
				
				Result r =resultTvo.getMessage().getResult();
				pi= new PapagoInfoVO();
				pi.setPiSource(r.getSrcLangType());
				pi.setPiTarget(r.getTarLangType());
				pi.setPiResult(r.getTranslatedText());
				pi.setPiText(tvo.getText());
				pidao.insertPapagoInfo(pi);
				
				return resultTvo.getMessage();
				
				//System.out.println(res);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//url 이 잘못되면 여기로 에러가 떨어짐
			} catch (Exception e) {
				// TODO: handle exception
				//연결이 잘못되면 여기로 에러가 떨어질것이다.
				e.printStackTrace();
			}
		return null;
	}

}
