CREATE TABLE `med_manager`.`roles` (
  `role_id` BIGINT NOT NULL AUTO_INCREMENT,
  `role_code` VARCHAR(45) NULL,
  PRIMARY KEY (`role_id`),
  UNIQUE INDEX `role_code_UNIQUE` (`role_code` ASC) VISIBLE);


CREATE TABLE `med_manager`.`rel_user_role` (
  `id_rel_user_role` BIGINT NOT NULL AUTO_INCREMENT,
  `user_id` BIGINT NOT NULL,
  `role_id` BIGINT NOT NULL,
  PRIMARY KEY (`id_rel_user_role`),
  INDEX `role_id_idx` (`role_id` ASC) VISIBLE,
  INDEX `user_id_idx` (`user_id` ASC) VISIBLE,
  CONSTRAINT `role_id`
    FOREIGN KEY (`role_id`)
    REFERENCES `med_manager`.`roles` (`role_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `med_manager`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


INSERT INTO `med_manager`.`roles` (`role_id`, `role_code`) VALUES ('1', 'ADMIN');
INSERT INTO `med_manager`.`roles` (`role_id`, `role_code`) VALUES ('2', 'USER');

INSERT INTO `med_manager`.`rel_user_role` (`id_rel_user_role`, `user_id`, `role_id`) VALUES ('1', '1', '1');
INSERT INTO `med_manager`.`rel_user_role` (`id_rel_user_role`, `user_id`, `role_id`) VALUES ('2', '2', '2');
INSERT INTO `med_manager`.`rel_user_role` (`id_rel_user_role`, `user_id`, `role_id`) VALUES ('3', '3', '1');
