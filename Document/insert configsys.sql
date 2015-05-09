-- phpMyAdmin SQL Dump
-- version 4.1.6
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 27, 2015 at 11:49 AM
-- Server version: 5.6.16
-- PHP Version: 5.5.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `sale_watch`
--

--
-- Dumping data for table `configsys`
--

INSERT INTO `configsys` (`ID`, `NAME`, `VALUE`, `DESCRIPTION`, `DATE_CREATED`, `DATE_EFF`, `DATE_EXP`, `ACTIVE`) VALUES
(2, 'owner', 'Phan Van Duong', NULL, '2015-04-27 00:00:00', NULL, NULL, 1),
(4, 'address', 'Quận 9, TP Hồ Chí Minh', NULL, '2015-04-27 00:00:00', NULL, NULL, 1),
(5, 'hotline', '01695 306 207', NULL, '2015-04-27 00:00:00', NULL, NULL, 1);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
