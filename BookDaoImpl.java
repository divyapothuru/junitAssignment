package book.dao;

import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao{
	List<Book> books;

	
	public BookDaoImpl(){
		books = new ArrayList<Book>();
		books.add(new Book(1, "c", "123456"));
		books.add(new Book(2, "python", "123"));
		books.add(new Book(3, "oracle", "456"));
		books.add(new Book(4, "spring", "789"));
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		System.out.println(books.get(0));
		return books;
	}

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		books.add(book);
	}

	@Override
	public Book updateBook(String iSBN, String bookName) {
		// TODO Auto-generated method stub
		int index=0;
		for(int i=0;i<books.size();i++)
		{
			if(books.get(i).getiSBN().equals(iSBN))
			{
				index=i;
				books.get(i).setBookName(bookName);
			}
		}
		return books.get(index);
	}

	@Override
	public void delBook(String iSBN) {
		// TODO Auto-generated method stub
		boolean isIndex = false;
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getiSBN().equals(iSBN)) {
				isIndex = true;
				books.remove(i);
			}
		}
		
	}
	

}
