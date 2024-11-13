INSERT INTO roles (name) VALUES ('ROLE_USER');
INSERT INTO roles (name) VALUES ('ROLE_ADMIN');

INSERT INTO users (age, email, name, password) VALUES (42, 'user@user.ru', 'user', '$2a$12$ItVBUhgl72tYO3KY.778meYdBlJrkG3J49OQbazuq6c5zShYJUj.y');
INSERT INTO users (age, email, name, password) VALUES (33, 'admin@admin.ru', 'admin', '$2a$12$yo8kuSQAEiIabxZ7hWcm3uKiwLnZ3CpgE5BlBfepWs/18m8dEKUH6');



INSERT INTO users_roles (user_id, role_id) VALUES (1, 1);
INSERT INTO users_roles (user_id, role_id) VALUES (2, 1);
INSERT INTO users_roles (user_id, role_id) VALUES (2, 2);