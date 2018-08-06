package com.ambow.sercice;

import java.util.List;

import com.ambow.pojo.Reader;

public interface ReaderService {
	public void newReader(Reader reader);
	public void updateReader(Reader reader);
	public void deleteReaderById(int id);
	public Reader getReaderById(int id);
	public List<Reader> getAllReader();
	public List<Reader> getReaderByName(String name);
}
