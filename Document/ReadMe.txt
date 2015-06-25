-- Thong 06/26/2015
run  below queries (I updated in update_db_09052015):
-- add new column name_unsign by Thong
ALTER TABLE products ADD (name_unsign varchar(255) CHARACTER SET utf8);

ALTER TABLE `category` CHANGE `TITLE` `TITLE` VARCHAR(256) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NULL DEFAULT NULL;
ALTER TABLE `category` CHANGE `DESCRIPTION` `DESCRIPTION` TEXT CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NULL DEFAULT NULL;
ALTER TABLE `category` CHANGE `KEYWORD` `KEYWORD` VARCHAR(256) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NULL DEFAULT NULL;


after that

Run insert brand.sql
Run insert category.sql
