INSERT INTO users (username, password, enabled, correousuario, fechanacimientousuario) VALUES ('jovenes', '$2a$12$uNEbHcGVr.nSojzPo3BVqun5txT9MhPQjDzuIdKqgznP/TpsnEiSa', true, 'User@gmail.com', '1990-01-01');
INSERT INTO users (username, password, enabled, correousuario, fechanacimientousuario) VALUES ('admin', '$2a$12$HiVZzilA7cp05vflCtRrOOdC.tno3RPARhLDKJm5xn5ie2xF9qeEa', true, 'Admin@gmail.com', '1998-07-02');

INSERT INTO Terapia (tipo_terapia, descripcion_terapia) VALUES ('VideosTecnicasRespiracion', 'Terapias centradas en el control de la respiración y técnicas de respiración consciente.');
INSERT INTO Terapia (tipo_terapia, descripcion_terapia) VALUES ('MusicaRelajacion', 'Terapias basadas en sonidos y música relajante para calmar la mente.');
INSERT INTO Terapia (tipo_terapia, descripcion_terapia) VALUES ('MaterialMeditacion', 'Terapias que utilizan documentos, audios o videos para guiar la meditación.');

INSERT INTO playlist (nombre_playlist) VALUES ('Relajacion Profunda');
INSERT INTO playlist (nombre_playlist) VALUES ('Meditacion Matutina');
INSERT INTO playlist (nombre_playlist) VALUES ('Sueno Reparador');
INSERT INTO playlist (nombre_playlist) VALUES ('Mente en Calma');
INSERT INTO playlist (nombre_playlist) VALUES ('Energia Positiva');
INSERT INTO playlist (nombre_playlist) VALUES ('Respira y Fluye');
INSERT INTO playlist (nombre_playlist) VALUES ('Despertar Consciente');
INSERT INTO playlist (nombre_playlist) VALUES ('Tranquilidad Interior');
INSERT INTO playlist (nombre_playlist) VALUES ('Paz y Serenidad');
INSERT INTO playlist (nombre_playlist) VALUES ('Alivio del Estres');
INSERT INTO playlist (nombre_playlist) VALUES ('Meditacion Activa');
INSERT INTO playlist (nombre_playlist) VALUES ('Sonidos de la Naturaleza');
INSERT INTO playlist (nombre_playlist) VALUES ('Focus y Concentracion');
INSERT INTO playlist (nombre_playlist) VALUES ('Respiracion Guiada');
INSERT INTO playlist (nombre_playlist) VALUES ('Viaje Interior');


INSERT INTO musicacategoria (nombre_categoria) VALUES ('Relajacion');
INSERT INTO musicacategoria (nombre_categoria) VALUES ('Meditacion Guiada');
INSERT INTO musicacategoria (nombre_categoria) VALUES ('Musica Ambiental');
INSERT INTO musicacategoria (nombre_categoria) VALUES ('Sonidos de la Naturaleza');
INSERT INTO musicacategoria (nombre_categoria) VALUES ('Terapia Musical');
INSERT INTO musicacategoria (nombre_categoria) VALUES ('Musica para Dormir');
INSERT INTO musicacategoria (nombre_categoria) VALUES ('Relajacion Profunda');
INSERT INTO musicacategoria (nombre_categoria) VALUES ('Musica Calmante');
INSERT INTO musicacategoria (nombre_categoria) VALUES ('Musica Espiritual');
INSERT INTO musicacategoria (nombre_categoria) VALUES ('Sonidos de Agua');
INSERT INTO musicacategoria (nombre_categoria) VALUES ('Terapia con Cuencos');
INSERT INTO musicacategoria (nombre_categoria) VALUES ('Musica de Yoga');
INSERT INTO musicacategoria (nombre_categoria) VALUES ('Musica de Respiracion');
INSERT INTO musicacategoria (nombre_categoria) VALUES ('Musica para Estudio');
INSERT INTO musicacategoria (nombre_categoria) VALUES ('Musica para Concentracion');


INSERT INTO tipo_material (nombre_tipo_material) VALUES ('Documento');
INSERT INTO tipo_material (nombre_tipo_material) VALUES ('Podcast');
INSERT INTO tipo_material (nombre_tipo_material) VALUES ('Ejercicio');
INSERT INTO tipo_material (nombre_tipo_material) VALUES ('Infografia');
INSERT INTO tipo_material (nombre_tipo_material) VALUES ('Audio Guia');
INSERT INTO tipo_material (nombre_tipo_material) VALUES ('PDF');
INSERT INTO tipo_material (nombre_tipo_material) VALUES ('Articulo');
INSERT INTO tipo_material (nombre_tipo_material) VALUES ('Presentacion');
INSERT INTO tipo_material (nombre_tipo_material) VALUES ('Animacion');
INSERT INTO tipo_material (nombre_tipo_material) VALUES ('Guia Visual');
INSERT INTO tipo_material (nombre_tipo_material) VALUES ('Checklist');
INSERT INTO tipo_material (nombre_tipo_material) VALUES ('Juego');
INSERT INTO tipo_material (nombre_tipo_material) VALUES ('Mapa Mental');
INSERT INTO tipo_material (nombre_tipo_material) VALUES ('Cuaderno de Trabajo');
INSERT INTO tipo_material (nombre_tipo_material) VALUES ('Resumen Teorico');


INSERT INTO Musicarelajacion (nombre_musica, link_musica, descripcion_musica, idterapia, idplaylist, idmusica_categoria) VALUES ('Sonido de Lluvia', 'https://calmsphere.com/sonido-lluvia', 'Sonido relajante de lluvia para meditacion y relajacion', 2, 1, 1);
INSERT INTO Musicarelajacion (nombre_musica, link_musica, descripcion_musica, idterapia, idplaylist, idmusica_categoria) VALUES ('Vibraciones de Cuencos', 'https://calmsphere.com/vibraciones-cuencos', 'Sonidos de cuencos tibetanos para sanacion y relajacion', 2, 2, 1);
INSERT INTO Musicarelajacion (nombre_musica, link_musica, descripcion_musica, idterapia, idplaylist, idmusica_categoria) VALUES ('Olas del Mar', 'https://calmsphere.com/olas-mar', 'Sonido de olas del mar, perfecto para dormir o meditar', 2, 3, 4);
INSERT INTO Musicarelajacion (nombre_musica, link_musica, descripcion_musica, idterapia, idplaylist, idmusica_categoria) VALUES ('Musica para Respirar', 'https://calmsphere.com/musica-respirar', 'Combinacion de musica suave y ejercicios de respiracion', 2, 4, 3);
INSERT INTO Musicarelajacion (nombre_musica, link_musica, descripcion_musica, idterapia, idplaylist, idmusica_categoria) VALUES ('Armonia del Viento', 'https://calmsphere.com/armonia-viento', 'Sonido del viento suave para meditacion y relajacion mental', 2, 5, 2);
INSERT INTO Musicarelajacion (nombre_musica, link_musica, descripcion_musica, idterapia, idplaylist, idmusica_categoria) VALUES ('Canto de Pajaros', 'https://calmsphere.com/canto-pajaros', 'Musica relajante con canto de pajaros para relajacion profunda', 2, 6, 4);
INSERT INTO Musicarelajacion (nombre_musica, link_musica, descripcion_musica, idterapia, idplaylist, idmusica_categoria) VALUES ('Musica para Dormir', 'https://calmsphere.com/musica-dormir', 'Melodias suaves para inducir el sueno profundo', 2, 7, 5);
INSERT INTO Musicarelajacion (nombre_musica, link_musica, descripcion_musica, idterapia, idplaylist, idmusica_categoria) VALUES ('Sonido del Rio', 'https://calmsphere.com/sonido-rio', 'Sonido relajante de un rio fluyendo, ideal para concentracion', 2, 8, 4);
INSERT INTO Musicarelajacion (nombre_musica, link_musica, descripcion_musica, idterapia, idplaylist, idmusica_categoria) VALUES ('Terapia con Sonidos', 'https://calmsphere.com/terapia-sonidos', 'Combinacion de sonidos terapeuticos para reducir el estres', 2, 9, 5);
INSERT INTO Musicarelajacion (nombre_musica, link_musica, descripcion_musica, idterapia, idplaylist, idmusica_categoria) VALUES ('Bajo la Luna', 'https://calmsphere.com/bajo-luna', 'Musica suave bajo el resplandor de la luna para relajacion', 2, 10, 3);
INSERT INTO Musicarelajacion (nombre_musica, link_musica, descripcion_musica, idterapia, idplaylist, idmusica_categoria) VALUES ('Musica de Flute', 'https://calmsphere.com/musica-flute', 'Sonidos relajantes de flauta para meditacion', 2, 11, 2);
INSERT INTO Musicarelajacion (nombre_musica, link_musica, descripcion_musica, idterapia, idplaylist, idmusica_categoria) VALUES ('Cancion de la Paz', 'https://calmsphere.com/cancion-paz', 'Musica calma para encontrar paz interior', 2, 12, 1);
INSERT INTO Musicarelajacion (nombre_musica, link_musica, descripcion_musica, idterapia, idplaylist, idmusica_categoria) VALUES ('Ecos de la Montana', 'https://calmsphere.com/ecos-montana', 'Sonidos suaves de la montana para desconectar y relajarse', 2, 13, 6);
INSERT INTO Musicarelajacion (nombre_musica, link_musica, descripcion_musica, idterapia, idplaylist, idmusica_categoria) VALUES ('Meditacion con Gongs', 'https://calmsphere.com/meditacion-gongs', 'Sonidos de gongs tibetanos para inducir a la meditacion profunda', 2, 14, 2);
INSERT INTO Musicarelajacion (nombre_musica, link_musica, descripcion_musica, idterapia, idplaylist, idmusica_categoria) VALUES ('Armonizacion Mental', 'https://calmsphere.com/armonizacion-mental', 'Musica calmante para armonizar la mente y reducir el estres', 2, 15, 1);

INSERT INTO roles (rol, user_id) VALUES ('JOVENESPROFESIONALES', 1);
INSERT INTO roles (rol, user_id) VALUES ('ADMIN', 2);

INSERT INTO Sesionterapia (fecha_inicio, fecha_fin, completado, idusuario, idterapia) VALUES ('2025-05-01', '2025-05-02', true, 1, 1);
INSERT INTO Sesionterapia (fecha_inicio, fecha_fin, completado, idusuario, idterapia) VALUES ('2025-05-03', '2025-05-04', true, 2, 2);
INSERT INTO Sesionterapia (fecha_inicio, fecha_fin, completado, idusuario, idterapia) VALUES ('2025-05-05', '2025-05-06', false, 1, 3);
INSERT INTO Sesionterapia (fecha_inicio, fecha_fin, completado, idusuario, idterapia) VALUES ('2025-05-07', '2025-05-08', true, 2, 1);
INSERT INTO Sesionterapia (fecha_inicio, fecha_fin, completado, idusuario, idterapia) VALUES ('2025-05-09', '2025-05-10', false, 1, 2);
INSERT INTO Sesionterapia (fecha_inicio, fecha_fin, completado, idusuario, idterapia) VALUES ('2025-05-11', '2025-05-12', true, 2, 3);
INSERT INTO Sesionterapia (fecha_inicio, fecha_fin, completado, idusuario, idterapia) VALUES ('2025-05-13', '2025-05-14', true, 1, 1);
INSERT INTO Sesionterapia (fecha_inicio, fecha_fin, completado, idusuario, idterapia) VALUES ('2025-05-15', '2025-05-16', false, 2, 2);
INSERT INTO Sesionterapia (fecha_inicio, fecha_fin, completado, idusuario, idterapia) VALUES ('2025-05-17', '2025-05-18', true, 1, 3);
INSERT INTO Sesionterapia (fecha_inicio, fecha_fin, completado, idusuario, idterapia) VALUES ('2025-05-19', '2025-05-20', false, 2, 1);
INSERT INTO Sesionterapia (fecha_inicio, fecha_fin, completado, idusuario, idterapia) VALUES ('2025-05-21', '2025-05-22', true, 1, 2);
INSERT INTO Sesionterapia (fecha_inicio, fecha_fin, completado, idusuario, idterapia) VALUES ('2025-05-23', '2025-05-24', false, 2, 3);
INSERT INTO Sesionterapia (fecha_inicio, fecha_fin, completado, idusuario, idterapia) VALUES ('2025-05-25', '2025-05-26', true, 1, 1);
INSERT INTO Sesionterapia (fecha_inicio, fecha_fin, completado, idusuario, idterapia) VALUES ('2025-05-27', '2025-05-28', false, 2, 2);
INSERT INTO Sesionterapia (fecha_inicio, fecha_fin, completado, idusuario, idterapia) VALUES ('2025-05-29', '2025-05-30', true, 1, 3);

INSERT INTO Progresomusicas (fechacompletado, completado, idsesion_terapia, idmusica_relajacion) VALUES ('2025-04-01', true, 1, 1);
INSERT INTO Progresomusicas (fechacompletado, completado, idsesion_terapia, idmusica_relajacion) VALUES ('2025-04-02', true, 2, 2);
INSERT INTO Progresomusicas (fechacompletado, completado, idsesion_terapia, idmusica_relajacion) VALUES ('2025-04-03', false, 3, 3);
INSERT INTO Progresomusicas (fechacompletado, completado, idsesion_terapia, idmusica_relajacion) VALUES ('2025-04-04', true, 4, 4);
INSERT INTO Progresomusicas (fechacompletado, completado, idsesion_terapia, idmusica_relajacion) VALUES ('2025-04-05', false, 5, 5);
INSERT INTO Progresomusicas (fechacompletado, completado, idsesion_terapia, idmusica_relajacion) VALUES ('2025-04-06', true, 6, 6);
INSERT INTO Progresomusicas (fechacompletado, completado, idsesion_terapia, idmusica_relajacion) VALUES ('2025-04-07', true, 7, 7);
INSERT INTO Progresomusicas (fechacompletado, completado, idsesion_terapia, idmusica_relajacion) VALUES ('2025-04-08', false, 8, 8);
INSERT INTO Progresomusicas (fechacompletado, completado, idsesion_terapia, idmusica_relajacion) VALUES ('2025-04-09', true, 9, 9);
INSERT INTO Progresomusicas (fechacompletado, completado, idsesion_terapia, idmusica_relajacion) VALUES ('2025-04-10', false, 10, 10);
INSERT INTO Progresomusicas (fechacompletado, completado, idsesion_terapia, idmusica_relajacion) VALUES ('2025-04-11', true, 11, 11);
INSERT INTO Progresomusicas (fechacompletado, completado, idsesion_terapia, idmusica_relajacion) VALUES ('2025-04-12', false, 12, 12);
INSERT INTO Progresomusicas (fechacompletado, completado, idsesion_terapia, idmusica_relajacion) VALUES ('2025-04-13', true, 13, 13);
INSERT INTO Progresomusicas (fechacompletado, completado, idsesion_terapia, idmusica_relajacion) VALUES ('2025-04-14', true, 14, 14);
INSERT INTO Progresomusicas (fechacompletado, completado, idsesion_terapia, idmusica_relajacion) VALUES ('2025-04-15', false, 15, 15);

INSERT INTO tecnicameditacion (nombre_tecnica_meditacion, descripcion_tecnica_meditacion, idterapia) VALUES ('Atencion a la Respiracion', 'Concentracion en la respiracion', 1);
INSERT INTO tecnicameditacion (nombre_tecnica_meditacion, descripcion_tecnica_meditacion, idterapia) VALUES ('Escaneo Corporal', 'Exploracion sensorial del cuerpo', 1);
INSERT INTO tecnicameditacion (nombre_tecnica_meditacion, descripcion_tecnica_meditacion, idterapia) VALUES ('Observacion de Pensamientos', 'Conciencia del dialogo interno', 2);
INSERT INTO tecnicameditacion (nombre_tecnica_meditacion, descripcion_tecnica_meditacion, idterapia) VALUES ('Relajacion de Miembros', 'Relajacion secuencial de musculos', 3);
INSERT INTO tecnicameditacion (nombre_tecnica_meditacion, descripcion_tecnica_meditacion, idterapia) VALUES ('4-7-8', 'Tecnica de respiracion para dormir', 1);
INSERT INTO tecnicameditacion (nombre_tecnica_meditacion, descripcion_tecnica_meditacion, idterapia) VALUES ('Visualizacion Positiva', 'Imaginacion guiada', 3);
INSERT INTO tecnicameditacion (nombre_tecnica_meditacion, descripcion_tecnica_meditacion, idterapia) VALUES ('Inhalacion Profunda', 'Respiracion controlada', 1);
INSERT INTO tecnicameditacion (nombre_tecnica_meditacion, descripcion_tecnica_meditacion, idterapia) VALUES ('Silencio Interno', 'Desarrollo de quietud mental', 3);
INSERT INTO tecnicameditacion (nombre_tecnica_meditacion, descripcion_tecnica_meditacion, idterapia) VALUES ('Autoaceptacion', 'Fortalecer autoestima', 3);
INSERT INTO tecnicameditacion (nombre_tecnica_meditacion, descripcion_tecnica_meditacion, idterapia) VALUES ('Aromas y Memoria', 'Asociaciones olfativas positivas', 2);
INSERT INTO tecnicameditacion (nombre_tecnica_meditacion, descripcion_tecnica_meditacion, idterapia) VALUES ('Mantras Suaves', 'Repeticion de sonidos', 2);
INSERT INTO tecnicameditacion (nombre_tecnica_meditacion, descripcion_tecnica_meditacion, idterapia) VALUES ('Movimiento Consciente', 'Meditacion en movimiento', 3);
INSERT INTO tecnicameditacion (nombre_tecnica_meditacion, descripcion_tecnica_meditacion, idterapia) VALUES ('Ritmo Natural', 'Respiracion sin forzar', 1);
INSERT INTO tecnicameditacion (nombre_tecnica_meditacion, descripcion_tecnica_meditacion, idterapia) VALUES ('Paisaje Interno', 'Visualizar un lugar seguro', 3);
INSERT INTO tecnicameditacion (nombre_tecnica_meditacion, descripcion_tecnica_meditacion, idterapia) VALUES ('Compasion Guiada', 'Desarrollar empatia interna', 2);

INSERT INTO pagos (tipo_pago, fecha_pago, idusuario) VALUES ('Billetera Electronica', '2025-05-01', 1);
INSERT INTO pagos (tipo_pago, fecha_pago, idusuario) VALUES ('Tarjeta', '2025-05-02', 2);
INSERT INTO pagos (tipo_pago, fecha_pago, idusuario) VALUES ('Billetera Electronica', '2025-05-03', 1);
INSERT INTO pagos (tipo_pago, fecha_pago, idusuario) VALUES ('Tarjeta', '2025-05-04', 2);
INSERT INTO pagos (tipo_pago, fecha_pago, idusuario) VALUES ('Billetera Electronica', '2025-05-05', 1);
INSERT INTO pagos (tipo_pago, fecha_pago, idusuario) VALUES ('Tarjeta', '2025-05-06', 2);
INSERT INTO pagos (tipo_pago, fecha_pago, idusuario) VALUES ('Billetera Electronica', '2025-05-07', 1);
INSERT INTO pagos (tipo_pago, fecha_pago, idusuario) VALUES ('Tarjeta', '2025-05-08', 2);
INSERT INTO pagos (tipo_pago, fecha_pago, idusuario) VALUES ('Billetera Electronica', '2025-05-09', 1);
INSERT INTO pagos (tipo_pago, fecha_pago, idusuario) VALUES ('Tarjeta', '2025-05-10', 2);
INSERT INTO pagos (tipo_pago, fecha_pago, idusuario) VALUES ('Billetera Electronica', '2025-05-11', 1);
INSERT INTO pagos (tipo_pago, fecha_pago, idusuario) VALUES ('Tarjeta', '2025-05-12', 2);
INSERT INTO pagos (tipo_pago, fecha_pago, idusuario) VALUES ('Billetera Electronica', '2025-05-13', 1);
INSERT INTO pagos (tipo_pago, fecha_pago, idusuario) VALUES ('Tarjeta', '2025-05-14', 2);
INSERT INTO pagos (tipo_pago, fecha_pago, idusuario) VALUES ('Billetera Electronica', '2025-05-15', 1);


INSERT INTO billeteraelectronica (tipo_pago, imagenqrbilletera_electronica, evidencia_billetera_electronica, idpagos) VALUES ('PayPal', 'https://calmsphere.com/qr/paypal_1.png', 'https://calmsphere.com/evidencia/paypal_1.png', 1);
INSERT INTO billeteraelectronica (tipo_pago, imagenqrbilletera_electronica, evidencia_billetera_electronica, idpagos) VALUES ('Daviplata', 'https://calmsphere.com/qr/daviplata_3.png', 'https://calmsphere.com/evidencia/daviplata_3.png', 3);
INSERT INTO billeteraelectronica (tipo_pago, imagenqrbilletera_electronica, evidencia_billetera_electronica, idpagos) VALUES ('Nequi', 'https://calmsphere.com/qr/nequi_5.png', 'https://calmsphere.com/evidencia/nequi_5.png', 5);
INSERT INTO billeteraelectronica (tipo_pago, imagenqrbilletera_electronica, evidencia_billetera_electronica, idpagos) VALUES ('PayPal', 'https://calmsphere.com/qr/paypal_7.png', 'https://calmsphere.com/evidencia/paypal_7.png', 7);
INSERT INTO billeteraelectronica (tipo_pago, imagenqrbilletera_electronica, evidencia_billetera_electronica, idpagos) VALUES ('Daviplata', 'https://calmsphere.com/qr/daviplata_9.png', 'https://calmsphere.com/evidencia/daviplata_9.png', 9);
INSERT INTO billeteraelectronica (tipo_pago, imagenqrbilletera_electronica, evidencia_billetera_electronica, idpagos) VALUES ('Nequi', 'https://calmsphere.com/qr/nequi_11.png', 'https://calmsphere.com/evidencia/nequi_11.png', 11);
INSERT INTO billeteraelectronica (tipo_pago, imagenqrbilletera_electronica, evidencia_billetera_electronica, idpagos) VALUES ('PayPal', 'https://calmsphere.com/qr/paypal_13.png', 'https://calmsphere.com/evidencia/paypal_13.png', 13);
INSERT INTO billeteraelectronica (tipo_pago, imagenqrbilletera_electronica, evidencia_billetera_electronica, idpagos) VALUES ('Daviplata', 'https://calmsphere.com/qr/daviplata_15.png', 'https://calmsphere.com/evidencia/daviplata_15.png', 15);

INSERT INTO tarjeta (nombre_titular_tarjeta, numero_tarjeta, cvv_tarjeta, fechacaducidad_tarjeta, idpagos) VALUES ('Maria Garcia', '4111 2345 6789 2345', '234', '05/24', 2);
INSERT INTO tarjeta (nombre_titular_tarjeta, numero_tarjeta, cvv_tarjeta, fechacaducidad_tarjeta, idpagos) VALUES ('Ana Rodriguez', '4111 2345 6789 4567', '456', '02/25', 4);
INSERT INTO tarjeta (nombre_titular_tarjeta, numero_tarjeta, cvv_tarjeta, fechacaducidad_tarjeta, idpagos) VALUES ('Sofia Hernandez', '4111 2345 6789 6789', '678', '03/28', 6);
INSERT INTO tarjeta (nombre_titular_tarjeta, numero_tarjeta, cvv_tarjeta, fechacaducidad_tarjeta, idpagos) VALUES ('Laura Perez', '4111 2345 6789 8901', '890', '06/23', 8);
INSERT INTO tarjeta (nombre_titular_tarjeta, numero_tarjeta, cvv_tarjeta, fechacaducidad_tarjeta, idpagos) VALUES ('Marta Gomez', '4111 2345 6789 0123', '012', '11/25', 10);
INSERT INTO tarjeta (nombre_titular_tarjeta, numero_tarjeta, cvv_tarjeta, fechacaducidad_tarjeta, idpagos) VALUES ('Antonio Lopez', '4111 2345 6789 2341', '234', '09/28', 12);
INSERT INTO tarjeta (nombre_titular_tarjeta, numero_tarjeta, cvv_tarjeta, fechacaducidad_tarjeta, idpagos) VALUES ('Ricardo Torres', '4111 2345 6789 4563', '456', '03/29', 14);

INSERT INTO membresia (fechainicio_membresia, fechafinal_membresia, estado_membresia, idusuario) VALUES ('2025-01-01', '2025-01-31', true, 1);
INSERT INTO membresia (fechainicio_membresia, fechafinal_membresia, estado_membresia, idusuario) VALUES ('2025-02-01', '2025-03-03', true, 2);

INSERT INTO Progresomusicas (fechacompletado, completado, idsesion_terapia, idmusica_relajacion) VALUES ('2025-04-01', true, 1, 1);
INSERT INTO Progresomusicas (fechacompletado, completado, idsesion_terapia, idmusica_relajacion) VALUES ('2025-04-02', true, 2, 2);
INSERT INTO Progresomusicas (fechacompletado, completado, idsesion_terapia, idmusica_relajacion) VALUES ('2025-04-03', false, 3, 3);
INSERT INTO Progresomusicas (fechacompletado, completado, idsesion_terapia, idmusica_relajacion) VALUES ('2025-04-04', true, 4, 4);
INSERT INTO Progresomusicas (fechacompletado, completado, idsesion_terapia, idmusica_relajacion) VALUES ('2025-04-05', false, 5, 5);
INSERT INTO Progresomusicas (fechacompletado, completado, idsesion_terapia, idmusica_relajacion) VALUES ('2025-04-06', true, 6, 6);
INSERT INTO Progresomusicas (fechacompletado, completado, idsesion_terapia, idmusica_relajacion) VALUES ('2025-04-07', true, 7, 7);
INSERT INTO Progresomusicas (fechacompletado, completado, idsesion_terapia, idmusica_relajacion) VALUES ('2025-04-08', false, 8, 8);
INSERT INTO Progresomusicas (fechacompletado, completado, idsesion_terapia, idmusica_relajacion) VALUES ('2025-04-09', true, 9, 9);
INSERT INTO Progresomusicas (fechacompletado, completado, idsesion_terapia, idmusica_relajacion) VALUES ('2025-04-10', false, 10, 10);
INSERT INTO Progresomusicas (fechacompletado, completado, idsesion_terapia, idmusica_relajacion) VALUES ('2025-04-11', true, 11, 11);
INSERT INTO Progresomusicas (fechacompletado, completado, idsesion_terapia, idmusica_relajacion) VALUES ('2025-04-12', false, 12, 12);
INSERT INTO Progresomusicas (fechacompletado, completado, idsesion_terapia, idmusica_relajacion) VALUES ('2025-04-13', true, 13, 13);
INSERT INTO Progresomusicas (fechacompletado, completado, idsesion_terapia, idmusica_relajacion) VALUES ('2025-04-14', true, 14, 14);
INSERT INTO Progresomusicas (fechacompletado, completado, idsesion_terapia, idmusica_relajacion) VALUES ('2025-04-15', false, 15, 15);

INSERT INTO videostecnicasrespiracion (nombre_respiracion, descripcion_respiracion, link_respiracion, idterapia) VALUES ('Respiracion Diafragmatica', 'Tecnica de respiracion profunda que ayuda a reducir el estres y mejorar la concentracion.', 'https://calmsphere.com/video1', 1);
INSERT INTO videostecnicasrespiracion (nombre_respiracion, descripcion_respiracion, link_respiracion, idterapia) VALUES ('Respiracion de Caja', 'Tecnica que consiste en inhalar, sostener, exhalar y mantener la respiracion en intervalos iguales.', 'https://calmsphere.com/video2', 1);
INSERT INTO videostecnicasrespiracion (nombre_respiracion, descripcion_respiracion, link_respiracion, idterapia) VALUES ('Respiracion de Fuego', 'Tecnica activa que energiza el cuerpo mediante respiraciones rapidas y controladas.', 'https://calmsphere.com/video3', 1);
INSERT INTO videostecnicasrespiracion (nombre_respiracion, descripcion_respiracion, link_respiracion, idterapia) VALUES ('Respiracion Alterna de Narinas', 'Tecnica que equilibra el cuerpo y la mente al alternar la respiracion entre las narinas.', 'https://calmsphere.com/video4', 1);
INSERT INTO videostecnicasrespiracion (nombre_respiracion, descripcion_respiracion, link_respiracion, idterapia) VALUES ('Respiracion 4-7-8', 'Inhalar durante 4 segundos, sostener la respiracion por 7 segundos y exhalar durante 8 segundos para reducir la ansiedad.', 'https://calmsphere.com/video5', 1);
INSERT INTO videostecnicasrespiracion (nombre_respiracion, descripcion_respiracion, link_respiracion, idterapia) VALUES ('Respiracion Relajante', 'Tecnica suave y profunda para inducir la relajacion y reducir la tension.', 'https://calmsphere.com/video6', 1);
INSERT INTO videostecnicasrespiracion (nombre_respiracion, descripcion_respiracion, link_respiracion, idterapia) VALUES ('Respiracion Abdominal', 'Inhalacion profunda que expande el abdomen, mejorando la oxigenacion.', 'https://calmsphere.com/video7', 1);
INSERT INTO videostecnicasrespiracion (nombre_respiracion, descripcion_respiracion, link_respiracion, idterapia) VALUES ('Respiracion Lenta', 'Tecnica de respiracion pausada que calma el sistema nervioso.', 'https://calmsphere.com/video8', 1);
INSERT INTO videostecnicasrespiracion (nombre_respiracion, descripcion_respiracion, link_respiracion, idterapia) VALUES ('Respiracion de Estrella', 'Tecnica que sincroniza la respiracion con movimientos especificos para aumentar la concentracion.', 'https://calmsphere.com/video9', 1);
INSERT INTO videostecnicasrespiracion (nombre_respiracion, descripcion_respiracion, link_respiracion, idterapia) VALUES ('Respiracion Nadi Shodhana', 'Tecnica de respiracion que limpia los canales energeticos y equilibra la mente.', 'https://calmsphere.com/video10', 1);
INSERT INTO videostecnicasrespiracion (nombre_respiracion, descripcion_respiracion, link_respiracion, idterapia) VALUES ('Respiracion en Movimiento', 'Combinacion de respiracion y movimientos suaves para liberar bloqueos energeticos.', 'https://calmsphere.com/video11', 1);
INSERT INTO videostecnicasrespiracion (nombre_respiracion, descripcion_respiracion, link_respiracion, idterapia) VALUES ('Respiracion Suavizada', 'Tecnica suave que reduce la tension y mejora el enfoque mental.', 'https://calmsphere.com/video12', 1);
INSERT INTO videostecnicasrespiracion (nombre_respiracion, descripcion_respiracion, link_respiracion, idterapia) VALUES ('Respiracion en Meditacion', 'Respiracion profunda y tranquila que facilita la concentracion durante la meditacion.', 'https://calmsphere.com/video13', 1);
INSERT INTO videostecnicasrespiracion (nombre_respiracion, descripcion_respiracion, link_respiracion, idterapia) VALUES ('Respiracion Energizante', 'Tecnica rapida que revitaliza el cuerpo y mente, aumentando la vitalidad.', 'https://calmsphere.com/video14', 1);
INSERT INTO videostecnicasrespiracion (nombre_respiracion, descripcion_respiracion, link_respiracion, idterapia) VALUES ('Respiracion Larga y Profunda', 'Inhalacion profunda seguida de una exhalacion lenta para reducir la ansiedad y fomentar la calma.', 'https://calmsphere.com/video15', 1);

INSERT INTO progresovideosTR (fechacompletado, completado, idsesion_terapia, idvideos_tecnicas_respiracion) VALUES ('2025-04-01', true, 1, 1);
INSERT INTO progresovideosTR (fechacompletado, completado, idsesion_terapia, idvideos_tecnicas_respiracion) VALUES ('2025-04-02', false, 2, 2);
INSERT INTO progresovideosTR (fechacompletado, completado, idsesion_terapia, idvideos_tecnicas_respiracion) VALUES ('2025-04-03', true, 3, 3);
INSERT INTO progresovideosTR (fechacompletado, completado, idsesion_terapia, idvideos_tecnicas_respiracion) VALUES ('2025-04-04', true, 4, 4);
INSERT INTO progresovideosTR (fechacompletado, completado, idsesion_terapia, idvideos_tecnicas_respiracion) VALUES ('2025-04-05', false, 5, 5);
INSERT INTO progresovideosTR (fechacompletado, completado, idsesion_terapia, idvideos_tecnicas_respiracion) VALUES ('2025-04-06', true, 6, 6);
INSERT INTO progresovideosTR (fechacompletado, completado, idsesion_terapia, idvideos_tecnicas_respiracion) VALUES ('2025-04-07', true, 7, 7);
INSERT INTO progresovideosTR (fechacompletado, completado, idsesion_terapia, idvideos_tecnicas_respiracion) VALUES ('2025-04-08', false, 8, 8);
INSERT INTO progresovideosTR (fechacompletado, completado, idsesion_terapia, idvideos_tecnicas_respiracion) VALUES ('2025-04-09', true, 9, 9);
INSERT INTO progresovideosTR (fechacompletado, completado, idsesion_terapia, idvideos_tecnicas_respiracion) VALUES ('2025-04-10', true, 10, 10);
INSERT INTO progresovideosTR (fechacompletado, completado, idsesion_terapia, idvideos_tecnicas_respiracion) VALUES ('2025-04-11', false, 11, 11);
INSERT INTO progresovideosTR (fechacompletado, completado, idsesion_terapia, idvideos_tecnicas_respiracion) VALUES ('2025-04-12', true, 12, 12);
INSERT INTO progresovideosTR (fechacompletado, completado, idsesion_terapia, idvideos_tecnicas_respiracion) VALUES ('2025-04-13', false, 13, 13);
INSERT INTO progresovideosTR (fechacompletado, completado, idsesion_terapia, idvideos_tecnicas_respiracion) VALUES ('2025-04-14', true, 14, 14);
INSERT INTO progresovideosTR (fechacompletado, completado, idsesion_terapia, idvideos_tecnicas_respiracion) VALUES ('2025-04-15', false, 15, 15);
INSERT INTO materialmeditacion (nombre_material_meditacion, url_material_meditacion, descripcion_material_meditacion, idtecnica_meditacion, idtipo_material) VALUES ('Respiracion consciente', 'https://meditaapp.com/materiales/respiracion1', 'Ejercicio de respiracion profunda para comenzar el dia.', 1, 1);
INSERT INTO materialmeditacion (nombre_material_meditacion, url_material_meditacion, descripcion_material_meditacion, idtecnica_meditacion, idtipo_material) VALUES ('Visualizacion guiada', 'https://meditaapp.com/materiales/visualizacion1', 'Guia visual para reducir el estres.', 2, 2);
INSERT INTO materialmeditacion (nombre_material_meditacion, url_material_meditacion, descripcion_material_meditacion, idtecnica_meditacion, idtipo_material) VALUES ('Escaneo corporal', 'https://meditaapp.com/materiales/escaneo1', 'Practica de atencion plena al cuerpo.', 3, 3);
INSERT INTO materialmeditacion (nombre_material_meditacion, url_material_meditacion, descripcion_material_meditacion, idtecnica_meditacion, idtipo_material) VALUES ('Mantra Om', 'https://meditaapp.com/materiales/mantra1', 'Audio con repeticion de mantras para concentracion.', 4, 4);
INSERT INTO materialmeditacion (nombre_material_meditacion, url_material_meditacion, descripcion_material_meditacion, idtecnica_meditacion, idtipo_material) VALUES ('Mente abierta', 'https://meditaapp.com/materiales/menteabierta1', 'Documento sobre tecnicas de aceptacion.', 5, 5);
INSERT INTO materialmeditacion (nombre_material_meditacion, url_material_meditacion, descripcion_material_meditacion, idtecnica_meditacion, idtipo_material) VALUES ('Agradecimiento diario', 'https://meditaapp.com/materiales/agradecimiento1', 'Ejercicio para cultivar gratitud al despertar.', 6, 6);
INSERT INTO materialmeditacion (nombre_material_meditacion, url_material_meditacion, descripcion_material_meditacion, idtecnica_meditacion, idtipo_material) VALUES ('Respiracion 4-7-8', 'https://meditaapp.com/materiales/respiracion478', 'Ejercicio para conciliar el sueno.', 7, 7);
INSERT INTO materialmeditacion (nombre_material_meditacion, url_material_meditacion, descripcion_material_meditacion, idtecnica_meditacion, idtipo_material) VALUES ('Meditacion caminando', 'https://meditaapp.com/materiales/caminando1', 'Instrucciones para meditar al caminar.', 8, 8);
INSERT INTO materialmeditacion (nombre_material_meditacion, url_material_meditacion, descripcion_material_meditacion, idtecnica_meditacion, idtipo_material) VALUES ('Relajacion progresiva', 'https://meditaapp.com/materiales/relajacion1', 'Tecnica para soltar tension muscular.', 9, 9);
INSERT INTO materialmeditacion (nombre_material_meditacion, url_material_meditacion, descripcion_material_meditacion, idtecnica_meditacion, idtipo_material) VALUES ('Meditacion del amor bondadoso', 'https://meditaapp.com/materiales/metta1', 'Guia de meditacion para generar compasion.', 10, 10);
INSERT INTO materialmeditacion (nombre_material_meditacion, url_material_meditacion, descripcion_material_meditacion, idtecnica_meditacion, idtipo_material) VALUES ('Anclaje al presente', 'https://meditaapp.com/materiales/presente1', 'Tecnica para reconectar con el aqui y ahora.', 11, 11);
INSERT INTO materialmeditacion (nombre_material_meditacion, url_material_meditacion, descripcion_material_meditacion, idtecnica_meditacion, idtipo_material) VALUES ('Ritual de cierre', 'https://meditaapp.com/materiales/cierre1', 'Material para cerrar sesiones con intencion.', 12, 12);
INSERT INTO materialmeditacion (nombre_material_meditacion, url_material_meditacion, descripcion_material_meditacion, idtecnica_meditacion, idtipo_material) VALUES ('Respiracion abdominal', 'https://meditaapp.com/materiales/abdominal1', 'Instrucciones paso a paso para respirar profundo.', 13, 13);
INSERT INTO materialmeditacion (nombre_material_meditacion, url_material_meditacion, descripcion_material_meditacion, idtecnica_meditacion, idtipo_material) VALUES ('Meditacion del sonido', 'https://meditaapp.com/materiales/sonido1', 'Uso de sonidos naturales como anclaje.', 14, 14);
INSERT INTO materialmeditacion (nombre_material_meditacion, url_material_meditacion, descripcion_material_meditacion, idtecnica_meditacion, idtipo_material) VALUES ('Bitacora de emociones', 'https://meditaapp.com/materiales/bitacora1', 'PDF para registrar emociones y reflexiones.', 15, 15);

INSERT INTO progreso_material_medi (fechacompletado, completado, idsesion_terapia, idmaterial_meditacion) VALUES ('2025-05-01', true, 1, 1);
INSERT INTO progreso_material_medi (fechacompletado, completado, idsesion_terapia, idmaterial_meditacion) VALUES ('2025-05-02', true, 2, 2);
INSERT INTO progreso_material_medi (fechacompletado, completado, idsesion_terapia, idmaterial_meditacion) VALUES ('2025-05-03', false, 3, 3);
INSERT INTO progreso_material_medi (fechacompletado, completado, idsesion_terapia, idmaterial_meditacion) VALUES ('2025-05-04', true, 4, 4);
INSERT INTO progreso_material_medi (fechacompletado, completado, idsesion_terapia, idmaterial_meditacion) VALUES ('2025-05-05', false, 5, 5);
INSERT INTO progreso_material_medi (fechacompletado, completado, idsesion_terapia, idmaterial_meditacion) VALUES ('2025-05-06', true, 6, 6);
INSERT INTO progreso_material_medi (fechacompletado, completado, idsesion_terapia, idmaterial_meditacion) VALUES ('2025-05-07', true, 7, 7);
INSERT INTO progreso_material_medi (fechacompletado, completado, idsesion_terapia, idmaterial_meditacion) VALUES ('2025-05-08', false, 8, 8);
INSERT INTO progreso_material_medi (fechacompletado, completado, idsesion_terapia, idmaterial_meditacion) VALUES ('2025-05-09', true, 9, 9);
INSERT INTO progreso_material_medi (fechacompletado, completado, idsesion_terapia, idmaterial_meditacion) VALUES ('2025-05-10', true, 10, 10);
INSERT INTO progreso_material_medi (fechacompletado, completado, idsesion_terapia, idmaterial_meditacion) VALUES ('2025-05-11', false, 11, 11);
INSERT INTO progreso_material_medi (fechacompletado, completado, idsesion_terapia, idmaterial_meditacion) VALUES ('2025-05-12', true, 12, 12);
INSERT INTO progreso_material_medi (fechacompletado, completado, idsesion_terapia, idmaterial_meditacion) VALUES ('2025-05-13', false, 13, 13);
INSERT INTO progreso_material_medi (fechacompletado, completado, idsesion_terapia, idmaterial_meditacion) VALUES ('2025-05-14', true, 14, 14);
INSERT INTO progreso_material_medi (fechacompletado, completado, idsesion_terapia, idmaterial_meditacion) VALUES ('2025-05-15', true, 15, 15);
