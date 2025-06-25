DECLARE
    CURSOR customer_cursor IS
        SELECT CustomerID, DOB
        FROM customers;
    
    v_customer_id customers.CustomerID%TYPE;
    v_customer_dob customers.DOB%TYPE;
    v_age NUMBER;

BEGIN
    FOR customer_record IN customer_cursor LOOP
        v_customer_id := customer_cursor.CustomerID;
        v_customer_dob := customer_cursor.DOB;

        v_age := TRUNC(MONTHS_BETWEEN(SYSDATE, v_customer_dob) / 12);

        IF (v_age > 60) THEN
            UPDATE loans
            SET interestrate = interestrate * 1
            WHERE CustomerID = v_customer_id;
        END IF;
    END LOOP;
    COMMIT;
END;