CREATE DATABASE IF not exists med_manager;

CREATE TABLE `med_manager`.`users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `user_name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `active` BOOL NOT NULL,
  PRIMARY KEY (`id`));