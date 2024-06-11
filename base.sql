INSERT INTO style_tags(tag_name) VALUES ('Минимализм');
INSERT INTO style_tags(tag_name) VALUES ('Лофт');

INSERT INTO roles(role) VALUES ('ADMIN');
INSERT INTO roles(role) VALUES ('USER');
INSERT INTO roles(role) VALUES ('DESIGNER');

INSERT INTO user_accounts(login, password, name, surname, email, number)
VALUES('Test','Test','Name','Surname','test@test.ru','899999999999');

INSERT INTO user_accounts(login, password, name, surname, email, number)
VALUES('Test1','Test1','Name1','Surname1','test1@test.ru','899999999998');

INSERT INTO designers(login, password, name, surname, number, email, telegram, whatsapp)
VALUES ('TestDis', 'testdis', 'TestDisName', 'TestDisSurname', '87777777777', 'testdis@test.ru', 'telegram', 'whatsapp');

INSERT INTO projects(header, short_description, description, tag_id, designer_id)
VALUES ('Test Header','Test Short Description', 'Test Description', 1, 1);

INSERT INTO projects(header, short_description, description, tag_id, designer_id)
VALUES ('Test Header1','Test Short Description 1', 'Test Description 1', 1, 1);

INSERT INTO comments(project_id, user_account_id, text) VALUES (1,1,'Test Text');