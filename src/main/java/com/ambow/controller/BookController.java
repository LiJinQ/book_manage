package com.ambow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ambow.pojo.Book;
import com.ambow.sercice.BookService;

@Controller
@RequestMapping("/Book")
public class BookController {
	
	@Autowired
	BookService bs;
	
	@RequestMapping("/getAllBook.do")
	@ResponseBody
	public List<Book> getAllBook(){
		return bs.getAllBook();
	}
	
	@RequestMapping("/newBook.do")
	public boolean newBook(@RequestBody Book book) {
		bs.newBook(book);
		if(book.getId()!=0) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
