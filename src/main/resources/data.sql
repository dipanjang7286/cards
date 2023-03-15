DROP TABLE IF EXISTS cards;
CREATE TABLE cards(
    card_id int AUTO_INCREMENT PRIMARY KEY,
    customer_id int NOT NULL,
    card_number BIGINT NOT NULL,
    card_type VARCHAR(100) NOT NULL,
    expire_date DATE DEFAULT NULL
);

INSERT INTO cards (customer_id,card_number,card_type,expire_date) VALUES(1,98765,'CREDIT_CARD',CURDATE());
INSERT INTO cards (customer_id,card_number,card_type,expire_date) VALUES(1,96745,'DEBIT_CARD',CURDATE());
