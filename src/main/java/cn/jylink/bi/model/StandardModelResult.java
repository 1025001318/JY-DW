package cn.jylink.bi.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;

public class StandardModelResult {
	private BigInteger uuid;	
	private String orgCode;
	private Date date;
	private String taskId;
	private String modelVersion;
	private String taskType;
	private String belongCode;
	private String modelCode;
	private String modelAlgorithm;
	private BigDecimal assessScore;
	private String assessGrade;
	private String topTaskId;
	private String resultType;
	private Integer patrolType;
	private List<StandardModelResultDetail> Details;
	public BigInteger getUuid() {
		return uuid;
	}
	public List<StandardModelResultDetail> getDetails() {
		return Details;
	}
	public void setDetails(List<StandardModelResultDetail> details) {
		Details = details;
	}
	public void setUuid(BigInteger uuid) {
		this.uuid = uuid;
	}
	public String getOrgCode() {
		return orgCode;
	}
	public Integer getPatrolType() {
		return patrolType;
	}
	public void setPatrolType(Integer patrolType) {
		this.patrolType = patrolType;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getModelVersion() {
		return modelVersion;
	}
	public void setModelVersion(String modelVersion) {
		this.modelVersion = modelVersion;
	}
	public String getTaskType() {
		return taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
	public String getBelongCode() {
		return belongCode;
	}
	public void setBelongCode(String belongCode) {
		this.belongCode = belongCode;
	}
	public String getModelCode() {
		return modelCode;
	}
	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}
	public String getModelAlgorithm() {
		return modelAlgorithm;
	}
	public void setModelAlgorithm(String modelAlgorithm) {
		this.modelAlgorithm = modelAlgorithm;
	}
	public BigDecimal getAssessScore() {
		return assessScore;
	}
	public void setAssessScore(BigDecimal assessScore) {
		this.assessScore = assessScore;
	}
	public String getAssessGrade() {
		return assessGrade;
	}
	public void setAssessGrade(String assessGrade) {
		this.assessGrade = assessGrade;
	}
	public String getTopTaskId() {
		return topTaskId;
	}
	public void setTopTaskId(String topTaskId) {
		this.topTaskId = topTaskId;
	}
	public String getResultType() {
		return resultType;
	}
	public void setResultType(String resultType) {
		this.resultType = resultType;
	}
	
	
}
