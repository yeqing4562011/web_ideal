package com.ideal.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ideal.common.service.interf.IFirstIdealCommonService;
import com.ideal.common.service.interf.RMIObject;
import com.ideal.utility.resource.PropertiesUtil;
import com.ideal.utility.util.ApplicationContextHolder;

/**
 *
* @ClassName: IdealFirstWebController
* @Description: TODO
* @author yq
* @date 2013��8��4�� ����8:32:58
*
 */
@Controller
public class IdealFirstWebController extends ControllerBase{

	/**
	* @Title: gotoHtml
	* @Description: TODO
	* @param modelMap
	* @param request
	* @param response
	* @return
	* @throws Exception
	* @return Object
	* @throws
	 */
	@RequestMapping(value = "/test/gotoHtml", method = RequestMethod.GET)
	public Object gotoHtml(ModelMap modelMap,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Map<String, Object> mapDate=new HashMap<String, Object>();
		/*IFirstIdealCommonService firstIdealCommonService = ApplicationContextHolder.get("firstIdealCommonService");
		//firstIdealCommonService.firstHessianServicesRMI();
		RMIObject rmiObject = new RMIObject();
		rmiObject.setName("service...............");
		RMIObject serviceObject = firstIdealCommonService.rmiObject(rmiObject);
		System.out.println(serviceObject.getName());*/
		mapDate.put("username", "yq");
		return mapDate;
	}

	/**
	* @Title: accountList
	* @Description: TODO
	* @param modelMap
	* @param request
	* @param response
	* @return
	* @throws Exception
	* @return Object
	* @throws
	 */
	@RequestMapping(value = "gotoAjax", method = RequestMethod.GET)
	@ResponseBody
	public Object accountList(ModelMap modelMap,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception {
		Map<String, Object> mapDate=new HashMap<String, Object>();
		System.out.println("12123");
		System.out.println(this.getCache());
		this.getCache().getCache().set("te_", 123);
		System.out.println(this.getCache().getCache().get("test_one_cache"));
		mapDate.put("username", "yq");
		return mapDate;
	}

	/**
	* @Title: ajaxFtl
	* @Description: TODO
	* @param modelMap
	* @param request
	* @param response
	* @return
	* @throws Exception
	* @return Object
	* @throws
	 */
	@RequestMapping(value = "ajaxFtl", method = RequestMethod.GET)
	public Object ajaxFtl(ModelMap modelMap,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception {
		Map<String, Object> mapDate=new HashMap<String, Object>();
		System.out.println("12123");
		mapDate.put("username", "yq");
		return "ajax/dealerselect";
	}

	/**
	* @Title: findUserByName
	* @Description: TODO
	* @param modelMap
	* @param request
	* @param response
	* @return
	* @return String
	* @throws
	 */
	@RequestMapping(value = "findUserByName2")
    public String findUserByName(ModelMap modelMap,
			HttpServletRequest request, HttpServletResponse response) {
		String userId = PropertiesUtil.getProperty("mall.site.userid");
		System.out.println(userId);
        return "ajax/showUser/asd";
    }

}
