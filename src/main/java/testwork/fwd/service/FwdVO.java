package testwork.fwd.service;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class FwdVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9003525570910231754L;
	
	
	private int reqParam;
	
	public int getReqParam() {
		return reqParam;
	}
	
	public void setReqParam(int reqParam) {
		this.reqParam = reqParam;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
