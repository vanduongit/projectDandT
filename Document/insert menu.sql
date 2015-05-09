-- phpMyAdmin SQL Dump
-- version 4.1.6
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 27, 2015 at 11:50 AM
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
-- Dumping data for table `menu`
--

INSERT INTO `menu` (`ID`, `NAME`, `LOGO`, `LINK`, `ACTIVE`, `ORD`, `PARENT_ID`) VALUES
(1, 'Mục lục 1', NULL, '#', 1, 1, NULL),
(2, 'Menu 2', NULL, '#', 1, 1, NULL),
(3, 'Menu 3', NULL, '#', 1, 1, NULL),
(4, 'Menu 4', NULL, '#', 1, 1, NULL),
(5, 'Menu 5', NULL, '#', 1, 1, NULL),
(6, 'Page 1', NULL, '#', 1, 1, 3),
(7, 'Page 2', NULL, '#', 1, 1, 3),
(8, 'Page 3', NULL, '#', 1, 1, 3);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
