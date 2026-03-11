# Lab 2 - Design Pattern

## Chủ đề

Bài lab sử dụng chủ đề **quán cà phê** để minh họa 3 mẫu thiết kế phổ biến:

- `Singleton`
- `Factory Method`
- `Abstract Factory`

Mục tiêu là giúp phân biệt vai trò của từng pattern thông qua các tình huống gần gũi trong thực tế.

## 1. Singleton Pattern

Lớp `CafeManager` được sử dụng để quản lý thông tin chung của quán cà phê, ví dụ:

- Tên quán
- Trạng thái mở cửa

Pattern `Singleton` đảm bảo trong toàn bộ chương trình chỉ tồn tại **một đối tượng quản lý duy nhất**.

Ý nghĩa:

- Tránh tạo nhiều đối tượng quản lý khác nhau
- Dễ đồng bộ dữ liệu dùng chung trong hệ thống

File chính:

- `src/lab2/singleton/CafeManager.java`

## 2. Factory Method Pattern

Lớp `DrinkFactory` dùng để tạo ra các loại đồ uống khác nhau như:

- Cà phê sữa
- Trà sữa trân châu
- Sinh tố xoài

Thay vì khởi tạo trực tiếp bằng `new`, chương trình gọi factory để nhận đúng đối tượng cần dùng.

Ý nghĩa:

- Tách phần tạo đối tượng ra khỏi phần sử dụng
- Dễ mở rộng khi thêm loại đồ uống mới
- Mã nguồn rõ ràng và dễ bảo trì hơn

Các file liên quan:

- `src/lab2/factory/Drink.java`
- `src/lab2/factory/Coffee.java`
- `src/lab2/factory/MilkTea.java`
- `src/lab2/factory/Smoothie.java`
- `src/lab2/factory/DrinkFactory.java`

## 3. Abstract Factory Pattern

Pattern `Abstract Factory` được dùng để tạo ra **một bộ sản phẩm liên quan với nhau** trong một combo của quán cà phê.

Ví dụ:

- Một loại đồ uống
- Một món ăn kèm
- Một loại topping

Trong bài này có thể tạo các combo như:

- `ClassicComboFactory`
- `HealthyComboFactory`

Ý nghĩa:

- Tạo ra các nhóm sản phẩm đồng bộ với nhau
- Phù hợp khi hệ thống có nhiều "họ sản phẩm"
- Dễ thay đổi cả bộ sản phẩm mà không ảnh hưởng mã phía client

Các file liên quan:

- `src/lab2/abstractfactory/ComboFactory.java`
- `src/lab2/abstractfactory/Dessert.java`
- `src/lab2/abstractfactory/Topping.java`
- `src/lab2/abstractfactory/ClassicComboFactory.java`
- `src/lab2/abstractfactory/HealthyComboFactory.java`

## Cấu trúc thư mục

```text
src/
└── lab2/
    ├── Main.java
    ├── singleton/
    ├── factory/
    └── abstractfactory/
```

## Cách chạy chương trình

Biên dịch:

```powershell
javac -d out (Get-ChildItem -Recurse -Filter *.java src | ForEach-Object { $_.FullName })
```

Chạy chương trình:

```powershell
java -cp out lab2.Main
```

## Kết quả minh họa

Chương trình sẽ lần lượt hiển thị:

- Kết quả của `Singleton` để chứng minh chỉ có một đối tượng quản lý
- Danh sách đồ uống được tạo bằng `Factory Method`
- Một combo hoàn chỉnh được tạo bằng `Abstract Factory`

## Kết luận

Thông qua chủ đề quán cà phê, bài lab đã minh họa được:

- `Singleton` dùng khi cần một đối tượng duy nhất
- `Factory Method` dùng khi cần tạo một đối tượng theo loại
- `Abstract Factory` dùng khi cần tạo một nhóm đối tượng liên quan với nhau

Ba pattern này giúp chương trình dễ mở rộng, dễ bảo trì và tổ chức mã nguồn tốt hơn.
