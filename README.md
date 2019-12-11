# SitUpWebServer
SitUp app web server

# 本站对外接口

- 本站遵循 MIT 开源协议
- 禁止任何形式侵犯版权
- 本站对外开放所有 api 



![API](https://github.com/FishInWater-1999/SitUpWebServer/blob/master/WebContent/drawable/thVCGWHGMT.jpg)



## 用户

- 注册

```
http://localhost:8080/SitUpWebServer/regist?username=qwe&password=qwe

返回 int
```

- 登录

```
http://localhost:8080/SitUpWebServer/login?username=qwe&password=qwe

返回 UserBean JSON
```

- 修改

```
http://localhost:8080/SitUpWebServer/update?user_id=0c68ab94-5af5-43ea-8be4-6bc5c4e29b3e&user_password=123456

返回 UserBean JSON
```



## 帖子

- 发布

```
http://localhost:8080/SitUpWebServer/publishpost?user_id=qwe&post_title=qwe&post_content=qwe&post_date=q-w-e

返回 PostBean JSON
```

- 删除

```
http://localhost:8080/SitUpWebServer/deletepost?post_id=3c3b10ae-797f-49a6-a11f-8649ea350767

返回 int
```



## 计划

- 发布

```
http://localhost:8080/SitUpWebServer/AddPlan?plan_title=qwe&plan_content=qwe&plan_date=3-3-3&plan_start_date=qwe&plan_end_date=qwe&plan_score=0

返回 int JSON
```

- 修改

```
http://localhost:8080/SitUpWebServer/updateplan?plan_id=24cc4128-59c9-4fa9-93b1-7af7da35edb5&plan_title=qwe&plan_content=qwe&plan_date=3-3-3&plan_start_date=qwe&plan_end_date=qwe&plan_score=0

返回 int JSON
```

- 删除

```
http://localhost:8080/SitUpWebServer/deleteplan?plan_id=5bdfa8d2-e642-4f64-9f73-677b7ce3e3c4

返回 int
```



## 点赞

- 点赞

```
http://localhost:8080/SitUpWebServer/addfavorite?post_id=qwe&user_id=123123

返回 int

```

- 取消点赞

```
http://localhost:8080/SitUpWebServer/cancelfavorite?favorite_id=59e49d1a-7306-4968-8c82-a76c792583b3

返回 int

```



## 收藏

- 收藏

```
http://localhost:8080/SitUpWebServer/addcollection?post_id=qwe&user_id=123123

返回 boolean

```

- 取消收藏

```
http://localhost:8080/SitUpWebServer/cancelcollection?collection_id=a214003a-2433-4b04-9f02-fa42cc57bcdd

返回 boolean

```



## 返回值

| 类型           | 返回值 |
| -------------- | ------ |
| SUCCEED        | 1      |
| FAILED         | -1     |
| WRONG_NAME     | -2     |
| WRONG_PASSWORD | -3     |



# 项目地址

- [SitUpWebServer](https://github.com/FishInWater-1999/SitUpWebServer)



# MIT License

```
Copyright (c) 2019-12-10 FishInWater-1999

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

```



# LICENSE
MIT License

Copyright (c) 2019-12-10 FishInWater-1999

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
