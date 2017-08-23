-- -----------------------------------------------------
-- Schema STARTUP
-- -----------------------------------------------------
-- DROP SCHEMA IF EXISTS `STARTUP` ;

-- -----------------------------------------------------
-- Schema STARTUP
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `STARTUP` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `STARTUP` ;

CREATE TABLE IF NOT EXISTS `STARTUP`.`users` (
 `USERNAME` varchar(45) NOT NULL,
 `PASSWORD` varchar(45) NOT NULL,
 `EMAIL` varchar(45) NOT NULL,
 PRIMARY KEY (`USERNAME`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `STARTUP`.`USER_ROLES` (
 `username` varchar(45) NOT NULL,
 `role` varchar(45) NOT NULL,
 PRIMARY KEY (`username`, `role`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




