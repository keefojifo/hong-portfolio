package com.sp.papago.controller;

import java.util.List;


import javax.annotation.Resource;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;


import com.sp.papago.dao.impl.PapagoInfoDAOImpl;

import com.sp.papago.vo.PapagoInfoVO;


import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class PapagoController {
	
	@Resource
	private PapagoInfoDAOImpl pidao;

	@GetMapping("/papago")
	public List<PapagoInfoVO> getpapagoInfos(PapagoInfoVO papago) {
		log.info("controller papago=>{}",papago);
		return pidao.getPapagoList(null);
	}
	
	
}
