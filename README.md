# java-demo

java study

## Java 基础

### HelloWorld

- 编译

  ```sh
  javac src/HelloWorld.java
  ```

- 运行

  -cp 是 -classpath 的缩写，用于指定类路径。类路径告诉 Java 运行时和编译器去哪里寻找类文件（.class 文件），以便成功加载和运行程序中的类。

  ```sh
  java -cp src HelloWorld
  ```

### example1

- 编译

  `-d .`会将编译生成的 .class 文件输出到当前目录，并创建相应的包结构。

  ```sh
  javac -d . src/example1/EmployeeTest.java src/example1/Employee.java
  ```

- 运行

  -cp 是 -classpath 的缩写，用于指定类路径。类路径告诉 Java 运行时和编译器去哪里寻找类文件（.class 文件），以便成功加载和运行程序中的类。

  ```sh
  java -cp src HelloWorld
  ```

### example2

- 编译

  ```sh
  javac -d . src/example2/mycompany/ecommerce/checkout/PaymentProcessor.java src/CheckoutService.java
  ```

- 运行

  ```sh
  java CheckoutService
  ```
