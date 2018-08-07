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
import com.ambow.vo.PagerVo;

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
	public Pager<Book> getAllBookPager(@RequestBody PagerVo pv){
		return bs.getAllBookPager(pv.getPageNum());
	}
	
	@RequestMapping(value="getBookByName.do",method=RequestMethod.POST)
	@ResponseBody
	public Pager<Book> getBookByName(@RequestBody PagerVo pv){
		return bs.getBookByName(pv.getPageNum(), pv.getContent());
	}
	
	@RequestMapping(value="getBookByTypeId.do",method=RequestMethod.POST)
	@ResponseBody
	public Pager<Book> getBookByTypeId(@RequestBody PagerVo pv){
		return bs.getBookByTypeId(pv.getPageNum(), pv.getTypeId());
	}
	
	@RequestMapping(value="getBookBySearch.do",method=RequestMethod.POST)
	@ResponseBody
	public Pager<Book> getBookBySearch(@RequestBody PagerVo pv){
		if(pv.getContent()==null) {
			pv.setContent("");
		}
		return bs.getBookBySearch(pv.getPageNum(), pv.getContent());
	}
}
