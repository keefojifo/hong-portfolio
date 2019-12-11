package com.sp.papago.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.sp.papago.dao.UserDAO;
import com.sp.papago.vo.PapagoInfoVO;
import com.sp.papago.vo.UserInfoVO;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class UserDAOImpl implements UserDAO {

	@Resource
	private SqlSessionFactory ssf;

	@Override
	public UserInfoVO doLogin(UserInfoVO ui) {
	
		SqlSession ss =ssf.openSession(false);
		
		try {
			return ss.selectOne("com.sp.papago.UserInfoMapper.doLogin", ui);

		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			ss.close();
		}
		log.info("ss=>{}",ss);
		return null;
	}
}
