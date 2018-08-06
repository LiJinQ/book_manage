package com.ambow.sercice;

import java.util.List;

import com.ambow.pojo.Reader;

public interface ReaderService {
	public int newReader(Reader reader);
	public int updateReader(Reader reader);
	public int deleteReaderById(int id);
	public Reader getReaderById(int id);
	public List<Reader> getAllReader();
	public List<Reader> getReaderByName(String name);
	public List<Reader> getReaderSearch(String content);
}
