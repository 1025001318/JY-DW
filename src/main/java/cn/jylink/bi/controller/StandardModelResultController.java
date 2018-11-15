package cn.jylink.bi.controller;


import java.text.SimpleDateFormat;
import java.util.Date;

import cn.jylink.bi.model.dto.ResultViewModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.apache.commons.lang.StringUtils;

import cn.jylink.bi.model.StandardModelResult;
import cn.jylink.bi.model.StandardModelResultViewModel;
import cn.jylink.bi.service.IStandardModelResultService;

@Controller
public class StandardModelResultController extends BaseController {
	@Autowired
	private IStandardModelResultService standardModelResultService;
	
	@PostMapping("getStandardModelResult")
	@ResponseBody
	public Object getStandardModelResult(@RequestBody StandardModelResult standardModel){
		if(StringUtils.isBlank(standardModel.getTaskId())||standardModel.getPatrolType()==null){
			return new ResultViewModel(412,"任务ID和巡查类型不能为空！");
		};
		try {
			return new ResultViewModel(200,"成功",standardModelResultService.getStandardModelResult(standardModel));
		} catch (Exception e) {
			return new ResultViewModel(500,e.toString());
		}
		
	}

	@PostMapping(value = "SaveStandardModelResult")
	@ResponseBody
	public Object SaveStandardModelResult(@RequestBody StandardModelResultViewModel standardModelVM){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		standardModelVM.setDate(sdf.format(new Date()));


		try {
			if(standardModelResultService.SaveStandardModelResult(standardModelVM)){
				return new ResultViewModel(200,"成功！");
			}
			else{
				return new ResultViewModel(500,"存储错误！");
			}
		} catch (Exception e) {
			return new ResultViewModel(500,e.toString());
		}
	}

}
