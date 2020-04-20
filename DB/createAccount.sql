-- 建立新的帳號，主機是localhost
CREATE USER 'menuuser'@'localhost' IDENTIFIED BY 'menuuser';
-- 給予新帳號權限讀寫新資料庫 menu_system
GRANT ALL PRIVILEGES ON menu_system.* TO 'menuuser'@'localhost';