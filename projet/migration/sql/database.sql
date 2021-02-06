-- Databases
DROP DATABASE IF EXISTS goodfood;
DROP DATABASE IF EXISTS goodfoodold;
CREATE DATABASE goodfood CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
CREATE DATABASE goodfoodold CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- User
CREATE USER IF NOT EXISTS "goodfood"@"%";
SET password FOR "goodfood"@"%" = 'goodfood';

-- Privileges
GRANT ALL ON goodfood.* TO "goodfood"@"%";
GRANT ALL ON goodfoodold.* TO "goodfood"@"%";
FLUSH PRIVILEGES;
