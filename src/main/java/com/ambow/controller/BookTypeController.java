package com.ambow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ambow.pojo.BookType;
import com.ambow.sercice.BookTypeService;
import com.ambow.vo.Pager;
import com.ambow.vo.PagerVo;

@Controller
@RequestMapping("/bookType")
public class BookTypeController {
	@Autowired
	private BookTypeService bts;
	
	
	@RequestMapping("/newBookType.do")
	@ResponseBody
	public boolean newBookType(@RequestBody BookType bookType) {
		if(bts.newBookType(bookType)!=1) {
			return false;
		}else {
			return true;
		}
	}
	@RequestMapping("/deleteBookTypeById.do")
	@ResponseBody
	public boolean deleteBookTypeById(@RequestBody Integer id) {
		if(bts.deleteBookTypeById(id)!=1) {
			return false;
		}else {
			return true;
		}
	}
	
	@RequestMapping("/updateBookType.do")
	@ResponseBody
	public boolean updateBookType(@RequestBody BookType bookType) {
		if(bts.updateBookType(bookType)!=1) {
			return false;
		}else {
			return true;
		}
	}
	
	@RequestMapping("/getAllBookType.do")
	@ResponseBody
	public List<BookType> getAllBookType() {
		System.out.println(bts.getAllBookType());
		return bts.getAllBookType();
	}

	@RequestMapping("/getBookTypeByName.do")
	@ResponseBody
	public BookType getBookTypeByName(@RequestBody String name) {
		return bts.getBookTypeByName(name);
	}

	@RequestMapping("/getBookTypePager.do")
	@ResponseBody
	public Pager<BookType> getBookTypePager(@RequestBody PagerVo pv) {
		return bts.getBookTypePager(pv.getPageNum());
	}

	@RequestMapping("/getBookTypeFindPager")
	@ResponseBody
	public Pager<BookType> getBookTypeFindPager(@RequestBody PagerVo pv) {
		return bts.getBookTypeFindPager(pv.getPageNum(), pv.getContent());
	}

}
