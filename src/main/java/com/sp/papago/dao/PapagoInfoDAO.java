package com.sp.papago.dao;

import java.util.List;

import com.sp.papago.vo.PapagoInfoVO;

public interface PapagoInfoDAO {

	public List<PapagoInfoVO> getPapagoList(PapagoInfoVO tvo);
	public PapagoInfoVO selectPapagoInfo(PapagoInfoVO tvo);
	public int insertPapagoInfo(PapagoInfoVO tvo);
	public int updatePapagoInfoForCnt(PapagoInfoVO tvo);
}
