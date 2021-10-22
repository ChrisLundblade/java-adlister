USE adlister_db;
DROP TABLE IF EXISTS ads;

CREATE TABLE ads(
    id INT UNSIGNED AUTO_INCREMENT NOT NULL PRIMARY KEY,
    user_id INT UNSIGNED NOT NULL,
    title VARCHAR(50) NOT NULL,
    description text,
    FOREIGN KEY (user_id) REFERENCES users(id)
);