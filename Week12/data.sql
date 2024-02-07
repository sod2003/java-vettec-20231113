INSERT INTO bookstore.books(ISBN, title, author, price, numInStock)
VALUES 
(12345, "How to catch jellyfish", "Spongebob", 3.99, 14),
(12346, "Friends, and where to find them", "Unknown", 10.95, 2),
(12332, "The Loch Ness Monster", "Chef", 3.50, 10),
(12233, "Ducks: And how to make them pay", "William Cook", 15.99, 1);

INSERT INTO bookstore.employees(name, wage)
VALUES
("Sam", 9.00),
("Rod", 11.00),
("Sean", 15.30);

INSERT INTO bookstore.sales(employeeID, total)
VALUES
(1, 20),
(2, 8),
(2, 15);

INSERT INTO bookstore.`sales(line item)`(transactionID, ISBN, numSold)
VALUES
(1,12233,1),
(1,12345,1),
(2,12345,1),
(2,12332,1),
(3,12345,1),
(3,12346,1);
