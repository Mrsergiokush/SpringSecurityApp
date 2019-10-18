-- Table: users
CREATE TABLE users
(
    id       INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
)
    ENGINE = InnoDB;

-- Table: roles
CREATE TABLE roles
(
    id   INT          NOT NULL auto_increment primary key,
    name varchar(255) not null
)
    ENGINE = InnoDB;

-- Table for mapping user and roles

CREATE TABLE user_roles
(
    user_id int not null,
    role_id int not null,

    FOREIGN KEY (user_id) REFERENCES users (id),
    FOREIGN KEY (role_id) REFERENCES roles (id),

    UNIQUE (user_id, role_id)
)
    ENGINE = InnoDB;

-- Insert data

INSERT INTO users
VALUES (1, 'sergio', 'rdhfhdfshdsjdj213');

insert into roles
values (1, 'ROLE_USER');
insert into roles
values (2, 'ROLE_ADMIN');

INSERT INTO users
VALUES (3, 'LionelMessi', '$2a$11$WFnXctkloeKw7HmfizsrEei.yMwgyI1FXHxVDfGKDBvrxLaa9yYwK');

INSERT INTO user_roles
values (3, 2);