# HappyHouse

- 삼성 청년 SW 아카데미 관통프로젝트 - <b>최우수상🏆</b>

- 부동산 실거래가 및 주변상권 조회 서비스

<img width="877" alt="스크린샷 2022-07-03 오후 11 35 53" src="https://user-images.githubusercontent.com/73926213/177044656-4ee7a4ff-6b8a-4055-a47f-3e32e441e0dc.png">
<img width="1113" alt="스크린샷 2022-07-03 오후 11 36 54" src="https://user-images.githubusercontent.com/73926213/177044660-eb1f67e5-2059-4847-9c25-06291786a341.png">

<!-- 
## ⚙ Environment

Frontend
```
- npm version : 6.14.10
- react version : 16.8.4
```

Backend
```
- node version : 14.15.4
```

Database
```
- MongoDB
```
!-->

<!-- ## 🚀 How to Run
1. 프로젝트를 clone 합니다.

```
git clone https://github.com/cksql428/HappyHouse.git
```

2. 다음 API 들의 KEY 를 발급받으세요.
- KAKAO MAP API
- OPENWEATHER API 

3. `front` 폴더 안에 `.env.local` 파일을 만들어주세요.


```
mkdir ./front/.env.local
```

4. `.env.local` 파일 안에 KAKAO MAP API KEY 와 OPENWEATHER API KEY 정보를 입력해주세요.

```
VUE_APP_KAKAO_MAP_API_KEY=<KAKAO_MAP_API_KEY>
VUE_APP_OPENWEATHER_API_KEY=<OPENWEATHER_API_KEY>
```

5. `front` 디렉토리에서 `npm install`을 하세요. ( 콘솔에서 다음 명령을 실행하여 필요한 dependencies를 가져옵니다. )

```
cd ./front
npm install
```

6. `back/src/main/resources` 폴더 안에 `application.properites` 파일을 만들어주세요.

```
mkdir ./back/src/main/resources/application.properties
```

7. `application.properites` 파일 안에 다음 정보들을 입력해주세요.

```
#server.servlet.context-path=/
server.port=80

##JSP Setting
#spring.mvc.view.prefix=/WEB-INF/views/
#spring.mvc.view.suffix=.jsp

#DataBase Setting
spring.datasource.hikari.maximum-pool-size=4

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/happyhouse_pjt?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8
spring.datasource.username=<MySQL username>
spring.datasource.password=<MySQL password>

#MyBatis Setting
mybatis.type-aliases-package=com.ssafy.happyhouse.model


#mybaits
mybatis.config-location=classpath:/config/mybatis-config.xml


#File Upload size Setting
spring.servlet.multipart.max-file-size=5MB
spring.servlet.multipart.max-request-size=5MB

#log level Setting
logging.level.root=info
logging.level.com.ssafy.happyhouse=debug

#app properties
app.fileupload.uploadPath=/Users/baechanbi/ssafy_java/springboot/happyhouse_final/src/main/resources/static
app.fileupload.uploadDir=upload
#gson
spring.mvc.converters.preferred-json-mapper=gson

#Failed to start bean 'documentationPluginsBootstrapper'; error
spring.mvc.pathmatch.matching-strategy = ANT_PATH_MATCHER


#Email
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=cksql0428@gmail.com
spring.mail.password=xogud1230
spring.mail.properties.mail.smtp.starttls.enable=true
spring.mail.properties.mail.smtp.starttls.required=true
spring.mail.properties.mail.smtp.auth=true

#news api key
app.search.news.api.key=IZXFvACBN4
``` -->

<!--6. 공공데이터포털에서 아래 목록을 서비스 신청해서 api 인증키를 받아서 ~~에 등록해주세요.-->

## 📅 Development period
2022.05.13~2022.05.26
