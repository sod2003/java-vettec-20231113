SELECT books.title, salesman.name, salesman.numSold
FROM bookstore.books
INNER JOIN (
	SELECT `sales(line item)`.ISBN, salesman.name, `sales(line item)`.numSold 
    FROM bookstore.`sales(line item)`
    INNER JOIN (
		SELECT employees.name, sales.transactionID
		FROM bookstore.sales
        INNER JOIN bookstore.employees ON (sales.employeeID = employees.employeeID)
	) AS salesman ON (`sales(line item)`.transactionID = salesman.transactionID)
) AS salesman ON (books.ISBN = salesman.ISBN);