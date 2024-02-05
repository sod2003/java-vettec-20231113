# 1. Retrieve all customers from the "customer" table.
SELECT * FROM sakila.customer;

# 2. Get the titles of all films from the "film" table.
SELECT title FROM sakila.film;

# 3. Retrieve the first name, last name, and email of all customers.
SELECT first_name, last_name, email FROM sakila.customer;

# 4. Get the rental ID, rental date, and return date from the "rental" table.
SELECT rental_id, rental_date, return_date FROM sakila.rental;

# 5. Get the film titles and descriptions of films that have a rating of "R".
SELECT title, description
FROM sakila.film
WHERE rating = 'R';

# 6. Retrieve the rental ID, customer ID, and return date of rentals that are overdue (return date is in the past).
SELECT rental_id, customer_id, return_date
FROM sakila.rental
WHERE CURRENT_DATE > return_date;

# 7. Get the distinct cities from the "city" table.
SELECT DISTINCT city FROM sakila.city;

# 8. Retrieve the film titles and rental rates of films that have a rental rate greater than $4.50.
SELECT title, rental_rate
FROM sakila.film
WHERE rental_rate > 4.5;

# 9. Retrieve the first name and last name of all staff members from the "staff" table.
SELECT first_name, last_name FROM sakila.staff;

# 10. Challenge: Retrieve the first name, last name, and phone number of customers whose last name starts with "S".
SELECT first_name, last_name, phone
FROM sakila.customer
INNER JOIN sakila.address ON customer.address_id = address.address_id
WHERE last_name LIKE "S%";
