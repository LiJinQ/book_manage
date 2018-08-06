package com.ambow.sercice;

import com.ambow.pojo.ReaderBook;

public interface ReaderBookService {
	/**
	 * 0:成功
	 * 1：库存不足
	 * 2：读者有欠款项
	 * 3：插入失败
	 * @param readerBook
	 * @return
	 */
	public int borrowBook(ReaderBook readerBook);
	public int backBook(ReaderBook readerBook);
	public ReaderBook getBackPrice();
}
