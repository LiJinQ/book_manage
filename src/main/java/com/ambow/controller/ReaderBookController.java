package com.ambow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ambow.pojo.Reader;
import com.ambow.pojo.ReaderBook;
import com.ambow.sercice.ReaderBookService;
import com.ambow.vo.Pager;
import com.ambow.vo.PagerVo;
import com.ambow.vo.ReaderBookVo;

@Controller
@RequestMapping("/readerBook")
public class ReaderBookController {
	
	@Autowired
	private ReaderBookService rbs;
	
	/**
	 * readerBook封装的值：
	 * 1、reader_id
	 * 2、book_id
	 * @param readerBook
	 * @return
	 * 0:成功
	 * 1：库存不足
	 * 2：读者有欠款项
	 * 3：插入失败
	 */
	@RequestMapping(value="/borrowBook.do",method = RequestMethod.POST)
	@ResponseBody
	public int borrowBook(@RequestBody ReaderBook readerBook) {
		return rbs.borrowBook(readerBook);
	}
	
	@RequestMapping(value = "/backBook.do",method = RequestMethod.POST)
	@ResponseBody
	public int backBook(@RequestBody int readerBookId) {
		return rbs.backBook(readerBookId);
	}
	
	/**
	 * @param id 主键
	 * @param lost	丢失：1
	 * @param damaged	损坏：1
	 * @return 计算价格后的实体
	 */
	@RequestMapping(value = "/getBackPrice.do",method = RequestMethod.POST)
	@ResponseBody
	public ReaderBook getBackPrice(@RequestBody PagerVo pv) {
		return rbs.getBackPrice(pv.getReaderBookId(), pv.getLost(), pv.getDamaged());
	}
	
	@RequestMapping(value="getReaderBookByReaderId.do",method = RequestMethod.POST)
	@ResponseBody
	public Pager<ReaderBook> getReaderBookByReaderId(@RequestBody PagerVo pv){
		return rbs.getReaderBookByReaderId(pv.getPageNum(), pv.getReaderId());
	}
	
	@RequestMapping(value="getReaderBookByBookId.do",method = RequestMethod.POST)
	@ResponseBody
	public Pager<ReaderBook> getReaderBookByBookId(@RequestBody PagerVo pv){
		return rbs.getReaderBookByBookId(pv.getPageNum(), pv.getBookId());
	}
	
	@RequestMapping(value="getAllReaderBook.do",method = RequestMethod.POST)
	@ResponseBody
	public Pager<ReaderBook> getAllReaderBook(@RequestBody PagerVo pv){
		return rbs.getAllReaderBook(pv.getPageNum());
	}
	
	@RequestMapping(value="getReaderBookById.do",method = RequestMethod.POST)
	@ResponseBody
	public ReaderBook getReaderBookById(@RequestBody int id) {
		return rbs.getReaderBookById(id);
	}
	
	@RequestMapping(value="getReaderBookByBookId2.do",method = RequestMethod.POST)
	@ResponseBody
	public List<ReaderBookVo> getReaderBookByBookId2(@RequestBody int bookId) {
		return rbs.getReaderBookByBookId2(bookId);
	}
}
