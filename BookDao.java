package book.dao;

import java.util.List;

public interface BookDao {
	public List<Book> getAllBooks();
	public void addBook(Book book);
	public Book updateBook(String iSBN, String bookName);
	public void delBook(String iSBN);
}
