### 准备工作

1，mysql数据库，名称为：website；

2，redis，用的是单机版；

执行ehcache的sql，用于测试ehcache

```sql
CREATE TABLE `tb_user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

INSERT INTO `tb_user` VALUES (1, 'tellsea', '654321');
INSERT INTO `tb_user` VALUES (2, 'susan', '123456');
INSERT INTO `tb_user` VALUES (3, 'super', '565656');
```

### 启动

1，先启动eureka

2，再启动website

### 地址

1，druid连接池地址

http://127.0.0.1:8000/druid/weburi.html

2，eureka地址

[http://localhost:8761/](http://localhost:8761/)

3，swagger地址

[http://localhost:8000/swagger-ui.html#/](http://localhost:8000/swagger-ui.html#/)