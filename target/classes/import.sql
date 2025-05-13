INSERT INTO users (username, password, enabled, correousuario, fechanacimientousuario) VALUES ('jovenes', '$2a$12$uNEbHcGVr.nSojzPo3BVqun5txT9MhPQjDzuIdKqgznP/TpsnEiSa', true, 'User@gmail.com', '1990-01-01');
INSERT INTO users (username, password, enabled, correousuario, fechanacimientousuario) VALUES ('admin', '$2a$12$HiVZzilA7cp05vflCtRrOOdC.tno3RPARhLDKJm5xn5ie2xF9qeEa', true, 'Admin@gmail.com', '1998-07-02');

INSERT INTO roles (rol, user_id) VALUES ('JOVENESPROFESIONALES', 1);
INSERT INTO roles (rol, user_id) VALUES ('ADMIN', 2);