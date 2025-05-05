INSERT INTO users (username, password, enabled, correousuario, fechanacimientousuario) VALUES ('user', '$2a$12$GFwjiGCRDg5x3aNVKpMOM.sjvWJK62RET36nJ3aepsE.r3EFQNDbW', true, 'User@gmail.com', '1990-01-01');
INSERT INTO users (username, password, enabled, correousuario, fechanacimientousuario) VALUES ('admin', '$2a$12$HiVZzilA7cp05vflCtRrOOdC.tno3RPARhLDKJm5xn5ie2xF9qeEa', true, 'Admin@gmail.com', '1998-07-02');

INSERT INTO roles (rol, user_id) VALUES ('ROLE_CLIENTE', 1);
INSERT INTO roles (rol, user_id) VALUES ('ROLE_ADMIN', 2);
