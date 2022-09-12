insert into municipios (nombre) values 	('Bucaramanga');
insert into municipios (nombre) values 	('Zapatoca');
insert into municipios (nombre) values 	                             ('Villanueva');
insert into municipios (nombre) values 	                             ('Vetas');
insert into municipios (nombre) values 	                             ('Vélez');
insert into municipios (nombre) values 	                             ('Valle de San José');
insert into municipios (nombre) values 	                             ('Tona');
insert into municipios (nombre) values 	                             ('Suratá');
insert into municipios (nombre) values 	                             ('Sucre');
insert into municipios (nombre) values 	                             ('Suaita');
insert into municipios (nombre) values 	                             ('Socorro');
insert into municipios (nombre) values 	                             ('Simacota');
insert into municipios (nombre) values 	                             ('Santa Helena del Opón');
insert into municipios (nombre) values 	                             ('Santa Bárbara');
insert into municipios (nombre) values 	                             ('San Vicente de Chucurí');
insert into municipios (nombre) values 	                             ('San Miguel');
insert into municipios (nombre) values 	                             ('San José de Miranda');
insert into municipios (nombre) values 	                             ('San Joaquín');
insert into municipios (nombre) values 	                             ('San Gil');
insert into municipios (nombre) values 	                             ('San Benito');
insert into municipios (nombre) values 	                             ('San Andrés');
insert into municipios (nombre) values 	                             ('Sabana de Torres');
insert into municipios (nombre) values 	                             ('Rionegro');
insert into municipios (nombre) values 	                             ('Puerto Wilches');
insert into municipios (nombre) values 	                             ('Puerto Parra');
insert into municipios (nombre) values 	                             ('Puente Nacional');
insert into municipios (nombre) values 	                             ('Pinchote');
insert into municipios (nombre) values 	                             ('Piedecuesta');
insert into municipios (nombre) values 	                             ('Páramo');
insert into municipios (nombre) values 	                             ('Palmas del Socorro');
insert into municipios (nombre) values 	                             ('Palmar');
insert into municipios (nombre) values 	                             ('Onzaga');
insert into municipios (nombre) values 	                             ('Oiba');
insert into municipios (nombre) values 	                             ('Ocamonte');
insert into municipios (nombre) values 	                             ('Molagavita');
insert into municipios (nombre) values 	                             ('Mogotes');
insert into municipios (nombre) values 	                             ('Matanza');
insert into municipios (nombre) values 	                             ('Málaga');
insert into municipios (nombre) values 	                             ('Macaravita');
insert into municipios (nombre) values 	                             ('Los Santos');
insert into municipios (nombre) values 	                             ('Lebrija');
insert into municipios (nombre) values 	                             ('Landázuri');
insert into municipios (nombre) values 	                             ('La Paz');
insert into municipios (nombre) values 	                             ('La Belleza');
insert into municipios (nombre) values 	                             ('Jordán');
insert into municipios (nombre) values 	                             ('Jesús María');
insert into municipios (nombre) values 	                             ('Hato');
insert into municipios (nombre) values 	                             ('Güepsa');
insert into municipios (nombre) values 	                             ('Guavatá');
insert into municipios (nombre) values 	                             ('Guapotá');
insert into municipios (nombre) values 	                             ('Guadalupe');
insert into municipios (nombre) values 	                             ('Guaca');
insert into municipios (nombre) values 	                             ('Girón');
insert into municipios (nombre) values 	                             ('Gámbita');
insert into municipios (nombre) values 	                             ('Galán');
insert into municipios (nombre) values 	                             ('Floridablanca');
insert into municipios (nombre) values 	                             ('Florián');
insert into municipios (nombre) values 	                             ('Enciso');
insert into municipios (nombre) values 	                             ('Encino');
insert into municipios (nombre) values 	                             ('El Playón');
insert into municipios (nombre) values 	                             ('El Peñón');
insert into municipios (nombre) values 	                             ('El Guacamayo');
insert into municipios (nombre) values 	                             ('El Carmen de Chucurí');
insert into municipios (nombre) values 	                             ('Curití');
insert into municipios (nombre) values 	                             ('Coromoro');
insert into municipios (nombre) values 	                             ('Contratación');
insert into municipios (nombre) values 	                             ('Confines');
insert into municipios (nombre) values 	                             ('Concepción');
insert into municipios (nombre) values 	                             ('Cimitarra');
insert into municipios (nombre) values 	                             ('Chipatá');
insert into municipios (nombre) values 	                             ('Chima');
insert into municipios (nombre) values 	                             ('Charalá');
insert into municipios (nombre) values 	                             ('Cerrito');
insert into municipios (nombre) values 	                             ('Cepitá');
insert into municipios (nombre) values 	                             ('Carcasí');
insert into municipios (nombre) values 	                             ('Capitanejo');
insert into municipios (nombre) values 	                             ('California');
insert into municipios (nombre) values 	                             ('Cabrera');
insert into municipios (nombre) values 	                             ('Bolívar');
insert into municipios (nombre) values 	                             ('Betulia');
insert into municipios (nombre) values 	                             ('Barrancabermeja');
insert into municipios (nombre) values 	                             ('Barichara');
insert into municipios (nombre) values 	                             ('Barbosa');
insert into municipios (nombre) values 	                             ('Aratoca');
insert into municipios (nombre) values 	                             ('Albania');
insert into municipios (nombre) values 	                             ('Aguada');
insert into municipios (nombre) values 	                             ('Bucaramanga');


INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('Horus19cdv','$2a$10$C3Uln5uqnzx/GswADURJGOIdBqYrly9731fnwKDaUdBkt/M3qvtLq',1, 'Horacio', 'camacho','horus19@correo.com');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$RmdEsvEfhI7Rcm9f/uZXPebZVCcPC7ZXZwV51efAvMAp1rIaRAfPK',1, 'Dago', 'Doe','dagodoe@correo.com');

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 1);

INSERT into publicaciones  (descripcion, titulo, municipio_id, usuario_id, url_image ) VALUES('lorem ipsum text', 'titulo de publicacion', 19, 1, 'https://cdn.baquianos.com/img/blog/2019/13/san-gil-i6yx640.jpg');
insert into imagenes (url, publicacion_id) VALUES('https://cdn.baquianos.com/img/blog/2019/13/san-gil-i6yx360.jpg', 1);



INSERT into publicaciones  (descripcion, titulo, municipio_id, usuario_id, url_image) VALUES('lorem ipsum text', 'titulo de publicacion', 19, 1,  'https://cdn.baquianos.com/img/blog/2019/13/san-gil-i6yx640.jpg');
insert into imagenes (url, publicacion_id) VALUES('https://cdn.baquianos.com/img/blog/2019/13/san-gil-i6yx360.jpg', 1);



INSERT into publicaciones  (descripcion, titulo, municipio_id, usuario_id, url_image) VALUES('lorem ipsum text', 'titulo de publicacion', 19, 1,  'https://cdn.baquianos.com/img/blog/2019/13/san-gil-i6yx640.jpg');
insert into imagenes (url, publicacion_id) VALUES('https://cdn.baquianos.com/img/blog/2019/13/san-gil-i6yx360.jpg', 1);



INSERT into publicaciones  (descripcion, titulo, municipio_id, usuario_id, url_image) VALUES('lorem ipsum text', 'titulo de publicacion', 19, 1,  'https://cdn.baquianos.com/img/blog/2019/13/san-gil-i6yx640.jpg');
insert into imagenes (url, publicacion_id) VALUES('https://cdn.baquianos.com/img/blog/2019/13/san-gil-i6yx360.jpg', 1);

INSERT into publicaciones  (descripcion, titulo, municipio_id, usuario_id, url_image ) VALUES('lorem ipsum text', 'titulo de publicacion', 19, 1, 'https://cdn.baquianos.com/img/blog/2019/13/san-gil-i6yx640.jpg');
insert into imagenes (url, publicacion_id) VALUES('https://cdn.baquianos.com/img/blog/2019/13/san-gil-i6yx360.jpg', 1);



INSERT into publicaciones  (descripcion, titulo, municipio_id, usuario_id, url_image) VALUES('lorem ipsum text', 'titulo de publicacion', 19, 1,  'https://cdn.baquianos.com/img/blog/2019/13/san-gil-i6yx640.jpg');
insert into imagenes (url, publicacion_id) VALUES('https://cdn.baquianos.com/img/blog/2019/13/san-gil-i6yx360.jpg', 1);



INSERT into publicaciones  (descripcion, titulo, municipio_id, usuario_id, url_image) VALUES('lorem ipsum text', 'titulo de publicacion', 19, 1,  'https://cdn.baquianos.com/img/blog/2019/13/san-gil-i6yx640.jpg');
insert into imagenes (url, publicacion_id) VALUES('https://cdn.baquianos.com/img/blog/2019/13/san-gil-i6yx360.jpg', 1);



INSERT into publicaciones  (descripcion, titulo, municipio_id, usuario_id, url_image) VALUES('lorem ipsum text', 'titulo de publicacion', 19, 1,  'https://cdn.baquianos.com/img/blog/2019/13/san-gil-i6yx640.jpg');
insert into imagenes (url, publicacion_id) VALUES('https://cdn.baquianos.com/img/blog/2019/13/san-gil-i6yx360.jpg', 1);

INSERT into publicaciones  (descripcion, titulo, municipio_id, usuario_id, url_image ) VALUES('lorem ipsum text', 'titulo de publicacion', 19, 1, 'https://cdn.baquianos.com/img/blog/2019/13/san-gil-i6yx640.jpg');
insert into imagenes (url, publicacion_id) VALUES('https://cdn.baquianos.com/img/blog/2019/13/san-gil-i6yx360.jpg', 1);



INSERT into publicaciones  (descripcion, titulo, municipio_id, usuario_id, url_image) VALUES('lorem ipsum text', 'titulo de publicacion', 19, 1,  'https://cdn.baquianos.com/img/blog/2019/13/san-gil-i6yx640.jpg');
insert into imagenes (url, publicacion_id) VALUES('https://cdn.baquianos.com/img/blog/2019/13/san-gil-i6yx360.jpg', 1);



INSERT into publicaciones  (descripcion, titulo, municipio_id, usuario_id, url_image) VALUES('lorem ipsum text', 'titulo de publicacion', 19, 1,  'https://cdn.baquianos.com/img/blog/2019/13/san-gil-i6yx640.jpg');
insert into imagenes (url, publicacion_id) VALUES('https://cdn.baquianos.com/img/blog/2019/13/san-gil-i6yx360.jpg', 1);



INSERT into publicaciones  (descripcion, titulo, municipio_id, usuario_id, url_image) VALUES('lorem ipsum text', 'titulo de publicacion', 19, 1,  'https://cdn.baquianos.com/img/blog/2019/13/san-gil-i6yx640.jpg');
insert into imagenes (url, publicacion_id) VALUES('https://cdn.baquianos.com/img/blog/2019/13/san-gil-i6yx360.jpg', 1);

INSERT into publicaciones  (descripcion, titulo, municipio_id, usuario_id, url_image ) VALUES('lorem ipsum text', 'titulo de publicacion', 19, 1, 'https://cdn.baquianos.com/img/blog/2019/13/san-gil-i6yx640.jpg');
insert into imagenes (url, publicacion_id) VALUES('https://cdn.baquianos.com/img/blog/2019/13/san-gil-i6yx360.jpg', 1);



INSERT into publicaciones  (descripcion, titulo, municipio_id, usuario_id, url_image) VALUES('lorem ipsum text', 'titulo de publicacion', 19, 1,  'https://cdn.baquianos.com/img/blog/2019/13/san-gil-i6yx640.jpg');
insert into imagenes (url, publicacion_id) VALUES('https://cdn.baquianos.com/img/blog/2019/13/san-gil-i6yx360.jpg', 1);

