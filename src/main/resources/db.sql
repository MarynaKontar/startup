-- -----------------------------------------------------
-- Schema STARTUP
-- -----------------------------------------------------
-- DROP SCHEMA IF EXISTS `STARTUP` ;

-- -----------------------------------------------------
-- Schema STARTUP
-- -----------------------------------------------------
-- CREATE SCHEMA IF NOT EXISTS `STARTUP` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ; --
-- USE `STARTUP` ;

CREATE TABLE IF NOT EXISTS `users` (
 `USERNAME` varchar(45) NOT NULL,
 `PASSWORD` varchar(455) NOT NULL,
 `EMAIL` varchar(45) NOT NULL,
 PRIMARY KEY (`USERNAME`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `user_roles` (
 `USER_USERNAME` varchar(45) NOT NULL,
 `ROLE` varchar(45) NOT NULL,
 PRIMARY KEY (`USER_USERNAME`, `ROLE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




