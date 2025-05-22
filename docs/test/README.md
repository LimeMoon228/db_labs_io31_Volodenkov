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

якщо ні, то встановлюємо maven.
<br>
<br>

компілюємо та збираємо проєкт

```bash
mvn clean package
```

запускаємо проєкт на java

```bash
cd target
java -jar db_lab_6-0.0.1-SNAPSHOT.jar
```



<hr>

## Тестування

### User:

#### GET All
![UserGetAll.png](..%2F..%2Fimages%2FUserGetAll.png)
#### GET By ID
![UserGetById.png](..%2F..%2Fimages%2FUserGetById.png)
#### POST
![UserPost.png](..%2F..%2Fimages%2FUserPost.png)
#### PUT
![UserPut.png](..%2F..%2Fimages%2FUserPut.png)
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

