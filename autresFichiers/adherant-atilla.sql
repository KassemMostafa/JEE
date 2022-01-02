CREATE DATABASE  IF NOT EXISTS adhesion;
USE adhesion;
DROP TABLE IF EXISTS Cotisation;
DROP TABLE IF EXISTS Reponse;
DROP TABLE IF EXISTS Admin;
DROP TABLE IF EXISTS Adherant;

CREATE TABLE Adherant (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nom varchar(45) DEFAULT NULL,
  prenom varchar(45) DEFAULT NULL,
  genre varchar(45) DEFAULT NULL,
  date_de_naissance date DEFAULT NULL,
  promo varchar(45) DEFAULT NULL,
  campus varchar(45) DEFAULT NULL,
  email varchar(45) DEFAULT NULL,
  mailing_liste BOOL DEFAULT 0,
  cotisant BOOL DEFAULT 0);
CREATE TABLE Cotisation (
	idCotisation INT PRIMARY KEY AUTO_INCREMENT,
    idAdherant INT,
    cotisantionValide BOOL DEFAULT 0,
    FOREIGN KEY fk_adherant(idAdherant) REFERENCES Adherant(id) ON DELETE CASCADE);
CREATE TABLE Reponse (
	idReponse INT PRIMARY KEY AUTO_INCREMENT,
    idAdherant INT,
    connaissancesInfo varchar(45) DEFAULT NULL,
    attentes varchar(45) DEFAULT NULL,
	centreInterets varchar(45) DEFAULT NULL,
    FOREIGN KEY fk_adherant(idAdherant) REFERENCES Adherant(id) ON DELETE CASCADE);
CREATE TABLE Admin (
	username varchar(45) PRIMARY KEY,
    password varchar(64),
    idAdherant INT,
	 FOREIGN KEY fk_adherant(idAdherant) REFERENCES Adherant(id) ON DELETE CASCADE);

    INSERT INTO Adherant Values (1, 'John', 'Doe', 'M','1999-03-30', 'ING2','Cergy', 'John@cy-tech.fr', 1, 1);
    INSERT INTO Adherant Values (2, 'rené', 'provence', 'neutre','1999-03-30', 'ING2','Pau', 'rené@cy-tech.fr', 0, 0);
    INSERT INTO Adherant Values (3, 'guillaume', 'Ricou', 'M','1999-04-30', 'ING3','Cergy', 'guigui@cy-tech.fr', 1, 1);
    INSERT INTO Adherant Values (4, 'John', 'Deux', 'F','1999-03-30', 'ING2','Cergy', 'John2@cy-tech.fr', 1, 0);
    INSERT INTO Adherant Values (5, 'John', 'trois', 'M','1999-03-30', 'ING3','Cergy', 'Johny3@cy-tech.fr', 1, 0);
    INSERT INTO Adherant Values (6, 'DAVID', 'Doa', 'David','1999-03-30', 'ING3','Cergy', 'David@cy-tech.fr', 1, 1);
