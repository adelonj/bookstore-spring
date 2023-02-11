CREATE TABLE IF NOT EXISTS public.book_file
(
    id              BIGINT  NOT NULL GENERATED BY DEFAULT AS IDENTITY,
    create_date     TIMESTAMP without time zone NOT NULL,
    edit_date       TIMESTAMP without time zone NOT NULL,
    type_id         BIGINT NOT NULL,
    hash            CHARACTER VARYING(255) NOT NULL,
    path            CHARACTER VARYING(255) NOT NULL,

    CONSTRAINT book_file_pkey PRIMARY KEY (id),
    CONSTRAINT fk_book_file_typeId
    FOREIGN KEY (type_id)
            REFERENCES public.book_file_type (id)  ON DELETE CASCADE
);

