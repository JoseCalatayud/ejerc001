-- public.dato definition

-- Drop table

-- DROP TABLE public.dato;

CREATE TABLE public.dato (
	id int4 NOT NULL,
	nombre varchar(80) NULL,
	CONSTRAINT dato_pk PRIMARY KEY (id)
);