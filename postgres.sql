CREATE DATABASE customer
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'en_US.UTF-8'
       LC_CTYPE = 'en_US.UTF-8'
       CONNECTION LIMIT = -1;

\c customer; 

CREATE TABLE public.customer
(
  id bigint NOT NULL,
  name character varying(25),
  ssn character varying(25),
  CONSTRAINT customer_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.customer
  OWNER TO postgres;

INSERT INTO public.customer(
            id, name, ssn)
    VALUES (1, 'postgres-customer', 1);