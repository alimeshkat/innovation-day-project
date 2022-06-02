CREATE TABLE IF NOT EXISTS `PAYMENT`
(
    `id` INT GENERATED ALWAYS AS IDENTITY ,
    `from_iban` varchar(255),
    `to_iban` varchar(255),
    `name` varchar(255),
    `amount` varchar(255),
    `date` number,
    PRIMARY KEY (`id`),
);
