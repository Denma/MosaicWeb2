
1. Spring Starter Project 생성

	- Name : MosaicWeb
	- Type : Gradle(Buildship)
	- Packaging : war
	- Group : com.hybrid
	- Artifact : MosaicWeb
	- Package : com.hybrid
	
	- Dependencies 선택 : Web - Web
2. 형상관리

	- Remote Repository 생성 (github)
	- Local Repository 생성
		- >> git status
		- >> git log
		- >> dir /A > .gitignore
		- >> notepad .gitignore 편집
		- >> git init
		- >> git add *
		- >> git commit -m "first commit" 
	- Local ====push===> Remote (최초 동기화)
		- >> git remote add origin https://github.com/Denma/MosaicWeb.git
		- >> git remote -v
		- >> git remote remove origin (remote제거)
		- >> git remote add origin https://github.com/Denma/MosaicWeb.git
		- >> git push -u origin master
	- 개발자 2가 Clone 수행
		- >> git clone https://github.com/Denma/MosaicWeb.git
		- >> git clone https://github.com/Denma/MosaicWeb.git MosaicWebDev (MasaicWebDev폴더 생성 후 Clone)
		- >> Eclipse Gradle Import		
	- 개발자 1(master)의 변경사항 저장
		- >> git add .
		- >> git status
		- >> git git push
	- 개발자 2가 변경사항 받아오기
		- >> git pull
		
3. HTML 설정

	- 설정 불필요
	- mkdir src/main/webapp 폴더 생성
	- notepad src/main/webapp/Hello.html
	- gradle bootRun 
	- Firefox ==> http://localhost:8080/Hello.html
		
4. JSP 설정

	- mvnrepository.com  >> search : tomcat jasper
	- build.gradle dependency : providedRuntime group: 'org.apache.tomcat.embed', name: 'tomcat-embed-jasper', version: '8.5.4'
	- Eclipse -> Gradle Refresh
	- notepad src/main/webapp/Hello.jsp
	- gradle bootRun
	- Firefox ==> http://localhost:8080/Hello.jsp
	
5. Servlet 설정	
	
	- MosaicWebApplication.java << @ServletComponentScan 추가
	- com.hybrid.servlet.HelloServlet.java 생성
	- Eclipse -> project -> Project Pacets 
	- >> Dynamic WebModule (version : 3.1)
	- >> java(version : 1.8)
	- >> javascript(version : 1.0)
	- gradle bootRun
	- Firefox ==> http://localhost:8080/HelloServlet
	
6. Springloaded 설정 (리로드 기능)
	
	- Terminal에서 tree /f 으로 구조를 보면 HelloServlet.class가 두곳에 있는데 Eclipse가 저장하는 곳을 Gradle이 저장하는 곳과 맞춰준다.
	- mvnrepository.com >> search : springloaded
	- build.gradle에 설정 (두 곳)
	->> (위쪽 dependencies) classpath("org.springframework:springloaded:1.2.6.RELEASE") 
	->> (아래쪽 dependencies) compile group: 'org.springframework', name: 'springloaded', version: '1.2.6.RELEASE'
	- Eclipse Output Directory 변경
	- 	bin ==> build/classes/main
	- 개발자2는 Project -> Properties 에서 두가지 변경이 필요함
	- 1. Project Pacets 
	- >> Dynamic WebModule (version : 3.1)
	- >> java(version : 1.8)
	- >> javascript(version : 1.0)
	- 2. Eclipse Output Directory 변경
	- >> Java Build Path -> Source -> Default output folder
	- >> bin ==> build/classes/main
	
7. Mybatis

	- mvnrepository.com >> search : Mybatis Spring Boot Starter
	- build.gradle의 Dependency에 설정
	- >> compile group: 'org.mybatis.spring.boot', name: 'mybatis-spring-boot-starter', version: '1.1.1'
	- >> src/main/webapp/WEB-INF/lib에 ojdbc7.jar 가져오기
	- >> compile files('src/main/webapp/WEB-INF/lib/ojdbc7.jar');
	- application.properties
	-	>>spring.datasource.driver-class-name=oracle.jdbc.OracleDriver
	-	>>spring.datasource.url=jdbc:oracle:thin:@52.78.104.216:1521:orcl
	-	>>spring.datasource.username=scott
	-	>>spring.datasource.password=tiger
	- Eclipse Gradle Refresh
	- gradle bootRun
	
	- notepad src/main/java/com/hybrid/mapper/DeptMapper.java (인터페이스 생성)
	- notepad src/main/java/com/hybrid/domain/Dept.java
	- notepad src/test/java/com/hybrid/mapper/DeptMapperTest.java
	- notepad src/main/webapp/dept.jsp	
	
8. Deploy 방법

	- gradle war (MosaicWeb/build/libs/MosaicWebxxx.war 생성)
	- MosaicWeb.war 를 C:\Program Files\Apache Software Foundation\Tomcat 8.5\webapps에 복사한다.
	- Browser -> http://localhost/MosaicWeb.index.html
	
9. Gluon 설정

	- FXTemplate/src를 MosaicWeb/src에 복사한다
	- FXTemplate/build.gradle을 MosaicWeb/build.gradle에 통합시킨다. (build.gradle 내의 5~7번 세팅)
	- com.hybrid.fx.MainApplication과 com.hybrid.MosaicWebApplication 통합 (init과 close를 같이하도록)
	- 	>> spring boot + gluon start
	- 	>> spring stop + gloun stop
	-	>> PrimaryView 에 WebView 추가
	
	
	
	