package com.ambow.dao;

import java.util.List;

import com.ambow.pojo.Reader;

public interface ReaderDao {
	public void newReader(Reader reader);

	public void updateReader(Reader reader);

	public void deleteReaderById(int id);
	
	public Reader getReaderById(int id);
	
	/**
	 * Ä£ºý²éÑ¯
	 * @param name
	 * @return
	 */
	public List<Reader> getReaderByName(String name);
	
	public List<Reader> getAllReader();
}
