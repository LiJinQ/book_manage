package com.ambow.vo;

import com.ambow.pojo.Reader;
import com.ambow.pojo.ReaderBook;

public class ReaderBookVo {
	private ReaderBook readerBook;
	private Reader reader;
	public ReaderBookVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReaderBookVo(ReaderBook readerBook, Reader reader) {
		super();
		this.readerBook = readerBook;
		this.reader = reader;
	}
	@Override
	public String toString() {
		return "ReaderBookVo [readerBook=" + readerBook + ", reader=" + reader + "]";
	}
	public ReaderBook getReaderBook() {
		return readerBook;
	}
	public void setReaderBook(ReaderBook readerBook) {
		this.readerBook = readerBook;
	}
	public Reader getReader() {
		return reader;
	}
	public void setReader(Reader reader) {
		this.reader = reader;
	}
	
}
