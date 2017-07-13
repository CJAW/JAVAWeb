package com.user.struts2;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 搭建struts的环境
 * 1.导入struts的jar包
 * 2.导入struts.xml到src目录下
 * 3.在web.xml中配置过滤器关联上struts
 * @author user
 *
 */
public class Demo extends ActionSupport{

	
	/**
	 * 
	 */
	
	public  String un;
	public  String pd;
	

	@Override
	public String execute() throws Exception {
		System.out.println(un+","+pd);
		if(un.equals("111")&&pd.equals("111")){
			
			return "success";
		}else{
		
			return "error";
		}
	}




	public void setUn(String un) {
		this.un = un;
	}




public String getUn() {
		return un;
	}



	public void setPd(String pd) {
		this.pd = pd;
	}




	public String getPd() {
		return pd;
	}





	
	
	
}
