package com.deloitte.library.services;

import com.deloitte.library.model.Books;
import com.library.dao.BooksDAO;

public class BooksServiceImpl implements BooksInterfaceServices {

	@Override
	public void createBooks(String name1, float price) {
		// TODO Auto-generated method stub
		Books obj = new Books();
		obj.setBookName(name1);
		obj.setBookPrice(price);
		obj.setBookId();
		BooksDAO.addBook(obj);
	}

}
