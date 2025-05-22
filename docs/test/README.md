# Тестування працездатності системи

## Запуск тестування

перехід до директорії, де в нас код api

```bash
cd src/API/lab6
```

перевірка версии maven

```bash
mvn --version
```

якщо ні, то встановлюємо maven на нашу ОС.
<br>
<br>

компілюємо та збираємо прооект

```bash
mvn clean package
```

запускаємо проект за допомогою java

```bash
cd target
java -jar db_lab_6-0.0.1-SNAPSHOT.jar
```

Або ж запускаємо за допомогою maven (перед цим не треба додатково збирати та запаковувати проект)
```bash
mvn spring-boot:run
```
<hr>

## Тестування

### User:

#### GET All
#### GET By ID
#### POST
#### PUT
#### DELETE
![UserDelete.png](..%2F..%2Fimages%2FUserDelete.png)
<hr>

### Role:

#### GET All
![RoleGetAll.png](..%2F..%2Fimages%2FRoleGetAll.png)
#### GET By ID
![RoleGetById.png](..%2F..%2Fimages%2FRoleGetById.png)
#### POST
![RolePost.png](..%2F..%2Fimages%2FRolePost.png)
#### PUT
![RolePut.png](..%2F..%2Fimages%2FRolePut.png)
#### DELETE
![RoleDelete.png](..%2F..%2Fimages%2FRoleDelete.png)
<hr>

