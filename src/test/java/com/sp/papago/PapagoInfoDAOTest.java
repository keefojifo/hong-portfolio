/*
 * package com.sp.papago;
 * 
 * import static org.junit.Assert.*;
 * 
 * import java.util.List;
 * 
 * import javax.annotation.Resource;
 * 
 * import org.junit.Test; import org.junit.runner.RunWith; import
 * org.springframework.test.context.ContextConfiguration; import
 * org.springframework.test.context.junit4.SpringJUnit4ClassRunner; import
 * org.springframework.util.Assert;
 * 
 * import com.sp.papago.dao.PapagoInfoDAO; import com.sp.papago.vo.PapagoInfoVO;
 * 
 * 
 * @RunWith(SpringJUnit4ClassRunner.class)
 * 
 * @ContextConfiguration(locations = {
 * "file:src/main/webapp/WEB-INF/spring/root-context.xml" } ) public class
 * PapagoInfoDAOTest { //test할것을 앞에다가 적고 뒤에 test를 적는 것이 규칙이다.
 * 
 * 
 * @Resource private PapagoInfoDAO pidao;
 * 
 * @Test public void test() { //Assert.is Assert.notNull(pidao,"그럼 그렇치 ");
 * //Assert.isNull(pidao,"null 에러"); List<PapagoInfoVO> piList =
 * pidao.getPapagoList(null); //Assert.isTrue(piList.size()!=1,"사이지가 1일리가 없지");
 * Assert.isTrue(piList.size()==2, "  주석 아맞아 목록이 2개 였지");
 * 
 * PapagoInfoVO papagoview = pidao.selectPapagoInfo(null); //
 * Assert.isTrue(papagoview.setPiCnt(1) == 1,"selectone 은 하나이지");
 * 
 * //PapagoInfoVO selectPapagoInfo(PapagoInfoVO tvo);
 * 
 * // int insertPapagoInfo(PapagoInfoVO tvo);
 * 
 * 
 * }
 * 
 * }
 */