CREATE TABLE MANUFACTURER
(
    ID   BIGSERIAL    NOT NULL PRIMARY KEY,
    NAME VARCHAR(255) NOT NULL,

    UNIQUE (NAME)
);

CREATE TABLE PRODUCT
(
    ID           BIGSERIAL      NOT NULL PRIMARY KEY,
    TITLE        VARCHAR(255)   NOT NULL,
    COST         DECIMAL(10, 2) NOT NULL,
    PRODUCT_DATE DATE           NOT NULL


);

create table CART
(
    ID     BIGSERIAL NOT NULL PRIMARY KEY,
    STATUS VARCHAR(256) DEFAULT ''
);
CREATE TABLE CART_PRODUCT
(
    CART_ID    BIGINT NOT NULL,
    PRODUCT_ID BIGINT NOT NULL,

    PRIMARY KEY (CART_ID, PRODUCT_ID),

    CONSTRAINT fk_cart_product,
    FOREIGN KEY (CART_ID)
        REFERENCES CART (ID),

    CONSTRAINT fk_cart_product_product
        FOREIGN KEY (PRODUCT_ID)
            REFERENCES PRODUCT (ID)
);

CREATE TABLE CLIENT
(
    ID          BIGINT       NOT NULL PRIMARY KEY,
    CLIENT_NAME varchar(256) NOT NULL
);

CREATE TABLE ORD
(
    ORD_ID  BIGINT NOT NULL PRIMARY KEY,
    PRODUCTS  varchar(32256),
    CLIENT_ID BIGINT NOT NULL,
    COST      numeric,

    CONSTRAINT fk_client_id_id
        FOREIGN KEY (CLIENT_ID)
            REFERENCES CLIENT (ID)
);

CREATE TABLE ORD_PRODUCTS
(
    ORD_ID    BIGINT NOT NULL,
    PRODUCT_ID BIGINT NOT NULL,

    PRIMARY KEY (ORD_ID, PRODUCT_ID),

    CONSTRAINT fk_ord_product
    FOREIGN KEY (ORD_ID)
        REFERENCES ORD (ORD_ID),

    CONSTRAINT fk_ord_product_product
        FOREIGN KEY (PRODUCT_ID)
            REFERENCES PRODUCT (ID)
);




