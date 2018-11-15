package cn.jylink.bi.service;

import java.util.List;
import java.util.Map;

import cn.jylink.bi.model.InitialValue;


public interface IInitialValueService {
	/*
	 * 获取最新指标初始值
	 */
	public Map<String,InitialValue> getNewestInitialValueMap(String orgCode);
	/*
	 * 获取最新指标初始值
	 */
	public List<InitialValue> getNewestInitialValueList(String orgCode);
	/*
	 * 根据请求指标列表返回最新指标初始值
	 */
	public List<InitialValue> getNewestInitialValueList(List<InitialValue> initialValues,String orgCode);
}
