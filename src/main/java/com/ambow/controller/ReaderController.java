package com.ambow.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ambow.pojo.Reader;
import com.ambow.sercice.ReaderService;
import com.ambow.vo.Pager;
import com.ambow.vo.PagerVo;

@Controller
@RequestMapping("/Reader")
public class ReaderController {

	@Autowired
	private ReaderService rs;

	@RequestMapping("/newReader")
	@ResponseBody
	public boolean newReader(@RequestBody Reader reader) {
		if (rs.newReader(reader) != 1) {
			return false;
		} else {
			return true;
		}
	}

	@RequestMapping("/updateReader")
	@ResponseBody
	public boolean updateReader(@RequestBody Reader reader) {
		if (rs.updateReader(reader) != 1) {
			return false;
		} else {
			return true;
		}
	}

	@RequestMapping("/deleteReaderById")
	@ResponseBody
	public boolean deleteReaderById(@RequestBody Integer id) {
		if (rs.deleteReaderById(id) != 1) {
			return false;
		} else {
			return true;
		}
	}

	@RequestMapping("/getReaderById")
	@ResponseBody
	public Reader getReaderById(@RequestBody Integer id) {
		Reader reader = rs.getReaderById(id);
		if (reader == null) {
			return null;
		} else {
			return reader;
		}
	}

	@RequestMapping("/getAllReader")
	@ResponseBody
	public List<Reader> getAllReader() {
		return rs.getAllReader();
	}

	@RequestMapping("/getReaderByName")
	@ResponseBody
	public List<Reader> getReaderByName(@RequestBody String name) {
		List<Reader> readerlist = rs.getReaderByName(name);
		if (readerlist == null) {
			return null;
		} else {
			return readerlist;
		}
	}

	@RequestMapping("/getReaderBySearch.do")
	@ResponseBody
	public List<Reader> getReaderSearch(@RequestBody(required = false) String content) {
		if (content == null) {
			content = "";
		}
		List<Reader> readerlist = rs.getReaderSearch(content);
		if (readerlist == null) {
			return null;
		} else {
			return readerlist;
		}
	}
	
	@RequestMapping(value="/getAllReaderPager.do",method=RequestMethod.POST)
	@ResponseBody
	public Pager<Reader> getAllReader(@RequestBody PagerVo pv){
		return rs.getAllReader(pv.getPageNum());
	}
	
	@RequestMapping(value="/getReaderPagerByName.do",method=RequestMethod.POST)
	@ResponseBody
	public Pager<Reader> getReaderByName(@RequestBody PagerVo pv){
		if(pv.getContent()==null) {
			pv.setContent("");
		}
		return rs.getReaderByName(pv.getPageNum(), pv.getContent());
	}
	@RequestMapping(value="/getReaderPagerSearch.do",method=RequestMethod.POST)
	@ResponseBody
	public Pager<Reader> getReaderSearch(@RequestBody PagerVo pv){
		if(pv.getContent()==null) {
			pv.setContent("");
		}
		return rs.getReaderSearch(pv.getPageNum(), pv.getContent());
	}
	
	@RequestMapping("/getReaderCanBorrow.do")
	@ResponseBody
	public List<Reader> getReaderCanBorrow(){
		return rs.getReaderConBorrow();
	}
}
