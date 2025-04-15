CREATE TABLE IF NOT EXISTS cabco.company (
  identification VARCHAR(25),
  social_name VARCHAR(60) NOT NULL,
  display_name VARCHAR(45) NULL,
  second_name VARCHAR(45) NULL,
  last_name VARCHAR(45) NULL,
  second_last_name VARCHAR(45) NULL,
  main_address VARCHAR(60) NOT NULL,
  phone VARCHAR(15) NOT NULL,
  email VARCHAR(100) NOT NULL,
  created_at DATETIME NOT NULL,
  is_enabled TINYINT NOT NULL,
  PRIMARY KEY (identification))
ENGINE = InnoDB