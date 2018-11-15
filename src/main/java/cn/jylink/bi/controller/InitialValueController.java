package cn.jylink.bi.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.jylink.bi.model.InitialValuesParam;
import cn.jylink.bi.model.dto.ResultViewModel;
import cn.jylink.bi.service.InitialValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import cn.jylink.bi.model.InitialValue;


@Controller
public class InitialValueController extends BaseController {
	@Autowired
	private InitialValueService initialValueService;
	
	@PostMapping("/getInitialValue")
	@ResponseBody
	public Object getInitialValue( @RequestBody InitialValuesParam initialValuesParam){
		try {
			return new ResultViewModel(200,"成功",initialValueService.getNewestInitialValueList(initialValuesParam.getModel(),initialValuesParam.getOrgCode()));
		} catch (Exception e) {
			return new ResultViewModel(500,e.toString());
			
		}
		
	}
	@GetMapping("/getFixedInitialValue")
	@ResponseBody
	public Object getFixedInitialValue(String orgCode){					
		try {
			Map<String,String> initialValues=new HashMap<String,String>();
			initialValues.put("A001B001C001", "矿井水文地质复杂程度");
			initialValues.put("A001B002C001", "地质构造");
			initialValues.put("A001B002C002", "顶板破碎程度");
			initialValues.put("A001B002C003", "顶底板和煤层冲击地压倾向性");
			initialValues.put("A001B002C004", "回采工作面支护方式");
			initialValues.put("A001B002C005", "掘进工作面支护方式");
			initialValues.put("A001B003C001", "地质条件");
			initialValues.put("A001B003C002", "自燃倾向性");
			initialValues.put("A001B003C003", "煤层爆炸倾向性");
			initialValues.put("A001B003C004", "瓦斯等级");
			initialValues.put("A001B003C005", "采煤工艺");			
			initialValues.put("A001B005C001", "煤尘爆炸指数");
			List<InitialValue> initialValueList =new ArrayList<InitialValue>();					
			Map<String, InitialValue> searchResult=  initialValueService.getNewestInitialValueMap(orgCode);
			for (Map.Entry<String, String> entry : initialValues.entrySet()){
				if(searchResult.containsKey(entry.getKey())){
					initialValueList.add(searchResult.get(entry.getKey()));
				}
				else{
					initialValueList.add(new InitialValue(entry.getKey(),entry.getValue()));
				}
			}
			return new ResultViewModel(200,"成功",initialValueList);
		} catch (Exception e) {
			return new ResultViewModel(500,e.toString());
		}
	}
}
