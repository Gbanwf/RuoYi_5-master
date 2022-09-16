DROP TABLE IF EXISTS order_dd;
CREATE TABLE `order_dd` (
                            `dingdan_id` VARCHAR(255) COLLATE utf8_bin NOT NULL,
                            `laiyuan_id` VARCHAR(255) COLLATE utf8_bin DEFAULT NULL,
                            `xiadan_time` DATETIME DEFAULT NULL,
                            `user_nametwo` VARCHAR(255) COLLATE utf8_bin DEFAULT NULL,
                            `dizhi_` VARCHAR(255) COLLATE utf8_bin DEFAULT NULL,
                            `yaoqiu_time` DATETIME DEFAULT NULL,
                            `peiche_id` VARCHAR(255) COLLATE utf8_bin DEFAULT NULL,
                            `wancheng_state` VARCHAR(255) COLLATE utf8_bin DEFAULT NULL,
                            PRIMARY KEY (`dingdan_id`)
);

DROP TABLE IF EXISTS firstcar;
CREATE TABLE `firstcar` (
                            `firstpeiche_id` VARCHAR(255) COLLATE utf8_bin DEFAULT NULL,
                            `firstdingdan_id` VARCHAR(255) COLLATE utf8_bin NOT NULL,
                            `firstlaiyuan_id` VARCHAR(255) COLLATE utf8_bin DEFAULT NULL,
                            `firstxiadan_time` DATETIME DEFAULT NULL,
                            `firstuser_nametwo` VARCHAR(255) COLLATE utf8_bin DEFAULT NULL,
                            `firstdizhi_` VARCHAR(255) COLLATE utf8_bin DEFAULT NULL,
                            `firstyaoqiu_time` DATETIME DEFAULT NULL,
                            `firstwancheng_state` VARCHAR(255) COLLATE utf8_bin DEFAULT NULL,
                            PRIMARY KEY (`firstdingdan_id`)
);

DROP TABLE IF EXISTS secondcar;
CREATE TABLE `secondcar` (
                            `secondpeiche_id` VARCHAR(255) COLLATE utf8_bin DEFAULT NULL,
                            `seconddingdan_id` VARCHAR(255) COLLATE utf8_bin NOT NULL,
                            `secondlaiyuan_id` VARCHAR(255) COLLATE utf8_bin DEFAULT NULL,
                            `secondxiadan_time` DATETIME DEFAULT NULL,
                            `seconduser_nametwo` VARCHAR(255) COLLATE utf8_bin DEFAULT NULL,
                            `seconddizhi_` VARCHAR(255) COLLATE utf8_bin DEFAULT NULL,
                            `secondyaoqiu_time` DATETIME DEFAULT NULL,
                            `secondwancheng_state` VARCHAR(255) COLLATE utf8_bin DEFAULT NULL,
                            PRIMARY KEY (`seconddingdan_id`)
);

DROP TABLE IF EXISTS thirdcar;
CREATE TABLE `thirdcar` (
                             `thirdpeiche_id` VARCHAR(255) COLLATE utf8_bin DEFAULT NULL,
                             `thirddingdan_id` VARCHAR(255) COLLATE utf8_bin NOT NULL,
                             `thirdlaiyuan_id` VARCHAR(255) COLLATE utf8_bin DEFAULT NULL,
                             `thirdxiadan_time` DATETIME DEFAULT NULL,
                             `thirduser_nametwo` VARCHAR(255) COLLATE utf8_bin DEFAULT NULL,
                             `thirddizhi_` VARCHAR(255) COLLATE utf8_bin DEFAULT NULL,
                             `thirdyaoqiu_time` DATETIME DEFAULT NULL,
                             `thirdwancheng_state` VARCHAR(255) COLLATE utf8_bin DEFAULT NULL,
                             PRIMARY KEY (`thirddingdan_id`)
);