package com.sp.papago.dao;

import com.sp.papago.vo.UserInfoVO;

public interface UserDAO {

	public UserInfoVO doLogin(UserInfoVO ui);
}
