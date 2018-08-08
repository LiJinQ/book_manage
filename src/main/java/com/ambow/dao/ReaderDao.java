package com.ambow.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ambow.pojo.Reader;
import com.ambow.vo.Pager;

public interface ReaderDao {
	public int newReader(Reader reader);

	public int updateReader(Reader reader);

	public int deleteReaderById(int id);
	
	public Reader getReaderById(int id);
	
	public List<Reader> getReaderCanBorrow();
	
	public List<Reader> getReaderByName(String name);
	
	public List<Reader> getAllReader();
	
	public List<Reader> getReaderSearch(String content);
	
	public int getTotalRecord(String name);
	
	public int getTotalSearchRecord(String content);
	
	public List<Reader> getReaderPagerByName(@Param("pager") Pager<Reader> pager,@Param("name") String name);
	
	public List<Reader> getReaderPagerSearch(@Param("pager") Pager<Reader> pager,@Param("content") String content);
	
	public List<Reader> getAllReaderPager(Pager<Reader> pager);
}
