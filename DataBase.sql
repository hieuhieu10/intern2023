CREATE DATABASE  IF NOT EXISTS `dung_lao` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `dung_lao`;
-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: dung_lao
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Table structure for table `giagao`
--

DROP TABLE IF EXISTS `giagao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `giagao` (
  `LoaiGao` varchar(10) NOT NULL,
  `GiaTien` int DEFAULT NULL,
  PRIMARY KEY (`LoaiGao`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `giagao`
--

LOCK TABLES `giagao` WRITE;
/*!40000 ALTER TABLE `giagao` DISABLE KEYS */;
INSERT INTO `giagao` VALUES ('Xau',2000),('Xin',20000);
/*!40000 ALTER TABLE `giagao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ngaybangao`
--

DROP TABLE IF EXISTS `ngaybangao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ngaybangao` (
  `NgayBan` int NOT NULL,
  `SoLuongGaoXinBanDuoc` int DEFAULT NULL,
  `SoLuongGaoXauBanDuoc` int DEFAULT NULL,
  PRIMARY KEY (`NgayBan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ngaybangao`
--

LOCK TABLES `ngaybangao` WRITE;
/*!40000 ALTER TABLE `ngaybangao` DISABLE KEYS */;
INSERT INTO `ngaybangao` VALUES (1,81,NULL),(2,93,NULL),(3,111,NULL),(4,111,NULL),(5,93,NULL),(6,57,NULL),(7,105,NULL),(8,96,NULL),(9,36,NULL),(10,72,NULL),(11,117,NULL),(12,18,NULL),(13,66,NULL),(14,36,NULL),(15,15,NULL),(16,27,NULL),(17,27,NULL),(18,69,NULL),(19,57,NULL),(20,93,NULL),(21,69,NULL),(22,33,NULL),(23,114,NULL),(24,48,NULL),(25,39,NULL),(26,78,NULL),(27,90,NULL),(28,18,NULL),(29,36,NULL),(30,36,NULL);
/*!40000 ALTER TABLE `ngaybangao` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-20 22:40:24
