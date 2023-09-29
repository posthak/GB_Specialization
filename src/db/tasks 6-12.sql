7. В подключенном MySQL репозитории создать базу данных “Друзья человека” 
CREATE DATABASE human_friends;
USE human_friends;

8. Создать таблицы с иерархией из диаграммы в БД 
CREATE TABLE horses (
	id BIGINT UNSIGNED auto_increment NOT NULL,
	birth_date DATE NOT NULL,
	name varchar(50) NOT NULL,
	commands varchar(50) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE camels (
	id BIGINT UNSIGNED auto_increment NOT NULL,
	birth_date DATE NOT NULL,
	name varchar(50) NOT NULL,
	commands varchar(50) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE donkeys (
	id BIGINT UNSIGNED auto_increment NOT NULL,
	birth_date DATE NOT NULL,
	name varchar(50) NOT NULL,
	commands varchar(50) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE dogs (
	id BIGINT UNSIGNED auto_increment NOT NULL,
	birth_date DATE NOT NULL,
	name varchar(50) NOT NULL,
	commands varchar(50) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE cats (
	id BIGINT UNSIGNED auto_increment NOT NULL,
	birth_date DATE NOT NULL,
	name varchar(50) NOT NULL,
	commands varchar(50) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE hamsters (
	id BIGINT UNSIGNED auto_increment NOT NULL,
	birth_date DATE NOT NULL,
	name varchar(50) NOT NULL,
	commands varchar(50) NOT NULL,
	PRIMARY KEY (id)
);

9. Заполнить низкоуровневые таблицы именами(животных), командами которые они выполняют и датами рождения

INSERT INTO horses
(birth_date, name, commands)
VALUES
('2021-01-01', 'Horses1', 'Jog'),
('2021-01-02, 'Horses2', 'Jog'),
('2021-01-03', 'Horses3', 'Jog'),
('2021-01-04', 'Horses4', 'Jog');

INSERT INTO camels
(birth_date, name, commands)
VALUES
('2020-01-01', 'Camel1', 'Walk'),
('2020-01-02', 'Camel2', 'Walk'),
('2020-01-03', 'Camel3', 'Walk'),
('2020-01-04', 'Camel4', 'Walk');

INSERT INTO donkeys
(birth_date, name, commands)
VALUES
('2019-01-01', 'Donkey1', 'Stay'),
('2019-01-02', 'Donkey2', 'Stay),
('2019-01-03', 'Donkey3', 'Stay'),
('2019-01-04', 'Donkey4', 'Stay');

INSERT INTO dogs
(birth_date, name, commands)
VALUES
('2015-05-01', 'Dog1', 'Aport'),
('2016-05-01', 'Dog2', 'Aport'),
('2017-05-01', 'Dog3', 'Aport'),
('2018-05-01', 'Dog4', 'Aport');

INSERT INTO cats
(birth_date, name, commands)
VALUES
('2018-01-01', 'Cat1', 'Ks'),
('2017-01-01', 'Cat2', 'Ks'),
('2016-01-01', 'Cat3', 'Ks'),
('2017-01-01', 'Cat4', 'Ks');

INSERT INTO hamsters
(birth_date, name, commands)
VALUES
('2019-03-21', 'Hamster1', 'Eat'),
('2019-03-22', 'Hamster2', 'Eat'),
('2019-03-23', 'Hamster3', 'Eat'),
('2019-03-24', 'Hamster4', 'Eat');


10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу. 

DROP TABLE camels;

CREATE TABLE horses_donkeys
(SELECT * FROM horses
UNION
SELECT * FROM donkeys);

11.Создать новую таблицу “молодые животные” в которую попадут все животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью до месяца подсчитать возраст животных в новой таблице 

CREATE TABLE young_animals 
SELECT id, birth_date, name, commands, (SELECT TIMESTAMPDIFF(MONTH, birth_date, curdate())) AS age_in_month FROM horses
WHERE (SELECT TIMESTAMPDIFF(MONTH, birth_date, curdate())) BETWEEN 12 AND 35
UNION
SELECT id, birth_date, name, commands, (SELECT TIMESTAMPDIFF(MONTH, birth_date, curdate())) AS age_in_month FROM donkeys
WHERE (SELECT TIMESTAMPDIFF(MONTH, birth_date, curdate())) BETWEEN 12 AND 35
UNION
SELECT id, birth_date, name, commands, (SELECT TIMESTAMPDIFF(MONTH, birth_date, curdate())) AS age_in_month FROM dogs
WHERE (SELECT TIMESTAMPDIFF(MONTH, birth_date, curdate())) BETWEEN 12 AND 35
UNION
SELECT id, birth_date, name, commands, (SELECT TIMESTAMPDIFF(MONTH, birth_date, curdate())) AS age_in_month FROM cats
WHERE (SELECT TIMESTAMPDIFF(MONTH, birth_date, curdate())) BETWEEN 12 AND 35
UNION
SELECT id, birth_date, name, commands, (SELECT TIMESTAMPDIFF(MONTH, birth_date, curdate())) AS age_in_month FROM hamsters
WHERE (SELECT TIMESTAMPDIFF(MONTH, birth_date, curdate())) BETWEEN 12 AND 35;

12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на прошлую принадлежность к старым таблицам. 

CREATE TABLE general
SELECT id, birth_date, name, commands FROM horses
UNION
SELECT id, birth_date, name, commands FROM donkeys
UNION
SELECT id, birth_date, name, commands FROM dogs
UNION
SELECT id, birth_date, name, commands FROM cats
UNION
SELECT id, birth_date, name, commands FROM hamsters;