insert into users (login, password, firstname, lastname,id) values ('amelier23@gmail.fr', 'passw', 'Amelie', 'Bonnet',1);
insert into users (login, password, firstname, lastname,id) values ('ericpetit12@orange.fr', 'passw', 'Eric', 'Petit',2);
insert into users (login, password, firstname, lastname,id) values ('aurimartin2@laposte.fr', 'passw', 'Aurore', 'Martin',3);
insert into users (login, password, firstname, lastname,id) values ('pdubois3@hotmail.fr', 'passw', 'Patrice', 'Dubois',4);
insert into users (login, password, firstname, lastname,id) values ('audbernard1968@gmail.com', 'passw', 'Audray', 'Bernard',5);
insert into users (login, password, firstname, lastname,id) values ('pierrem69@hotmail.fr', 'passw', 'Pierre', 'Michel',6);
insert into users (login, password, firstname, lastname,id) values ('cxpalacioo@gmail.com', 'passw', 'Ximena', 'Palacio',7);
insert into users (login, password, firstname, lastname,id) values ('mleroy@orange.fr', 'passw', 'Morgane', 'Leroy',8);
insert into users (login, password, firstname, lastname,id) values ('camilleb@laposte.fr', 'passw', 'Camille', 'Blanc',9);
insert into users (login, password, firstname, lastname,id) values ('verogarcia@orange.fr', 'passw', 'Veronique', 'Garcia', 10);


insert into items(id, title, Number_copies, release_Date) values(1, 'Pulp Fiction', 4, '1994-03-04');
insert into items(id, title, Number_copies, release_Date) values(2, 'Inception', 5, '2018-04-15');
insert into items(id, title, Number_copies, release_Date) values(3, 'Titanic', 0, '2006-06-07');
insert into items(id, title, Number_copies, release_Date) values(4, 'Shrek', 1, '2022-07-26');
insert into items(id, title, Number_copies, release_Date) values(5, 'Harry potter', 0, '2017-10-24');

insert into items(id, title, Number_copies, release_Date) values(6, 'Bad', 1, '2020-03-02');
insert into items(id, title, Number_copies, release_Date) values(7, 'Ops I did it again', 0, '2017-09-13');
insert into items(id, title, Number_copies, release_Date) values(8, 'She wolf', 2, '2016-05-08');
insert into items(id, title, Number_copies, release_Date) values(9, 'Loud', 5, '2019-10-24');
insert into items(id, title, Number_copies, release_Date) values(10,'Contra la corriente', 2, '2022-09-30'); 

insert into items(id, title, Number_copies, release_Date) values(11, 'Animal farm', 1, '2001-03-27'); 
insert into items(id, title, Number_copies, release_Date) values(12, 'Charlie and the chocolat factory', 0, '2009-09-19'); 
insert into items(id, title, Number_copies, release_Date) values(13, 'Drama', 1, '2018-05-12'); 
insert into items(id, title, Number_copies, release_Date) values(14, 'Bad guys', 2, '2022-10-04'); 
insert into items(id, title, Number_copies, release_Date) values(15, 'George', 4, '2009-01-01'); 



insert into dvd (id_Item, director, duration,TYPEDVD) values (1,'Carla Colcomb', 177, 'DVD');         
insert into dvd (id_Item, director, duration,TYPEDVD) values (2,'Cooper Enocksson', 151, 'BLURAY');                                        
insert into dvd (id_Item, director, duration,TYPEDVD) values (3,'Estele Rany', 151, 'BLURAY');           
insert into dvd (id_Item, director, duration,TYPEDVD) values (4,'Dougy Balsdon', 82, 'BLURAY');  
insert into dvd (id_Item, director, duration,TYPEDVD) values (5,'Carla Colcomb', 177, 'DVD'); 


insert into cd (id_Item, artist, duration, Numbertitles) values (6,'Michael Jackson', 172, 7);                                        
insert into cd (id_Item, artist, duration, Numbertitles) values (7,'Britney Spears', 121, 2);                                         
insert into cd (id_Item, artist, duration, Numbertitles) values (8,'Shakira', 113, 5);                                            
insert into cd (id_Item, artist, duration, Numbertitles) values (9,'Rihanna', 165, 2);                                         
insert into cd (id_Item, artist, duration, Numbertitles) values (10,'Marc Anthony', 155, 6);     
                                                                                                                                                                                                                                                     
insert into book (id_Item, author, ISBN_Number) values (11,'Natal Aird', 504747);                                                                                                                                                                                                     
insert into book (id_Item, author, ISBN_Number) values (12,'Devland Cobello', 710626);                                                                                                                                                                                                
insert into book (id_Item, author, ISBN_Number) values (13,'Niki Antram', 291665);                                                                                                                                                                                                    
insert into book (id_Item, author, ISBN_Number) values (14,'Base Sadd', 289038);                                                                                                                                                                                                      
insert into book (id_Item, author, ISBN_Number) values (15,'Helyn Toulson', 760761);      


insert into borrow (borrow_Date, return_Date , id , user_id) values ('2022-10-19','2022-03-26',1,1);
insert into borrow (borrow_Date, return_Date , id , user_id) values ('2022-10-18','2022-03-25',2,7);
insert into borrow (borrow_Date, return_Date , id , user_id) values ('2022-10-20','2022-03-27',3,5);
                                      
insert into borrow_items (borrows_id, items_id) values (1,13);
insert into borrow_items (borrows_id, items_id) values (2,1);
insert into borrow_items (borrows_id, items_id) values(3,8);