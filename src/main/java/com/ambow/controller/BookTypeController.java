package com.ambow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ambow.pojo.BookType;
import com.ambow.sercice.BookTypeService;

@Controller
@RequestMapping("/bookType")
public class BookTypeController {
	@Autowired
	private BookTypeService bts;
	
	@RequestMapping("/getAllBookType.do")
	@ResponseBody
	public List<BookType> getAllBookType(){
		return bts.getAllBookType();
	}
	
	@RequestMapping("/getBookTypeByName.do")
	@ResponseBody
	public BookType getBookTypeByName(@RequestBody String name) {
		return bts.getBookTypeByName(name);
	}
}
