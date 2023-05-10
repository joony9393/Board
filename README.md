# 🗒 게시판 만들기

간단히 사용자들과 소통할 수 있는 게시판 서비스입니다. 

### Tech Stack
<div align=center> 
  <img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"> 
  <img src="https://img.shields.io/badge/spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white"> 
  <img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white"> 
  <img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white">
</div>

## 💻 사용 기술 스택
- Java jdk
- Spring boot3.0.6, Gradle
- Spring Web, Spring Security, Lombok, Thymeleaf
- JPA, MySQL
- Intellij


## 프로젝트 기능 및 설계
#### 회원가입 기능
  * -[ ] 사용자는 회원가입을 할 수 있다. 일반적으로 모든 사용자는 회원가입시 USER 권한 (일반 권한)을 지닌다. 
  * -[ ] 회원가입 시 등록 일시가 저장된다.
  * -[ ] 회원가입시 아이디와 패스워드를 입력받으며, 아이디는 unique 해야한다. 
  * -[ ] 회원가입 수정 시 수정 일시가 저장된다.

#### 로그인 기능
  * -[ ] 사용자는 로그인을 할 수 있다. 로그인시 회원가입때 사용한 아이디와 패스워드가 일치해야한다. 
  * -[ ] 회원가입한 적이 없는 ID를 이용하여 로그인을 시도하면 에러가 발생한다.

#### 게시글 작성 기능 
  * -[ ] 게시글 작성 시 제목, 내용, 작성 일시, 아이디 정보가 함께 저장된다.
  * -[ ] 로그인 한 사용자만 글을 작성할 수 있다. 
  * -[ ] 사용자는 게시글 제목, 게시글 내용를 작성할 수 있다.

#### 게시글 목록 조회 기능 
  * -[ ] 로그인하지 않은 사용자는 게시글을 조회할 수 없다. 
  * -[ ] 게시글은 최신순으로 기본 정렬되며, 댓글이 많은순/적은순 으로도 정렬이 가능하다.
  * -[ ] 게시글 목록 조회시 응답에는 게시글 제목과 작성일, 댓글 수의 정보가 필요하다.
  * -[ ] 게시글은 paging 처리를 한다. 

#### 공지사항 조회 기능
  * -[ ] 게시판 최상단 로그인 하지 않은 회원도 조회할 수 있다. 
  * -[ ] 게시글 제목, 게시글 내용, 작성자, 작성일이 조회된다. 

#### 댓글 목록 조회 기능
  *-[ ] 로그인 한 사용자만 댓글을 작성 및 조회할 수 있다.
  *-[ ] 댓글은 최신순으로만 정렬되며, paging 처리를 한다. 
  *-[ ] 댓글 목록 조회시에는 댓글 작성자와 댓글 내용, 댓글 작성일의 정보가 필요하다.

#### 댓글 작성 기능
  * -[ ] 로그인을 진행해야 작성할 수 있다.
  * -[ ] 사용자는 댓글 내용를 작성 및 수정 할 수 있다. 

#### ✏️ 구현해 보고 싶은 추가 기능(추후 구현)
- 게시판 카테고리 생성 및 게시글 분류 
- 게시글, 댓글 좋아요 기능
-

## ERD 
![다운로드](https://user-images.githubusercontent.com/86875215/235946482-e6bb266d-6cd5-4182-904d-9aa0a3fa05eb.png)



## Trouble Shooting
[go to the trouble shooting section](doc/TROUBLE_SHOOTING.md)



