CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
    CURSOR saving_cur IS
        SELECT ACCOUNTID, BALANCE
        FROM ACCOUNTS
        WHERE ACCOUNTTYPE = 'Savings';

    v_acc_id ACCOUNTS.ACCOUNTID%TYPE;
    v_balance ACCOUNTS.BALANCE%TYPE;
    
BEGIN
    OPEN saving_cur;
    LOOP
        FETCH saving_cur INTO v_acc_id, v_balance;

        EXIT WHEN saving_cur%NOTFOUND;

        UPDATE ACCOUNTS
        SET BALANCE = v_balance + (v_balance * 0.1), LASTMODIFIED = SYSDATE
        WHERE ACCOUNTID = v_acc_id;
    END LOOP;
    CLOSE saving_cur;
END;