-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: library
-- ------------------------------------------------------
-- Server version	8.0.35

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `account` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `role` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` VALUES (1,'Jennylyn','Aniag','jennylynaniag@gmail.com','admin','password','Librarian'),(2,'Romeo','Quinones','romeoquinones@gmail.com','2022100960','romeo960','Student'),(3,'Tyron','Dimla','tyrondimla@gmail.com','2022100499','tyron499','Student'),(4,'Emman','Oxales','emmanoxales@gmail.com','emman123','emman321','Student'),(6,'Reymark','Mendoza','reymarkmendoza@gmail.com','mendoza123','mendoza321','Teacher'),(7,'Lorenz Romeo','Taganas','lorenzromeotaganas@gmail.com','lorenzromeo123','lorenzromeo321','Staff');
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `books`
--

DROP TABLE IF EXISTS `books`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `books` (
  `isbn` bigint NOT NULL,
  `title` varchar(200) DEFAULT NULL,
  `author` varchar(100) DEFAULT NULL,
  `publish_date` varchar(30) DEFAULT NULL,
  `category` varchar(50) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  PRIMARY KEY (`isbn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `books`
--

LOCK TABLES `books` WRITE;
/*!40000 ALTER TABLE `books` DISABLE KEYS */;
INSERT INTO `books` VALUES (9780134494166,'Introduction to Algorithms','Thomas H. Cormen','2009-07-31','Programming','Not Available',2),(9780374533557,'Thinking, Fast and Slow','Daniel Kahneman','2011-10-25','Science','Not Available',0),(9780446520706,'The Catcher in the Rye','J.D. Salinger','1951-07-16','English','Available',2),(9780465026562,'Gödel, Escher, Bach','Douglas Hofstadter','1979-04-01','Philosophy','Available',4),(9780521294149,'Principia Mathematica','Alfred North','1910-01-01','Math','Available',1),(9781234567890,'Code Craftsmanship','ane Coder','2022-05-15','Programming','Available',2),(9781234567891,'The Quantum Frontier','Alan Scientists','2018-10-08','Science','Available',2),(9781234567892,'Mathematics Unleashed','David Mathlete','2015-03-21','Math','Available',7),(9781234567896,'The Cosmic Odyssey','Stella Astronomer','2021-02-09','Science','Available',2),(9781234567897,'Quantum Mathematics Explained','Olivia Mathlete','2013-11-25','Math','Available',1),(9781234567898,'Mastering English Grammar','Daniel Linguist','2017-04-03','English','Not Available',0),(9781234567899,'Existential Musings','Sophia Philosopher','2020-10-14','Philosophy','Available',4);
/*!40000 ALTER TABLE `books` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `borrowed_books`
--

DROP TABLE IF EXISTS `borrowed_books`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `borrowed_books` (
  `borrow_id` int NOT NULL AUTO_INCREMENT,
  `user_id` int NOT NULL,
  `book_isbn` bigint NOT NULL,
  `borrowed_date` varchar(100) DEFAULT NULL,
  `returned_date` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`borrow_id`,`user_id`,`book_isbn`),
  UNIQUE KEY `unique_user_book_borrow` (`user_id`,`book_isbn`),
  KEY `book_isbn_idx` (`book_isbn`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `borrowed_books`
--

LOCK TABLES `borrowed_books` WRITE;
/*!40000 ALTER TABLE `borrowed_books` DISABLE KEYS */;
INSERT INTO `borrowed_books` VALUES (3,2,9780374533557,'2023-11-28','2023-12-13'),(4,2,9781234567899,'2023-11-28','2023-12-13'),(5,2,9781234567898,'2023-11-28','2023-12-13'),(6,2,9781234567896,'2023-11-28','2023-12-13'),(7,2,9781234567890,'2023-11-28','2023-12-13'),(9,6,9780374533557,'2023-11-28','2023-12-13'),(10,6,9781234567897,'2023-11-28','2023-12-13'),(11,6,9781234567893,'2023-11-28','2023-12-13'),(12,6,9781234567892,'2023-11-28','2023-12-13'),(13,6,9781234567899,'2023-11-28','2023-12-13'),(16,6,9781234567891,'2023-11-28','2023-12-13'),(17,7,9780134494166,'2023-11-28','2023-12-13'),(18,7,9781234567890,'2023-11-28','2023-12-13'),(19,7,9781234567891,'2023-11-28','2023-12-13'),(20,7,9781234567892,'2023-11-28','2023-12-13'),(21,3,9781234567899,'2023-11-28','2023-12-13'),(22,3,9780134494166,'2023-11-28','2023-12-13'),(23,3,9781234567897,'2023-11-28','2023-12-13'),(24,3,9781234567891,'2023-11-28','2023-12-13'),(25,4,9780134494166,'2023-11-28','2023-12-13'),(26,4,9781234567892,'2023-11-28','2023-12-13'),(29,2,9781234567897,'2023-11-28','2023-12-13');
/*!40000 ALTER TABLE `borrowed_books` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-08-21 20:30:56
