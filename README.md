# LaptopShop Spring MVC Project

## Giới Thiệu
Đây là một dự án Spring MVC cho một cửa hàng laptop. Dự án này sử dụng Spring Boot, MySQL và Visual Studio Code. Bạn có thể sử dụng nó để quản lý các thông tin về laptop, người dùng và các vai trò của người dùng trong hệ thống.

## Mục Lục
1. [Cài đặt Môi Trường](#cài-đặt-môi-trường)
   - [Cài đặt Java Version 17](#cài-java-version-17)
   - [Cài đặt Visual Studio Code](#cài-đặt-visual-studio-code)
   - [Cài đặt Extensions cho VS Code](#cài-đặt-extensions-cho-vs-code)
   - [Cài đặt MySQL Workbench](#setup-mysql-workbench)
2. [Chạy Chương Trình](#chạy-chương-trình)

## Cài đặt Môi Trường

### 1. Cài Java version 17
- Tải Java 17:
  - [Link tải Java 17](ở dưới)
- Kiểm tra phiên bản:
  ```bash
  java --version
  ```
  ![Kiểm tra Java version](./images/check%20java%20version.png)

### 2. Cài đặt Visual Studio Code
- Tải VS Code: Nếu đã cài rồi thì thôi, còn chưa thì link tải ở dưới.

### 3. Cài đặt Extensions cho VS Code
- **Extension Pack for Java**  
  [Extension Pack for Java](https://marketplace.visualstudio.com/items/?itemName=vscjava.vscode-java-pack)

- **Spring Boot Extension Pack**  
  [Spring Boot Extension Pack](https://marketplace.visualstudio.com/items/?itemName=vmware.vscode-boot-dev-pack)

### 4. Setup MySQL Workbench

Cài mysql trong link ở dưới với các lưu ý sau:

1. chọn Full Options  
   ![Chọn full option](./images/mysql%20full%20option.png)

2. Khi cài đặt, chọn mật khẩu `123456`  
   ![Chọn mật khẩu MySQL](./images/set%20mysql%20password.png)

3. Xác nhận mật khẩu `123456`  
   ![Xác nhận mật khẩu](./images/check%20mysql%20password.png)

5. Sau khi finish, windows tự động mở mysql workbench thì tạo database `laptopshop`  
   ```sql
   CREATE DATABASE laptopshop;
   ```
   ![Tạo database laptopshop](./images/create%20database.jpg)

[Cài đặt java, vscode, mysql tại đây](https://actvneduvn-my.sharepoint.com/:f:/g/personal/at180104_actvn_edu_vn/EsgHVeL3GbFNsOjM8OfaStIBHpViPE0KmdIBVQ3IXjRLdw?e=o8xqME) 

## Chạy Chương Trình

1. Clone project về máy:
   ```bash
   git clone https://github.com/tuananhkqtt/laptopshop.git
   cd laptopshop
   ```

2. Mở file `LaptopShopApplication.java` và chạy:
   ![Chạy Main Application](./images/run%20project.jpg)

3. Sau khi chạy chương trình, hệ thống tự động fake data:
   ![fake data bảng roles](./images/fake%20roles%20table.jpg)
   ![Kiểm tra bảng users](./images/fake%20users%20table.jpg)
   ![Kiểm tra bảng products](./images/fake%20products%20table.jpg)

4. Truy cập ứng dụng:
   - Mở trình duyệt và vào: http://localhost:8080  
     ![Giao diện ứng dụng](./images/test%20project.jpg)

5. Test theo video demo.
