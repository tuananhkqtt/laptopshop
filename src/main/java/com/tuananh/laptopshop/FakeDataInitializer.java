package com.tuananh.laptopshop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.tuananh.laptopshop.domain.User;
import com.tuananh.laptopshop.domain.Product;
import com.tuananh.laptopshop.service.RoleService;
import com.tuananh.laptopshop.service.UserService;
import com.tuananh.laptopshop.service.ProductService;

@Component
public class FakeDataInitializer implements CommandLineRunner {

    private final UserService userService;
    private final RoleService roleService;
    private final PasswordEncoder passwordEncoder;
    private final ProductService productService;

    public FakeDataInitializer(UserService userService, RoleService roleService, PasswordEncoder passwordEncoder, ProductService productService) {
        this.userService = userService;
        this.roleService = roleService;
        this.passwordEncoder = passwordEncoder;
        this.productService = productService;
    }

    @Override
    public void run(String... args) throws Exception {
        // Khởi tạo các role mặc định
        roleService.initializeDefaultRoles();

        // Kiểm tra và tạo user giả nếu chưa có
        if (userService.getUserByEmail("user@example.com") == null) {
            User user = new User();
            user.setEmail("user@example.com");
            user.setPassword(this.passwordEncoder.encode("123456"));
            user.setFullName("I Am User");
            user.setRole(roleService.getRoleByName("USER"));
            userService.handleSaveUser(user);
        }

        if (userService.getUserByEmail("admin@example.com") == null) {
            User admin = new User();
            admin.setEmail("admin@example.com");
            admin.setPassword(this.passwordEncoder.encode("123456"));
            admin.setFullName("I Am Admin");
            admin.setRole(roleService.getRoleByName("ADMIN"));
            userService.handleSaveUser(admin);
        }

        // Kiểm tra xem bảng 'products' đã có dữ liệu hay chưa
        if (productService.countProducts() == 0) {  // Dùng method countProducts() từ ProductService để kiểm tra dữ liệu
            // Nếu chưa có dữ liệu thì chèn sản phẩm mẫu vào
            Product product1 = new Product();
            product1.setName("ASUS TUF Gaming F15 FX506HF");
            product1.setPrice(17490000);
            product1.setImage("1711078092373-asus-01.png");
            product1.setDetailDesc("Laptop Asus TUF Gaming");
            product1.setShortDesc("Intel Core i5 11400H, NVIDIA RTX 3050");
            product1.setQuantity(100);
            product1.setSold(0);
            product1.setFactory("ASUS");
            product1.setTarget("GAMING");
            productService.createProduct(product1);
            
            Product product2 = new Product();
            product2.setName("Dell Inspiron 15 N3520");
            product2.setPrice(15490000);
            product2.setImage("1711078452562-dell-01.png");
            product2.setDetailDesc("Laptop Dell Inspiron 15");
            product2.setShortDesc("i5 1235U/16GB/512GB/15.6\" FHD");
            product2.setQuantity(200);
            product2.setSold(0);
            product2.setFactory("DELL");
            product2.setTarget("SINHVIEN-VANPHONG");
            productService.createProduct(product2);

            Product product3 = new Product();
            product3.setName("Lenovo IdeaPad Gaming 3");
            product3.setPrice(19500000);
            product3.setImage("1711079073759-lenovo-01.png");
            product3.setDetailDesc("Lenovo IdeaPad Gaming 3");
            product3.setShortDesc("i5-10300H, RAM 8G");
            product3.setQuantity(150);
            product3.setSold(0);
            product3.setFactory("LENOVO");
            product3.setTarget("GAMING");
            productService.createProduct(product3);

            Product product4 = new Product();
            product4.setName("Asus K501UX");
            product4.setPrice(11900000);
            product4.setImage("1711079496409-asus-02.png");
            product4.setDetailDesc("Asus K501UX");
            product4.setShortDesc("VGA NVIDIA GTX 950M- 4G");
            product4.setQuantity(99);
            product4.setSold(0);
            product4.setFactory("ASUS");
            product4.setTarget("THIET-KE-DO-HOA");
            productService.createProduct(product4);

            Product product5 = new Product();
            product5.setName("MacBook Air 13");
            product5.setPrice(17690000);
            product5.setImage("1711079954090-apple-01.png");
            product5.setDetailDesc("MacBook Air 13");
            product5.setShortDesc("Apple M1 GPU 7 nhân");
            product5.setQuantity(99);
            product5.setSold(0);
            product5.setFactory("APPLE");
            product5.setTarget("GAMING");
            productService.createProduct(product5);

            Product product6 = new Product();
            product6.setName("Laptop LG Gram Style");
            product6.setPrice(31490000);
            product6.setImage("1711080386941-lg-01.png");
            product6.setDetailDesc("Laptop LG Gram Style");
            product6.setShortDesc("Intel Iris Plus Graphics");
            product6.setQuantity(99);
            product6.setSold(0);
            product6.setFactory("LG");
            product6.setTarget("DOANH-NHAN");
            productService.createProduct(product6);

            Product product7 = new Product();
            product7.setName("MacBook Air 13 M2");
            product7.setPrice(24990000);
            product7.setImage("1711080787179-apple-02.png");
            product7.setDetailDesc("MacBook Air 13 M2");
            product7.setShortDesc("Apple M2 GPU 8 nhân");
            product7.setQuantity(99);
            product7.setSold(0);
            product7.setFactory("APPLE");
            product7.setTarget("MONG-NHE");
            productService.createProduct(product7);

            Product product8 = new Product();
            product8.setName("Laptop Acer Nitro");
            product8.setPrice(23490000);
            product8.setImage("1711080948771-acer-01.png");
            product8.setDetailDesc("Laptop Acer Nitro");
            product8.setShortDesc("i7 12700H, RTX 3050");
            product8.setQuantity(99);
            product8.setSold(0);
            product8.setFactory("ACER");
            product8.setTarget("SINHVIEN-VANPHONG");
            productService.createProduct(product8);

            Product product9 = new Product();
            product9.setName("Laptop Acer Nitro V");
            product9.setPrice(26999000);
            product9.setImage("1711081080930-asus-03.png");
            product9.setDetailDesc("Laptop Acer Nitro V");
            product9.setShortDesc("NVIDIA GeForce RTX 4050");
            product9.setQuantity(99);
            product9.setSold(0);
            product9.setFactory("ASUS");
            product9.setTarget("MONG-NHE");
            productService.createProduct(product9);

            Product product10 = new Product();
            product10.setName("Laptop Dell Latitude 3420");
            product10.setPrice(21399000);
            product10.setImage("1711081278418-dell-02.png");
            product10.setDetailDesc("Laptop Dell Latitude 3420");
            product10.setShortDesc("Intel Iris Xe Graphics");
            product10.setQuantity(99);
            product10.setSold(0);
            product10.setFactory("DELL");
            product10.setTarget("MONG-NHE");
            productService.createProduct(product10);

            System.out.println("Dữ liệu mẫu đã được chèn vào bảng 'products'.");
        } else {
            System.out.println("Bảng 'products' đã có dữ liệu.");
        }
    }
}
