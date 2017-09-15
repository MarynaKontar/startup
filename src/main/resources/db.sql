-- -----------------------------------------------------
-- Schema STARTUP
-- -----------------------------------------------------
-- DROP SCHEMA IF EXISTS `STARTUP` ;

-- -----------------------------------------------------
-- Schema STARTUP
-- -----------------------------------------------------
-- CREATE SCHEMA IF NOT EXISTS `STARTUP` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ; --
-- ДОПИСАТЬ FOREIGN KEYS, INDEXES, ПРОВЕРИТЬ ДЛИНУ ПЕРЕМЕННЫХ

CREATE TABLE IF NOT EXISTS `users` (
 `USERNAME` varchar(45) NOT NULL,
 `PASSWORD` varchar(455) NOT NULL,
 `profileFotoLink` varchar(455) DEFAULT NULL,
 `personalPageFotoLink` varchar(455) DEFAULT NULL,
 `youtubeLink` varchar(455) DEFAULT NULL,
 `aboutMe` varchar(455) DEFAULT NULL,
 `skills` varchar(455) DEFAULT NULL,
#  `contact_id` BIGINT DEFAULT NULL, -- для случая @OneToOne Contact

 -- для случая @Embedded Contact:
 `email` varchar(45) NOT NULL,
 `phoneNumber` varchar(455) DEFAULT NULL,
 `city` varchar(455) DEFAULT NULL,
 `country` varchar(455) DEFAULT NULL,
 PRIMARY KEY (`USERNAME`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `user_roles` (
 `USER_USERNAME` varchar(45) NOT NULL,
 `ROLE` varchar(45) NOT NULL,
 PRIMARY KEY (`USER_USERNAME`, `ROLE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- для случая @OneToOne Contact
# CREATE TABLE IF NOT EXISTS `contact` (
#  `id` BIGINT AUTO_INCREMENT,
#  `email` varchar(45) NOT NULL,
#  `phoneNumber` varchar(455) DEFAULT NULL,
#  `city` varchar(455) DEFAULT NULL,
#  `country` varchar(455) DEFAULT NULL,
#  PRIMARY KEY (`id`)
# ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- для случая Unidirectional @OneToMany association
CREATE TABLE IF NOT EXISTS `experience` (
 `id` BIGINT AUTO_INCREMENT,
 `company` varchar(45) DEFAULT NULL ,
 `position` varchar(455) DEFAULT NULL,
 `responsibility` varchar(455) DEFAULT NULL,
 `from` TIMESTAMP DEFAULT NULL,
 `until` TIMESTAMP DEFAULT NULL,
 PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- для случая Unidirectional @OneToMany association
CREATE TABLE IF NOT EXISTS `user_experiences` (
 `USER_USERNAME` varchar(45) NOT NULL,
 `experience` BIGINT NOT NULL,
 PRIMARY KEY (`USER_USERNAME`, `experience`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;