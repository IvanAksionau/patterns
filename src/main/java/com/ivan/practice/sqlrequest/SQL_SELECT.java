package com.ivan.practice.sqlrequest;
//MySQL is case-insensitive
public class SQL_SELECT {
    /**
     * ------SELECT---------------------------------------------------------------------------
     * SELECT * FROM employees;                           - select all from table
     * SELECT first_name, last_name FROM employees;
     *
     *------WHERE--------------=---------!=------------->---------------------------------
     * SELECT * FROM employees WHERE first_name = 'denis';
     * SELECT * FROM employees WHERE first_name != 'denis';
     * SELECT * FROM employees WHERE first_name != 'denis';
     * SELECT * FROM employees WHERE hire_date >= '1990-01-01';
     *
     *------WHERE------AND------------OR------------------------------------------------
     *  SELECT * FROM employees WHERE first_name='Denis' OR first_name='Alvis' AND gender='M';
     *  SELECT * FROM employees WHERE first_name='Denis' AND (gender='M' OR gender='F');
     *
     *------IN--------------NOT IN-------------------------------------------------------------
     * SELECT * FROM employees WHERE first_name IN ('Denis', 'MArk', 'Nathan');
     * SELECT * FROM employees WHERE first_name NOT IN ('Denis', 'MArk', 'Nathan');
     *
     * --------NOT LIKE---------------LIKE----------------------------------------------------pattern matching
     * SELECT * FROM employees WHERE first_name LIKE('Mar%');   - returns all starting with 'Mar....'
     * SELECT * FROM employees WHERE first_name LIKE('%Mar');   - returns all ending with '....Mar'
     * SELECT * FROM employees WHERE first_name LIKE('%Mar%');   - returns all with '....Mar....' in the middle
     * SELECT * FROM employees WHERE first_name LIKE('Mar_');   - returns all with 'Mar.' in the middle
     *
     * --------------BETWEEN---------------------NOT BETWEEN--------------------------------------------------
     * SELECT * FROM employees WHERE hire_date BETWEEN '1990-01-01' AND '2000-01-01';
     * SELECT * FROM employees WHERE hire_date NOT BETWEEN '1990-01-01' AND '2000-01-01';
     *
     * -----------IS NULL--------------------IS NOT NULL-----------------------------
     * SELECT * FROM employees WHERE first_name IS NULL;
     * SELECT * FROM employees WHERE first_name IS NOT NULL;
     *
     * -------------DISTINCT--------------------------------------------------------------without duplicates
     * SELECT DISTINCT * FROM employees WHERE first_name = 'denis';
     *
     * -------------ASC-----------------------ORDER BY---------------DESC----------------
     * SELECT * FROM employees ORDER BY first_name, last_name DESC;      returns in descending order
     *
     * ----------------GROUP BY---------------COUNT---------------------------------------------------------
     * SELECT first_name, COUNT(first_name) FROM employees GROUP BY first_name ORDER BY first_name DESC;
     *
     * * ----------------Alias is used to rename a selection from query------------AS-----HAVING-------
     * SELECT first_name, COUNT(first_name) AS names_count FROM employees;
     * SELECT first_name, COUNT(first_name) FROM employees GROUP BY first_name HAVING COUNT(first_name) > 250 -не встречается больше чем 250 раз
     *
     * ---------------------------LIMIT---------------------------------------------------------
     * SELECT * FROM employees LIMIT 10
     */
}
