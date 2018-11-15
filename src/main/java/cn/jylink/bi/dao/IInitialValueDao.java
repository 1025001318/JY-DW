package cn.jylink.bi.dao;


import java.util.List;
import java.util.Map;
import cn.jylink.bi.model.InitialValue;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IInitialValueDao {
	/*
	 * 获取最新指标初始值
	 */
	public List<InitialValue> getNewestInitialValueList(@Param("orgCode") String orgCode);
}
