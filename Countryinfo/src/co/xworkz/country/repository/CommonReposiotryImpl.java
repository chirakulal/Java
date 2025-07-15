package co.xworkz.country.repository;

import co.xworkz.country.dto.CountryDto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CommonReposiotryImpl implements CommonRepository{


    @Override
    public Collection<CountryDto> findByAll() {
       CountryDto countryDto = new CountryDto("Afghanistan", 1001L, 41, 34, 652230.0, "Mohammad Hassan Akhund", "Pashto", "Dari", 20.1 );
       CountryDto countryDto1 = new CountryDto("Albania", 1002L, 2.8, 12, 28748.0, "Edi Rama", "Albanian", "Greek", 18.3);
       CountryDto countryDto2 = new CountryDto("Algeria", 1003L, 44.2, 58, 2381741.0, "Nadir Larbaoui", "Arabic", "Berber", 206.0);
       CountryDto countryDto3 = new CountryDto("Andorra", 1004L, 0.077, 7, 468.0, "Xavier Espot Zamora", "Catalan", "Spanish", 3.2);
       CountryDto countryDto4 = new CountryDto("Angola", 1005L, 36.6, 18, 1246700.0, "João Lourenço", "Portuguese", "Umbundu", 85.4);
       CountryDto countryDto5 = new CountryDto("Antigua and Barbuda", 1006L, 0.093, 6, 442.6, "Gaston Browne", "English", "Antiguan Creole", 1.8);
       CountryDto countryDto6 = new CountryDto("Argentina", 1007L, 46.2, 23, 2780400.0, "Javier Milei", "Spanish", "Italian", 640.1);
       CountryDto countryDto7 = new CountryDto("Armenia", 1008L, 2.7, 11, 29743.0, "Nikol Pashinyan", "Armenian", "Russian", 20.4);
       CountryDto countryDto8 = new CountryDto("Australia", 1009L, 26.4, 6, 7692024.0, "Anthony Albanese", "English", "Mandarin", 1753.0);
       CountryDto countryDto9 = new CountryDto("Austria", 1010L, 9.1, 9, 83879.0, "Karl Nehammer", "German", "Croatian", 533.7);
       CountryDto countryDto10 = new CountryDto("Azerbaijan", 1011L, 10.3, 10, 86600.0, "Ilham Aliyev", "Azerbaijani", "Russian", 78.7);
       CountryDto countryDto11 = new CountryDto("Bahamas", 1012L, 0.4, 31, 13940.0, "Philip Davis", "English", "Bahamian Creole", 13.6);
       CountryDto countryDto12 = new CountryDto("Bahrain", 1013L, 1.5, 4, 780.0, "Salman bin Hamad Al Khalifa", "Arabic", "English", 46.1);
       CountryDto countryDto13= new CountryDto("Bangladesh", 1014L, 173.0, 8, 148460.0, "Sheikh Hasina", "Bengali", "Chittagonian", 460.2);
       CountryDto countryDto14 = new CountryDto("Barbados", 1015L, 0.28, 11, 430.0, "Mia Mottley", "English", "Bajan Creole", 5.6);
       CountryDto countryDto15 = new CountryDto("Belarus", 1016L, 9.2, 6, 207600.0, "Alexander Lukashenko", "Belarusian", "Russian", 75.3);
       CountryDto countryDto16 = new CountryDto("Belgium", 1017L, 11.7, 10, 30528.0, "Alexander De Croo", "Dutch", "French", 657.8);
       CountryDto countryDto17= new CountryDto("Belize", 1018L, 0.44, 6, 22966.0, "Johnny Briceño", "English", "Spanish", 2.1);
       CountryDto countryDto18= new CountryDto("Benin", 1019L, 13.7, 12, 112622.0, "Patrice Talon", "French", "Fon", 17.2);
       CountryDto countryDto19= new CountryDto("Bhutan", 1020L, 0.78, 20, 38394.0, "Tshering Tobgay", "Dzongkha", "Nepali", 3.2);
       CountryDto countryDto20= new CountryDto("Bolivia", 1021L, 12.3, 9, 1098581.0, "Luis Arce", "Spanish", "Quechua", 45.9);
       CountryDto countryDto21= new CountryDto("Bosnia and Herzegovina", 1022L, 3.2, 10, 51197.0, "Borjana Krišto", "Bosnian", "Serbian", 26.7);
       CountryDto countryDto22= new CountryDto("Botswana", 1023L, 2.6, 10, 581730.0, "Mokgweetsi Masisi", "English", "Tswana", 20.5);
       CountryDto countryDto23= new CountryDto("Brazil", 1024L, 216.4, 26, 8515767.0, "Luiz Inácio Lula da Silva", "Portuguese", "Spanish", 2753.0);
       CountryDto countryDto24= new CountryDto("Brunei", 1025L, 0.45, 4, 5765.0, "Hassanal Bolkiah", "Malay", "English", 16.1);
       CountryDto countryDto25= new CountryDto("Bulgaria", 1026L, 6.4, 28, 110994.0, "Dimitar Glavchev", "Bulgarian", "Turkish", 89.3);
       CountryDto countryDto26= new CountryDto("Burkina Faso", 1027L, 23.3, 13, 272967.0, "Ibrahim Traoré", "French", "Mossi", 20.6);
       CountryDto countryDto27= new CountryDto("Burundi", 1028L, 13.2, 18, 27834.0, "Évariste Ndayishimiye", "Kirundi", "French", 3.5);
       CountryDto countryDto28 = new CountryDto("Cabo Verde", 1029L, 0.56, 10, 4033.0, "José Maria Neves", "Portuguese", "Cape Verdean Creole", 2.1);
       CountryDto countryDto29 = new CountryDto("Cambodia", 1030L, 17.1, 25, 181035.0, "Hun Manet", "Khmer", "French", 32.9);
       CountryDto countryDto30= new CountryDto("Cameroon", 1031L, 28.6, 10, 475442.0, "Joseph Ngute", "French", "English", 45.1);
       CountryDto countryDto31= new CountryDto("Canada", 1032L, 39.0, 13, 9984670.0, "Justin Trudeau", "English", "French", 2320.0);
       CountryDto countryDto32= new CountryDto("Central African Republic", 1033L, 5.5, 16, 622984.0, "Faustin-Archange Touadéra", "French", "Sango", 2.3);
       CountryDto countryDto33= new CountryDto("Chad", 1034L, 18.2, 23, 1284000.0, "Mahamat Déby", "Arabic", "French", 13.5);
       CountryDto countryDto34 = new CountryDto("Chile", 1035L, 19.5, 16, 756102.0, "Gabriel Boric", "Spanish", "Mapudungun", 387.0);
       CountryDto countryDto35= new CountryDto("China", 1036L, 1411.8, 23, 9596961.0, "Li Qiang", "Mandarin", "Cantonese", 17320.0);
       CountryDto countryDto36= new CountryDto("Colombia", 1037L, 52.2, 32, 1141748.0, "Gustavo Petro", "Spanish", "Wayuu", 393.5);
       CountryDto countryDto37= new CountryDto("Comoros", 1038L, 0.85, 3, 2235.0, "Azali Assoumani", "Arabic", "French", 1.2);
       CountryDto countryDto38= new CountryDto("Congo (Congo-Brazzaville)", 1039L, 5.8, 12, 342000.0, "Denis Sassou Nguesso", "French", "Lingala", 14.8);
       CountryDto countryDto39= new CountryDto("Costa Rica", 1040L, 5.2, 7, 51100.0, "Rodrigo Chaves Robles", "Spanish", "English", 85.7);
       CountryDto countryDto40= new CountryDto("Croatia", 1041L, 3.9, 20, 56594.0, "Andrej Plenković", "Croatian", "Italian", 78.9);
       CountryDto countryDto41= new CountryDto("Cuba", 1042L, 11.2, 15, 109884.0, "Miguel Díaz-Canel", "Spanish", "Haitian Creole", 109.4);
       CountryDto countryDto42= new CountryDto("Cyprus", 1043L, 1.3, 6, 9251.0, "Nikos Christodoulides", "Greek", "Turkish", 29.4);
       CountryDto countryDto43= new CountryDto("Czech Republic (Czechia)", 1044L, 10.7, 14, 78867.0, "Petr Fiala", "Czech", "Slovak", 354.3);
       CountryDto countryDto44= new CountryDto("DR Congo (Congo-Kinshasa)", 1045L, 102.3, 26, 2344858.0, "Félix Tshisekedi", "French", "Lingala", 64.9);
       CountryDto countryDto45 = new CountryDto("Denmark", 1046L, 5.9, 5, 42933.0, "Mette Frederiksen", "Danish", "German", 444.0);
       CountryDto countryDto46= new CountryDto("Djibouti", 1047L, 1.1, 6, 23200.0, "Ismaïl Omar Guelleh", "French", "Arabic", 3.5);
       CountryDto countryDto47= new CountryDto("Dominica", 1048L, 0.07, 10, 751.0, "Roosevelt Skerrit", "English", "Dominican Creole", 1.1);
       CountryDto countryDto48= new CountryDto("Dominican Republic", 1049L, 11.3, 31, 48671.0, "Luis Abinader", "Spanish", "Haitian Creole", 120.4);
       CountryDto countryDto49= new CountryDto("Ecuador", 1050L, 18.2, 24, 283561.0, "Daniel Noboa", "Spanish", "Quechua", 118.2);
        CountryDto countryDto50 = new CountryDto("Egypt", 1150L, 109.3, 27, 1002450.0, "Mostafa Madbouly", "Arabic", "English", 404.1);
        CountryDto countryDto51 = new CountryDto("El Salvador", 1160L, 6.5, 14, 21041.0, "Nayib Bukele", "Spanish", "Nawat", 31.5);
        CountryDto countryDto52 = new CountryDto("Equatorial Guinea", 1170L, 1.5, 7, 28051.0, "Manuela Roka Botey", "Spanish", "French", 15.0);
        CountryDto countryDto53 = new CountryDto("Eritrea", 1180L, 3.7, 6, 117600.0, "Abiy Ahmed (in dispute)", "Tigrinya", "Arabic", 7.1);
        CountryDto countryDto54 = new CountryDto("Estonia", 1190L, 1.3, 15, 45228.0, "Kaja Kallas", "Estonian", "Russian", 39.1);
        CountryDto countryDto55 = new CountryDto("Eswatini", 1200L, 1.2, 4, 17364.0, "Cleopas Dlamini", "Swazi", "English", 13.2);
        CountryDto countryDto56 = new CountryDto("Ethiopia", 1210L, 126.5, 11, 1104300.0, "Abiy Ahmed", "Amharic", "Oromo", 111.3);
        CountryDto countryDto57 = new CountryDto("Fiji", 1220L, 0.9, 4, 18274.0, "Sitiveni Rabuka", "English", "Fijian", 5.1);
        CountryDto countryDto58 = new CountryDto("Finland", 1230L, 5.6, 19, 338145.0, "Petteri Orpo", "Finnish", "Swedish", 312.4);
        CountryDto countryDto59 = new CountryDto("France", 1240L, 67.8, 18, 551695.0, "Gabriel Attal", "French", "Breton", 3030.5);
        CountryDto countryDto60 = new CountryDto("Gabon", 1250L, 2.3, 9, 267668.0, "Raymond Ndong Sima", "French", "Fang", 20.4);
        CountryDto countryDto61 = new CountryDto("Gambia", 1260L, 2.7, 5, 11295.0, "Adama Barrow", "English", "Mandinka", 2.1);
        CountryDto countryDto62 = new CountryDto("Georgia", 1270L, 3.7, 9, 69700.0, "Irakli Kobakhidze", "Georgian", "Russian", 28.8);
        CountryDto countryDto63 = new CountryDto("Germany", 1280L, 83.1, 16, 357022.0, "Olaf Scholz", "German", "English", 4460.2);
        CountryDto countryDto64 = new CountryDto("Ghana", 1290L, 34.1, 16, 238533.0, "Nana Akufo-Addo", "English", "Akan", 77.6);
        CountryDto countryDto65 = new CountryDto("Greece", 1300L, 10.3, 13, 131957.0, "Kyriakos Mitsotakis", "Greek", "English", 239.3);
        CountryDto countryDto66 = new CountryDto("Grenada", 1310L, 0.1, 6, 344.0, "Dickon Mitchell", "English", "Grenadian Creole", 1.2);
        CountryDto countryDto67 = new CountryDto("Guatemala", 1320L, 17.4, 22, 108889.0, "Bernardo Arévalo", "Spanish", "Kʼicheʼ", 95.8);
        CountryDto countryDto68 = new CountryDto("Guinea", 1330L, 13.5, 8, 245857.0, "Mamady Doumbouya", "French", "Fula", 16.4);
        CountryDto countryDto69 = new CountryDto("Guinea-Bissau", 1340L, 2.1, 9, 36125.0, "Geraldo Martins", "Portuguese", "Crioulo", 1.7);
        CountryDto countryDto70 = new CountryDto("Guyana", 1350L, 0.8, 10, 214969.0, "Irfaan Ali", "English", "Guyanese Creole", 16.0);
        CountryDto countryDto71 = new CountryDto("Haiti", 1360L, 11.7, 10, 27750.0, "Garry Conille", "French", "Haitian Creole", 21.1);
        CountryDto countryDto72 = new CountryDto("Honduras", 1370L, 10.6, 18, 112492.0, "Xiomara Castro", "Spanish", "Garifuna", 29.5);
        CountryDto countryDto73 = new CountryDto("Hungary", 1380L, 9.5, 19, 93028.0, "Viktor Orbán", "Hungarian", "English", 211.7);
        CountryDto countryDto74 = new CountryDto("Iceland", 1390L, 0.4, 8, 103000.0, "Bjarni Benediktsson", "Icelandic", "English", 30.7);
        CountryDto countryDto75 = new CountryDto("India", 1400L, 1428.6, 28, 3287263.0, "Narendra Modi", "Hindi", "English", 3731.0);
        CountryDto countryDto76 = new CountryDto("Indonesia", 1410L, 277.5, 34, 1904569.0, "Joko Widodo", "Indonesian", "Javanese", 1386.7);
        CountryDto countryDto77 = new CountryDto("Iran", 1420L, 89.6, 31, 1648195.0, "Ebrahim Raisi", "Persian", "Azeri", 388.6);
        CountryDto countryDto78 = new CountryDto("Iraq", 1430L, 45.6, 19, 438317.0, "Mohammed Shia' Al Sudani", "Arabic", "Kurdish", 267.9);
        CountryDto countryDto79 = new CountryDto("Ireland", 1440L, 5.3, 26, 70273.0, "Simon Harris", "Irish", "English", 594.9);
        CountryDto countryDto80 = new CountryDto("Israel", 1450L, 9.8, 6, 22072.0, "Benjamin Netanyahu", "Hebrew", "Arabic", 522.0);
        CountryDto countryDto81 = new CountryDto("Italy", 1460L, 58.9, 20, 301340.0, "Giorgia Meloni", "Italian", "German", 2113.2);
        CountryDto countryDto82 = new CountryDto("Ivory Coast", 1470L, 28.7, 14, 322463.0, "Alassane Ouattara", "French", "Dioula", 74.5);
        CountryDto countryDto83 = new CountryDto("Jamaica", 1480L, 2.8, 14, 10991.0, "Andrew Holness", "English", "Jamaican Patois", 17.7);
        CountryDto countryDto84 = new CountryDto("Japan", 1490L, 123.3, 47, 377975.0, "Fumio Kishida", "Japanese", "English", 4216.5);
        CountryDto countryDto85 = new CountryDto("Jordan", 1500L, 11.3, 12, 89342.0, "Bisher Al-Khasawneh", "Arabic", "English", 49.3);
        CountryDto countryDto86 = new CountryDto("Kazakhstan", 1510L, 19.6, 14, 2724902.0, "Älihan Smaiylov", "Kazakh", "Russian", 243.6);
        CountryDto countryDto87 = new CountryDto("Kenya", 1520L, 55.1, 47, 580367.0, "William Ruto", "Swahili", "English", 115.0);
        CountryDto countryDto88 = new CountryDto("Kiribati", 1530L, 0.1, 3, 811.0, "Taneti Maamau", "English", "Gilbertese", 0.2);
        CountryDto countryDto89 = new CountryDto("Korea, North", 1540L, 26.1, 9, 120540.0, "Kim Jong-un", "Korean", "Chinese", 28.0);
        CountryDto countryDto90 = new CountryDto("Korea, South", 1550L, 52.0, 17, 100210.0, "Yoon Suk-yeol", "Korean", "English", 1812.0);
        CountryDto countryDto91 = new CountryDto("Kosovo", 1560L, 1.9, 7, 10887.0, "Albin Kurti", "Albanian", "Serbian", 9.0);
        CountryDto countryDto92 = new CountryDto("Kuwait", 1570L, 4.3, 6, 17818.0, "Ahmad Nawaf Al-Ahmad Al-Sabah", "Arabic", "English", 164.6);
        CountryDto countryDto93 = new CountryDto("Kyrgyzstan", 1580L, 6.8, 7, 199951.0, "Akylbek Japarov", "Kyrgyz", "Russian", 11.9);
        CountryDto countryDto94 = new CountryDto("Laos", 1590L, 7.5, 17, 236800.0, "Sonexay Siphandone", "Lao", "French", 18.8);
        CountryDto countryDto95 = new CountryDto("Latvia", 1600L, 1.8, 26, 64559.0, "Evika Siliņa", "Latvian", "Russian", 45.2);
        CountryDto countryDto96 = new CountryDto("Lebanon", 1610L, 5.2, 8, 10452.0, "Najib Mikati", "Arabic", "French", 20.5);
        CountryDto countryDto97 = new CountryDto("Lesotho", 1620L, 2.3, 10, 30355.0, "Sam Matekane", "Sesotho", "English", 2.5);
        CountryDto countryDto98 = new CountryDto("Liberia", 1630L, 5.3, 15, 111369.0, "Joseph Boakai", "English", "Kpelle", 4.2);
        CountryDto countryDto99 = new CountryDto("Libya", 1640L, 6.7, 22, 1759540.0, "Abdul Hamid Dbeibeh", "Arabic", "Italian", 42.8);
        CountryDto countryDto100 = new CountryDto("Liechtenstein", 1650L, 0.04, 11, 160.0, "Daniel Risch", "German", "Alemannic", 7.6);
        CountryDto countryDto101 = new CountryDto("Lithuania", 1660L, 2.8, 10, 65300.0, "Ingrida Šimonytė", "Lithuanian", "Russian", 74.3);
        CountryDto countryDto102 = new CountryDto("Luxembourg", 1670L, 0.7, 12, 2586.0, "Luc Frieden", "Luxembourgish", "French", 87.4);
        CountryDto countryDto103 = new CountryDto("Madagascar", 1680L, 30.3, 23, 587041.0, "Christian Ntsay", "Malagasy", "French", 15.2);
        CountryDto countryDto104 = new CountryDto("Malawi", 1690L, 21.6, 28, 118484.0, "Lazarus Chakwera", "English", "Chichewa", 13.1);
        CountryDto countryDto105 = new CountryDto("Malaysia", 1700L, 34.3, 13, 330803.0, "Anwar Ibrahim", "Malay", "English", 434.1);
        CountryDto countryDto106 = new CountryDto("Maldives", 1710L, 0.6, 1, 298.0, "Mohamed Muizzu", "Dhivehi", "English", 5.9);
        CountryDto countryDto107 = new CountryDto("Mali", 1720L, 22.6, 10, 1240192.0, "Choguel Kokalla Maïga", "French", "Bambara", 19.0);
        CountryDto countryDto108 = new CountryDto("Malta", 1730L, 0.5, 5, 316.0, "Robert Abela", "Maltese", "English", 19.4);
        CountryDto countryDto109 = new CountryDto("Marshall Islands", 1740L, 0.06, 2, 181.0, "David Kabua", "Marshallese", "English", 0.3);
        CountryDto countryDto110 = new CountryDto("Mauritania", 1750L, 4.9, 15, 1030700.0, "Mohamed Ould Ghazouani", "Arabic", "French", 11.1);
        CountryDto countryDto111 = new CountryDto("Mauritius", 1760L, 1.3, 9, 2040.0, "Pravind Jugnauth", "English", "French", 14.2);
        CountryDto countryDto112 = new CountryDto("Mexico", 1770L, 129.9, 32, 1964375.0, "Andrés Manuel López Obrador", "Spanish", "Nahuatl", 1499.7);
        CountryDto countryDto113 = new CountryDto("Micronesia", 1780L, 0.1, 4, 702.0, "Wesley Simina", "English", "Chuukese", 0.4);
        CountryDto countryDto114 = new CountryDto("Moldova", 1790L, 2.5, 32, 33846.0, "Dorin Recean", "Romanian", "Russian", 14.4);
        CountryDto countryDto115 = new CountryDto("Monaco", 1800L, 0.04, 1, 2.0, "Albert II", "French", "Italian", 9.8);
        CountryDto countryDto116 = new CountryDto("Mongolia", 1810L, 3.4, 21, 1564116.0, "Luvsannamsrain Oyun-Erdene", "Mongolian", "Russian", 19.2);
        CountryDto countryDto117 = new CountryDto("Montenegro", 1820L, 0.6, 24, 13812.0, "Milojko Spajić", "Montenegrin", "Serbian", 7.8);
        CountryDto countryDto118 = new CountryDto("Morocco", 1830L, 37.8, 12, 446550.0, "Aziz Akhannouch", "Arabic", "Berber", 144.1);
        CountryDto countryDto119 = new CountryDto("Mozambique", 1840L, 33.9, 11, 801590.0, "Adriano Maleiane", "Portuguese", "Makhuwa", 20.6);
        CountryDto countryDto120 = new CountryDto("Myanmar (Burma)", 1850L, 55.2, 14, 676578.0, "Min Aung Hlaing", "Burmese", "Shan", 59.5);
        CountryDto countryDto121 = new CountryDto("Namibia", 1860L, 2.6, 14, 825615.0, "Nangolo Mbumba", "English", "Afrikaans", 13.6);
        CountryDto countryDto122 = new CountryDto("Nauru", 1870L, 0.01, 1, 21.0, "David Adeang", "Nauruan", "English", 0.1);
        CountryDto countryDto123 = new CountryDto("Nepal", 1880L, 30.0, 7, 147516.0, "Pushpa Kamal Dahal", "Nepali", "Maithili", 40.7);
        CountryDto countryDto124 = new CountryDto("Netherlands", 1890L, 17.5, 12, 41543.0, "Dick Schoof", "Dutch", "Frisian", 1048.3);
        CountryDto countryDto125 = new CountryDto("New Zealand", 1900L, 5.2, 16, 268838.0, "Christopher Luxon", "English", "Māori", 253.0);
        CountryDto countryDto126 = new CountryDto("Nicaragua", 1910L, 7.1, 15, 130373.0, "Daniel Ortega", "Spanish", "Miskito", 15.1);
        CountryDto countryDto127 = new CountryDto("Niger", 1920L, 26.2, 8, 1267000.0, "Ali Lamine Zeine", "French", "Hausa", 15.3);
        CountryDto countryDto128 = new CountryDto("Nigeria", 1930L, 223.8, 36, 923769.0, "Bola Tinubu", "English", "Hausa", 477.4);
        CountryDto countryDto129 = new CountryDto("North Macedonia", 1940L, 2.1, 8, 25713.0, "Dimitar Kovačevski", "Macedonian", "Albanian", 14.7);
        CountryDto countryDto130 = new CountryDto("Norway", 1950L, 5.5, 11, 385207.0, "Jonas Gahr Støre", "Norwegian", "Sami", 578.2);
        CountryDto countryDto131 = new CountryDto("Oman", 1960L, 4.7, 11, 309500.0, "Haitham bin Tariq", "Arabic", "English", 104.2);
        CountryDto countryDto132 = new CountryDto("Pakistan", 1970L, 241.5, 4, 881913.0, "Shehbaz Sharif", "Urdu", "Punjabi", 374.9);
        CountryDto countryDto133 = new CountryDto("Palau", 1980L, 0.02, 16, 459.0, "Surangel Whipps Jr.", "Palauan", "English", 0.3);
        CountryDto countryDto134 = new CountryDto("Palestine", 1990L, 5.2, 16, 6020.0, "Mohammad Shtayyeh", "Arabic", "Hebrew", 18.1);
        CountryDto countryDto135 = new CountryDto("Panama", 2000L, 4.5, 10, 75417.0, "José Raúl Mulino", "Spanish", "Ngäbere", 76.8);
        CountryDto countryDto136 = new CountryDto("Papua New Guinea", 2010L, 10.3, 22, 462840.0, "James Marape", "English", "Tok Pisin", 32.4);
        CountryDto countryDto137 = new CountryDto("Paraguay", 2020L, 7.5, 17, 406752.0, "Santiago Peña", "Spanish", "Guarani", 41.7);
        CountryDto countryDto138 = new CountryDto("Peru", 2030L, 34.6, 25, 1285216.0, "Dina Boluarte", "Spanish", "Quechua", 268.3);
        CountryDto countryDto139 = new CountryDto("Philippines", 2040L, 117.3, 17, 300000.0, "Ferdinand Marcos Jr.", "Filipino", "English", 435.7);
        CountryDto countryDto140 = new CountryDto("Poland", 2050L, 37.7, 16, 312696.0, "Donald Tusk", "Polish", "Kashubian", 842.6);
        CountryDto countryDto141 = new CountryDto("Portugal", 2060L, 10.2, 18, 92090.0, "Luís Montenegro", "Portuguese", "Mirandese", 301.7);
        CountryDto countryDto142 = new CountryDto("Qatar", 2070L, 2.7, 8, 11586.0, "Mohammed bin Abdulrahman bin Jassim Al Thani", "Arabic", "English", 235.6);
        CountryDto countryDto143 = new CountryDto("Romania", 2080L, 19.8, 41, 238397.0, "Marcel Ciolacu", "Romanian", "Hungarian", 331.2);
        CountryDto countryDto144 = new CountryDto("Russia", 2090L, 144.4, 85, 17098242.0, "Vladimir Putin", "Russian", "Tatar", 2057.6);
        CountryDto countryDto145 = new CountryDto("Rwanda", 2100L, 14.1, 30, 26338.0, "Édouard Ngirente", "Kinyarwanda", "French", 13.3);
        CountryDto countryDto146 = new CountryDto("Saint Kitts and Nevis", 2110L, 0.05, 14, 261.0, "Terrance Drew", "English", "Saint Kitts Creole", 1.1);
        CountryDto countryDto147 = new CountryDto("Saint Lucia", 2120L, 0.18, 10, 617.0, "Philip J. Pierre", "English", "Saint Lucian Creole French", 2.1);
        CountryDto countryDto148 = new CountryDto("Saint Vincent and the Grenadines", 2130L, 0.11, 6, 389.0, "Ralph Gonsalves", "English", "Vincentian Creole", 0.9);
        CountryDto countryDto149 = new CountryDto("Samoa", 2140L, 0.2, 11, 2842.0, "Fiamē Naomi Mataʻafa", "Samoan", "English", 1.3);
        CountryDto countryDto150 = new CountryDto("San Marino", 2150L, 0.03, 9, 61.0, "Alessandro Scarano & Adele Tonnini", "Italian", "Emilian-Romagnol", 2.2);
        CountryDto countryDto151 = new CountryDto("Sao Tome and Principe", 2160L, 0.2, 7, 964.0, "Patrice Trovoada", "Portuguese", "Forro", 0.5);
        CountryDto countryDto152 = new CountryDto("Saudi Arabia", 2170L, 36.9, 13, 2149690.0, "Mohammed bin Salman", "Arabic", "English", 1135.0);
        CountryDto countryDto153 = new CountryDto("Senegal", 2180L, 18.0, 14, 196722.0, "Bassirou Diomaye Faye", "French", "Wolof", 29.2);
        CountryDto countryDto154 = new CountryDto("Serbia", 2190L, 6.6, 29, 77474.0, "Miloš Vučević", "Serbian", "Hungarian", 71.8);
        CountryDto countryDto155 = new CountryDto("Seychelles", 2200L, 0.1, 8, 459.0, "Wavel Ramkalawan", "Seychellois Creole", "French", 2.0);
        CountryDto countryDto156 = new CountryDto("Sierra Leone", 2210L, 8.8, 5, 71740.0, "Julius Maada Bio", "English", "Krio", 5.1);
        CountryDto countryDto157 = new CountryDto("Singapore", 2220L, 5.9, 1, 728.6, "Lee Hsien Loong", "English", "Mandarin", 515.6);
        CountryDto countryDto158 = new CountryDto("Slovakia", 2230L, 5.4, 8, 49035.0, "Robert Fico", "Slovak", "Hungarian", 142.5);
        CountryDto countryDto159 = new CountryDto("Slovenia", 2240L, 2.1, 12, 20273.0, "Robert Golob", "Slovene", "Italian", 69.3);
        CountryDto countryDto160 = new CountryDto("Solomon Islands", 2250L, 0.7, 9, 28896.0, "Jeremiah Manele", "English", "Pijin", 1.6);
        CountryDto countryDto161 = new CountryDto("Somalia", 2260L, 18.1, 18, 637657.0, "Hamza Abdi Barre", "Somali", "Arabic", 8.1);
        CountryDto countryDto162 = new CountryDto("South Africa", 2270L, 60.4, 9, 1221037.0, "Cyril Ramaphosa", "Zulu", "Afrikaans", 399.0);
        CountryDto countryDto163 = new CountryDto("South Sudan", 2280L, 11.0, 10, 619745.0, "Abdel Fattah al-Burhan (interim)", "English", "Dinka", 4.5);
        CountryDto countryDto164 = new CountryDto("Spain", 2290L, 47.8, 17, 505992.0, "Pedro Sánchez", "Spanish", "Catalan", 1603.1);
        CountryDto countryDto165 = new CountryDto("Sri Lanka", 2300L, 21.9, 9, 65610.0, "Ranil Wickremesinghe", "Sinhala", "Tamil", 84.0);
        CountryDto countryDto166 = new CountryDto("Sudan", 2310L, 48.1, 18, 1861484.0, "Osman Hussein (interim)", "Arabic", "English", 51.0);
        CountryDto countryDto167 = new CountryDto("Suriname", 2320L, 0.6, 10, 163820.0, "Chandrikapersad Santokhi", "Dutch", "Sranan Tongo", 3.9);
        CountryDto countryDto168 = new CountryDto("Sweden", 2330L, 10.5, 21, 450295.0, "Ulf Kristersson", "Swedish", "Sami", 627.4);
        CountryDto countryDto169 = new CountryDto("Switzerland", 2340L, 8.9, 26, 41284.0, "Viola Amherd", "German", "French", 977.0);
        CountryDto countryDto170 = new CountryDto("Syria", 2350L, 23.5, 14, 185180.0, "Bashar al-Assad", "Arabic", "Kurdish", 60.0);
        CountryDto countryDto171 = new CountryDto("Taiwan", 2360L, 23.9, 22, 36197.0, "Lai Ching-te", "Mandarin", "Hokkien", 830.0);
        CountryDto countryDto172 = new CountryDto("Tajikistan", 2370L, 10.0, 4, 143100.0, "Kokhir Rasulzoda", "Tajik", "Russian", 11.6);
        CountryDto countryDto173 = new CountryDto("Tanzania", 2380L, 67.4, 31, 945087.0, "Samia Suluhu Hassan", "Swahili", "English", 85.4);
        CountryDto countryDto174 = new CountryDto("Thailand", 2390L, 71.6, 77, 513120.0, "Srettha Thavisin", "Thai", "English", 543.7);
        CountryDto countryDto175 = new CountryDto("Timor-Leste", 2400L, 1.4, 13, 14874.0, "Xanana Gusmão", "Tetum", "Portuguese", 2.2);
        CountryDto countryDto176 = new CountryDto("Togo", 2410L, 8.8, 5, 56785.0, "Victoire Tomegah Dogbé", "French", "Ewe", 8.6);
        CountryDto countryDto177 = new CountryDto("Tonga", 2420L, 0.1, 5, 747.0, "Siaosi Sovaleni", "Tongan", "English", 0.6);
        CountryDto countryDto178 = new CountryDto("Trinidad and Tobago", 2430L, 1.5, 15, 5130.0, "Keith Rowley", "English", "Trinidadian Creole", 27.1);
        CountryDto countryDto179 = new CountryDto("Tunisia", 2440L, 12.3, 24, 163610.0, "Najla Bouden", "Arabic", "French", 49.2);
        CountryDto countryDto180 = new CountryDto("Turkey", 2450L, 85.3, 81, 783562.0, "Recep Tayyip Erdoğan", "Turkish", "Kurdish", 1306.0);
        CountryDto countryDto181 = new CountryDto("Turkmenistan", 2460L, 6.5, 5, 488100.0, "Serdar Berdimuhamedow", "Turkmen", "Russian", 67.5);
        CountryDto countryDto182 = new CountryDto("Tuvalu", 2470L, 0.012, 1, 26.0, "Kausea Natano", "Tuvaluan", "English", 0.06);
        CountryDto countryDto183 = new CountryDto("Uganda", 2480L, 48.6, 4, 241038.0, "Yoweri Museveni", "English", "Swahili", 49.4);
        CountryDto countryDto184 = new CountryDto("Ukraine", 2490L, 36.7, 24, 603628.0, "Volodymyr Zelenskyy", "Ukrainian", "Russian", 160.5);
        CountryDto countryDto185 = new CountryDto("United Arab Emirates", 2500L, 9.5, 7, 83600.0, "Mohammed bin Zayed Al Nahyan", "Arabic", "English", 498.9);
        CountryDto countryDto186 = new CountryDto("United Kingdom", 2510L, 67.7, 4, 243610.0, "Rishi Sunak", "English", "Welsh", 3263.9);
        CountryDto countryDto187 = new CountryDto("United States", 2520L, 339.9, 50, 9833517.0, "Joe Biden", "English", "Spanish", 28340.3);
        CountryDto countryDto188 = new CountryDto("Uruguay", 2530L, 3.4, 19, 176215.0, "Luis Lacalle Pou", "Spanish", "Portuguese", 78.9);
        CountryDto countryDto189 = new CountryDto("Uzbekistan", 2540L, 36.0, 12, 447400.0, "Abdulla Aripov", "Uzbek", "Russian", 90.7);
        CountryDto countryDto190 = new CountryDto("Vanuatu", 2550L, 0.3, 6, 12189.0, "Charlot Salwai", "Bislama", "English", 1.1);
        CountryDto countryDto191 = new CountryDto("Vatican City", 2560L, 0.0008, 1, 0.49, "Pope Francis", "Italian", "Latin", 0.02);
        CountryDto countryDto192 = new CountryDto("Venezuela", 2570L, 28.3, 23, 916445.0, "Nicolás Maduro", "Spanish", "Wayuu", 96.6);
        CountryDto countryDto193 = new CountryDto("Vietnam", 2580L, 98.9, 58, 331212.0, "Phạm Minh Chính", "Vietnamese", "Khmer", 430.1);
        CountryDto countryDto194 = new CountryDto("Yemen", 2590L, 34.4, 22, 527968.0, "Ahmed Awad bin Mubarak", "Arabic", "Mehri", 22.1);
        CountryDto countryDto195 = new CountryDto("Zambia", 2600L, 20.1, 10, 752612.0, "Hakainde Hichilema", "English", "Bemba", 29.2);
        CountryDto countryDto196 = new CountryDto("Zimbabwe", 2610L, 16.7, 10, 390757.0, "Emmerson Mnangagwa", "English", "Shona", 28.4);
        CountryDto countryDto197 = new CountryDto("South Sudan", 2620L, 11.0, 10, 619745.0, "Salva Kiir Mayardit", "English", "Dinka", 4.5);  // (If needed; or can skip if already included at 163)

        Collection<CountryDto> collection = new ArrayList<>(Arrays.asList(
                countryDto1, countryDto2, countryDto3, countryDto4, countryDto5, countryDto6, countryDto7, countryDto8, countryDto9, countryDto10,
                countryDto11, countryDto12, countryDto13, countryDto14, countryDto15, countryDto16, countryDto17, countryDto18, countryDto19, countryDto20,
                countryDto21, countryDto22, countryDto23, countryDto24, countryDto25, countryDto26, countryDto27, countryDto28, countryDto29, countryDto30,
                countryDto31, countryDto32, countryDto33, countryDto34, countryDto35, countryDto36, countryDto37, countryDto38, countryDto39, countryDto40,
                countryDto41, countryDto42, countryDto43, countryDto44, countryDto45, countryDto46, countryDto47, countryDto48, countryDto49, countryDto50,
                countryDto51, countryDto52, countryDto53, countryDto54, countryDto55, countryDto56, countryDto57, countryDto58, countryDto59, countryDto60,
                countryDto61, countryDto62, countryDto63, countryDto64, countryDto65, countryDto66, countryDto67, countryDto68, countryDto69, countryDto70,
                countryDto71, countryDto72, countryDto73, countryDto74, countryDto75, countryDto76, countryDto77, countryDto78, countryDto79, countryDto80,
                countryDto81, countryDto82, countryDto83, countryDto84, countryDto85, countryDto86, countryDto87, countryDto88, countryDto89, countryDto90,
                countryDto91, countryDto92, countryDto93, countryDto94, countryDto95, countryDto96, countryDto97, countryDto98, countryDto99, countryDto100,
                countryDto101, countryDto102, countryDto103, countryDto104, countryDto105, countryDto106, countryDto107, countryDto108, countryDto109, countryDto110,
                countryDto111, countryDto112, countryDto113, countryDto114, countryDto115, countryDto116, countryDto117, countryDto118, countryDto119, countryDto120,
                countryDto121, countryDto122, countryDto123, countryDto124, countryDto125, countryDto126, countryDto127, countryDto128, countryDto129, countryDto130,
                countryDto131, countryDto132, countryDto133, countryDto134, countryDto135, countryDto136, countryDto137, countryDto138, countryDto139, countryDto140,countryDto141, countryDto142, countryDto143, countryDto144, countryDto145, countryDto146, countryDto147, countryDto148, countryDto149, countryDto150,
                countryDto151, countryDto152, countryDto153, countryDto154, countryDto155, countryDto156, countryDto157, countryDto158, countryDto159, countryDto160,
                countryDto161, countryDto162, countryDto163, countryDto164, countryDto165, countryDto166, countryDto167, countryDto168, countryDto169, countryDto170,
                countryDto171, countryDto172, countryDto173, countryDto174, countryDto175, countryDto176, countryDto177, countryDto178, countryDto179, countryDto180,
                countryDto181, countryDto182, countryDto183, countryDto184, countryDto185, countryDto186, countryDto187, countryDto188, countryDto189, countryDto190,
                countryDto191, countryDto192, countryDto193, countryDto194, countryDto195, countryDto196, countryDto197
        ));

        return collection;
    }
}
