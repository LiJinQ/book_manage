package com.ambow.dao;

import java.util.List;

import com.ambow.pojo.Reader;

public interface ReaderDao {
	public int newReader(Reader reader);

	public int updateReader(Reader reader);

	public int deleteReaderById(int id);
	
	public Reader getReaderById(int id);
	
	/**
	 * ģ����ѯ
	 * @param name
	 * @return
	 */
	public List<Reader> getReaderByName(String name);
	
	public List<Reader> getAllReader();
}
