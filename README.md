# SitUpWebServer
- SitUp app web server，为 SitUp App 提供各种网络接口


# 本站对外接口

- 本站遵循 MIT 开源协议
- 禁止任何形式侵犯版权
- 本站对外开放所有 api 


<div align=center><img src="https://github.com/FishInWater-1999/SitUpWebServer/blob/master/WebContent/drawable/thVCGWHGMT.jpg"/></div>


## 用户

- 注册

```
http://localhost:8080/SitUpWebServer/adduser?username=qwe&password=qwe

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
http://localhost:8080/SitUpWebServer/addpost?user_id=qwe&post_title=qwe&post_content=qwe&post_date=q-w-e

返回 PostBean JSON
```

- 删除

```
http://localhost:8080/SitUpWebServer/deletepost?post_id=3c3b10ae-797f-49a6-a11f-8649ea350767

返回 int
```

- 根据 post_id 查询帖子

```
http://localhost:8080/SitUpWebServer/getpost?post_id=0184f816-91f2-49d0-8f80-cfb78fc8af80

返回 PostBean JSON
```

- 查询用户帖子

```
http://localhost:8080/SitUpWebServer/getuserposts?user_id=478c7092-0d6d-46a3-bd4d-24f1a52296dd

返回 JSON post_id list
```

- 查询第 n 页帖子

```
http://localhost:8080/SitUpWebServer/getpostsbypage?page=0

返回 post_id
["0184f816-91f2-49d0-8f80-cfb78fc8af80","043fd455-922e-43a1-82b1-4061dae90ff8","0e6f09f9-2184-4450-b023-5071bff73df2","0e8de0cc-426e-4722-99ca-1b6c4a7ed5a4","122aef50-e9fe-456b-8bc5-27deaa5c8e97","1bb152e1-6022-4547-9cb9-d700cecc7327","2b30cfd0-6a4b-4b97-bd83-104442b52893","45a9a456-cd92-4e76-b471-61501d3c6207","464a9604-36d6-4278-91bd-3ec3ba65f03e"]
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

- 根据 plan_id 查询计划

```
http://localhost:8080/SitUpWebServer/getplan?plan_id=33ce2797-ff87-4b12-970c-63cc8003e458

返回 PlanBean JSON
```

- 查询用户某天计划

```
1. 先查询天
2. 根据天查询计划
```



## 点赞

- 点赞

```
http://localhost:8080/SitUpWebServer/addfavorite?post_id=qwe&user_id=80cedc60-5050-450f-9ae7-94ad759ea3e9

返回 int
```

- 取消点赞

```
http://localhost:8080/SitUpWebServer/deletefavorite?favorite_id=59e49d1a-7306-4968-8c82-a76c792583b3

返回 int
```

- 查询用户所有点赞

```
http://localhost:8080/SitUpWebServer/getuserfavorite?user_id=80cedc60-5050-450f-9ae7-94ad759ea3e9

返回 Favorite JSON
```



## 收藏

- 收藏

```
http://localhost:8080/SitUpWebServer/addcollection?post_id=043fd455-922e-43a1-82b1-4061dae90ff8&user_id=80cedc60-5050-450f-9ae7-94ad759ea3e9

返回 boolean
```

- 取消收藏

```
http://localhost:8080/SitUpWebServer/deletecollection?collection_id=a214003a-2433-4b04-9f02-fa42cc57bcdd

返回 boolean
```

- 查询用户所有收藏

```
http://localhost:8080/SitUpWebServer/getusercollections?user_id=80cedc60-5050-450f-9ae7-94ad759ea3e9

返回 CollectionBean JSON 
```



# 天

- 添加

```
http://localhost:8080/SitUpWebServer/addday?user_id=85bbf54c-459a-46b7-a0bf-8c3a5a00b888

返回 int
```

- 修改

```
http://localhost:8080/SitUpWebServer/updateday?day_id=2486c3dd-55d8-4666-8444-eae2f44051d1&day_plans=1111

返回 DayBean JSON
注 Get 请求 不支持 JSON {} 会报错，请用 POST 尝试
```

- 查询

```
http://localhost:8080/SitUpWebServer/getday?user_id=85bbf54c-459a-46b7-a0bf-8c3a5a00b888&day_date=12-12-12

返回 int
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




# 项目地址

- [SitUpWebServer](https://github.com/FishInWater-1999/SitUpWebServer)



# MIT License

```
Copyright (c) 2019-12-10 FishInWater-1999

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
