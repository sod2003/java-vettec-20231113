package com.skillstorm;

import java.util.List;

import com.skillstorm.daos.BookDao;
import com.skillstorm.daos.BookDaoMySQLImpl;
import com.skillstorm.models.Book;

/**
 * Hello world!
 */
public final class App {

    BookDao dao = new BookDaoMySQLImpl();

    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     * @throws ClassNotFoundException 
     */
    public static void main(String[] args) throws ClassNotFoundException {
        App app = new App();
		app.start();
    }

    public void start() throws ClassNotFoundException {

		List<Book> result = dao.findAll();
		for (Book book : result) {
            System.out.println(book);
        }
	}
}
