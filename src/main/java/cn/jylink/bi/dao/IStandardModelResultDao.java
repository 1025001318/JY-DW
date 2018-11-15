package cn.jylink.bi.dao;

import java.math.BigInteger;
import java.util.List;

import cn.jylink.bi.model.StandardModelResult;
import cn.jylink.bi.model.StandardModelResultDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

@Mapper
public interface IStandardModelResultDao {
	/**
	 * 获取模型计算结果
	 * @param standardModel
	 * @return
	 */
	public List<StandardModelResult> getStandardModelResult(StandardModelResult standardModel);

	/**
	 * 获取模型计算详细结果
	 * @param standardModel
	 * @return
	 */
	public List<StandardModelResultDetail> getStandardModelResultDetail(StandardModelResult standardModel);
	/**
	 * 保存模型计算结果主表
	 * @param standardModel
	 * @return uuid
	 */
	public Long SaveStandardModelResult(StandardModelResult standardModel);
	/**
	 * 保存模型计算结果明细
	 * @param standardModelDetail
	 * @return
	 */
	public boolean SaveStandardModelResultDetail(@Param("standardModelDetail") StandardModelResultDetail standardModelDetail, @Param("taskType") Integer taskType);
	/**
	 * 保存模型计算结果明细
	 * @param standardModelDetails
	 * @return
	 */
	@Transactional
	public int SaveStandardModelResultDetails(@Param("standardModelDetails") List<StandardModelResultDetail> standardModelDetails,@Param("taskType") Integer taskType);
}
