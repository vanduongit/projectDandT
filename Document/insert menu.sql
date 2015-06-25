-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 25, 2015 at 06:57 PM
-- Server version: 5.6.24
-- PHP Version: 5.6.8

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
(1, 'DƯỠNG - ĐẶC TRỊ', NULL, 'duong-dac-tri', 1, 1, NULL),
(2, 'LÀM SẠCH', NULL, 'lam-sach', 1, 1, NULL),
(3, 'DINH DƯỠNG - SỨC KHỎE', NULL, 'dinh-duong-suc-khoe', 1, 1, NULL),
(4, 'TRANG ĐIỂM', NULL, 'trang-diem', 1, 1, NULL),
(5, 'NƯỚC HOA', NULL, 'nuoc-hoa', 1, 1, NULL),
(6, 'Chống lão hóa', NULL, 'chong-lao-hoa', 1, 1, 1),
(7, 'Dưỡng trắng', NULL, 'duong-trang', 1, 1, 1),
(8, 'Dưỡng thể', NULL, 'duong-the', 1, 1, 1),
(9, 'PHỤ KIỆN & LINH TINH', NULL, 'phu-kien-linh-tinh', 0, 1, NULL),
(10, 'THƯƠNG HIỆU', NULL, 'thuong-hieu', 1, 1, NULL),
(11, 'SỰ KIỆN', NULL, 'su-kien', 1, 1, NULL),
(12, 'LIÊN HỆ', NULL, 'lien-he', 1, 1, NULL),
(13, 'Trị mụn', NULL, 'tri-mun', 1, 1, 1),
(14, 'Chống nắng', NULL, 'chong-nang', 1, 1, 1),
(15, 'Khác', NULL, 'khac', 1, 1, 1),
(16, 'TÓC', NULL, 'toc', 1, 1, 2),
(17, 'TOÀN THÂN', NULL, 'toan-than', 1, 1, 2),
(18, 'MẶT', NULL, 'mat', 1, 1, 2),
(19, 'COLLAGEN', NULL, 'collagen', 1, 1, 3),
(20, 'Thực phẩm bổ sung', NULL, 'thuc-pham-bo-sung', 1, 1, 3),
(21, 'Giảm cân', NULL, 'giam-can', 1, 1, 3),
(22, 'MẶT', NULL, 'mat', 1, 1, 4),
(23, 'MÔI', NULL, 'moi', 1, 1, 4),
(24, 'MẮT', NULL, 'mat1', 1, 1, 4),
(25, 'Nam', NULL, 'nam', 1, 1, 5),
(26, 'Nữ', NULL, 'nu', 1, 1, 5),
(27, 'Mini-Set', NULL, 'mini-set', 1, 1, 5),
(28, 'Khuyến mãi', NULL, 'khuyen-mai', 1, 1, 12),
(29, 'Bí quyết - chia sẻ', NULL, 'bi-quyet-chia-se', 1, 1, 12);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
