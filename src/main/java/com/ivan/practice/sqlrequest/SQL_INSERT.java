package com.ivan.practice.sqlrequest;
//MySQL is case-insensitive
public class SQL_INSERT {
    /**
     * ------INSERT---------------------------------------------------------------------------
     * INSERT INTO table_name (column_1, column_2) VALUES (value_1, value_2);
     * INSERT INTO table_name (column_1, column_2) SELECT * FROM table2_name;
     *
     *------UPDATE---------------------------------------------------------------------------
     * UPDATE table_name SET first_name='Ivan', last_name='Smith' WHERE user_id= 123;
     *
     * ------------------------------------ROLLBACK------------------------------
     * ROLLBACK;
     *
     *-----------------DELETE------------------------------------------------------
     * DELETE FROM table_name WHERE user_id= 123;
     *
     * --------------SUM---MAX  MIN  AVG  ROUND-------------------------------------------
     * SELECT SUM(salary) FROM table_name;
     * SELECT MAX(salary) FROM table_name;
     * SELECT MIN(salary) FROM table_name;
     * SELECT AVG(salary) FROM table_name;
     * SELECT ROUND(AVG(salary)) FROM table_name; -ВЕРНЁТ ЦЕЛОЕ ЧИСЛО
     *
     * ---------------------------INNER JOIN-----------------------------------------------------------
     * SELECT products.name, orders.order_time FROM orders INNER JOIN products ON orders.product_id=products.id;
     *
     *
     *
     * Database Constraints:
     * A database constraint is a rule applied to the data stored in the database
     * • Not Null-Column is not allowed to have null values
     * • Unique - Column value must be unique
     * • Primary Key - Identifier of row, combines Not Null and Unique
     * • Foreign Key - Value must exist in referenced (foreign) table aka, referential integrity
     * • Check Constraint - Sets condition on data - like min max, or list of values (ENUM)
     */
}
