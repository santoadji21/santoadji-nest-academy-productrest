create table user (
    id int not NULL,
    username VARCHAR(255),
    email VARCHAR(255),
    password VARCHAR(255)
);

create table brand (
    brand_id int not null,
    brand_name VARCHAR(255)
);

create table products(
    id int not NULL,
    name VARCHAR(255),
    user_id int not NULL,
    brand_id int not NULL,
    price DECIMAL NULL,
    currency VARCHAR(255),
    category VARCHAR(255),
    quantity int NULL,
    picture VARCHAR(255),
    year DATE ,
    create_at TIMESTAMP
)
