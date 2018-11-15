package cn.jylink.bi.model;

import java.sql.Timestamp;

public class InitialValue {
	private String orgCode;
	private Timestamp date;
	private String standardCode;
	private String standardValue;
	private String standardName;
	public InitialValue(){
		
	}
	public InitialValue(String standardCode){
		this.standardCode=standardCode;
	}
	public InitialValue(String standardCode,String standardName){
		this.standardCode=standardCode;
		this.standardName=standardName;
	}
	public InitialValue(String standardCode,String standardName,String standardValue){
		this.standardCode=standardCode;
		this.standardName=standardName;
		this.standardValue=standardValue;
	}
	public String getStandardName() {
		return standardName;
	}
	public void setStandardName(String standardName) {
		this.standardName = standardName;
	}
	public String getOrgCode() {
		return orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public String getStandardCode() {
		return standardCode;
	}
	public void setStandardCode(String standardCode) {
		this.standardCode = standardCode;
	}
	public String getStandardValue() {
		return standardValue;
	}
	public void setStandardValue(String standardValue) {
		this.standardValue = standardValue;
	}
	
	
}
