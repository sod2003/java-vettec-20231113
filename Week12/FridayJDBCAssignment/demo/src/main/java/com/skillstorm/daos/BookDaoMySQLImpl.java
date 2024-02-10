package com.skillstorm.daos;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.skillstorm.config.DbUtils;
import com.skillstorm.models.Book;

public class BookDaoMySQLImpl implements BookDao {

    @Override
    public Optional<Book> findById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<Book> findAll() {
        try {
			DbUtils config = DbUtils.getInstance();
			try (Connection conn = config.getConnection()) {
                List<Book> books = new ArrayList<>();
				PreparedStatement stmt = conn.prepareStatement("SELECT * FROM books");

				// Step 4: Execute statement
				ResultSet rs = stmt.executeQuery();

				// Step 5: Process results
				while (rs.next()) {

					int ISBN = rs.getInt("ISBN");
					String title = rs.getString("title");
					String author = rs.getString("author");
					float price = rs.getFloat("price");
                    int numInStock = rs.getInt("numInStock");
					
					// map your rows to objects
					Book book = new Book(ISBN, title, author, price, numInStock);
					books.add(book);
				}
                return books;
			} catch (SQLException e) {
				System.out.println("Unable to get connection: " + e.getMessage());
				return new ArrayList<Book>();
			}
		} catch (IOException e) {
            System.out.println("Unable to read from properties file");
            return new ArrayList<Book>();
		}
    }

    @Override
    public Book save(Book e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Book update(Book e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Book e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public void deleteById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    public Optional<Book> findByName(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByName'");
    }

}
