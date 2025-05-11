INSERT INTO users (username, password, enabled, correousuario, fechanacimientousuario) VALUES ('jovenes', '$2a$12$iWV0pYUPIBTKBywGZm96fusvl5aT97BQjLk2Hzf7YQG6r58hx979e', true, 'User@gmail.com', '1990-01-01');
INSERT INTO users (username, password, enabled, correousuario, fechanacimientousuario) VALUES ('admin', '$2a$12$HiVZzilA7cp05vflCtRrOOdC.tno3RPARhLDKJm5xn5ie2xF9qeEa', true, 'Admin@gmail.com', '1998-07-02');

INSERT INTO roles (rol, user_id) VALUES ('ROLE_JOVENESPROFESIONALES', 1);
INSERT INTO roles (rol, user_id) VALUES ('ROLE_ADMIN', 2);