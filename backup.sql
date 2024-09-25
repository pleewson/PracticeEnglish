-- MySQL dump 10.13  Distrib 9.0.1, for macos14.4 (arm64)
--
-- Host: localhost    Database: irregular_verbs_DB
-- ------------------------------------------------------
-- Server version	8.2.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `category` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'animal'),(2,'food');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `irregular_verbs`
--

DROP TABLE IF EXISTS `irregular_verbs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `irregular_verbs` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `verb1` varchar(255) NOT NULL,
  `verb2` varchar(255) NOT NULL,
  `verb3` varchar(255) NOT NULL,
  `verb_in_polish` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=70 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `irregular_verbs`
--

LOCK TABLES `irregular_verbs` WRITE;
/*!40000 ALTER TABLE `irregular_verbs` DISABLE KEYS */;
INSERT INTO `irregular_verbs` VALUES (1,'be','was/were','been','być'),(2,'become','became','become','stawać się'),(3,'begin','began','begun','zaczynać'),(4,'break','broke','broken','łamać'),(5,'bring','brought','brought','przynosić'),(6,'build','built','built','budować'),(7,'buy','bought','bought','kupować'),(8,'catch','caught','caught','łapać'),(9,'choose','chose','chosen','wybierać'),(10,'come','came','come','przyjść'),(11,'cost','cost','cost','kosztować'),(12,'cut','cut','cut','ciąć'),(13,'do','did','done','robić'),(14,'draw','drew','drawn','rysować'),(15,'dream','dreamed/dremt','dreamed/dremt','śnić/marzyć'),(16,'drink','drank','drunk','pić'),(17,'drive','drove','driven','prowadzić'),(18,'eat','ate','eaten','jeść'),(19,'fall','fell','fallen','padać/upadać'),(20,'feel','felt','felt','czuć'),(21,'find','found','found','znaleźć'),(22,'fly','flew','flown','latać'),(23,'get','got','got','dostawać'),(24,'give','gave','given','dawać'),(25,'go','went','gone','iść'),(26,'grow','grew','grown','rosnąć'),(27,'have','had','had','mieć'),(28,'hear','heard','heard','słyszeć'),(29,'hit','hit','hit','uderzać'),(30,'hold','held','held','trzymac'),(31,'hurt','hurt','hurt','ranić'),(32,'keep','kept','kept','trzymać'),(33,'know','knew','known','znać'),(34,'learn','learned/learnt','learned/learnt','uczyć się'),(35,'leave','left','left','opuszczać'),(36,'lend','lent','lent','pożyczać'),(37,'lose','lost','lost','tracić/zgubić'),(38,'make','made','made','robić/wykonywać'),(39,'mean','meant','meant','spotykać/poznać'),(40,'pay','paid','paid','płacić'),(41,'put','put','put','kłaść'),(42,'read','read','read','czytać'),(43,'ride','rode','ridden','jeździć'),(44,'ring','rang','rung','dzwonić'),(45,'run','ran','run','biec'),(46,'say','said','said','mówić'),(47,'see','saw','seen','widzieć'),(48,'sell','sold','sold','sprzedawać'),(49,'send','sent','sent','wysyłać'),(50,'show','showed','shown','pokazywać'),(51,'shut','shut','shut','zamykać'),(52,'sing','sang','sung','śpiewać'),(53,'sit','sat','sat','siedzieć'),(54,'sleep','slept','slept','spać'),(55,'speak','spoke','spoken','mówić'),(56,'spend','spent','spent','spędzać/wydawać'),(57,'stand','stood','stood','stać'),(58,'steal','stole','stolen','kraść'),(59,'swim','swam','swum','pływać'),(60,'take','took','taken','brać'),(61,'teach','taught','taught','uczyć'),(62,'tell','told','told','powiedzieć'),(63,'think','thought','thought','myśleć/sądzić'),(64,'throw','threw','thrown','rzucać'),(65,'wake','woke','woken','budzić'),(66,'wear','wore','worn','nosić'),(67,'understand','understood','understood','rozumieć'),(68,'win','won','won','wygrywać'),(69,'write','wrote','written','pisać');
/*!40000 ALTER TABLE `irregular_verbs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `thing`
--

DROP TABLE IF EXISTS `thing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `thing` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `english_name` varchar(255) DEFAULT NULL,
  `polish_name` varchar(255) DEFAULT NULL,
  `src` varchar(255) DEFAULT NULL,
  `category_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK90q0wmatp7c03u7f1why58j2w` (`category_id`),
  CONSTRAINT `FK90q0wmatp7c03u7f1why58j2w` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `thing`
--

LOCK TABLES `thing` WRITE;
/*!40000 ALTER TABLE `thing` DISABLE KEYS */;
INSERT INTO `thing` VALUES (1,'cow','krowa','/images/things/animals/cow.jpg',1),(2,'elephant','słoń','/images/things/animals/elephant.jpg',1),(3,'zebra','zebra','/images/things/animals/zebra.jpg',1),(4,'donkey','osioł','/images/things/animals/donkey.jpg',1),(5,'bat','nietoperz','/images/things/animals/bat.jpg',1),(6,'owl','sowa','/images/things/animals/owl.jpg',1),(7,'sheep','owca','/images/things/animals/sheep.jpg',1),(8,'croissant','rogalik','/images/things/food/croissant.jpg',2),(9,'fish','ryba','/images/things/food/fish.jpg',2),(10,'pasta','makaron','/images/things/food/pasta.jpg',2),(11,'pizza','rogalik','/images/things/food/pizza.jpg',2),(16,'sandwich','kanapka','/images/things/food/sandwich.jpg',2),(17,'sushi','sushi','/images/things/food/sushi.jpg',2),(18,'tomato','pomidor','/images/things/food/tomato.jpg',2),(19,'sausage','kiełbasa','/images/things/food/sausage.jpg',2),(20,'camel','wielbłąd','/images/things/animals/camel.jpg',1),(21,'gorilla','goryl','/images/things/animals/gorilla.jpg',1),(22,'kangaroo','kangur','/images/things/animals/kangaroo.jpg',1),(23,'monkey','małpa','/images/things/animals/monkey.jpg',1),(24,'rhino','nosorożec','/images/things/animals/rhino.jpg',1),(25,'shark','rekin','/images/things/animals/shark.jpg',1),(26,'walrus','mors','/images/things/animals/walrus.jpg',1),(27,'dog','pies','/images/things/animals/dog.jpg',1),(28,'cat','kot','/images/things/animals/cat.jpg',1);
/*!40000 ALTER TABLE `thing` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-09-25 13:26:52
