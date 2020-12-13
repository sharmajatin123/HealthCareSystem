/*
SQLyog Community v13.1.6 (64 bit)
MySQL - 5.5.1-m2-community : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `test`;

/*Table structure for table `airline` */

DROP TABLE IF EXISTS `airline`;

CREATE TABLE `airline` (
  `name` varchar(20) DEFAULT NULL,
  `type` varchar(20) DEFAULT NULL,
  `seats` int(5) DEFAULT NULL,
  `model_no` varchar(20) NOT NULL,
  PRIMARY KEY (`model_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `airline` */

insert  into `airline`(`name`,`type`,`seats`,`model_no`) values 
('Etihad','AirBus 380',30,'ABE101'),
('Qatar','Boeing 777',45,'BQ101'),
('United Airlines','AirBus 380',45,'UAA101');

/*Table structure for table `allowance` */

DROP TABLE IF EXISTS `allowance`;

CREATE TABLE `allowance` (
  `employee_id` int(6) NOT NULL,
  `first_name` varchar(20) DEFAULT NULL,
  `b_salary` float DEFAULT NULL,
  `grade_pay` float DEFAULT NULL,
  `sa` float DEFAULT NULL,
  `pa` float DEFAULT NULL,
  `ra` float DEFAULT NULL,
  `ea` float DEFAULT NULL,
  `hra` float DEFAULT NULL,
  `total_days` int(7) DEFAULT NULL,
  `present_days` int(7) DEFAULT NULL,
  `total_allowances` float DEFAULT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `allowance` */

insert  into `allowance`(`employee_id`,`first_name`,`b_salary`,`grade_pay`,`sa`,`pa`,`ra`,`ea`,`hra`,`total_days`,`present_days`,`total_allowances`) values 
(101,'Adesh',40000,0,0,0,0,0,0,30,29,38666.7),
(102,'Dev',90000,500,0,0,0,0,0,30,25,75416.7),
(103,'Lalita',50000,600,0,0,0,0,0,30,30,50600),
(104,'Ninja',20000,456,0,0,0,0,0,30,30,20456);

/*Table structure for table `ambulance_report` */

DROP TABLE IF EXISTS `ambulance_report`;

CREATE TABLE `ambulance_report` (
  `informer_id` varchar(50) NOT NULL,
  `informer_name` varchar(50) DEFAULT NULL,
  `total_injured` varchar(50) DEFAULT NULL,
  `loaction` varchar(50) DEFAULT NULL,
  `contact` varchar(50) DEFAULT NULL,
  `alt_contact` varchar(50) DEFAULT NULL,
  `time_of_response` varchar(50) NOT NULL,
  `contact_ambulance` varchar(50) DEFAULT NULL,
  `network` varchar(50) DEFAULT NULL,
  `ambulance_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`informer_id`,`time_of_response`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `ambulance_report` */

insert  into `ambulance_report`(`informer_id`,`informer_name`,`total_injured`,`loaction`,`contact`,`alt_contact`,`time_of_response`,`contact_ambulance`,`network`,`ambulance_name`) values 
('aaki101','Aakarsh Mandloi','2','City Center','9977010888','7788554455','11/12/2020 14:17:00','7894561230','BosNet','Wheels'),
('aaki101','Aakarsh Mandloi','4','Center Square','9977010888','9977889977','NA','NA','NA','NA'),
('dev101','Dev Vyas','5','Beach','7894561230','7744112255','11/12/2020 14:18:37','7894561230','BosNet','Wheels');

/*Table structure for table `appoint_status` */

DROP TABLE IF EXISTS `appoint_status`;

CREATE TABLE `appoint_status` (
  `pat_id` varchar(50) NOT NULL,
  `pat_name` varchar(50) DEFAULT NULL,
  `doctor_id` varchar(50) NOT NULL,
  `appointment` varchar(50) DEFAULT NULL,
  `date` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`pat_id`,`doctor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `appoint_status` */

insert  into `appoint_status`(`pat_id`,`pat_name`,`doctor_id`,`appointment`,`date`) values 
('aaki101','Aakarsh Mandloi','thomas101','Accepted','09/12/2020'),
('ada101','Ada Khan','anita101','Accepted','11/12/2020'),
('dev101','Dev Vyas','adesh101','Accepted','10/12/2020'),
('dev101','Dev Vyas','anita101','Accepted','17/12/2020'),
('dev101','Dev Vyas','thomas101','Denied','NA');

/*Table structure for table `appointment` */

DROP TABLE IF EXISTS `appointment`;

CREATE TABLE `appointment` (
  `p_name` varchar(50) DEFAULT NULL,
  `p_id` varchar(50) NOT NULL,
  `p_age` varchar(50) DEFAULT NULL,
  `p_sym` varchar(500) DEFAULT NULL,
  `d_name` varchar(50) DEFAULT NULL,
  `d_id` varchar(50) NOT NULL,
  `d_enter` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`p_id`,`d_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `appointment` */

insert  into `appointment`(`p_name`,`p_id`,`p_age`,`p_sym`,`d_name`,`d_id`,`d_enter`) values 
('Aakarsh Mandloi','aaki101','25','Cough,Nausia','Thomas','thomas101','Cal Hospital'),
('Ada Khan','ada101','26','Achne','Anita','anita101','City Hospital'),
('Dev Vyas','dev101','20','Ear pain','Adesh','adesh101','Cal Hospital'),
('Dev Vyas','dev101','20','Cough','Anita','anita101','City Hospital'),
('Dev Vyas','dev101','20','Headache','David','david101','Cal Hospital'),
('Dev Vyas','dev101','20','fever','Thomas','thomas101','Cal Hospital');

/*Table structure for table `audit` */

DROP TABLE IF EXISTS `audit`;

CREATE TABLE `audit` (
  `username` varchar(20) DEFAULT NULL,
  `time` varchar(50) NOT NULL,
  `status` varchar(20) DEFAULT NULL,
  `id` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`time`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `audit` */

insert  into `audit`(`username`,`time`,`status`,`id`) values 
('adesh_vyas','Jul 17, 2020/00:38:59','logged in','1'),
('dev','Jul 17, 2020/00:51:52','logged in','2'),
('lalita','Jul 17, 2020/00:54:13','logged in','3'),
('dev','Jul 17, 2020/01:13:39','logged in','2'),
('dev','Jul 17, 2020/01:13:42','logged out','2'),
('adesh_vyas','Oct 1, 2020/12:12:48','logged in','1'),
('adesh_vyas','Sep 26, 2020/10:55:51','logged in','1'),
('adesh_vyas','Sep 26, 2020/12:34:19','logged in','1'),
('adesh_vyas','Sep 26, 2020/12:50:28','logged out','1');

/*Table structure for table `bank_details` */

DROP TABLE IF EXISTS `bank_details`;

CREATE TABLE `bank_details` (
  `employ_id` varchar(20) NOT NULL,
  `bank_name` varchar(50) DEFAULT NULL,
  `account_no` varchar(20) DEFAULT NULL,
  `ifsc` varchar(20) DEFAULT NULL,
  `branch` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`employ_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `bank_details` */

insert  into `bank_details`(`employ_id`,`bank_name`,`account_no`,`ifsc`,`branch`) values 
('101','SBi','552244117788','SBI1012034','Rau'),
('102','HDFC','100200356545','HDFC134646','Mhow'),
('103','IDFC','564978412364','IDFC789456','Sudama Nagar'),
('104','SBI','456794561365','SBI10235465','China');

/*Table structure for table `cars` */

DROP TABLE IF EXISTS `cars`;

CREATE TABLE `cars` (
  `serial_no` varchar(12) NOT NULL,
  `car_type` varchar(40) DEFAULT NULL,
  `manuf` varchar(20) DEFAULT NULL,
  `model` varchar(40) DEFAULT NULL,
  `yom` int(10) DEFAULT NULL,
  `aval` varchar(10) DEFAULT NULL,
  `min_seat` int(10) DEFAULT NULL,
  `max_seat` int(10) DEFAULT NULL,
  `state` varchar(40) DEFAULT NULL,
  `city` varchar(40) DEFAULT NULL,
  `maintain` varchar(20) DEFAULT NULL,
  `doc` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`serial_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cars` */

insert  into `cars`(`serial_no`,`car_type`,`manuf`,`model`,`yom`,`aval`,`min_seat`,`max_seat`,`state`,`city`,`maintain`,`doc`) values 
('M-09-PX-2015','SUV','Ford','Ecosport',2019,'Yes',1,8,'California','San Jose','Not Expired','08/10/2020');

/*Table structure for table `covid_booking` */

DROP TABLE IF EXISTS `covid_booking`;

CREATE TABLE `covid_booking` (
  `patient_i` varchar(50) NOT NULL,
  `patient_n` varchar(50) DEFAULT NULL,
  `patient_add` varchar(500) DEFAULT NULL,
  `patient_age` varchar(50) DEFAULT NULL,
  `patient_phone` varchar(50) DEFAULT NULL,
  `patient_email` varchar(50) DEFAULT NULL,
  `test_type` varchar(50) DEFAULT NULL,
  `covid_center` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`patient_i`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `covid_booking` */

insert  into `covid_booking`(`patient_i`,`patient_n`,`patient_add`,`patient_age`,`patient_phone`,`patient_email`,`test_type`,`covid_center`) values 
('aaki101','Aakarsh Mandloi','Somewhere','25','9977010888','aaki@gmail.com','RT-PCR','Cal Hospital'),
('ada101','Ada Khan','Indore','26','8527419630','ada@hotmail.com','RT-PCR','City Hospital'),
('dev101','Dev Vyas','Earth','20','7894561230','dev@gmail.com','Antigen','Cal Hospital');

/*Table structure for table `covid_care_result` */

DROP TABLE IF EXISTS `covid_care_result`;

CREATE TABLE `covid_care_result` (
  `patient_i` varchar(50) NOT NULL,
  `patient_n` varchar(50) DEFAULT NULL,
  `patient_add` varchar(500) DEFAULT NULL,
  `patient_age` varchar(50) DEFAULT NULL,
  `patient_phone` varchar(50) DEFAULT NULL,
  `patient_email` varchar(50) DEFAULT NULL,
  `test_type` varchar(50) DEFAULT NULL,
  `covid_center` varchar(50) DEFAULT NULL,
  `request_status` varchar(50) DEFAULT NULL,
  `test_result` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`patient_i`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `covid_care_result` */

insert  into `covid_care_result`(`patient_i`,`patient_n`,`patient_add`,`patient_age`,`patient_phone`,`patient_email`,`test_type`,`covid_center`,`request_status`,`test_result`) values 
('aaki101','Aakarsh Mandloi','Somewhere','25','9977010888','aaki@gmail.com','RT-PCR','Cal Hospital','Declined','Null'),
('ada101','Ada Khan','Indore','26','8527419630','ada@hotmail.com','RT-PCR','City Hospital','Accepted','Positive'),
('dev101','Dev Vyas','Earth','20','7894561230','dev@gmail.com','Antigen','Cal Hospital','Accepted','Negative');

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `f_name` varchar(30) DEFAULT NULL,
  `l_name` varchar(30) DEFAULT NULL,
  `mobile` varchar(12) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `dob` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`mobile`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `customer` */

insert  into `customer`(`f_name`,`l_name`,`mobile`,`email`,`password`,`dob`) values 
('Dev','Vyas','7788994466','dev26vyas@gmail.com','dev101','05/05/1995'),
('Rakesh','Sharma','8844779955','rak@gmail.com','rakesh101',NULL),
('Adesh','Vyas','9988774455','adesh05vyas@gmail.com','adesh102','14/10/2020');

/*Table structure for table `deduction` */

DROP TABLE IF EXISTS `deduction`;

CREATE TABLE `deduction` (
  `e_id` int(11) NOT NULL,
  `name_f` varchar(20) DEFAULT NULL,
  `pf` float DEFAULT NULL,
  `esic` float DEFAULT NULL,
  `pt` float DEFAULT NULL,
  `income_tax` float DEFAULT NULL,
  `adv` float DEFAULT NULL,
  `other` float DEFAULT NULL,
  `other_reason` varchar(200) DEFAULT NULL,
  `total_deduction` float DEFAULT NULL,
  `salary_final` float DEFAULT NULL,
  PRIMARY KEY (`e_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `deduction` */

insert  into `deduction`(`e_id`,`name_f`,`pf`,`esic`,`pt`,`income_tax`,`adv`,`other`,`other_reason`,`total_deduction`,`salary_final`) values 
(101,'Adesh',3600,0,208,0,0,0,'',3808,34858.7),
(102,'Dev',1000,0,208,0,0,0,'No reason for this',1208,74208.7),
(103,'Lalita',900,0,208,0,0,0,'sdfasfdwsfsdafs',1108,49492),
(104,'Ninja',0,0,125,0,0,0,'',125,20331);

/*Table structure for table `donor_request` */

DROP TABLE IF EXISTS `donor_request`;

CREATE TABLE `donor_request` (
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `blood` varchar(50) DEFAULT NULL,
  `weight` varchar(50) DEFAULT NULL,
  `height` varchar(50) DEFAULT NULL,
  `username` varchar(50) NOT NULL,
  `age` varchar(50) DEFAULT NULL,
  `donor_org` varchar(50) NOT NULL,
  `donor_location` varchar(50) DEFAULT NULL,
  `donor_net` varchar(50) DEFAULT NULL,
  `donor_enter` varchar(50) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`username`,`donor_org`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `donor_request` */

insert  into `donor_request`(`first_name`,`last_name`,`gender`,`address`,`email`,`phone`,`blood`,`weight`,`height`,`username`,`age`,`donor_org`,`donor_location`,`donor_net`,`donor_enter`,`status`) values 
('Aakarsh','Mandloi','Male','Somewhere','aaki@gmail.com','9977010888','B+','147.71','165','aaki101','25','Save Life Blood Bank','Earth','BosNet','San Jose','Pending'),
('Dev','Vyas','Male','Earth','dev@gmail.com','7894561230','AB+','187','178','dev101','20','Save Life Blood Bank','Earth','BosNet','San Jose','Accepted');

/*Table structure for table `emp_table` */

DROP TABLE IF EXISTS `emp_table`;

CREATE TABLE `emp_table` (
  `emp_id` int(6) NOT NULL AUTO_INCREMENT,
  `f_name` varchar(20) DEFAULT NULL,
  `l_name` varchar(20) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `dob` varchar(10) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `contact` varchar(12) DEFAULT NULL,
  `p_address` varchar(100) DEFAULT NULL,
  `c_address` varchar(100) DEFAULT NULL,
  `pincode` varchar(6) DEFAULT NULL,
  `institute` varchar(20) DEFAULT NULL,
  `dept` varchar(20) DEFAULT NULL,
  `designation` varchar(30) DEFAULT NULL,
  `doj` varchar(12) DEFAULT NULL,
  `basic_salary` float DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  `image` mediumblob,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=105 DEFAULT CHARSET=latin1;

/*Data for the table `emp_table` */

insert  into `emp_table`(`emp_id`,`f_name`,`l_name`,`gender`,`dob`,`email`,`contact`,`p_address`,`c_address`,`pincode`,`institute`,`dept`,`designation`,`doj`,`basic_salary`,`status`,`image`) values 
(101,'Adesh','Vyas','','05/05/1995','adesh@gmail.com','8602386226','somewhere in world','somewhere in world','452009','IIST','CSE','Assosiate Professor','29/07/2019',40000,'Permanent',NULL),
(102,'Dev','Vyas','','05/05/1995','dev@gmail.com','9893198938','Indore','Indore','452001','IIST','IT','Principal','29/07/2019',90000,'Permanent',NULL),
(103,'Lalita','Rawal','','10/07/1966','lalita@gmail.com','987654321','somewhere on earth','somewhere on earth','452009','IIP','B2','Professor','10/10/2010',50000,'Permanent',NULL),
(104,'Ninja','Warrior','','26/09/2020','ninjahasnoid@gmail.com','9977101888','Shaolin Temple','Shaolin Temple','452020','Transport','Ambulance','None','27/09/2020',20000,'Contract',NULL);

/*Table structure for table `fire_report` */

DROP TABLE IF EXISTS `fire_report`;

CREATE TABLE `fire_report` (
  `informer_id` varchar(50) NOT NULL,
  `informer_name` varchar(50) DEFAULT NULL,
  `total_injured` varchar(50) DEFAULT NULL,
  `loaction` varchar(50) DEFAULT NULL,
  `contact` varchar(50) DEFAULT NULL,
  `alt_contact` varchar(50) DEFAULT NULL,
  `time_of_response` varchar(50) DEFAULT NULL,
  `contact_fire` varchar(50) DEFAULT NULL,
  `network` varchar(50) DEFAULT NULL,
  `fire_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`informer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `fire_report` */

insert  into `fire_report`(`informer_id`,`informer_name`,`total_injured`,`loaction`,`contact`,`alt_contact`,`time_of_response`,`contact_fire`,`network`,`fire_name`) values 
('aaki101','Aakarsh Mandloi','2','City Center','9977010888','7788554455','11/12/2020 14:38:01','8877994455','BosNet','FireOut'),
('dev101','Dev Vyas','5','Beach','7894561230','7744112255','NA','NA','NA','NA');

/*Table structure for table `flight` */

DROP TABLE IF EXISTS `flight`;

CREATE TABLE `flight` (
  `fli_name` varchar(30) DEFAULT NULL,
  `fli_type` varchar(30) DEFAULT NULL,
  `flight_no` varchar(30) NOT NULL,
  `source` varchar(20) DEFAULT NULL,
  `destination` varchar(20) DEFAULT NULL,
  `de_date` varchar(12) DEFAULT NULL,
  `ar_date` varchar(12) DEFAULT NULL,
  `de_time` varchar(12) DEFAULT NULL,
  `ar_time` varchar(12) DEFAULT NULL,
  `price` int(10) DEFAULT NULL,
  `a_seat` int(10) DEFAULT NULL,
  PRIMARY KEY (`flight_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `flight` */

insert  into `flight`(`fli_name`,`fli_type`,`flight_no`,`source`,`destination`,`de_date`,`ar_date`,`de_time`,`ar_time`,`price`,`a_seat`) values 
('Air India','AirBus 380','1230','Mumbai','New York','03/11/2020','04/11/2020','16:00','19:00',200,30),
('United Airlines','AirBus 380','4510','New York','London','02/11/2020','03/11/2020','21:00','05:35',630,28),
('Air China','Boeing 777','4560','Tokyo','Mumbai','31/10/2020','02/11/2020','22:30','00:20',1505,45),
('Emirates','AirBus 380','7890','Boston','New York','03/11/2020','03/11/2020','04:00','05:20',850,30);

/*Table structure for table `insurance` */

DROP TABLE IF EXISTS `insurance`;

CREATE TABLE `insurance` (
  `company_name` varchar(50) DEFAULT NULL,
  `company_id` varchar(50) NOT NULL,
  `pass` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`company_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `insurance` */

insert  into `insurance`(`company_name`,`company_id`,`pass`) values 
('ICICI','com101','compass');

/*Table structure for table `insure_request` */

DROP TABLE IF EXISTS `insure_request`;

CREATE TABLE `insure_request` (
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `blood` varchar(50) DEFAULT NULL,
  `weight` varchar(50) DEFAULT NULL,
  `height` varchar(50) DEFAULT NULL,
  `username` varchar(50) NOT NULL,
  `age` varchar(50) DEFAULT NULL,
  `duration` varchar(50) DEFAULT NULL,
  `pack_type` varchar(50) DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `insure_request` */

insert  into `insure_request`(`first_name`,`last_name`,`gender`,`address`,`email`,`phone`,`blood`,`weight`,`height`,`username`,`age`,`duration`,`pack_type`,`amount`,`status`) values 
('Aakarsh','Mandloi','Male','Somewhere','aaki@gmail.com','9977010888','B+','147.71','165','aaki101','25','1 year','Gold',200,'Accepted'),
('Dev','Vyas','Male','Earth','dev@gmail.com','7894561230','AB+','187','178','dev101','20','1 year','Gold',500,'Rejected');

/*Table structure for table `logins` */

DROP TABLE IF EXISTS `logins`;

CREATE TABLE `logins` (
  `user` varchar(50) NOT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`user`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `logins` */

/*Table structure for table `manage_ambulance` */

DROP TABLE IF EXISTS `manage_ambulance`;

CREATE TABLE `manage_ambulance` (
  `ambulance_name` varchar(50) DEFAULT NULL,
  `contact` varchar(50) DEFAULT NULL,
  `location` varchar(50) DEFAULT NULL,
  `usern` varchar(50) NOT NULL,
  `passw` varchar(50) DEFAULT NULL,
  `net` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`usern`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `manage_ambulance` */

insert  into `manage_ambulance`(`ambulance_name`,`contact`,`location`,`usern`,`passw`,`net`) values 
('Wheels','7894561230','Earth','wh101','whpass','BosNet');

/*Table structure for table `manage_covid` */

DROP TABLE IF EXISTS `manage_covid`;

CREATE TABLE `manage_covid` (
  `covid_doc` varchar(50) DEFAULT NULL,
  `covid_location` varchar(50) DEFAULT NULL,
  `covid_username` varchar(50) NOT NULL,
  `covid_pass` varchar(50) DEFAULT NULL,
  `covid_net` varchar(50) DEFAULT NULL,
  `covid_enter` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`covid_username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `manage_covid` */

insert  into `manage_covid`(`covid_doc`,`covid_location`,`covid_username`,`covid_pass`,`covid_net`,`covid_enter`) values 
('Anshul','Someplace','anshul101','anshulpass','Texas','City Hospital'),
('Peter','MountIDA','peter101','peterpass','CalNet','Cal Hospital');

/*Table structure for table `manage_doc` */

DROP TABLE IF EXISTS `manage_doc`;

CREATE TABLE `manage_doc` (
  `doc_name` varchar(50) DEFAULT NULL,
  `special` varchar(50) DEFAULT NULL,
  `location` varchar(50) DEFAULT NULL,
  `usern` varchar(50) NOT NULL,
  `passw` varchar(50) DEFAULT NULL,
  `doc_net` varchar(50) DEFAULT NULL,
  `doc_enter` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`usern`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `manage_doc` */

insert  into `manage_doc`(`doc_name`,`special`,`location`,`usern`,`passw`,`doc_net`,`doc_enter`) values 
('Adesh','ENT','Kane Squre','adesh101','adeshpass','CalNet','Cal Hospital'),
('Anita','Dermitologist','Someplace','anita101','anitapass','Texas','City Hospital'),
('David','Cardiology','Kane Squre','david101','davidpass','CalNet','Cal Hospital'),
('Thomas','Ortho','Mount IDA','thomas101','thomaspass','CalNet','Cal Hospital');

/*Table structure for table `manage_donor` */

DROP TABLE IF EXISTS `manage_donor`;

CREATE TABLE `manage_donor` (
  `donor_org` varchar(50) DEFAULT NULL,
  `donor_location` varchar(50) DEFAULT NULL,
  `donor_username` varchar(50) NOT NULL,
  `donor_pass` varchar(50) DEFAULT NULL,
  `donor_net` varchar(50) DEFAULT NULL,
  `donor_enter` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`donor_username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `manage_donor` */

insert  into `manage_donor`(`donor_org`,`donor_location`,`donor_username`,`donor_pass`,`donor_net`,`donor_enter`) values 
('Save Life Blood Bank','Earth','ravi101','ravipass','BosNet','San Jose');

/*Table structure for table `manage_emerg` */

DROP TABLE IF EXISTS `manage_emerg`;

CREATE TABLE `manage_emerg` (
  `org_id` varchar(50) NOT NULL,
  `org_type` varchar(50) DEFAULT NULL,
  `org_name` varchar(50) DEFAULT NULL,
  `org_net` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`org_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `manage_emerg` */

insert  into `manage_emerg`(`org_id`,`org_type`,`org_name`,`org_net`) values 
('1','Ambulance','Wheels','BosNet'),
('2','Fire Department','FireOut','BosNet');

/*Table structure for table `manage_enter` */

DROP TABLE IF EXISTS `manage_enter`;

CREATE TABLE `manage_enter` (
  `network_name` varchar(50) DEFAULT NULL,
  `enter_type` varchar(50) DEFAULT NULL,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `manage_enter` */

insert  into `manage_enter`(`network_name`,`enter_type`,`name`) values 
('AriNet','Emergency','Arizona City Emergency'),
('CalNet','Hospital','Cal Hospital'),
('FloNet','Medical Services','Center of Medical Service'),
('Texas','Hospital','City Hospital'),
('BosNet','Emergency','CityBostonEmergency'),
('CalNet','Emergency','Quick Response'),
('BosNet','Emergency','San Jose');

/*Table structure for table `manage_fire` */

DROP TABLE IF EXISTS `manage_fire`;

CREATE TABLE `manage_fire` (
  `fire_name` varchar(50) DEFAULT NULL,
  `contact` varchar(50) DEFAULT NULL,
  `location` varchar(50) DEFAULT NULL,
  `usern` varchar(50) NOT NULL,
  `passw` varchar(50) DEFAULT NULL,
  `net` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`usern`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `manage_fire` */

insert  into `manage_fire`(`fire_name`,`contact`,`location`,`usern`,`passw`,`net`) values 
('FireOut','8877994455','Beach','fo101','fopass','BosNet');

/*Table structure for table `manage_hospital` */

DROP TABLE IF EXISTS `manage_hospital`;

CREATE TABLE `manage_hospital` (
  `o_id` int(10) NOT NULL,
  `o_type` varchar(50) DEFAULT NULL,
  `o_name` varchar(50) DEFAULT NULL,
  `o_net` varchar(50) DEFAULT NULL,
  `o_ent` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`o_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `manage_hospital` */

insert  into `manage_hospital`(`o_id`,`o_type`,`o_name`,`o_net`,`o_ent`) values 
(1,'Doctor','Thomas','CalNet','Cal Hospital'),
(2,'CovidCare','Peter','CalNet','Cal Hospital'),
(3,'Doctor','David','CalNet','Cal Hospital'),
(4,'Doctor','Adesh','CalNet','Cal Hospital'),
(5,'Doctor','Anita','Texas','City Hospital'),
(6,'CovidCare','Anshul','Texas','City Hospital');

/*Table structure for table `manage_lab` */

DROP TABLE IF EXISTS `manage_lab`;

CREATE TABLE `manage_lab` (
  `phamacy_org` varchar(50) DEFAULT NULL,
  `phamacy_location` varchar(50) DEFAULT NULL,
  `phamacy_username` varchar(50) NOT NULL,
  `phamacy_pass` varchar(50) DEFAULT NULL,
  `phamacy_net` varchar(50) DEFAULT NULL,
  `phamacy_enter` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`phamacy_username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `manage_lab` */

insert  into `manage_lab`(`phamacy_org`,`phamacy_location`,`phamacy_username`,`phamacy_pass`,`phamacy_net`,`phamacy_enter`) values 
('Test Laby','Someplace near','rahul101','rahulpass','BosNet','San Jose');

/*Table structure for table `manage_logins` */

DROP TABLE IF EXISTS `manage_logins`;

CREATE TABLE `manage_logins` (
  `n_name` varchar(50) DEFAULT NULL,
  `e_name` varchar(50) DEFAULT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) DEFAULT NULL,
  `o_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `manage_logins` */

insert  into `manage_logins`(`n_name`,`e_name`,`username`,`password`,`o_name`) values 
('BosNet','CityBostonEmergency','cbe101','cbepass','Rohit Verma'),
('CalNet','Cal Hospital','ch101','chpass','Monty Singh'),
('Texas','City Hospital','city101','citypass','Dev Vyas'),
('FloNet','Center of Medical Service','cm101','cmpass','Robert D'),
('AriNet','Arizona City Emergency','don101','donpass','Don'),
('BosNet','San Jose','sj101','sjpass','Rakesh Jain');

/*Table structure for table `manage_medical` */

DROP TABLE IF EXISTS `manage_medical`;

CREATE TABLE `manage_medical` (
  `org_id` varchar(50) NOT NULL,
  `org_type` varchar(50) DEFAULT NULL,
  `org_name` varchar(50) DEFAULT NULL,
  `org_net` varchar(50) DEFAULT NULL,
  `org_enter` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`org_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `manage_medical` */

insert  into `manage_medical`(`org_id`,`org_type`,`org_name`,`org_net`,`org_enter`) values 
('1','Pharmacy','Medi Home Pharmacy','BosNet','San Jose'),
('2','Laboratory','Test Laby','BosNet','San Jose'),
('3','Blood Donor Camp','Save Life Blood Bank','BosNet','San Jose');

/*Table structure for table `manage_phamacy` */

DROP TABLE IF EXISTS `manage_phamacy`;

CREATE TABLE `manage_phamacy` (
  `phamacy_org` varchar(50) DEFAULT NULL,
  `phamacy_location` varchar(50) DEFAULT NULL,
  `phamacy_username` varchar(50) NOT NULL,
  `phamacy_pass` varchar(50) DEFAULT NULL,
  `phamacy_net` varchar(50) DEFAULT NULL,
  `phamacy_enter` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`phamacy_username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `manage_phamacy` */

insert  into `manage_phamacy`(`phamacy_org`,`phamacy_location`,`phamacy_username`,`phamacy_pass`,`phamacy_net`,`phamacy_enter`) values 
('Medi Home Pharmacy','around','monu101','monupass','BosNet','San Jose');

/*Table structure for table `network` */

DROP TABLE IF EXISTS `network`;

CREATE TABLE `network` (
  `state_name` varchar(50) NOT NULL,
  `net_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`state_name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `network` */

insert  into `network`(`state_name`,`net_name`) values 
('Arizona','AriNet'),
('Boston','BosNet'),
('California','CalNet'),
('Florida','FloNet'),
('TexNet','Texas');

/*Table structure for table `pharmacy_status` */

DROP TABLE IF EXISTS `pharmacy_status`;

CREATE TABLE `pharmacy_status` (
  `b_id` varchar(50) NOT NULL,
  `b_name` varchar(50) DEFAULT NULL,
  `do_id` varchar(50) NOT NULL,
  `do_name` varchar(50) DEFAULT NULL,
  `do_enter` varchar(50) DEFAULT NULL,
  `drug` varchar(50) DEFAULT NULL,
  `quantity` varchar(50) DEFAULT NULL,
  `dose` varchar(50) DEFAULT NULL,
  `duration` varchar(50) DEFAULT NULL,
  `instruction` varchar(500) DEFAULT NULL,
  `date_time` varchar(50) NOT NULL,
  `request` varchar(50) DEFAULT NULL,
  `p_id` varchar(50) DEFAULT NULL,
  `p_org` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`b_id`,`do_id`,`date_time`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `pharmacy_status` */

insert  into `pharmacy_status`(`b_id`,`b_name`,`do_id`,`do_name`,`do_enter`,`drug`,`quantity`,`dose`,`duration`,`instruction`,`date_time`,`request`,`p_id`,`p_org`) values 
('aaki101','Aakarsh Mandloi','thomas101','Thomas','Cal Hospital','Paracitamol','200','2','5 days','Take to Tablet per day','10/12/2020 20:45:15','Accepted','Medi Home Pharmacy','monu101'),
('ada101','Ada Khan','anita101','Anita','City Hospital','Avil','20','1','2 days','Before breakfast','10/12/2020 20:43:42','Accepted','Medi Home Pharmacy','monu101'),
('dev101','Dev Vyas','thomas101','Thomas','Cal Hospital','Parxon','50','1','7 days','Once a day after lunch','10/12/2020 20:44:09','Denied','Medi Home Pharmacy','monu101');

/*Table structure for table `prescription` */

DROP TABLE IF EXISTS `prescription`;

CREATE TABLE `prescription` (
  `b_id` varchar(50) NOT NULL,
  `b_name` varchar(50) DEFAULT NULL,
  `do_id` varchar(50) NOT NULL,
  `do_name` varchar(50) DEFAULT NULL,
  `do_enter` varchar(50) DEFAULT NULL,
  `drug` varchar(50) DEFAULT NULL,
  `quantity` varchar(50) DEFAULT NULL,
  `dose` varchar(50) DEFAULT NULL,
  `duration` varchar(50) DEFAULT NULL,
  `instruction` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`b_id`,`do_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `prescription` */

insert  into `prescription`(`b_id`,`b_name`,`do_id`,`do_name`,`do_enter`,`drug`,`quantity`,`dose`,`duration`,`instruction`) values 
('aaki101','Aakarsh Mandloi','thomas101','Thomas','Cal Hospital','Paracitamol','200','2','5 days','Take to Tablet per day'),
('ada101','Ada Khan','anita101','Anita','City Hospital','Avil','20','1','2 days','Before breakfast'),
('dev101','Dev Vyas','thomas101','Thomas','Cal Hospital','Parxon','50','1','7 days','Once a day after lunch');

/*Table structure for table `salary` */

DROP TABLE IF EXISTS `salary`;

CREATE TABLE `salary` (
  `employ_id` int(11) NOT NULL,
  `name_first` varchar(20) DEFAULT NULL,
  `name_last` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`employ_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `salary` */

/*Table structure for table `testing` */

DROP TABLE IF EXISTS `testing`;

CREATE TABLE `testing` (
  `pat_id` varchar(50) NOT NULL,
  `pat_name` varchar(50) DEFAULT NULL,
  `doctor_id` varchar(50) NOT NULL,
  `doctor_name` varchar(50) DEFAULT NULL,
  `date` varchar(50) DEFAULT NULL,
  `test_type` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`pat_id`,`doctor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `testing` */

insert  into `testing`(`pat_id`,`pat_name`,`doctor_id`,`doctor_name`,`date`,`test_type`) values 
('ada101','Ada Khan','anita101','Anita','12/12/2020','ECG'),
('dev101','Dev Vyas','anita101','Anita','11/12/2020','CBC');

/*Table structure for table `testing_status` */

DROP TABLE IF EXISTS `testing_status`;

CREATE TABLE `testing_status` (
  `pat_id` varchar(50) NOT NULL,
  `pat_name` varchar(50) DEFAULT NULL,
  `doctor_id` varchar(50) NOT NULL,
  `doctor_name` varchar(50) DEFAULT NULL,
  `doctor_date` varchar(50) DEFAULT NULL,
  `test_type` varchar(50) DEFAULT NULL,
  `reporting_date` varchar(50) DEFAULT NULL,
  `result` varchar(50) DEFAULT NULL,
  `organisation` varchar(50) DEFAULT NULL,
  `location` varchar(50) DEFAULT NULL,
  `network` varchar(50) DEFAULT NULL,
  `enterprise` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`pat_id`,`doctor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `testing_status` */

insert  into `testing_status`(`pat_id`,`pat_name`,`doctor_id`,`doctor_name`,`doctor_date`,`test_type`,`reporting_date`,`result`,`organisation`,`location`,`network`,`enterprise`) values 
('ada101','Ada Khan','anita101','Anita','12/12/2020','ECG','11/12/2020 00:09:29','Positive','Test Laby','Someplace near','BosNet','San Jose'),
('dev101','Dev Vyas','anita101','Anita','11/12/2020','CBC','11/12/2020 00:10:24','Negative','Test Laby','Someplace near','BosNet','San Jose');

/*Table structure for table `user_data` */

DROP TABLE IF EXISTS `user_data`;

CREATE TABLE `user_data` (
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `blood` varchar(50) DEFAULT NULL,
  `weight` varchar(50) DEFAULT NULL,
  `height` varchar(50) DEFAULT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) DEFAULT NULL,
  `age` varchar(50) DEFAULT NULL,
  `image` mediumblob,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user_data` */

insert  into `user_data`(`first_name`,`last_name`,`gender`,`address`,`email`,`phone`,`blood`,`weight`,`height`,`username`,`password`,`age`,`image`) values 
('Aakarsh','Mandloi','Male','Somewhere','aaki@gmail.com','9977010888','B+','147.71','165','aaki101','aakipass','25',NULL),
('Ada','Khan','Female','Indore','ada@hotmail.com','8527419630','B+','153','150','ada101','adapass','20',NULL),
('Dev','Vyas','Male','Earth','dev@gmail.com','7894561230','AB+','187','178','dev101','devpass','20','����\0JFIF\0\0`\0`\0\0��|Exif\0\0MM\0*\0\0\0\0\r\0\0\0\0\0\0�\0\0\0\0\0\0�1\0\0\0\0\0\0�2\0\0\0\0\0\0�;\0\0\0\0\0\0�\0\0\0\0\0\0\0\0\0\0\0\0\0\n�\0\0\0\0\0\0\nԇi\0\0\0\0\0\0�%\0\0\0\0\0\0✝\0\0\0\0\0\0f�\0\0\0\0\0\0��\0	\0\0\0\0\0<\0\0\0\0�\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0LENOVO\0\0Lenovo A6020a40\0Picasa\0\02016:08:29 21:01:31\0Picasa\0\0\0��\0\0\0\0\0\0`�\"\0\0\0\0\0\0\0\0�\'\0\0\0\0�\0\0�\0\0\0\0\00220�\0\0\0\0\0\0h�\0\0\0\0\0\0|�\0\0\0\0\0�\0\0\0\0\0\0��\0\0\0\0\0\0��\0\n\0\0\0\0\0��\0\0\0\0\0\0\0�	\0\0\0\0\0\0\0�\n\0\0\0\0\0\0���\0\0\0\0\0\0���\0\0\0\044\0\0��\0\0\0\044\0\0�\0\0\0\0\00100�\0\0\0\0\0\0\0�\0\0\0\0\0\0��\0\0\0\0\0\0\n�\0\0\0\0\0\0��\0\0\0\0\0\0\0\n�\0\0\0\0\0\n\0�\0\0\0\0\0\0\0\n�\0\0\0\0\0\0\0\0�\0\0\0\0\0\0��\0\0\0\0\0\r� \0\0\0\0!\0\0��\0\0\0\0\0\nT\0\0\0\0�\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\02016:08:29 20:55:42\02016:08:29 20:55:42\0\0\0�\0\0�\0\0\0�\0\0\0d����\0\0\0d\0\0`\0\0�445347\0\0\0\0S\0\0\037e36f4e86aa4fedcc3563f766b0cc8b\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\00\0\0\0\0\0\0\08\0\0\0\0\0M\0\0\0\0\0\0\0\0\0\0P\0\0\0\0\0\0\0X\0\0\0\0\0\0\0�\0\0\0d\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0&\0\0\0\0\0\0|\0\0\02016:08:29\0\0\0\0P\0i\0c\0a\0s\0a\0\0\0��Bhttp://ns.adobe.com/xap/1.0/\0<?xpacket begin=\'﻿\' id=\'W5M0MpCehiHzreSzNTczkc9d\'?>\r\n<x:xmpmeta xmlns:x=\"adobe:ns:meta/\"><rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><rdf:Description rdf:about=\"uuid:faf5bdd5-ba3d-11da-ad31-d33d75182f1b\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\"><xmp:CreateDate>2016-08-29T20:55:42.440</xmp:CreateDate><xmp:CreatorTool>Picasa</xmp:CreatorTool></rdf:Description><rdf:Description rdf:about=\"uuid:faf5bdd5-ba3d-11da-ad31-d33d75182f1b\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\"/><rdf:Description rdf:about=\"uuid:faf5bdd5-ba3d-11da-ad31-d33d75182f1b\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\"><dc:creator><rdf:Seq xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><rdf:li>Picasa</rdf:li></rdf:Seq>\r\n			</dc:creator></rdf:Description></rdf:RDF></x:xmpmeta>\r\n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                            <?xpacket end=\'w\'?>��\0C\0		\n\r\Z\Z $.\' \",#(7),01444\'9=82<.342��\0C			\r\r2!!22222222222222222222222222222222222222222222222222��\0�P\"\0��\0\0\0\0\0\0\0\0\0\0\0	\n��\0�\0\0\0}\0!1AQa\"q2���#B��R��$3br�	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz���������������������������������������������������������������������������\0\0\0\0\0\0\0\0	\n��\0�\0\0w\0!1AQaq\"2�B����	#3R�br�\n$4�%�\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz��������������������������������������������������������������������������\0\0\0?\0�|:�t����z�����@?٫�\n)E%�QKH3�J(i{QK@	K@�K@(���ZQ�JZ\0Z 4�\0�3Q��%�ƱuZق�o@i6�i���^}u�I�ؘZ�|ctF1�֕��M�E4�F�\\~u�2�����?�/Y��\r��X�����?:zȭЃ^6�\"�$fv��;�s� Y#�F����Vf����J��H� ¨B�FA�����@\r��:��i\r-!�����\n)h���E\0��Pm���*�G\0���)\0S����S�)E\0--&)E\0�P(������*���C�۴�0��,\\^Cl��p�SXW�.��R�6;W��s��\"0xZ�23�9[�\r�C��w�J�E=�c�;�3g�j��I�#eT�اd�Q^br=)��=jL�=*�!�\0]Ɔ�REv����Q��9�.w$�#�,L�E���ץK�V�\0�ҩOzcp����\\Gq��%�\"g�zk��׭����ּId\"��}*\0������{M��o)?��ֶ#�$�6\rM�*�����=�K�c���hWB=�T��#�0��欫nzU}%-!���Sh(��\0(��\0J)i(\0��(�|\"�j���)� :�IKL\nZAK�\0ZZJZ\0QKIK@-�$4�p\0�\nږ��nd�����0���u+�Ŏ�xZ��=i��ߺS���nY7n#�]X�y	8�y�)�S7b�[\0�*���q�]�ێ�Ssy�՘P�d�j�[�F*XL�Ő~t���q���I;�U�=j[��<���TW���B���@���qN�2���nRXgޫ�kj�O	+ǥdI��-�V��KBI\0�N\\��jo�ڞIqҬ	��J��G�Q�J����L�-Ŗ�ݹG��Cѵ����w����+kJ�%���<�,#��)k+F�V��qZ�CHih4\0�)h���Z\0J(���(�\n��:�KR0���1\0����ii1K@-P\\ߋož��ÿ�u0�砯*�������E�R��f4�w�u�U݂�֕���P6~���I����4�I\\Sx�O~�,���:sW�Hu��z��A�I̧����ގ�&��u�U�[��\n���|�}�j�.�\r������\\	���1ڤWxW%O\n�[ǂ�$zR�H�a�8>�,e��Cq.*��l3��z��Il�`�I�Ua��X�r�(ߠ����`9#5RF(v��z�!����1�=k;PӆKFyEk���d+j@I���zzV���6�*�.3Ҩ.r\0�1>;SB;�\0_�o,��^�nPk��[�\"�p+�tټ�Dl����QE\0%Q@%PE�\0QIE\0W�\nZ�\nZJQL\n\\R\nZ\0Z(��QKHh��im�K���+�\'l��5�x�����Ҹi�f��D��Ud�S��Zc�U1�-��`�ғf;�Y�}��ҡ�!����M�@��QMa�(*w(���H�ڑ�+���X�ل)��5�\"��\n�����8s��R�$�b����I���[IC�2��M<�`7j�{��|��\Z���f�����-��C0Ȭ���a��sګ�ڴ$c�5�]����Z���� �T�Qrķ\\Rͨ��-g�䎕i_q\\���4C��M@\0 ��X\n�_�V��H=�O=�V�A��`_��&�k�<%|g��$W�Bs�k����E���M���إ�A#dK��R!�QE0\nJ(�\0�\Z(�����\0�4�m8T�)E%-\08R�\nQLB斒�������\"�{R�<h���C\\��wS]G�o��ȃ���r�u�Q�9��0�z��C��cLn����D����*�]2.*K�� QҢV\ZW\'kԹ�K�*�痿֔z;��#����5���f��L��z��J����?�D>bp�T�xIw�zS��BG�c.�	�����%coʽ2/Ġ|��c����A�Vo�B��<�-��܆�cۓ^�y��6\n�k�����~�q��2õ���0:SJ���.�2Hx�_L�G\"��L�Ӓ�gi��5#C���a�j�\rX�\r���Ա��u�J�3�j�X�!���4���k��9�]��˾��#�� Qɫk��OZ���;P\r0����h&��\ni�4�@�Zh4�)E6�\Z`:��4�\0�����!j;�al�T��tlqI���e��w��X�&N+{�v��TuS��k�\'�<խ��T��)���\Zk�sQ���&R,F�	��M��/Z��t�gevZ�4���qת���E��m,A ���{uUTQF1W�\n�Rlݡ��ݧy�S1GW&�B%�b��4��,�\"��4�s�+g�1�P�]��H$�V=��Pp+��<�Y�V�ÑQ�֦�]�)�`h�9�J�-oKY %W��MB�t5�P���\Z��]ȀȩcR>��ɩӀ3](�<x��/ZJ-L��p�}���H�V5�Z����?AT�~ �F�-������4A4��<RPM% i3Fi(:u2�*F--6�P�i(�u(4���� �(�7�c�[��c�WwWq^��c4hq�5�^h�496+/k��Έ����r��������#�Zz4w,-��t��<	j�F�W��V���Q���jKղe�(�Aק�A����,��Zk��ߛn+����w�=���\r�8�H�Qjz��jr؃�#p��M�W*�G�[Ɣd�yM�{5��m*�%_ή%�H2�\rx孽��r��5�h�\\F�$��sԧɳ7�yn��L1փ0$�TS1PMC{v��H��y��%�sv���B��#��~�溞�}畍��Z��]��7\\0ϽtB���f3�N��)5�Tm�E�֩�k�� 85�C��O f�$�kA4��7u�z�\'.����\\�}�ox�����J(���j�(ʞ��|�śY�ZH�om���Dz��rE_Օ��:U�M=�}�3^�j%���9I��>�$��r>U�UA�\0��W���^��uu��a(��ғM&�B�4I�\0\\�f�4@&h�%\0.i3II@\r�(�f�\Z���Ss@4��4���Z\0x��\np����4V��On�G5��#A��]�r1\\w��ؒ`pEs֍�gNv��<?)�T�����I���͉HrE/��/޺MF�.����gR|�.+�\\歡���J�F�Ғ��[�d�Bt���,�z(�\'�i-�`����`�8�CC�n[���ii^Y��.k���&���5\'�@��؟���>�H�s�J�.�y�I��܃�v�ԎMs>!��\r�����P��+H�ǖ:��Ke�C��[P�jM��г5ni�\n��2��#�k^��Z]�3��.�ER�+�y��Z]��em����fyG2�(�[X��\\t\"�ShP�IT���[�y�ɐq�m[I�Ag���C]\\�r�`�����H�yd|��N����ROs6�R��,��ks[���ҵ!�0��pj��5����<�^E�IGG���(�%\'/#d�+���/#DN⹽WO���(S��k����b�dO�1]<���xNP��iV�mj�=*�����b��nr7wv�A4��1!���\nJ)\r\0-%�4�)3E!4fh�斐�f�\r34��!���\r8\ZcK�i��p���Ph���\r��{���5�/lqY��M)�G��1��\'Nz�X��6�Ⳣ�H�|�95���:��w:⭡J��w*���qV��c?}O����ԟe��������B���}�OV���󡴸�p��mOJ,�^����$d���X:|\r�k���i�s޴d�PI��z\Z�kD��*y��ܥ՚�aPY^ ��M��>aȭ(��\n��7�J���cH�@�\\��`���l\"�.��n7�ڬEe&��5i�I周|��T2$ d�*�ضyf�\r�#���i;!�g\\���3v�E�Zȏ%ģ������9�3I0\n&������%�r]?�5O�ĩp�zU�%�}˜��-�;i-����i;�5U����S������1Z�U���b���)����g�\0ZCIE �)�����s@��4R�Pi��\ZH\r/z`�f�ǃ�-0\Zu\0?4\nh�f�)�D�!V��QC\n�H���f/�q]]��\r��RC�V��x��:iI��g�[��f���j�I�\\w�֕�a�	��/cO��;��k�w`SaS�.eT�ۥU�Q��\0�%�I�nE�2u�K�T|�^�P�,��T���Z�N��5<#8�Y�j�>c9��2�-��R�Z����4���&�ɀ*��<�4����Σު�y�b&�P�\rW��q���O.0��B�c��ת����>srz�i��M4��&�M)��@M!�4��@i	��4\0���Ji	�bR�M&h����u 4���\Zc)��Z\0p4��qK@�M�@��N��7FG�r�ј�X{�[X:չ����h�\ZR���������*�ә�W�4z0w4V�g��Ꭲ�ﴸ���*N�:�XrF��,�A�Y��8l�M>(Տ&�-\n2�\\>A:�p�d$��[8��F*;�#U�\"��4�OM�;X�kY&_Z�۳�W���sKV\r�p=j�5���;\0x��6V�VWB��j���}�p+$fF\n:�괻_\"�&�����È�C@p(4f�Mu�bg��r)��i��x��sIFi3@!���HiO4�H4��⒘\r����KI�QLc�- ���Zh��\nu0S�\0<R�\r(�TP��e#�ME\'�#�����d=3Q�+W�H<�a�aF�\Z�}�S�ԒHL�B���O�ۀ�b\'��8^����M�e��l��W#��U�Mj��#���&��`�0W\0u5Fqrd(�ƺ�*1�P�a�g4��&r\"��L�p*�����\0;�+���NB�G�b��tCh�K]��Z��*�Y�&��Cst�zf��\'�\'ʍ����Wv��T(��l�X`UU�^�\\���%.gq����i�4��&��	�\0�M4M�\0�<�x�\0��M �4\0f�KHh)\r.)\r\02��J;P����)��i{P1�L��҃Q	��2\03�vb�(4���Y��+>՚�������BL�X�D�|��4�F�XW5q{,P-�+6˙r�9��+:�T�eR��u\Z���,�i�+��*i\\�S�4ח)ksӄ4������R*sV%aҳ����C*MFXF@?�$~%�\n5n�a���\ZM���_ʚq��6�q�W*��*��	�<���Mћ;�}\Z�UE\'(\r\\�K�d���b2jܖ� \n�)�ڔ�Lrv#g.���c,wI���T�<����x5�9$ф��=ѣ\\5K���障�O)�8�5����3^��乢xҮ��dnM=*�7��ɩM�c���9\'f�cR-^䦐�\"�2q�S���\r.V�ROaMFO�<����PQIޓ&���K�g8�րHi�斐�)���Pb��sK@�����`��i��i�{�w��ⵍ)Kc9U�we�Prj�Υ\Z����U��d6SE�@~s]T�Y�S}\"j�ݝ�R����Gq�K�+�S�c�Օ�i��,8��Z��zU��)�V㡚��D�nj�tU˥�j�Ex��l�=̪WRD��U�ځ^K=��J)<�/�H�y��uEC�i_\\�?��\\ڃ��yf�<��ȏy2k������dc}p�g�_�5v�	X�Ě�F)^�I>�C6�杨i��y��A����ݖƉ_qqM�i��FO5Q&D�� ���7qֱc�Z�\'�z�,�$|�b�T�HGz_5�j�N��k��w34��KqSX_�G$��JT0�f�\"8�\"ՙq��nEx�95`0#5Άd�\Z���\Z⫆��;�b��F�rh5Uo���{�3�%��U\"�d�⓽08=\r8*\Ze&��Gzh4f��QFi)4��Kr895	�v�(JG<��q�~�ZK�<g�4���Q	%2� �)���䩈rؼY�9���s֌���NF�C$�4�6.\0�4�3֨�����	�4������e�� ��\"MF\ny��\Z�-�P�L�\ZA�3�ˏQT6�nWuX��C2g,:�6����;p8�eU_f3�\nEl�ik�e���qi����7d�y�T2��\\��5�~�gw�!a��\\f�W9\"�Kt^�9a�I��� T�@��1ޒ�Fh�z��\n����Nڄ������T 8�Ք���8j~Κ�>KW�Um=(\0��6�ja�+��:t��{S�\n_Ҥ�W������\']�@늩R( �4�t4ˁ�8�n u5@������C���v^�:^�R�՜�F[�H֜vf�])2ʬ85��\n�9�����<2�t�﩮\r^Á���9A�ٝ𚚺03��i��ޠ�:R���5�X��&84������4S��Q�T~j��7�)�hl`����REq�x�n�1�W\"�=�e��ޯ)�GLSLEw��8��c���\"���	���<S�a@�����ӭF:`�ӏJ��V�^f/������Y����b�уS<DsL�x5iJ����4�¢�Y����\\c�����8��`I����[�X=jd���8��=,��n�p�1�&�}�b�N�Ʀ*엱qEY�-��AV<��y4� �{X#o�G��c#�� A�*U^*Q	4Z�$�+ݶ��^�\'B:Ԫ�i�A�N�`�\0�����N�9�I[\"�T\np>�6)��Rc��A4��@����4�(��!���R��6V\n����B��cA��ոn3�5EiCc�sԦ���U\\H��Ӷ�J�.aa0i@����+]��d��ks���rkQ�r���͜m�@�4 �F�Z���l)����a:�ri�4�8���krq����U�lɰ��9G����5^3�}��UЧ�b.iv�T�Y�;a�,C�y�\Z��S���ѱ�YT�\n��FԫԤ�5b�L�g�Sf�.�к��0Eyu2�����,���x[�!��u��R}���9D��5�s{�{�=h�b^\0�7{1���׽wQ��S8+�ji��^;T�Ł�KX�R`�WjI+#�r���]�9������F�;�\"6\\\Z]�i�|�p�^��c>X�Rv���V!�sS��\\J.U���A�N9��ڂH�\n@A�D��?Ω�bm��B�,hR\Zz�q�楍ʞf�$j��G9�\nq\'(��4�N)��T���\'Zj\\+6:{UY.�*�⑥G��Z$=M x��<9�搘�(�4���S\0�w~���(�P�f�\Zo�@8\0��\Z˹���]O�:t��Bv�c�+�A��(��P�����8���4c�@�is�3JE\0��k.�ګdլ��n���L�-_,)��R�>bylg��I\ng�O��Γj��M:7}��:5��)���\\R}i������\n̡�I� Ҩh�&��Ӕ�Ma�	ӭq��4�Ȧjp�\Z\Z��El�*�ظ5R�֩+�i��Eg�n�rX�*����9�B����4����ɴ�u�`ԑ[$杸��:ri��\Zc�b��JH�B�)��[	?zH��Ϳ<U���qW��5\'�)۽�)ZB\r.qړ�\r�\Z\0����愹V$c\rY�t��N�A=�W�U�GJ\\�x����ѻڐ(\0�P�z�B���ih\rG��N\r�)��ҎGh��2E#0��4�@��\0t��FpH�&��d-��o��*�5��-�QVw����u.��qJHm�]Gjc0�)H���wRHC���MBnAlc�Z��V�TsT-nZwUaT�}E{��m4�暿v�HS�Sa�8�T����ۚ�\"�>A�):R~6\r�BUǥS�I�c�i�����I���n3JG�rF\rH�3�j�����;�>)�����*���@��V�(�ƉX�Uv`N(2�^*4?7=jG�$X\0��Z����\r�Z���X�j#*�ت��y`䚮���u�֩A��l� `�N�Z�hI�dՑ��KVcEi,cw-ޖ��@��VqFh��t���ƣy�8�N������Gt��\rSE���N���z��`�\"p	4�c�j�] �ǭYG��,=	pO~i�Ҍ��@�����TS����Z�t��ҤU>��y�n u�K�:�\04����4��y�T�\rV��b�rռ��i���i�КD����m*�GZS��J������Z�;E?4��;����@��,q��#�Nqқ��N�i��i\0�8�d�gZ���R�um4֠1�\r(�X\'+�g���*���4-���D&^�ju����ږrA�\Z#��*�\\��UL>[ո���P�ȇ�)bJ���H�r��*\\ ��Z�ٹ�q���/�zU�$�\0����w$�]�\0G5`t�LV��٬^��wj:�7{Q��!�k�.k4^��ۇJ�ݑ�T%�Wva����E��&K����Z|b�Yًc��w�)y\rP��Ŏ:��[#��s�y�$�S��6�T�Mh���^*���=�_S�@���]a��H�.)���Bb�)�\n@�ԡ�qLB�3Q��F*RՓ��,l\n�3BWc,I$� �CV�k+זuB+imUIXD�-Fq�P��@��J~�)�r�W���(�\ZL��h%E=�}�LV�TP^\r3�$c�5��\02:�I����x��@���w�X�~Y,M#8�������u�Z��ɑ�:��(��I.B.Z��b�\'�&���t�w�(8���gɫ�\0Ra�����r��\\�^+)Rx��MY�N2��s�h��s����\'���SUzR�j�jg5�${�����h�x($�K7fʹ���^���/ҝM�=iH8⁇9��8���␀�Q�)�9����A�4�\'4�?� �h$���8�H:���K�i\0��Qp��9�f�fa�T��)7\Z�#�p^j���OZym6�$�\Zfp���4ߛu &\r���p��P�	�ޣo\rBW(��\'#�=�=*�����t��M7����<�b1�J�j���9)n��}�T۫9.D�\0(�Z�\rXZ�⛓�Q�.�R����.��ZSI���W!sv�hu\r�5pin%\'��$�|��<��B�4vۻ��bw>�5��&�.��iNFMC\0����S$��<\Z��Y�\nʲ�Jac�<V�ʤ��+{Y��%��Z� ���?:�$f2=:ӎ�u.ܳ��p{U5�d���\"��F*���v�M�и�-�>Pf�ޯn��єQ�\'�����w$��Z7{�a��R�dR\rI3�B}餏Z�YB��X5,�ל�q�d��G2ȡ�6���}雀���R=���34�0\0Ⳗ�1++U%rz����j]Ʋ�eG��<\n�z�j�����c�H�c�fG�lz�qRqQ�Z{0�{	��#�3<��7&+.]4��O&��A��N�g�[5�w�|�ΚÞ����\'}F���Ui�C�j�S���I0�J��C)n�p1�4�}魒8����yp\rTg,jFj\"�a6Cu H�8�2y.o�}�x��S�b*��:�2��UrsX�K�2XL�\'�хX�1Q�ߓZQ ڮM\"7\Z�\0Թ���H�����c�:��~W?���\0�u�`2�\0�b�+���;���>ŭ������6Z�rv���E��S��\Z}�kIЃ�\0��:���QE5^�q:4�5��#����Z�x�\0��P�ϸ{\n}���Z���)�o�@�?�E��������GX�\0�6MCWa��(��o>���>������?���MV5?�QO�ϸ{\n}���dq�\0�\n�����=����)����7�\0ǅUk����9��(��ϸ�B�bH5MF��`��S�\0Ǩ���T}AЧ�cx�R��h%�W�SU��_W��p�F��~���Po�\0]Q��bE�U�~���w����QO�L����p�}��֞<er)֊*�������Lg��)O��?�Ί(��%���|c&�ԃ�M��tQT�ȟ���(��1ӿ�/�Y�(��H_W� �b���C���9��=��t F�%�D9��ŮD	;O&�*�VH��*rTո�G7�E^�Or\"a�f�۰0�w�E\\^�\'��'),
('Maan','Singh','Male','Indore','maan@gmail.com','6655447788','B-','157','142','maan101','maanpass','52','�PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0~\0\0\0~\0\0\0�#��\0\0\0sBIT|d�\0\0\0sRGB\0���\0\0\0gAMA\0\0���a\0\0\0	pHYs\0\0�\0\0��+\0\0{IDATx^�L���J�� \ZD�D�`�\Z1�؍QK4�hb�b��\"jlA@��\Z5��\"`\"F@ň��\r[,8�}�G(�w��3���f�v�n�3;�3�֌Jw��Og�9E�)BxN�s��S��\"��!<��9E�)BxN�s��S��\"���L�x��\ry��)y��-������\'���\"666��ޞxxx�\r\Z����ׯ_$::���Đ�ϟ�w���7�����7�?>�۷/~�1 ��!�j:~�x�`�d�E@7oތG��~�ʕ���\\����������T<2_���������Z��v�؁��&!��/��H�*�\\\Z\Z���&Ѹk޼9k��ٳg��[�bL�(�߹sg��l۶�����{�^�J6�ݹs��zQlU���G�V7��nNN�ԉb�������\\�1u�����M:u�1�УGr��-��E���˗c�x����{��aL}(R����`H}(N���dR\\\\�1�r��)��	����!�STT�L�(Nx��)�?~���|���	_XX�!�����cL](N��߿cH(��ȅ�oܸ1��A�&M0�.\'|˖-1����1�.\'|�v�0d|�����0�.\'�����O�-H�֭1�.\'|�^�s����Ð�P��$((c�eΜ9R�������Օ���`L}(Rx�b�}��;w��W�(vNJJ��V���ٱ%YjF�%�ӧ	Ęaٿ?�T�x�RRR�V���4��]�]�(~^��/���3���&.]��1u�ت^�������ZC��Ft@��]�ta���z�AN�>�1N`�	1z��J�e]�СCxd�09�gϞ�^�zi�&fmmMg̘�G��^�ݻwiXXmذ�V�+���ݹs\'-,,�#��I���	$--��`��I���$����C���nff�[T#��v�D�^ ?BxN�s��S�ָ���u�gϞ%�A!x��t%��5��iӦ�;���/0`\0�iҀ������t�����ť�m�@cbb�L�\n�b�\nZ�^=�i�֮];����gh:D�/_��nݺi�8��ҥK�lM�����F��ne��^w0��y���SQk��Bo�9�/�\0��Ãؤ��ʽptt�T�d�V�P&z~�ƍZ3�7���3��]xx�@M���n#G��\\Q�������X����Ǐ+�y���oذC ..C�BV�_�|�(�EJ@��we��\'%%���\0�	\0�l�2�\r����\r���X���O�5k�[\ZY�߳g	Ø�~��LXx����\Z���ׯ̓���IF�a�C^.-ZT�U˫��ݛ�ݻ�>x���OG��III��W�.�f\nY�<xp��ͦN�J?~���Q;���i۶m�q��S����ze�R��?|�sA7�o�Ύ�)�AV�+f6s�L<{�(((`�������Mx��R)S�nK�,����e@����)�\"��W�^՚9j�iӦ��o߾�ߚ7o�ȇl¯_��R�����g��g\0�y��L�ل�0aB�R�����Y�9s��f͚aLd���Gk&�͌5�~[Η�����бcG67^�XYY�\'O�[[[L�7����J^xj���B���Ǽz��3��u��{oa<���_G���R��+j��\'���k׮Q�0��$�����7oo���A_]*4�G��v�Obb\"��,�_�~��d�l���x�US\\\\\\*�q��,���s��у�����ŋ��ٙm�o�>��/�v�Jǌ�1ݐE����r�V�YYY�A���ޞ����������5�I�������I]pp0�WǦM����;�,�/X�����jP:�C�����\n8}�t��8���58���삁G��Ա*���\'�������`\0�*�\0�̝;S�?�i�o�fa���kF�\r\ZD�>|��7f�yU<}��SjDcJݑEx;;��R�����ٖ�ѣG����*˗/������߿��Ɔ5ض[�l��Q�F�m������9+H�x��5��suE�5��f��(ژ<y2��\"���\r����Ǝ˞���T�P}�e���l{�%*���;va\\�|S����	i2G��km��4�Nݵ��#lM�\0V�v�ޝnذ�+66�޸q������?~̾�2e\n��GS�o޼�)uGg����J3G�+���ӧOl___L�����#G����!C���+\0�\0�F�ba\0����I�0�2���l9������ϟ?Dj��\n�u�%>L�����`je`2%x�\0�R+�=]��jd���lʹ��!��@��>�HU<���#�J=9v�=z4���l]BUH%���ݻ��Qc@xA�hJ㿀ƙ�Ӈ�[�����\0�i�l�kA\Zx	�0?���c�!���Ղ���Ô�5k��п������4̰���ugff�����Te#���kt�*6�#//�JUzi)��;L�j޼9�C�F۠-P���`@d�W�f�C�ąO777L����A��9�[�w�O���D\"���B�ZЦM�f��G�b�a����ĉ�a(B�Z�iU�gϞ=1U����,6�/ ���@+����`N��A	2��;9��x�EU����իWLt��!|�i��V��moݺ�D_�p!�ȋ�����0a���e��a�\r�]�����uD���ɓ�Rw`^��񢣣1U?�e\0\\��X^^^5��Wጊ�b�hݺ5����^&`BT� ^�V�hxx8�P	c�ڀ	�v�Æ\rc��L\\}���e��k֬����j3�4ikkK�ж�p��#����]���D�(�kX����@��ݙ+c ���N\ZN�s��S��\"��!<��9E�)BxN�s��S��\"��!<��9E�%��ŇsFV3s\0\0\0\0IEND�B`�');

/*Table structure for table `userlog` */

DROP TABLE IF EXISTS `userlog`;

CREATE TABLE `userlog` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Username` varchar(20) DEFAULT NULL,
  `Password` varchar(20) DEFAULT NULL,
  `empid` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  UNIQUE KEY `Id` (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `userlog` */

insert  into `userlog`(`Id`,`Username`,`Password`,`empid`) values 
(1,'adesh_vyas','cool',101),
(2,'dev','not_cool',102),
(3,'lalita','12345',103),
(4,'admin','admin',0);

/*Table structure for table `vaccine` */

DROP TABLE IF EXISTS `vaccine`;

CREATE TABLE `vaccine` (
  `pat_id` varchar(50) NOT NULL,
  `pat_name` varchar(50) DEFAULT NULL,
  `doctor_id` varchar(50) NOT NULL,
  `doctor_name` varchar(50) DEFAULT NULL,
  `date` varchar(50) DEFAULT NULL,
  `vaccine_type` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`pat_id`,`doctor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `vaccine` */

insert  into `vaccine`(`pat_id`,`pat_name`,`doctor_id`,`doctor_name`,`date`,`vaccine_type`) values 
('aaki101','Aakarsh Mandloi','thomas101','Thomas','15/12/2020','TDC'),
('dev101','Dev Vyas','thomas101','Thomas','17/12/2020','MMR');

/*Table structure for table `vaccine_status` */

DROP TABLE IF EXISTS `vaccine_status`;

CREATE TABLE `vaccine_status` (
  `pat_id` varchar(50) NOT NULL,
  `pat_name` varchar(50) DEFAULT NULL,
  `doctor_id` varchar(50) NOT NULL,
  `doctor_name` varchar(50) DEFAULT NULL,
  `date` varchar(50) DEFAULT NULL,
  `vaccine_type` varchar(50) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  `date_of_vaccination` varchar(50) DEFAULT NULL,
  `organisation` varchar(50) DEFAULT NULL,
  `network` varchar(50) DEFAULT NULL,
  `enterprise` varchar(50) DEFAULT NULL,
  `location` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`pat_id`,`doctor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `vaccine_status` */

insert  into `vaccine_status`(`pat_id`,`pat_name`,`doctor_id`,`doctor_name`,`date`,`vaccine_type`,`status`,`date_of_vaccination`,`organisation`,`network`,`enterprise`,`location`) values 
('aaki101','Aakarsh Mandloi','thomas101','Thomas','15/12/2020','TDC','Done ','NA','Test Laby','Someplace near','BosNet','San Jose');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
