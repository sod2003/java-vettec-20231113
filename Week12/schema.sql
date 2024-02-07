-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema BookStore
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema BookStore
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `BookStore` ;
USE `BookStore` ;

-- -----------------------------------------------------
-- Table `BookStore`.`Books`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `BookStore`.`Books` (
  `ISBN` INT NOT NULL,
  `title` VARCHAR(45) NOT NULL,
  `author` VARCHAR(45) NOT NULL,
  `price` DECIMAL NOT NULL,
  `numInStock` INT NOT NULL,
  PRIMARY KEY (`ISBN`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `BookStore`.`Employees`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `BookStore`.`Employees` (
  `employeeID` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `wage` DECIMAL NOT NULL,
  PRIMARY KEY (`employeeID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `BookStore`.`Sales`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `BookStore`.`Sales` (
  `transactionID` INT NOT NULL AUTO_INCREMENT,
  `employeeID` INT NOT NULL,
  `total` DECIMAL NOT NULL,
  PRIMARY KEY (`transactionID`),
  INDEX `fk_Sales_Employees1_idx` (`employeeID` ASC) VISIBLE,
  CONSTRAINT `fk_Sales_Employees1`
    FOREIGN KEY (`employeeID`)
    REFERENCES `BookStore`.`Employees` (`employeeID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `BookStore`.`Sales(line item)`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `BookStore`.`Sales(line item)` (
  `transactionID` INT NOT NULL,
  `ISBN` INT NOT NULL,
  `numSold` INT NOT NULL,
  PRIMARY KEY (`transactionID`, `ISBN`),
  INDEX `fk_Sales(line item)_Books_idx` (`ISBN` ASC) VISIBLE,
  CONSTRAINT `fk_Sales(line item)_Books`
    FOREIGN KEY (`ISBN`)
    REFERENCES `BookStore`.`Books` (`ISBN`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Sales(line item)_Sales1`
    FOREIGN KEY (`transactionID`)
    REFERENCES `BookStore`.`Sales` (`transactionID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
