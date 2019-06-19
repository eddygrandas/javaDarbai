CREATE TABLE employee
(
  id          INT(10) PRIMARY KEY AUTO_INCREMENT,
  name        VARCHAR(40),
  hourly      DOUBLE,
  position    varchar(30),
  on_vacation BOOLEAN
);
