package com.sp.papago.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.sp.papago.dao.impl.PapagoInfoDAOImpl;
import com.sp.papago.service.UserService;
import com.sp.papago.service.impl.PapagoServiceImpl;
import com.sp.papago.vo.Message;
import com.sp.papago.vo.PapagoInfoVO;
import com.sp.papago.vo.TransVO;
import com.sp.papago.vo.UserInfoVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class PapagoController {
	
	@Resource
	private PapagoInfoDAOImpl pidao;
	
	@Resource
	private PapagoServiceImpl ps;

	@GetMapping("/papago")
	public List<PapagoInfoVO> getpapagoInfos(PapagoInfoVO papago) {
		log.info("controller papago=>{}",papago);
		return pidao.getPapagoList(null);
	}
	
	@PostMapping("/papago")
	public Message doTranslate(TransVO tvo) {
		
		return ps.doTranslate(tvo);
	}

	
}
