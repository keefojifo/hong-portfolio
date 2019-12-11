package com.sp.papago.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.sp.papago.dao.UserDAO;
import com.sp.papago.service.UserService;
import com.sp.papago.vo.UserInfoVO;

@Service
public class UserServiceImpl implements UserService {


	@Resource
	private UserDAO udao;
	
	@Override
	public Map<String, Object> doLogin(UserInfoVO ui ,HttpSession hs) {
		ui = udao.doLogin(ui);
		Map<String,Object> rMap = new HashMap<>();
		if(ui==null) {
			rMap.put("msg","아이디나 비밀번호를 입력해 주세요");
			
		}else {
			rMap.put("msg", "로그인성공");
			rMap.put("ui", ui);
			hs.setAttribute("ui", ui);
		}
			
		return rMap;
	}

}
