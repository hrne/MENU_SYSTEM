use menu_system;

-- Memu_Item 菜單選項
create table Menu_Item(
	id int not null AUTO_INCREMENT comment 'key值',
	item_name varchar(100) not null comment '菜名',
    price int not null comment '單價',
    update_date timestamp not null DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新時間',
	PRIMARY KEY(id)
)comment '菜單選項';

-- Memu_Item 菜單狀態
create table Menu_State(
	id int not null AUTO_INCREMENT comment 'key值',
	state_name varchar(100) not null comment '菜單狀態名稱',
    update_date timestamp not null DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新時間',
	PRIMARY KEY(id)
)comment '菜單狀態';

-- Memu_Order 點餐資料
create table Menu_Order(
	id int not null AUTO_INCREMENT comment 'key值',
	table_num int not null comment '桌號',
	menu_item_id int not null comment '菜單ID',
	order_num int not null comment '數量',
	remark varchar(100)comment '備註',
	menu_state_id int not null comment '菜單狀態',
	update_date timestamp not null DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新時間',
	PRIMARY KEY(id),
	FOREIGN KEY (menu_item_id) REFERENCES Menu_Item (id),
	FOREIGN KEY (menu_state_id) REFERENCES Menu_State (id)
)comment '點餐資料';


--drop table
drop table Menu_Order;
drop table Menu_State;
drop table Menu_Item;