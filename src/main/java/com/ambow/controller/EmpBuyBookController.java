package com.ambow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ambow.pojo.EmpBuyBook;
import com.ambow.pojo.Status;
import com.ambow.sercice.EmpBuyBookService;
import com.ambow.vo.Pager;
import com.ambow.vo.PagerVo;
import com.ambow.vo.StatusVo;

@Controller
@RequestMapping("/empBuyBook")
public class EmpBuyBookController {
	@Autowired
	private EmpBuyBookService ebbs;
	
	/**
	 * 传入empId
	 * bookId
	 * @param ebb
	 * @return
	 */
	@RequestMapping(value="applyBuy.do",method=RequestMethod.POST)
	@ResponseBody
	public int applyBuy(@RequestBody EmpBuyBook ebb) {
		return ebbs.applyBuy(ebb);
	}
	
	/**
	 * id
	 * status
	 * @param status
	 * @return
	 */
	@RequestMapping(value="examine.do",method=RequestMethod.POST)
	@ResponseBody
	public int examine(@RequestBody Status status) {
		return ebbs.examine(status);
	}
	
	/**
	 * 页码，roleId
	 * @param pv
	 * @return
	 */
	@RequestMapping(value="getStatusNotPass.do",method=RequestMethod.POST)
	@ResponseBody
	public Pager<StatusVo> getStatusNotPass(@RequestBody PagerVo pv){
		return ebbs.getStatusNotPass(pv);
	}
	
	@RequestMapping(value="getStatusPass.do",method=RequestMethod.POST)
	@ResponseBody
	public Pager<StatusVo> getStatusPass(@RequestBody PagerVo pv){
		return ebbs.getStatusPass(pv);
	}
	
	@RequestMapping(value="getEBB.do",method=RequestMethod.POST)
	@ResponseBody
	public Pager<EmpBuyBook> getEBB(@RequestBody PagerVo pv){
		return ebbs.getEBB(pv);
	}
}
