CREATE TABLE permissions (
  id bigint(11) NOT NULL,
  name varchar(50) NOT NULL,
  created_at datetime DEFAULT NULL,
  updated_at datetime DEFAULT NULL,
  created_by bigint(20) DEFAULT NULL,
  updated_by bigint(20) DEFAULT NULL,
  PRIMARY KEY (id)
);


INSERT INTO permissions (id, name) VALUES
(1, 'User-Add'),
(2, 'User-Edit'),
(3, 'User-Delete'),
(4, 'User-View');

CREATE TABLE IF NOT EXISTS rel_role_permissions (
  id_rel_role_permissions BIGINT NOT NULL AUTO_INCREMENT,
  id_role BIGINT NOT NULL,
  id_permission BIGINT NOT NULL,
  created_at datetime DEFAULT NULL,
  updated_at datetime DEFAULT NULL,
  created_by bigint(20) DEFAULT NULL,
  updated_by bigint(20) DEFAULT NULL,
  PRIMARY KEY (id_rel_role_permissions),

--   INDEX id_idx (id_permission ASC) VISIBLE,
--   INDEX role_id_idx (id_role ASC) VISIBLE,

  CONSTRAINT id_role
    FOREIGN KEY (id_role)
    REFERENCES roles (role_id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,

  CONSTRAINT id
    FOREIGN KEY (id_permission)
    REFERENCES permissions (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


INSERT INTO rel_role_permissions (id_role, id_permission) VALUES
(1, 1),
(1, 2),
(1, 3),
(1, 4);