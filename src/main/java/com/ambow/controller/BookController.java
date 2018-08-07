package com.ambow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ambow.pojo.Book;
import com.ambow.sercice.BookService;
import com.ambow.vo.Pager;

@Controller
@RequestMapping("/Book")
public class BookController {
	
	@Autowired
	BookService bs;
	
	@RequestMapping("/newBook.do")
	@ResponseBody
	public boolean newBook(@RequestBody Book book) {
		if(bs.newBook(book)!=1) {
			return false;
		}else{
			return true;
		}
	}
	@RequestMapping("/updateBook.do")
	@ResponseBody
	public boolean updateBook(@RequestBody Book book) {
		if(bs.updateBook(book)!=1) {
			return false;
		}else {
			return true;
		}
	}
	@RequestMapping("/deleteBookById.do")
	@ResponseBody
	public boolean deleteBookById(@RequestBody Integer id) {
		if(bs.deleteBookById(id)!=1) {
			return false;
		}else {
			return true;
		}
	}
	
	@RequestMapping("/getAllBook.do")
	@ResponseBody
	public List<Book> getAllBook(){
		return bs.getAllBook();
	}
	
	@RequestMapping("/getBookById.do")
	@ResponseBody
	public Book getBookById(@RequestBody int id) {
		Book book=bs.getBookById(id);
		if(book==null) {
			return null;
		}else {
			return book;
		}
	}
	
	@RequestMapping("/getBookByTypeId.do")
	@ResponseBody
	public List<Book> getBookByTypeId(@RequestBody int typeId) {
		List <Book> booklist=bs.getBookByTypeId(typeId);
		if(booklist==null) {
			return null;
		}else {
			return booklist;
		}
	}
	@RequestMapping("/getBookByName.do")
	@ResponseBody
	public List<Book> getBookByName(@RequestBody String name) {
		List <Book> booklist= bs.getBookByName(name);
		if(booklist==null) {
			return null;
		}else {
			return booklist;
		}
	}
	
	@RequestMapping("/getBookBySearch.do")
	@ResponseBody
	public List<Book> getBookBySearch(@RequestBody(required=false) String content){
		System.out.println(content);
		if(content==null) {
			content="";
		}
		List <Book> booklist=bs.getBookBySearch(content);
		if(booklist==null) {
			return null;
		}else {
			return booklist;
		}
	}
	
	@RequestMapping(value="getAllBookPager.do",method=RequestMethod.POST)
	@ResponseBody
	public Pager<Book> getAllBookPager(@RequestBody int pageNum){
		return bs.getAllBookPager(pageNum);
	}
	
	@RequestMapping(value="getBookByName.do",method=RequestMethod.POST)
	@ResponseBody
	public Pager<Book> getBookByName(@RequestBody int pageNum,@RequestBody String name){
		return bs.getBookByName(pageNum, name);
	}
	
	@RequestMapping(value="getBookByTypeId.do",method=RequestMethod.POST)
	@ResponseBody
	public Pager<Book> getBookByTypeId(@RequestBody int pageNum,@RequestBody int typeId){
		return bs.getBookByTypeId(pageNum, typeId);
	}
	
	@RequestMapping(value="getBookBySearch.do",method=RequestMethod.POST)
	@ResponseBody
	public Pager<Book> getBookBySearch(@RequestBody int pageNum,@RequestBody(required=false) String content){
		if(content==null) {
			content="";
		}
		return bs.getBookBySearch(pageNum, content);
	}
}
