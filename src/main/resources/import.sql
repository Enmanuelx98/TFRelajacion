INSERT INTO users (username, password, enabled, correousuario, fechanacimientousuario) VALUES ('user', '$2a$12$lJlqDoVKkG6eSC/cEDDcduD0LacvpcZ07CD5krbZm11iIkZyoO5g2', true, 'User@gmail.com', '1990-01-01');
INSERT INTO users (username, password, enabled, correousuario, fechanacimientousuario) VALUES ('admin', '$2a$12$M7tCv1keWWzIHxnov5Z4LOr5n8ry/pQeKw2GizO5Zmuj5F1dWUYLO', true, 'Admin@gmail.com', '1998-07-02');

INSERT INTO roles (rol, user_id) VALUES ('ROLE_CLIENTE', 1);
INSERT INTO roles (rol, user_id) VALUES ('ROLE_ADMIN', 2);
