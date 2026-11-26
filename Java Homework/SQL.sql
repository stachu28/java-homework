1:
"SELECT COUNT(*)
FROM employees;"

2:
"SELECT first_name, last_name, salary
FROM employees
WHERE department_id = 1
ORDER BY salary DESC;"

3:
"SELECT first_name, last_name, salary
FROM employees
WHERE salary > 12000;"

4:
"SELECT first_name, last_name
FROM employees
WHERE phone IS NULL;"

5:
"SELECT MAX(salary) AS max_salary, MIN(salary) AS min_salary
FROM employees;"

6:
"SELECT DISTINCT city
FROM departments
ORDER BY city;"

7:
"SELECT first_name, last_name, hire_date
FROM employees
WHERE hire_date >= '2023-01-01'
  AND hire_date <  '2024-01-01';"

8:
"SELECT title, price
FROM books
WHERE price > 150
ORDER BY price DESC;"

9:
"SELECT title, in_stock
FROM books
WHERE in_stock < 15
ORDER BY in_stock ASC;"

10:
"SELECT title, publish_year
FROM books
WHERE publish_year < 2000
ORDER BY publish_year ASC;"

11:
"SELECT department_id, COUNT(*) AS employee_count
FROM employees
GROUP BY department_id
ORDER BY department_id;"

12:
"SELECT ROUND(AVG(salary), 2) AS avg_salary
FROM employees;
"

13:
"SELECT e.first_name, e.last_name, d.name
FROM employees e
JOIN departments d ON d.id = e.department_id
WHERE d.name = ''Sales''
ORDER BY e.last_name;"

14:
"SELECT d.name, COUNT(*) AS number
FROM employees e
JOIN departments d ON d.id = e.department_id
GROUP BY d.name HAVING COUNT(*) > 2 ORDER BY number DESC;"

15:
"SELECT b.title, p.name
FROM books b
JOIN publishers p ON p.id = b.publisher_id
WHERE p.country = ''USA'' ORDER BY b.title;"

16:
"SELECT p.name, COUNT(b.id) AS number
FROM publishers p
LEFT JOIN books b ON b.publisher_id = p.id
GROUP BY p.name ORDER BY number DESC, p.name;"

17:
"SELECT p.name, SUM(b.price * b.in_stock) AS wartosc FROM publishers p
JOIN books b ON b.publisher_id = p.id
GROUP BY p.name ORDER BY wartosc DESC;"

18:
"SELECT a.first_name, a.last_name FROM authors a
LEFT JOIN book_authors ba ON ba.author_id = a.id
WHERE ba.author_id IS NULL;"

19:
"SELECT d.name, COUNT(*) AS total_employees, ROUND(AVG(e.salary), 2) AS avg_salary
FROM departments d JOIN employees e ON e.department_id = d.id
WHERE e.is_active
GROUP BY d.name ORDER BY avg_salary DESC;"

20:
"SELECT d.name, ROUND(AVG(e.salary), 2) AS avg_pay FROM employees e
JOIN departments d ON d.id = e.department_id
GROUP BY d.name HAVING AVG(e.salary) > 10000 ORDER BY avg_pay DESC;"

21:
"SELECT e.first_name || '' '' || e.last_name || '' → '' || m.first_name || '' '' || m.last_name AS pair
FROM employees e
JOIN employees m ON m.id = e.manager_id
ORDER BY m.id, e.last_name;"

22:
"SELECT title, price
FROM books
WHERE price > (SELECT AVG(price) FROM books)
ORDER BY price DESC;"

23:
"SELECT a.first_name, a.last_name, COUNT(*) AS book_count
FROM authors a
JOIN book_authors ba ON ba.author_id = a.id
GROUP BY a.id
ORDER BY book_count DESC;"

24:
"SELECT p.name, b.title, b.price
FROM books b
JOIN publishers p ON p.id = b.publisher_id
WHERE b.price = (SELECT MAX(price) FROM books WHERE publisher_id = b.publisher_id)
ORDER BY b.price DESC;"

25:
"WITH ranking AS (
    SELECT d.name AS department,
           e.first_name,
           e.last_name,
           e.salary,
           ROW_NUMBER() OVER (PARTITION BY d.id ORDER BY e.salary DESC) AS position
    FROM employees e
    JOIN departments d ON d.id = e.department_id
)
SELECT department, first_name, last_name, salary
FROM ranking
WHERE position = 2
ORDER BY salary DESC;"

26:
"WITH stock_by_country AS (
    SELECT p.country,
           COUNT(*)                  AS titles,
           SUM(b.price * b.in_stock) AS stock_value,
           ROUND(AVG(b.price), 2)    AS avg_price
    FROM books b
    JOIN publishers p ON p.id = b.publisher_id
    GROUP BY p.country
)
SELECT *
FROM stock_by_country
WHERE stock_value > 1000
ORDER BY stock_value DESC;"

Bonus:
"SELECT m.first_name,
       m.last_name,
       COUNT(*)                AS subordinates,
       ROUND(AVG(e.salary), 2) AS avg_salary
FROM employees e
JOIN employees m ON m.id = e.manager_id
GROUP BY m.id
HAVING COUNT(*) >= 2
ORDER BY avg_salary DESC;"