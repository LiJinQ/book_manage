package com.ambow.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ambow.dao.ReaderDao;
import com.ambow.pojo.Reader;
import com.ambow.sercice.ReaderService;

@Service()
public class ReaderServiceImpl implements ReaderService {

	@Autowired
	private ReaderDao rd;
	
	@Override
	public int newReader(Reader reader) {
		// TODO Auto-generated method stub
		return rd.newReader(reader);
	}

	@Override
	public int updateReader(Reader reader) {
		// TODO Auto-generated method stub
		return rd.updateReader(reader);
	}

	@Override
	public int deleteReaderById(int id) {
		// TODO Auto-generated method stub
		return rd.deleteReaderById(id);
	}

	@Override
	public Reader getReaderById(int id) {
		// TODO Auto-generated method stub
		return rd.getReaderById(id);
	}

	@Override
	public List<Reader> getAllReader() {
		// TODO Auto-generated method stub
		return rd.getAllReader();
	}

	@Override
	public List<Reader> getReaderByName(String name) {
		// TODO Auto-generated method stub
		return rd.getReaderByName(name);
	}

	@Override
	public List<Reader> getReaderSearch(String content) {
		content="%"+content+"%";
		return rd.getReaderSearch(content);
	}

}
