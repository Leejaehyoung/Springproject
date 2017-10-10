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

  