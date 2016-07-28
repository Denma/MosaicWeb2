
1. Spring Starter Project 생성

	- Name : MosaicWeb
	- Type : Gradle(Buildship)
	- Packaging : war
	- Group : com.hybrid
	- Artifact : MosaicWeb
	- Package : com.hybrid
	
	- Dependencies 선택 : Web - Web
2. 형상관리
	
	- README.md 생성
	- Remote Repository 생성 (github)
	- Local Repository 생성
		- >> gradle build
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
		
	