/*
 * package com.sp.papago;
 * 
 * import static org.junit.Assert.*;
 * 
 * import javax.annotation.Resource;
 * 
 * import org.junit.Test; import org.junit.runner.RunWith; import
 * org.springframework.test.context.ContextConfiguration; import
 * org.springframework.test.context.junit4.SpringJUnit4ClassRunner; import
 * org.springframework.util.Assert;
 * 
 * import com.sp.papago.dao.UserDAO; import com.sp.papago.vo.UserInfoVO;
 * 
 * @RunWith(SpringJUnit4ClassRunner.class)
 * 
 * @ContextConfiguration(locations = { "classpath:/root-context.xml" } )
 * 
 * 
 * public class UserDAOTest {
 * 
 * @Resource private UserDAO udao;
 * 
 * 
 * @Test public void test() { UserInfoVO ui = new UserInfoVO();
 * ui.setUiId("용수용수"); ui.setUiPwd("용수용수"); ui = udao.doLogin(ui);
 * Assert.isNull(ui,"로그인이 되지 않았군 "); }
 * 
 * }
 */