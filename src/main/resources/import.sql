INSERT INTO users (username, password, enabled, correousuario, fechanacimientousuario) VALUES ('user', 'user', true, 'User@gmail.com', '1990-01-01');
INSERT INTO users (username, password, enabled, correousuario, fechanacimientousuario) VALUES ('admin', 'admin', true, 'Admin@gmail.com', '1998-07-02');

INSERT INTO roles (rol, user_id) VALUES ('ROLE_CLIENTE', 1);
INSERT INTO roles (rol, user_id) VALUES ('ROLE_ADMIN', 2);
