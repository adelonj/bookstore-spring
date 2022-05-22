DROP TABLE IF EXISTS authors;
DROP TABLE IF EXISTS books;

CREATE TABLE authors
(
    id           INT AUTO_INCREMENT PRIMARY KEY,
    first_name    VARCHAR(250)  DEFAULT NULL,
    last_name    VARCHAR(250)  DEFAULT NULL,
    bio          VARCHAR(3000) DEFAULT NULL
--     bio_extended VARCHAR(2000) DEFAULT NULL
);

CREATE TABLE books
(
    id        INT AUTO_INCREMENT PRIMARY KEY,
    price     VARCHAR(250) DEFAULT NULL,
    price_old VARCHAR(250) DEFAULT NULL,
    title     VARCHAR(250) NOT NULL,
    author_id INT DEFAULT NULL,

    FOREIGN KEY (author_id) REFERENCES authors(id)

);
