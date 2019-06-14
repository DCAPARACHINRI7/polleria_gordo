create database proy_polleria
use proy_polleria
/*TABLA INICIO*/
create table inicio
(
id_inicio int identity(1,1) not null,
usuario varchar(30) not null,
contrasena varchar(30) not null
)
insert into inicio values ('admin','123')

select * from inicio

/*TABLA DE REGISTRO DE USUARIO*/

CREATE TABLE USUARIOS
(
	IDUSUARIO INT IDENTITY(1,1),
	USUARIO VARCHAR(40),
	CONTRASEÑA VARCHAR(40),
	CONSTRAINT PK_USUARIOS PRIMARY KEY(IDUSUARIO),
)
delete USUARIOS
INSERT INTO USUARIOS (USUARIO, CONTRASEÑA) VALUES('LEO','leo')
INSERT INTO USUARIOS (USUARIO, CONTRASEÑA) VALUES('david','123',1)
select * from USUARIOS