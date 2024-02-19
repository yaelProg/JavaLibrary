CREATE DATABASE  IF NOT EXISTS `studentsnew`; 
USE `studentsnew`;

-- ------------------------------------------------------

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `author` varchar(45) DEFAULT NULL,
  `description` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
INSERT INTO `book` VALUES (1,'Alice in Wonderland','Lewis Carroll','Fantastical tale of a girl named Alice who falls down a rabbit hole into a whimsical world'),
(2,'Matilda','Roald Dahl','Story of a gifted girl facing challenges with her family and school'),
(3,`Charlotte's Web`,'E.B. White','Heartwarming story of a pig named Wilbur and his friendship with a spider named Charlotte'),
(4,`Harry Potter and the Philosopher's Stone`,'J.K. Rowling','First book in the Harry Potter series following the adventures of a young wizard'),
(5,'The Giving Tree','Shel Silverstein','Moving tale of a tree that selflessly gives everything to a boy throughout his life'),
(6,'The Hunger Games','Suzanne Collins','Dystopian novel where teenagers fight to the death in a televised event'),
(7,'The Alchemist','Paulo Coelho','A journey of self-discovery'),
(8,'The Da Vinci Code','Dan Brown','Mystery thriller involving symbology and hidden secrets'),
(9, 'The Lord of the Rings', 'J.R.R. Tolkien', 'Epic fantasy trilogy set in the fictional world of Middle-earth'),
(10, 'The Chronicles of Narnia', 'C.S. Lewis', 'Fantasy series following the adventures of children in the magical land of Narnia');
UNLOCK TABLES;

--
-- Table structure for table `loan`
--

DROP TABLE IF EXISTS `loan`;
CREATE TABLE `loan` (
  `id` int NOT NULL AUTO_INCREMENT,
  `userId` int DEFAULT NULL,
  `bookId` int DEFAULT NULL,
  `loanDate` date DEFAULT NULL,
  `extends` int DEFAULT '0',
  `isLoaned` tinyint DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `loan_userKey_idx` (`userId`),
  KEY `loan_bookKey_idx` (`bookId`),
  CONSTRAINT `loan_bookKey` FOREIGN KEY (`bookId`) REFERENCES `book` (`id`),
  CONSTRAINT `loan_userKey` FOREIGN KEY (`userId`) REFERENCES `usersimple` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `loan`
--

LOCK TABLES `loan` WRITE;
INSERT INTO `loan` VALUES (1,9,7,'20-12-2023',1,1),
(2,5,2,'05-09-2023',2,1),
(3,4,7,'15-07-2023',0,0),
(4,2,9,'03-04-2023',1,0),
(5,3,4,'28-02-2024',0,1),
(6,5,5,'01-01-2024',0,1),
(7,7,9,'25-06-2023',0,0),
(8,10,3,'17-08-2023',2,1),
(9,4,10,'10-11-2023',0,1),
(10,8,5,'09-03-2023',1,0);
UNLOCK TABLES;

--
-- Table structure for table `message`
--

DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` int NOT NULL AUTO_INCREMENT,
  `body` varchar(500) DEFAULT NULL,
  `userId` int DEFAULT NULL,
  `isRead` tinyint DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `message_userKey_idx` (`userId`),
  CONSTRAINT `message_userKey` FOREIGN KEY (`userId`) REFERENCES `usersimple` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `message`
--

LOCK TABLES `message` WRITE;
INSERT INTO `message` VALUES (1,'Lost Book Report',2,0),
(2,'Notification of Lost Library Card',9,0),
(3,'Feedback on Library Staff Assistance',4,1),
(4,'Question About Library Membership Renewal',10,1),
(5,'Concern About Library Hours',3,1),
(6,'Request for Book Recommendation',2,0),
(7,'Issue with Library Website',3,1),
(8,'Feedback on recent book loan',4,0),
(9,'Suggestion for Library Event',9,0),
(10,'Thank you',5,1);
UNLOCK TABLES;

--
-- Table structure for table `usersimple`
--

DROP TABLE IF EXISTS `usersimple`;
CREATE TABLE `usersimple` (
  `id` int NOT NULL AUTO_INCREMENT,
  `userName` varchar(45) DEFAULT NULL,
  `pass` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `status` int DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `usersimple`
--

LOCK TABLES `usersimple` WRITE;
INSERT INTO `usersimple` VALUES (1,'library@gmail.com','1234', '321 Sandy Ln','0506789012',0),
(2,'musiclover_2022@gmail.com','Sunshine2022!','29 Meadow Rd' ,'0553698542',1),
(3,'johndoe85@gmail.com','p@ssw0rd','123 Main St','0526803479',1),
(4,'sarah_smith@gmail.com','ilovebooks','456 Elm St','0508881234',1),
(5,'lisa.greenwood@gmail.com','Pa$$w0rd123','456 Meadow Rd','0588247063',2),
(6,'mike_jackson@gmail.com','m1k3j','789 Oak Ave','0542059137',0),
(7,'david_brown@gmail.com','secureP@ss','567 Cedar Ave','0536370915',2),
(8,'jenny_adams@gmail.com','jenny123','890 Birch St','0543698527',0),
(9,'markanderson76@gmail.com','ilovemydog','987 Brick Ave','0512345676',1),
(10,'jennifer.white@gmail.com','SecretPass!','888 Highrise Blvd','0557749966',2);
UNLOCK TABLES;
