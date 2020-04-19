use memu_system;

-- Memu_Item 菜單選項
create table Memu_Item(
	id int not null AUTO_INCREMENT comment 'key值',
	item_name varchar(100) not null comment '菜名',
    update_date timestamp not null DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新時間',
	PRIMARY KEY(id)
)comment '菜單選項';

-- Memu_Item 菜單狀態
create table Memu_State(
	id int not null AUTO_INCREMENT comment 'key值',
	state_name varchar(100) not null comment '菜單狀態名稱',
    update_date timestamp not null DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新時間',
	PRIMARY KEY(id)
)comment '菜單狀態';

-- Memu_Order 點餐資料
create table Memu_Order(
	id int not null AUTO_INCREMENT comment 'key值',
	table_num int not null comment '桌號',
	memu_item_id int not null comment '點餐ID',
	order_num int not null comment '點餐數量',
	remark varchar(100)comment '備註',
	memu_state_id int not null comment '菜單狀態',
	update_date timestamp not null DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新時間',
	PRIMARY KEY(id),
	FOREIGN KEY (memu_item_id) REFERENCES Memu_Item (id),
	FOREIGN KEY (memu_state_id) REFERENCES Memu_State (id)
)comment '點餐資料';


--drop table
drop table Memu_Order;
drop table Memu_State;
drop table Memu_Item;