DECLARE
    CURSOR loan_cur IS
        SELECT L.LOANID, L.CUSTOMERID, L.ENDDATE, C.NAME
        FROM LOANS L
        JOIN CUSTOMERS C
        ON C.CUSTOMERID = L.CUSTOMERID
        WHERE L.ENDDATE BETWEEN SYSDATE AND SYSDATE + 30;

BEGIN
    FOR loan_rec in loan_cur LOOP 
        DBMS_OUTPUT.PUT_LINE('CUSTOMER: ' || loan_rec.NAME || 'with CUSTOMER ID: ' || loan_rec.CUSTOMERID || ' has a LOAN due on ' || loan_rec.LOANID || 'ON ' || loan_rec.ENDDATE);
    END LOOP;
END;