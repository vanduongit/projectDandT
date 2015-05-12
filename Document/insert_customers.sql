-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 12, 2015 at 08:14 PM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `sale_watch`
--

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE IF NOT EXISTS `customers` (
`ID` int(10) unsigned NOT NULL,
  `NAME` varchar(256) CHARACTER SET utf8 DEFAULT NULL,
  `USERNAME` varchar(64) NOT NULL,
  `PASSWORD` varchar(64) NOT NULL,
  `BIRTHDAY` date DEFAULT NULL,
  `PROVINCE` varchar(100) DEFAULT NULL,
  `CUS_PHONE` varchar(100) DEFAULT NULL,
  `CUS_MOBILE` varchar(100) DEFAULT NULL,
  `CUS_EMAIL` varchar(100) DEFAULT NULL,
  `CUS_ADDRESS` varchar(200) DEFAULT NULL,
  `CUS_ADDRESS_SHIP` varchar(200) DEFAULT NULL,
  `DATE_CREATE` datetime DEFAULT NULL,
  `ACTIVE` int(2) DEFAULT '0'
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`ID`, `NAME`, `USERNAME`, `PASSWORD`, `BIRTHDAY`, `PROVINCE`, `CUS_PHONE`, `CUS_MOBILE`, `CUS_EMAIL`, `CUS_ADDRESS`, `CUS_ADDRESS_SHIP`, `DATE_CREATE`, `ACTIVE`) VALUES
(3, 'Nguyen Van Thong', 'thong@gmail.com', '123456', '1991-05-05', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
 ADD PRIMARY KEY (`ID`) USING BTREE;

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customers`
--
ALTER TABLE `customers`
MODIFY `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
