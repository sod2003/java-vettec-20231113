-- ORDER BY QUERY Practice
-- 1. Retrieve all customers from the "customer" table, ordered by last name in descending order:
SELECT *
FROM sakila.customer
ORDER BY last_name DESC;

-- 2. Get the titles of all films from the "film" table, ordered by release year in ascending order
SELECT title
FROM sakila.film
ORDER BY release_year;

-- 3. Retrieve the first name, last name, and email of all customers, ordered by last name in ascending order and then by first name in ascending order:
SELECT first_name, last_name, email
FROM sakila.customer
ORDER BY last_name, first_name;

-- 4. Get the rental ID, rental date, and return date from the "rental" table, ordered by rental date in descending order:
SELECT rental_id, rental_date, return_date
FROM sakila.rental
ORDER BY rental_date DESC;

-- 5. Retrieve the first name, last name, and phone number of customers whose last name starts with "S", ordered by last name in descending order:
SELECT first_name, last_name, phone
FROM sakila.customer
JOIN sakila.address USING (address_id)
WHERE last_name like "S%"
ORDER BY last_name DESC;

-- JOIN QUERY Practice
-- 1. Retrieve the film title and the language name it is in.
SELECT title, name
FROM sakila.film
JOIN sakila.language USING (language_id);

-- 2. Retrieve the staff member's first name and the store they work at.
SELECT first_name, location
FROM sakila.staff
JOIN sakila.store USING (store_id)
JOIN sakila.address ON (store.address_id = address.address_id);

-- 3. Retrieve the customer's first name and the rental date of the films they have rented.
SELECT first_name, rental_date
FROM sakila.customer
JOIN sakila.rental USING (customer_id);

-- 4. Get the staff member's first name and the number of customers they have assisted.
SELECT first_name, COUNT(*) AS `Customers Assisted`
FROM sakila.staff
JOIN sakila.rental USING (staff_id)
GROUP BY first_name;

-- 5. Get the customer's first name and the total amount they have paid in payments.
SELECT first_name AS Customer, SUM(amount) AS `Total Lifetime Value of Customer`
FROM sakila.customer
JOIN sakila.payment USING (customer_id)
GROUP BY first_name;

-- 6. Get the customer's first name, last name, and the film titles they have rented.
SELECT first_name, last_name, title
FROM sakila.customer
JOIN sakila.rental USING (customer_id)
JOIN sakila.inventory USING (inventory_id)
JOIN sakila.film USING (film_id)
ORDER BY first_name, last_name;