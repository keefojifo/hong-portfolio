package com.sp.papago.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sp.papago.dao.PapagoInfoDAO;
import com.sp.papago.vo.PapagoInfoVO;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class PapagoInfoDAOImpl implements PapagoInfoDAO {
	
	@Resource
	private SqlSessionFactory ssf;
	

	
	public List<PapagoInfoVO> getPapagoList(@RequestBody PapagoInfoVO tvo) {
		SqlSession ss =ssf.openSession(false);
		log.info("ss=>{}",ss);
		log.info("papago=>{}",tvo);
		try {
			 List<PapagoInfoVO> rs = ss.selectList("com.sp.papago.papagoInfoMapper.selectPapagoInfoList");
			log.info("rs={}",rs);
			return rs;
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			ss.close();
		}
		return null;

	}
	@Override
	public PapagoInfoVO selectPapagoInfo(PapagoInfoVO tvo) {
		SqlSession ss =ssf.openSession(false);
		//auto commit 을 하지못하도록 false를 넣는다 .
		
		try {
			return ss.selectOne("com.sp.papago.papagoInfoMapper.selectPapagoInfo", tvo);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			ss.close();
		}
		return null;
	}
	
	@Override
	public int insertPapagoInfo(PapagoInfoVO tvo) {
SqlSession ss =ssf.openSession();
		
		try {
			return ss.insert("com.sp.papago.papagoInfoMapper.insertPapagoInfo",tvo);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			ss.commit();
			ss.close();
		}
		return 0;
	}
	@Override
	public int updatePapagoInfoForCnt(PapagoInfoVO tvo) {
SqlSession ss =ssf.openSession();
		
		try {
			return ss.update("com.sp.papago.papagoInfoMapper.updatePapagoInfoForCnt",tvo);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			ss.commit();
			ss.close();
		}
		return 0;
	}
	
}


	