package cn.jylink.bi.model;

import java.math.BigDecimal;
import java.util.List;

public class StandardModelResultViewModel {	
	private String orgCode;
	private String date;
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
	private List<StandardModelResultDetailViewModel> model;
	public String getOrgCode() {
		return orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
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
	public List<StandardModelResultDetailViewModel> getModel() {
		return model;
	}
	public void setModel(List<StandardModelResultDetailViewModel> model) {
		this.model = model;
	}	
	
}
