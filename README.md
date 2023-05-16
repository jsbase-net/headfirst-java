# Headfirst Java

## Devtools

- [Install Maven]()
- [Build and run a java SE Application with Maven](https://www.oracle.com/webfolder/technetwork/tutorials/obe/java/Maven_SE/Maven.html)

```sh
mvn install
mvn clean package
mvn exec:java -Dexec.mainClass="net.netbase.Main"
```

## Roadmap

### Days 1

- [x] Install Java
- [x] Common data types

1. List of users

```json
 {
    "id": 7,
    "email": "michael.lawson@reqres.in",
    "firstName": "Michael",
    "lastName": "Lawson",
    "avatar": "https://reqres.in/img/faces/7-image.jpg"
}
```

### Days 2

- [ ] Config Jetbrains build sdk : https://www.jetbrains.com/help/idea/sdk.html#set-up-jdk
- [ ] Use Java to fetch external resource from internet
- [ ] File I/O

```sh
java -jar headfirst.jar
```

1. Read/Write text files

- Write a small program to fetch gold data from internet, read url from config file

2. Write a software to generate vote report
