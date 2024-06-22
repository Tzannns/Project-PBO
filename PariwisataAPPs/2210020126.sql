-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 22, 2024 at 10:13 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `2210020126`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id_admin` int(11) NOT NULL,
  `nama_admin` char(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `foto` blob DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `artikel`
--

CREATE TABLE `artikel` (
  `id_artikel` int(8) NOT NULL,
  `judul_artikel` varchar(200) NOT NULL,
  `isi_artikel` text NOT NULL,
  `tgl_artikel` date NOT NULL,
  `gambar` blob DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `artikel`
--

INSERT INTO `artikel` (`id_artikel`, `judul_artikel`, `isi_artikel`, `tgl_artikel`, `gambar`) VALUES
(1, 'Marathon', 'hhsdsdfhfsdj', '2027-09-12', 0x77776b776b),
(2, 'Festival Karya Rakyat', 'jifjkgfgkfdkjgkjgjkf', '2023-09-08', 0x6b617279612e706e67),
(3, 'Tilawah Qur\'an', 'wiurieueiwiejhwdjfhhdfjhwdjkhjkfdh', '2026-06-17', 0x74696c617761682e6a7067);

-- --------------------------------------------------------

--
-- Table structure for table `event`
--

CREATE TABLE `event` (
  `id_event` int(11) NOT NULL,
  `nama_event` varchar(255) NOT NULL,
  `lokasi_event` varchar(255) NOT NULL,
  `tgl_event_mulai` date NOT NULL,
  `tgl_event_berakhir` date NOT NULL,
  `deskripsi_event` text NOT NULL,
  `gambar` blob DEFAULT NULL,
  `tgl_pengajuan` date NOT NULL,
  `status` varchar(100) NOT NULL,
  `ket` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `event`
--

INSERT INTO `event` (`id_event`, `nama_event`, `lokasi_event`, `tgl_event_mulai`, `tgl_event_berakhir`, `deskripsi_event`, `gambar`, `tgl_pengajuan`, `status`, `ket`) VALUES
(1, 'java Jazz Festival', 'Bandung', '2024-12-05', '2024-12-10', 'Jazz musik festifal', 0x67616d626172, '2024-10-02', 'aktif', 'Java Musik'),
(2, 'Party Puncak', 'Kediri', '2024-09-01', '2024-09-10', 'Wisata puncak gunung', 0x67756e756e672e6a7067, '2024-08-12', 'nonaktif', 'jhdsjhjdfhjshdjdsf');

-- --------------------------------------------------------

--
-- Table structure for table `kategori`
--

CREATE TABLE `kategori` (
  `id_kategori` int(8) NOT NULL,
  `nama_kategori` char(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `kategori`
--

INSERT INTO `kategori` (`id_kategori`, `nama_kategori`) VALUES
(1, 'Musik'),
(2, 'Bazar'),
(3, 'Religi');

-- --------------------------------------------------------

--
-- Table structure for table `komentar`
--

CREATE TABLE `komentar` (
  `id_komentar` int(8) NOT NULL,
  `isi_komentar` text NOT NULL,
  `tgl_komentar` date NOT NULL,
  `id_artikel` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `komentar`
--

INSERT INTO `komentar` (`id_komentar`, `isi_komentar`, `tgl_komentar`, `id_artikel`) VALUES
(1, 'Mantap', '2024-06-12', 1),
(2, 'fjhdjhfjds', '2024-12-10', 3);

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE `member` (
  `id_member` int(8) NOT NULL,
  `nama_member` varchar(255) NOT NULL,
  `jk` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `foto` blob DEFAULT NULL,
  `tlp` char(13) NOT NULL,
  `informasi` text DEFAULT NULL,
  `keterangan` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`id_member`, `nama_member`, `jk`, `email`, `username`, `password`, `foto`, `tlp`, `informasi`, `keterangan`) VALUES
(1, 'Akhmad', 'laki-laki', 'yangmanazan@gmail.com', 'akhmad', 'akhmad2024', NULL, '087815042129', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `mhs`
--

CREATE TABLE `mhs` (
  `npm` varchar(20) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `telp` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `mhs`
--

INSERT INTO `mhs` (`npm`, `nama`, `telp`, `alamat`) VALUES
('2210020126', 'Akhmad Fauzan', '087815042129', 'jalan bjm');

-- --------------------------------------------------------

--
-- Table structure for table `ulasan`
--

CREATE TABLE `ulasan` (
  `id_ulasan` int(8) NOT NULL,
  `isi_ulasan` text NOT NULL,
  `tgl_ulasan` date NOT NULL,
  `id_member` int(11) NOT NULL,
  `id_event` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indexes for table `artikel`
--
ALTER TABLE `artikel`
  ADD PRIMARY KEY (`id_artikel`);

--
-- Indexes for table `event`
--
ALTER TABLE `event`
  ADD PRIMARY KEY (`id_event`);

--
-- Indexes for table `kategori`
--
ALTER TABLE `kategori`
  ADD PRIMARY KEY (`id_kategori`);

--
-- Indexes for table `komentar`
--
ALTER TABLE `komentar`
  ADD PRIMARY KEY (`id_komentar`);

--
-- Indexes for table `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`id_member`);

--
-- Indexes for table `mhs`
--
ALTER TABLE `mhs`
  ADD PRIMARY KEY (`npm`);

--
-- Indexes for table `ulasan`
--
ALTER TABLE `ulasan`
  ADD PRIMARY KEY (`id_ulasan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
