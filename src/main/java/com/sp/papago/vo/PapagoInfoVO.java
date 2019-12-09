package com.sp.papago.vo;

import lombok.Data;


public class PapagoInfoVO {

	private Integer piNum;
	private String piSource;
	private String piTarget;
	private String piText;
	private String piResult;
	private Integer piCnt;
	
	
	public Integer getPiNum() {
		return piNum;
	}
	public void setPiNum(Integer piNum) {
		this.piNum = piNum;
	}
	public String getPiSource() {
		return piSource;
	}
	public void setPiSource(String piSource) {
		this.piSource = piSource;
	}
	public String getPiTarget() {
		return piTarget;
	}
	public void setPiTarget(String piTarget) {
		this.piTarget = piTarget;
	}
	public String getPiText() {
		return piText;
	}
	public void setPiText(String piText) {
		this.piText = piText;
	}
	public String getPiResult() {
		return piResult;
	}
	public void setPiResult(String piResult) {
		this.piResult = piResult;
	}
	public Integer getPiCnt() {
		return piCnt;
	}
	public void setPiCnt(Integer piCnt) {
		this.piCnt = piCnt;
	}
	@Override
	public String toString() {
		return "PapagoInfoVO [piNum=" + piNum + ", piSource=" + piSource + ", piTarget=" + piTarget + ", piText="
				+ piText + ", piResult=" + piResult + ", piCnt=" + piCnt + "]";
	}
}
