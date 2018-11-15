package cn.jylink.bi.model;

import java.math.BigDecimal;
import java.util.List;

public class StandardModelResultDetailViewModel {
	private String standardCode;
	private String standardValue;
	private BigDecimal piecewiseValue;
	private BigDecimal proportion;
	private Integer standardLevel;
	private String standardParentCode;
	private BigDecimal assessScore;
	private String assessGrade;
	private String standardName;
	private List<StandardModelResultDetailViewModel> childmodel;
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
	public BigDecimal getPiecewiseValue() {
		return piecewiseValue;
	}
	public void setPiecewiseValue(BigDecimal piecewiseValue) {
		this.piecewiseValue = piecewiseValue;
	}
	public BigDecimal getProportion() {
		return proportion;
	}
	public void setProportion(BigDecimal proportion) {
		this.proportion = proportion;
	}
	public Integer getStandardLevel() {
		return standardLevel;
	}
	public void setStandardLevel(Integer standardLevel) {
		this.standardLevel = standardLevel;
	}
	public String getStandardParentCode() {
		return standardParentCode;
	}
	public void setStandardParentCode(String standardParentCode) {
		this.standardParentCode = standardParentCode;
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
	public String getStandardName() {
		return standardName;
	}
	public void setStandardName(String standardName) {
		this.standardName = standardName;
	}
	public List<StandardModelResultDetailViewModel> getChildmodel() {
		return childmodel;
	}
	public void setChildmodel(List<StandardModelResultDetailViewModel> childmodel) {
		this.childmodel = childmodel;
	}
	
}
