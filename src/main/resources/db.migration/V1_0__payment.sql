CREATE TABLE IF NOT EXISTS `payment`
(
    `id` INT GENERATED ALWAYS AS IDENTITY ,
    `from_iban` varchar(255),
    `to_iban` varchar(255),
    `name` varchar(255),
    `value` varchar(255),
    `date` timestamp,
    PRIMARY KEY (`id`),
);
