package com.sp.papago.interceptor;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class SessionInterceptor extends HandlerInterceptorAdapter{

	
	private ObjectMapper om = new ObjectMapper();
	public boolean preHandle(HttpServletRequest req,HttpServletResponse res,Object hanlder) throws IOException {
		String uri =req.getRequestURI();
		
		log.info("url=>{}",uri);
		System.out.println(uri);
		HttpSession hs =req.getSession();
		System.out.println(hs);
		if(hs.getAttribute("ui")==null) 
		//UserServiceImpl.java 에서hs.setAttribute 를 받아 오는 hs.getAttribute
		{
			String isAjax =req.getHeader("x-ajax");
			if(isAjax!=null) 
				//ajax header가 null 이 아니면
			{
				Map<String,String> map = new HashMap<>();
				map.put("msg", "로그인 안됨");
				res.setContentType("application/json;charset=utf-8");
				PrintWriter pw = res.getWriter();
				pw.write(om.writeValueAsString(map));
				return false;
			}
			//ajax header 가null 이면
			res.sendRedirect("/views/error/session-error");;
			return false;
		}
		return true;
	}
}
