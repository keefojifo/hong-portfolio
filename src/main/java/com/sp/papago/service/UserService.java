package com.sp.papago.service;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.sp.papago.vo.UserInfoVO;

@Service
public interface UserService {
	
	public Map<String,Object> doLogin(UserInfoVO ui ,HttpSession hs);
}
