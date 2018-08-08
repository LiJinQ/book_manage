package com.ambow.sercice;

import java.util.List;
import java.util.Map;

import com.ambow.pojo.Reader;
import com.ambow.vo.Pager;

public interface ReaderService {
	public int newReader(Reader reader);
	public int updateReader(Reader reader);
	public int deleteReaderById(int id);
	public Reader getReaderById(int id);
	public List<Reader> getAllReader();
	public List<Reader> getReaderByName(String name);
	public List<Reader> getReaderSearch(String content);
	public List<Reader> getReaderConBorrow();
	
	public Pager<Reader> getAllReader(int pageNum);
	public Pager<Reader> getReaderByName(int pageNum,String name);
	public Pager<Reader> getReaderSearch(int pageNum,String content);
	
	public Map<String,String> getSexProportion();

}
