package cn.jylink.bi.service;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.jylink.bi.model.StandardModelResultDetail;
import cn.jylink.bi.model.StandardModelResultDetailViewModel;
import cn.jylink.bi.model.StandardModelResultViewModel;
import org.springframework.stereotype.Service;

import cn.jylink.bi.dao.IStandardModelResultDao;
import cn.jylink.bi.model.StandardModelResult;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class StandardModelResultService implements IStandardModelResultService {

	@Resource
	IStandardModelResultDao standardModelResultDao;
	
	@Override
	public StandardModelResult getStandardModelResult(
			StandardModelResult standardModel) {
		StandardModelResult result = new StandardModelResult();
		List<StandardModelResult> standardModelResults = standardModelResultDao.getStandardModelResult(standardModel);
		//设置详细信息
		if(standardModelResults.size() > 0){
			result = standardModelResults.get(0);
			result.setDetails(standardModelResultDao.getStandardModelResultDetail(standardModelResults.get(0)));
		}
		return result;
	}

	@Override
	@Transactional
	public boolean SaveStandardModelResult(
			StandardModelResultViewModel standardModelVM) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		StandardModelResult r=new StandardModelResult();
		r.setAssessGrade(standardModelVM.getAssessGrade());
		r.setAssessScore(standardModelVM.getAssessScore());
		r.setBelongCode(standardModelVM.getBelongCode());
		try {
			r.setDate(formatter.parse(standardModelVM.getDate()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		r.setModelAlgorithm(standardModelVM.getModelAlgorithm());
		r.setOrgCode(standardModelVM.getOrgCode());
		r.setModelCode(standardModelVM.getModelCode());
		r.setResultType(standardModelVM.getResultType());
		r.setTaskId(standardModelVM.getTaskId());
		r.setTaskType(standardModelVM.getTaskType());
		r.setTopTaskId(standardModelVM.getTopTaskId());
		//使用时间来表示当前插入数据的id
		r.setUuid( BigInteger.valueOf  ( (new Date()).getTime()));
		standardModelResultDao.SaveStandardModelResult(r);
		List<StandardModelResultDetail> rds=new ArrayList<StandardModelResultDetail>();
		rds=buildDetailList(standardModelVM.getModel(),rds,r.getUuid(),"0");
		//通过判断更新行数temp来返回结果
		int temp = standardModelResultDao.SaveStandardModelResultDetails(rds, Integer.valueOf(standardModelVM.getTaskType()));
		boolean result = false;
		if(temp > 0){
			result = true;
		}

		return result;
	}
	private List<StandardModelResultDetail> buildDetailList(List<StandardModelResultDetailViewModel> rdvms,List<StandardModelResultDetail> rds,BigInteger uuid,String parentCode){
		for(StandardModelResultDetailViewModel rdvm:rdvms){
			StandardModelResultDetail rd=new StandardModelResultDetail();
			rd.setAssessGrade(rdvm.getAssessGrade());
			rd.setAssessScore(rdvm.getAssessScore());
			rd.setMainId(uuid);
			rd.setPiecewiseValue(rdvm.getPiecewiseValue());
			rd.setProportion(rdvm.getProportion());
			rd.setStandardCode(rdvm.getStandardCode());
			rd.setStandardLevel(rdvm.getStandardLevel());
			rd.setStandardName(rdvm.getStandardName());
			rd.setStandardParentCode(parentCode);
			rd.setStandardValue(rdvm.getStandardValue());
			rds.add(rd);

			if(rdvm.getChildmodel()!=null&&rdvm.getChildmodel().size()>0){
				buildDetailList(rdvm.getChildmodel(),rds,uuid,rdvm.getStandardCode());
			}

		}
		return rds;
	}



}
