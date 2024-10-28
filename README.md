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

## Maven 构建

### 编译

Maven 是一个广泛使用的 Java 项目管理和构建工具。使用 Maven 可以轻松管理依赖关系并自动化编译。

- 创建 Maven 项目：

  在项目根目录下，使用以下命令生成 Maven 项目结构：

  ```sh
  mvn archetype:generate -DgroupId=com.mycompany.service -DartifactId=crud-service -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
  ```

- 配置依赖：

  Maven 项目中有一个 pom.xml 文件，它用于管理依赖和配置构建。在 pom.xml 中定义项目的依赖库（如果需要）。

- 编译项目

  在项目根目录执行以下命令，Maven 会自动编译 src/main/java 中的代码，并将生成的 .class 文件放在 target/classes 目录中：

  ```sh
  //自动查找项目根目录的pom.xml文件
  mvn compile
  ```

- 运行项目

  ```sh
  mvn exec:java -Dexec.mainClass="com.mycompany.service.Main"
  ```

### 生成 JAR 包

JAR 包（Java ARchive）是 Java 中用于将多个 .class 文件、资源文件（如图片、配置文件）、依赖库等打包在一个压缩文件中的格式，文件后缀为 .jar。它的主要作用是简化 Java 项目的分发、共享和运行。

- 确保您运行了以下命令来生成 JAR 包：

  ```sh
  mvn clean package
  ```

- 定位 JAR 包

  构建完成后，您可以在项目根目录下的 target 文件夹中找到生成的 JAR 文件。文件名的格式通常是 artifactId-version.jar，例如：

  ```
  target/crud-service-1.0.jar
  ```

  其中：

  • crud-service 是 artifactId。
  • 1.0 是 version。

- 运行生成的 JAR 包

  您可以使用以下命令来运行这个 JAR 文件：

  ```sh
  java -jar target/crud-service-1.0.jar
  ```

当你运行 mvn package 时，Maven 会按照生命周期阶段自动执行以下步骤：

1. validate：验证项目是否正确并且所有必要信息都可用。
2. compile：编译源代码。
3. test：运行单元测试。
4. package：将编译后的代码打包成 JAR 文件。

因此，直接执行 mvn package 就会完成 compile 步骤，无需先手动运行 mvn compile。
