package cn.jylink.bi.model.dto;

public class ResultViewModel {
	private Integer ErrorCode;
	private String ErrorMsg;
	private Object Data;
	public ResultViewModel(Integer errorCode,String errowMsg){
		this.ErrorCode=errorCode;
		this.ErrorMsg=errowMsg;
	}
	public ResultViewModel(Integer errorCode,String errowMsg,Object data){
		this.ErrorCode=errorCode;
		this.ErrorMsg=errowMsg;
		this.Data=data;
	}
	public Integer getErrorCode() {
		return ErrorCode;
	}
	public void setErrorCode(Integer errorCode) {
		ErrorCode = errorCode;
	}
	public String getErrorMsg() {
		return ErrorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		ErrorMsg = errorMsg;
	}
	public Object getData() {
		return Data;
	}
	public void setData(Object data) {
		Data = data;
	}
	
}
