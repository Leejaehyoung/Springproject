# Springproject
## 스프링 프로젝트 실습 1

* Repository(GitHub 저장소) 생성
* pom.xml 초기화 (Maven 프로젝트화)
* index.html 생성 (페이지 확인, server.xml)
  - server.xml 경로 변경  '/'
* Index.java 생성 (로깅 라이브러리 추가, Logback)
  - logback.xml 추가
* IndexTest.java 생성 (테스트 라이브러리 추가, Junit4)

## [Problems]

1. Java compiler level does not match the version of the installed Java project facet.
-> 메뉴 Preferences에서  Java Build Path, Java Compiler, Project Facets 자바 버전을 일치 시킨다.
2. web.xml is missing and <failOnMissingWebXml> is set to truepom.xml
-> pom.xml에 Properties 태그에 <failOnMissingWebXml>false</failOnMissingWebXml> 추가한다.  

## 스프링 프로젝트 실습 2

* 서블릿 페이지 생성 및 확인
  - study.web.WelcomeServlet.java
* Spring mvc 확인
  - WelcomeController.java
  - WelcomeControllerTest.java(IndexTest.java 대체)
  - default-servlet.xml 생성(web.xml 변경)
* 부트스트랩 적용
  - css/fonts/js 폴더 및 스크립트 추가
  
## [Issues]
 
1. WAS 서버(Tomcat)인식 위한 컴파일 경로 변경
-> Java Build Path : webapp/WEB-INF/classes
2. STS(플러그인), 탬플릿 엔진 필요?
-> Spring Boot, Mustache, Bootstrap

## 스프링 프로젝트 실습 3

* GitHub 저장소 계정 추가 및 브랜치 사용
* web.xml 생성
  - context-param, listener, servlet, welcom-file-list, filter 태그 추가
* config/servlet-context.xml 변경
  - 기존 default-servlet.xml 치환 (webapp/WEB-INF)
  - webapp/WEB-INF/spring/appServlet 경로 변경
* spring/datasource-context.xml 생성
  - Mybatis와 데이터베이스 연결 설정
* spring/sqlmap-context.xml 생성
  - Mybatis와 Spring 연결 설정

## 스프링 프로젝트 실습 4

## [DB Template]

[Generator]
* plugin
* generatorConfig.xml
* study/gen/dao
   study/gen/vo
   study/gen/xml

[Code]
* /Theme/pages/forms/general.html
* /Theme/pages/tables/dats.html
* /WEB-INF/include/header.jspf
* /WEB-INF/include/footer.jspf

* study/common/CommandMap.java
* study/common/resolver/CustomMapArgumentResolver.java
* sevlet-context.xml

* study/web/user/controller/UserController.java
* study/web/user/service/UserService.java, UserServiceImpl.java
* study/web/user/dao/UserDao.java, AbstractAao.java
* study/web/user/vo/UserVo.java
* sqlmap/user_sql.xml
  