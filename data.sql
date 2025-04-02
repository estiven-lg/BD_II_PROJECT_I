-- Users


INSERT INTO USER_BANK (USER_ID, FULL_NAME, DPI, EMAIL, PHONE_NUMBER, DATE_OF_BIRTH, ADDRESS, REGISTRATION_DATE, STATUS)
VALUES (1, 'Juan Pérez', '1234567890101', 'juan.perez@email.com', '555-1234', TO_DATE('1990-05-10', 'YYYY-MM-DD'), 'Calle 5, Zona 10, Ciudad', SYSTIMESTAMP, 'ACTIVE');

INSERT INTO USER_BANK (USER_ID, FULL_NAME, DPI, EMAIL, PHONE_NUMBER, DATE_OF_BIRTH, ADDRESS, REGISTRATION_DATE, STATUS)
VALUES (2, 'María Gómez', '9876543210123', 'maria.gomez@email.com', '555-5678', TO_DATE('1985-11-20', 'YYYY-MM-DD'), 'Avenida Reforma 12, Zona 13', SYSTIMESTAMP, 'ACTIVE');

INSERT INTO USER_BANK (USER_ID, FULL_NAME, DPI, EMAIL, PHONE_NUMBER, DATE_OF_BIRTH, ADDRESS, REGISTRATION_DATE, STATUS)
VALUES (3, 'Carlos Rodríguez', '1928374650483', 'carlos.rodriguez@email.com', '555-8765', TO_DATE('1978-02-15', 'YYYY-MM-DD'), 'Barrio San Sebastián, Antigua', SYSTIMESTAMP, 'ACTIVE');

INSERT INTO USER_BANK (USER_ID, FULL_NAME, DPI, EMAIL, PHONE_NUMBER, DATE_OF_BIRTH, ADDRESS, REGISTRATION_DATE, STATUS)
VALUES (4, 'Ana López', '1346798520147', 'ana.lopez@email.com', '555-4321', TO_DATE('1992-09-22', 'YYYY-MM-DD'), 'Calle 8, Zona 4', SYSTIMESTAMP, 'ACTIVE');

INSERT INTO USER_BANK (USER_ID, FULL_NAME, DPI, EMAIL, PHONE_NUMBER, DATE_OF_BIRTH, ADDRESS, REGISTRATION_DATE, STATUS)
VALUES (5, 'José Martínez', '7456289130567', 'jose.martinez@email.com', '555-6789', TO_DATE('1980-03-17', 'YYYY-MM-DD'), 'Calle 10, Zona 6', SYSTIMESTAMP, 'ACTIVE');

-- SAVINGS_ACCOUNT

INSERT INTO SAVINGS_ACCOUNT (ACCOUNT_ID, USER_ID, ACCOUNT_NUMBER, ACCOUNT_TYPE, BALANCE, CURRENCY, CREATION_DATE, STATUS)
VALUES (1, 1, 'A123456789', 'Savings', 5000.00, 'GTQ', SYSTIMESTAMP, 'ACTIVE');

INSERT INTO SAVINGS_ACCOUNT (ACCOUNT_ID, USER_ID, ACCOUNT_NUMBER, ACCOUNT_TYPE, BALANCE, CURRENCY, CREATION_DATE, STATUS)
VALUES (2, 2, 'B987654321', 'Savings', 1500.50, 'GTQ', SYSTIMESTAMP, 'ACTIVE');

INSERT INTO SAVINGS_ACCOUNT (ACCOUNT_ID, USER_ID, ACCOUNT_NUMBER, ACCOUNT_TYPE, BALANCE, CURRENCY, CREATION_DATE, STATUS)
VALUES (3, 3, 'C112233445', 'Checking', 10000.00, 'GTQ', SYSTIMESTAMP, 'ACTIVE');

INSERT INTO SAVINGS_ACCOUNT (ACCOUNT_ID, USER_ID, ACCOUNT_NUMBER, ACCOUNT_TYPE, BALANCE, CURRENCY, CREATION_DATE, STATUS)
VALUES (4, 4, 'D667788990', 'Savings', 2500.00, 'GTQ', SYSTIMESTAMP, 'ACTIVE');

INSERT INTO SAVINGS_ACCOUNT (ACCOUNT_ID, USER_ID, ACCOUNT_NUMBER, ACCOUNT_TYPE, BALANCE, CURRENCY, CREATION_DATE, STATUS)
VALUES (5, 5, 'E112244668', 'Checking', 3000.00, 'USD', SYSTIMESTAMP, 'ACTIVE');


-- ATM
INSERT INTO ATM (ATM_ID, LOCATION, CITY, STATUS, CURRENCY, CASH_AVAILABLE, LAST_MAINTENANCE)
VALUES (1, 'Avenida 1, Zona 1', 'Ciudad de Guatemala', 'ACTIVE', 'GTQ', 10000.00, SYSTIMESTAMP);

INSERT INTO ATM (ATM_ID, LOCATION, CITY, STATUS, CURRENCY, CASH_AVAILABLE, LAST_MAINTENANCE)
VALUES (2, 'Calle 12, Zona 2', 'Mixco', 'ACTIVE', 'GTQ', 0.00, SYSTIMESTAMP);

INSERT INTO ATM (ATM_ID, LOCATION, CITY, STATUS, CURRENCY, CASH_AVAILABLE, LAST_MAINTENANCE)
VALUES (3, 'Calle 8, Zona 4', 'Santa Catarina Pinula', 'ACTIVE', 'GTQ', 5000.00, SYSTIMESTAMP);

INSERT INTO ATM (ATM_ID, LOCATION, CITY, STATUS, CURRENCY, CASH_AVAILABLE, LAST_MAINTENANCE)
VALUES (4, 'Boulevard Los Próceres', 'Guatemala', 'ACTIVE', 'GTQ', 20000.00, SYSTIMESTAMP);

INSERT INTO ATM (ATM_ID, LOCATION, CITY, STATUS, CURRENCY, CASH_AVAILABLE, LAST_MAINTENANCE)
VALUES (5, 'Calle 9, Zona 3', 'Villa Nueva', 'ACTIVE', 'GTQ', 15000.00, SYSTIMESTAMP);

-- CARD

INSERT INTO CARD (CARD_ID, USER_ID, ACCOUNT_ID, CARD_NUMBER, CARD_TYPE, CVV, PIN, EXPIRATION_DATE, STATUS)
VALUES (1, 1, 1, '1234567890123456', 'Debit', '123', '1234', TO_DATE('2027-12-31', 'YYYY-MM-DD'), 'ACTIVE');

INSERT INTO CARD (CARD_ID, USER_ID, ACCOUNT_ID, CARD_NUMBER, CARD_TYPE, CVV, PIN, EXPIRATION_DATE, STATUS)
VALUES (2, 2, 2, '9876543210987654', 'Credit', '456', '5678', TO_DATE('2026-05-15', 'YYYY-MM-DD'), 'ACTIVE');

INSERT INTO CARD (CARD_ID, USER_ID, ACCOUNT_ID, CARD_NUMBER, CARD_TYPE, CVV, PIN, EXPIRATION_DATE, STATUS)
VALUES (3, 3, 1, '1122334455667788', 'Debit', '789', '1357', TO_DATE('2028-09-01', 'YYYY-MM-DD'), 'BLOCKED');

INSERT INTO CARD (CARD_ID, USER_ID, ACCOUNT_ID, CARD_NUMBER, CARD_TYPE, CVV, PIN, EXPIRATION_DATE, STATUS)
VALUES (4, 1, 1, '5566778899001122', 'Credit', '987', '2468', TO_DATE('2025-03-20', 'YYYY-MM-DD'), 'ACTIVE');

INSERT INTO CARD (CARD_ID, USER_ID, ACCOUNT_ID, CARD_NUMBER, CARD_TYPE, CVV, PIN, EXPIRATION_DATE, STATUS)
VALUES (5, 2, 2, '9988776655443322', 'Debit', '654', '4321', TO_DATE('2027-08-30', 'YYYY-MM-DD'), 'ACTIVE');
