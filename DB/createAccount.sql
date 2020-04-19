-- 建立新的帳號，主機是localhost
CREATE USER 'memuuser'@'localhost' IDENTIFIED BY 'memuuser';
-- 給予新帳號權限讀寫新資料庫 memu_system
GRANT ALL PRIVILEGES ON memu_system.* TO 'memuuser'@'localhost';