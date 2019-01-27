CREATE DATABASE `customer`;

CREATE TABLE `customer`.`customer` (
  `id` bigint(20) NOT NULL,
  `name` varchar(25) DEFAULT NULL,
  `ssn` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `customer`.`customer`
(`id`, `name`, `ssn`)
VALUES
(2, "mysql-customer", 2);
