package cn.jylink.bi.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import cn.jylink.bi.dao.IInitialValueDao;
import cn.jylink.bi.model.InitialValue;

import javax.annotation.Resource;

@Service
public class InitialValueService implements IInitialValueService {
	@Resource
	private IInitialValueDao initialValueDao;
	@Override
	public Map<String, InitialValue> getNewestInitialValueMap(String orgCode) {

		List<InitialValue> initialValues = initialValueDao.getNewestInitialValueList(orgCode);
		Map<String, InitialValue> map = new HashMap<String, InitialValue>();

		for(InitialValue i : initialValues){
			map.put(i.getStandardCode(), i);
		}

		return map;
	}

	@Override
	public List<InitialValue> getNewestInitialValueList(String orgCode) {
		return initialValueDao.getNewestInitialValueList(orgCode);
	}

	@Override
	public List<InitialValue> getNewestInitialValueList(
			List<InitialValue> initialValues,String orgCode) {
		List<InitialValue> result = new ArrayList<InitialValue>();
		Map<String, InitialValue> map = getNewestInitialValueMap(orgCode);

		for(InitialValue i:initialValues){
			String key=i.getStandardCode();
			if(map.containsKey(key)){
				InitialValue initialValue = new InitialValue();
				initialValue.setStandardCode(key);
				initialValue.setStandardValue(map.get(key).getStandardValue());
				result.add(initialValue);
			}
		}

		return result;
	}
	
	
}
