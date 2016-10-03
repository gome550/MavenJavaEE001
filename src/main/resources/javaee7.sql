-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 2016 年 10 朁E03 日 11:49
-- サーバのバージョン： 5.7.9
-- PHP Version: 5.6.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `javaee7`
--

-- --------------------------------------------------------

--
-- テーブルの構造 `master01`
--

DROP TABLE IF EXISTS `master01`;
CREATE TABLE IF NOT EXISTS `master01` (
  `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `text` varchar(40) DEFAULT NULL,
  `flag1` varchar(1) DEFAULT '0',
  `flag2` varchar(1) DEFAULT '0',
  `update_user` varchar(20) DEFAULT NULL,
  `update_datetime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `create_datetime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- テーブルのデータのダンプ `master01`
--

INSERT INTO `master01` (`id`, `text`, `flag1`, `flag2`, `update_user`, `update_datetime`, `create_datetime`) VALUES
(1, 'データ１', '0', '0', '俺', '2016-08-06 18:11:20', '2016-08-06 18:11:10');

-- --------------------------------------------------------

--
-- テーブルの構造 `master02`
--

DROP TABLE IF EXISTS `master02`;
CREATE TABLE IF NOT EXISTS `master02` (
  `cd` varchar(3) NOT NULL DEFAULT '000',
  `begin_datetime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `end_datetime` datetime DEFAULT NULL,
  `text` varchar(256) DEFAULT NULL,
  `flag01` varchar(1) DEFAULT '0',
  `flag02` varchar(1) DEFAULT '0',
  `flag03` varchar(1) DEFAULT '0',
  `update_user` varchar(20) DEFAULT NULL,
  `update_datetime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `create_datetime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`cd`,`begin_datetime`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- テーブルのデータのダンプ `master02`
--

INSERT INTO `master02` (`cd`, `begin_datetime`, `end_datetime`, `text`, `flag01`, `flag02`, `flag03`, `update_user`, `update_datetime`, `create_datetime`) VALUES
('000', '2016-08-06 23:25:23', '2030-12-31 23:59:59', 'データ１', '0', '0', '0', NULL, '2016-08-06 23:25:23', '2016-08-06 23:25:23');

-- --------------------------------------------------------

--
-- テーブルの構造 `tran01`
--

DROP TABLE IF EXISTS `tran01`;
CREATE TABLE IF NOT EXISTS `tran01` (
  `Id` int(11) NOT NULL,
  `Text` varchar(256) NOT NULL,
  `UpdateDateTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `CreateDateTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`Id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- テーブルの構造 `tran02`
--

DROP TABLE IF EXISTS `tran02`;
CREATE TABLE IF NOT EXISTS `tran02` (
  `id` int(11) NOT NULL,
  `Text` varchar(256) NOT NULL,
  `Tran01_Id` int(11) NOT NULL,
  `UpdateDateTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `CreateDateTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
