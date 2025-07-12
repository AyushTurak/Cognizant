ALTER TABLE CUSTOMERS ADD isVIP VARCHAR(5);

DECLARE
    CURSOR cust_cursor IS
        SELECT isVIP, balance, CustomerID
        FROM CUSTOMERS;

BEGIN
    FOR cust_rec IN cust_cursor LOOP
        if (cust_rec.balance > 10000) THEN
            UPDATE CUSTOMERS
            SET isVIP = 'TRUE'
            WHERE CUSTOMERID = cust_rec.CustomerID;
        ELSE 
            UPDATE CUSTOMERS
            SET isVIP = 'FALSE'
            WHERE CUSTOMERID = cust_rec.CustomerID;
        END IF;
    END LOOP;
END;