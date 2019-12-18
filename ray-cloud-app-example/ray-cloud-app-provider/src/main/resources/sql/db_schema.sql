-- the table to store GlobalSession data
drop table if exists `ray_cloud`.`sample_provider_tbl`;
create table `ray_cloud`.`sample_provider_tbl` (
  `id` int(11)  not null  AUTO_INCREMENT,
  `test_name` varchar(200),
  PRIMARY KEY (`id`)