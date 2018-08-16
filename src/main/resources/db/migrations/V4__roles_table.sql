CREATE TABLE `med_manager`.`roles` (
  `role_id` INT NOT NULL,
  `role_code` VARCHAR(45) NULL,
  PRIMARY KEY (`role_id`),
  UNIQUE INDEX `role_code_UNIQUE` (`role_code` ASC) VISIBLE);


CREATE TABLE `med_manager`.`rel_user_role` (
  `id_rel_user_role` INT NOT NULL,
  `user_id` BIGINT NOT NULL,
  `role_code` VARCHAR(45) NULL,
  PRIMARY KEY (`id_rel_user_role`),
  INDEX `id_idx` (`user_id` ASC) VISIBLE,
  INDEX `role_code_idx` (`role_code` ASC) VISIBLE,
  CONSTRAINT `id`
    FOREIGN KEY (`user_id`)
    REFERENCES `med_manager`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `role_code`
    FOREIGN KEY (`role_code`)
    REFERENCES `med_manager`.`roles` (`role_code`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

