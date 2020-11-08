package book.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class TestBook {
	BookDaoImpl dao;
	Book book;
	public TestBook() {
		dao = new BookDaoImpl();
	}
	@Test
	public void testGetAllBooks() {
		int noOfRec = dao.books.size();
		assertEquals(4, noOfRec);
	}
	@Test
	public void testAddBook() {
		Book book = new Book(10, "Think like a monk", "3456");
		dao.addBook(book);
		int noOfRec = dao.books.size();
		assertEquals(5, noOfRec);
	}
	
	@Test
	public void testAddBookFalse() {
		Book book = new Book(10, "Think like a monk", "3456");
		int noOfRec = dao.books.size();
		assertNotEquals(dao.books.get(noOfRec-1), dao.books.add(book));
	}

	@Test
	public void testUpdateBook() {
		
		book= dao.books.get(0);
		assertEquals(book, dao.updateBook("ikigai", "123456"));
		
		
	}

	@Test
	public void testDelBook() {
		
		
		dao.delBook("123456");
		int noOfRec = dao.books.size();

		assertEquals(3, noOfRec);
		
	}
	
	
}
