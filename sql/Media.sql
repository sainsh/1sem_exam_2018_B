-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Vært: 127.0.0.1:33067
-- Genereringstid: 18. 12 2018 kl. 13:19:33
-- Serverversion: 5.6.40-log
-- PHP-version: 5.5.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `MediaManager`
--

-- --------------------------------------------------------

--
-- Struktur-dump for tabellen `Media`
--

DROP TABLE IF EXISTS `Media`;
CREATE TABLE IF NOT EXISTS `media` (
  `assetID` int(11) NOT NULL,
  `name` varchar(50) COLLATE utf8mb4_bin NOT NULL,
  `created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fileName` varchar(50) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Data dump for tabellen `Media`
--

INSERT INTO `Media` (`assetID`, `name`, `created`, `fileName`) VALUES
(1, 'hej', '2018-12-18 14:18:21', 'hej.txt'),
(2, 'hej', '2018-12-18 14:18:21', 'hej.txt'),
(3, 'hej', '2018-12-18 14:18:21', 'hej.txt'),
(4, 'hej', '2018-12-18 14:18:21', 'hej.txt'),
(5, 'hej', '2018-12-18 14:18:21', 'hej.txt');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
