package com.sp.papago.service;

import com.sp.papago.vo.Message;
import com.sp.papago.vo.TransVO;

public interface PapagoService {

	public Message doTranslate(TransVO tvo);
}
