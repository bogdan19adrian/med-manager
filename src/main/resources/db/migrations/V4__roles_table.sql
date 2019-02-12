CREATE TABLE roles (
  role_id BIGINT NOT NULL AUTO_INCREMENT,
  constraint roles_pk
    primary key (role_id),
  role_code VARCHAR(45) NULL);
create unique index role_code_UNIQUE
  on roles (role_id);


CREATE TABLE rel_user_role (
  id_rel_user_role BIGINT NOT NULL AUTO_INCREMENT,
  user_id BIGINT NOT NULL,
  role_id BIGINT NOT NULL,
  PRIMARY KEY (id_rel_user_role),
--   INDEX role_id_idx  (role_id ASC) VISIBLE,
--   INDEX user_id_idx (user_id ASC) VISIBLE,
  CONSTRAINT role_id
    FOREIGN KEY (role_id)
    REFERENCES roles (role_id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT user_id
    FOREIGN KEY (user_id)
    REFERENCES users (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


INSERT INTO roles (role_id, role_code) VALUES ('1', 'ADMIN');
INSERT INTO roles (role_id, role_code) VALUES ('2', 'USER');

INSERT INTO rel_user_role (id_rel_user_role, user_id, role_id) VALUES ('1', '1', '1');
INSERT INTO rel_user_role (id_rel_user_role, user_id, role_id) VALUES ('2', '2', '2');
INSERT INTO rel_user_role (id_rel_user_role, user_id, role_id) VALUES ('3', '3', '1');
