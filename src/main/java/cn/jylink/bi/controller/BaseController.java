package cn.jylink.bi.controller;

import java.util.Enumeration;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;


/**
 * Controller的基类
 * </pre>
 *
 * @see
 */
public class BaseController {

	public String ERROR_CODE = "ERROR_CODE" ;
	// 每页显示的页数
	private int rows = 10;
	// 当前页
	private int page = 1;
	
	private String sign = null;
	private int SUCCESS = 0 ;
	private int FAILURE=-1;
	private String MSG = "SUCCESS" ;
	
    /**基类公共方法,类似拦截器,所有子类任何方法都会先执行以下方法*/
	/*@ModelAttribute  
	public void init(HttpServletRequest request, HttpServletResponse response) {  
		String sign = request.getParameter( "sign" ) ;
		this.sign = sign;
	}*/
	
    protected Map<String,String> getParamsByRequest(HttpServletRequest request){
		
		Map<String,String> map = new TreeMap<String,String>();
		Enumeration<?> e = (Enumeration<?>)request.getParameterNames();
		while(e.hasMoreElements()){
			String parName = (String)e.nextElement();
			String value = request.getParameter(parName);
			map.put(parName.toUpperCase(), value);
		}
		return map;
	}
    
    protected String getUpperStr(String msg){
    	return msg.toUpperCase();
    }

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getSUCCESS() {
		return SUCCESS;
	}

	public void setSUCCESS(int sUCCESS) {
		SUCCESS = sUCCESS;
	}

	public String getMSG() {
		return MSG;
	}

	public void setMSG(String mSG) {
		MSG = mSG;
	}
	public int getFAILURE() {
		return FAILURE;
	}
	public void setFAILURE(int fAILURE) {
		FAILURE = fAILURE;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
	
	
}
