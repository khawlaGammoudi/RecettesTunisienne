-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Dim 18 Janvier 2015 à 15:14
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `gestion_recette`
--

-- --------------------------------------------------------

--
-- Structure de la table `contact`
--

CREATE TABLE IF NOT EXISTS `contact` (
  `email` varchar(150) NOT NULL,
  `sujet` varchar(100) NOT NULL,
  `message` varchar(1500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `contact`
--

INSERT INTO `contact` (`email`, `sujet`, `message`) VALUES
('dhekra@live.com', 'bonjour', 'helllo'),
('dhekra2013@gmail.com', 'hello', 'wfvhskjgfxj,fh'),
('dhekra2015@gmail.com', 'hello', 'dlfjhskngxdk,xfz');

-- --------------------------------------------------------

--
-- Structure de la table `recette`
--

CREATE TABLE IF NOT EXISTS `recette` (
  `id_recettes` tinyint(4) NOT NULL,
  `titre` varchar(50) NOT NULL,
  `description` varchar(5000) NOT NULL,
  `date_publication` varchar(10) NOT NULL,
  `date_modification` varchar(10) NOT NULL,
  `photo` varchar(50) NOT NULL,
  `type` varchar(50) NOT NULL,
  PRIMARY KEY (`id_recettes`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `recette`
--

INSERT INTO `recette` (`id_recettes`, `titre`, `description`, `date_publication`, `date_modification`, `photo`, `type`) VALUES
(1, 'spaghetti', 'Ingrédients / pour 2 personnes\r\n250 g de Capellini (spaghettis plus fins)\r\n200 g de coulis de tomate\r\n2 gousses d''ail\r\n1 cuillère à café d''origan séché\r\n1 avocat\r\nHuile d''olive\r\nUne quinzaine d''olives noires\r\nSel\r\npoivre\r\n1 avocat\r\n2 tranches de jambon serrano (ou tout autre jambon cru)\r\nQuelques feuilles de persil lavées et grossièrement coupées', '2015-01-09', 'null', 'page3-img8.jpg', 'plats'),
(2, 'Gâteau au yaourt', 'Temps de préparation : 15 minutes\r\nTemps de cuisson : 30 minutes\r\n\r\nIngrédients (pour 4 personnes) :\r\n- 1/2 paquet de levure\r\n- 1 pot de yaourt (= 20 cl)\r\n- 1/2 pot d''huile (= 10 cl)\r\n- 2 pots de sucre\r\n- 3 pots de farine\r\n- 2 œufs\r\n- 1 zeste de citron\r\n\r\nPréparation de la recette :\r\n\r\nMélanger tout simplement les ingrédients un à un, dans l''ordre ci-dessus.\r\n\r\nVerser la pâte dans un moule à gâteau. \r\n\r\nPuis, faire cuire à 180°C (thermostat 6) pendant 30 min environ.\r\n\r\nVérifier la cuisson avec la pointe d''un couteau, qui doit ressortir sèche.\r\n\r\nRemarques :\r\nVous pouvez remplacer le citron par un paquet de sucre vanillé. Comme yaourt je vous conseille des Veloutés ou autres yaourts liquides (bulgares, etc.).\r\n', '2015-01-15', 'null', 'page2-img9.jpg', 'dessert'),
(3, 'chakchouka', 'hggggggggggggggggggggggggggggggggrdfjfgdg', '2015-01-03', '0000-00-00', 'page2-img6.jpg', 'plats');

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE IF NOT EXISTS `utilisateur` (
  `id` int(11) NOT NULL,
  `login` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `type` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `utilisateur`
--

INSERT INTO `utilisateur` (`id`, `login`, `password`, `type`) VALUES
(1, 'kouka', 'kouka', 'admin'),
(2, 'douda', 'douda', 'client');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
