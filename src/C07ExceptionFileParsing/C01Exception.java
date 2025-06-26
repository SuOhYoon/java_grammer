import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;윤수오
        publicguard_
        오프라인 표시

        김선국_강사 — 2025. 5. 19. 오전 10:06
        https://picturesque-staircase-f6e.notion.site/
        picturesque-staircase-f6e on Notion
        커리큘럼 | Notion
        Made with Notion, the all-in-one connected workspace with publishing capabilities.
        커리큘럼 | Notion
        QZ — 2025. 5. 19. 오전 10:07
        https://docs.google.com/spreadsheets/d/1TSfU1NDOXTiCUFNGIrdrT6Zo1NBvszgo2QfK2912Lng/edit?gid=0#gid=0
        Google Docs
        [커리큘럼] 한화시스템 BEYOND SW CAMP 16기
        이미지
        김선국_강사 — 2025. 5. 19. 오전 10:08
        https://github.com/beyond-sw-camp
        GitHub
        beyond-sw-camp
        beyond-sw-camp has 421 repositories available. Follow their code on GitHub.
        beyond-sw-camp has 421 repositories available. Follow their code on GitHub.
        https://drive.google.com/drive/folders/1Kin_kd8RBOnCDTRXQpIxXzFjM2IfQkap
        Google Drive
        SWCAMP 16기_김형진 — 2025. 5. 19. 오후 4:40
        docker 를 활용한 리눅스 실행방법
        최초 실행 : docker run -it --name test-ubuntu ubuntu:20.04 /bin/bash
        밖으로 빠져나갈때 : exit
        다시 실행시 : docker ps -a를 통해 process조회 → docker start containerID
        다시 접속시 : docker exec -it 컨테이너ID /bin/bash
        김선국_강사 — 2025. 5. 21. 오후 3:40
        docker다운로드 및 설치
        docker run --name board_mariadb -e MYSQL_ROOT_PASSWORD=1234 -d -p 3306:3306 mariadb
        김선국_강사 — 2025. 5. 21. 오후 5:02
        docker exec -it 439e8aa0677d /bin/bash
        SWCAMP 16기_김지현A — 2025. 5. 21. 오후 5:41
        https://github.com/microsoft/WSL/releases/tag/2.4.13
        파일설치: wsl.2.4.13.0.x64.msi
        powershell: wsl --update
        GitHub
        Release 2.4.13 · microsoft/WSL
        Update Microsoft.Identity.MSAL.WSL.Proxy to version 0.1.1
        Update Microsoft.Identity.MSAL.WSL.Proxy to version 0.1.1
        김선국_강사 — 2025. 5. 27. 오후 2:36
        https://docs.google.com/spreadsheets/d/19Jt5I9FhN-_GtNLVhvd226S8bUD6BtS-18dUc-EAKBo/edit?usp=sharing
        Google Docs
        16기 DB수업
        이미지
        김선국_강사 — 2025. 5. 27. 오후 5:06
        -- 코드를 입력하세요
        SELECT o.ANIMAL_ID, o.NAME
        FROM ANIMAL_INS i RIGHT JOIN ANIMAL_OUTS o ON i.ANIMAL_ID=o.ANIMAL_ID
        WHERE i.DATETIME IS NULL
        ORDER BY ANIMAL_ID;
        SELECT o.animal_id, o.name from animal_outs o where o.animal_id not in (select animal_id from animal_ins);
        김선국_강사 — 2025. 5. 28. 오후 5:08
        DELIMITER //
        CREATE PROCEDURE insert_authors()
        BEGIN
        DECLARE i INT DEFAULT 1;
        DECLARE email VARCHAR(100);
        DECLARE batch_size INT DEFAULT 10000; -- 한 번에 삽입할 행 수
        확장
        message.txt
        1KB
        김선국_강사 — 2025. 5. 28. 오후 5:39
<수업내용정정>

금일 수업내용중 일부 정정합니다. 복합인덱스 설정시 개별 컬럼으로 조회시에 인덱스를 활용안하다고 말씀을 드렸는데, 2컬럼(예시-email, name)중 왼쪽컬럼(email)을 이용해 조회시에는 인덱스가 활용된다고 합니다. 참고하시길 바랍니다.

        혜성님이 찾아주심. 👍
        "The name index is an index over the last_name and first_name columns. The index can be used for lookups in queries that specify values in a known range for combinations of last_name and first_name values. It can also be used for queries that specify just a last_name value because that column is a leftmost prefix of the index (as described later in this section). Therefore, the name index is used for lookups in the following queries"
        김선국_강사 — 2025. 5. 29. 오후 2:32
        -- 사용자 테이블 생성
        create table author
        (id bigint auto_increment, email varchar(50) not null,
        name varchar(100), password varchar(255) not null, primary key(id));

        확장
        message.txt
        1KB
        김선국_강사 — 2025. 5. 29. 오후 2:41
        -- 회원가입 및 주소생성
        DELIMITER //
        create procedure insert_author(in emailInput varchar(255), in nameInput varchar(255), in passwordInput varchar(255),in countryInput varchar(255), in cityInput varchar(255), in streetInput varchar(255))
        begin
        declare exit handler for SQLEXCEPTION
        begin
        확장
        message.txt
        1KB
        김선국_강사 — 2025. 5. 29. 오후 2:50

        -- 글쓰기
        DELIMITER //
        create procedure insert_post(in titleInput varchar(255), in contentsInput varchar(255), in emailInput varchar(255))
        begin
        declare exit handler for SQLEXCEPTION
        확장
        message.txt
        1KB
        김선국_강사 — 2025. 5. 29. 오후 3:16

        -- 글편집하기
        DELIMITER //
        create procedure edit_post(in titleInput varchar(255), in contentsInput varchar(255), in emailInput varchar(255), in idInput bigint)
        begin
        declare exit handler for SQLEXCEPTION
        확장
        message.txt
        1KB
        김선국_강사 — 2025. 5. 29. 오후 3:25

        -- JOIN하여 데이터 조회
        select p.title as '제목', p.contents as '내용', a.name as '이름' from post p inner join author_post ap on p.id=ap.post_id
        inner join author a on a.id=ap.author_id;
        message.txt
        1KB
        김선국_강사 — 2025. 5. 29. 오후 3:39
        create table author_post2
        (author_id bigint not null, post_id bigint not null,
        primary key(author_id, post_id),
        foreign key(author_id) references author(id),
        foreign key(post_id) references post(id));
        message.txt
        1KB
        김선국_강사 — 2025. 5. 30. 오전 9:32
        https://docs.google.com/spreadsheets/d/1kiZ1mRDRLZHDZpVQZYvZCdpu1k7cRMGQkSGraYb9pbQ/edit?usp=sharing
        Google Docs
        16기_정규화
        이미지
        김선국_강사 — 2025. 5. 30. 오후 4:31
        /*M!999999\- enable the sandbox mode */
        -- MariaDB dump 10.19-11.6.2-MariaDB, for Win64 (AMD64)
        --
        -- Host: localhost    Database: board
        -- ------------------------------------------------------
        -- Server version11.6.2-MariaDB
        확장
        mydumpfile.sql
        6KB
        # 덤프파일 생성
        mysqldump -u root -p 스키마명 > 덤프파일명
        mysqldump -u root -p board > mydumpfile.sql
        docker exec -it 컨테이너ID mariadb-dump -u root -p1234 board > mydumpfile.sql

        # 덤프파일 적용(복원)
        확장
        message.txt
        1KB
        김선국_강사 — 2025. 6. 2. 오전 10:35

        delimiter //
        create procedure 글쓰기( in titleInput varchar(255), in contentsInput varchar(255), in emailInput varchar(255))
        begin
        -- declare는 begin밑에 위치
        declare authorIdInput bigint;
        확장
        message.txt
        1KB
        김선국_강사 — 2025. 6. 2. 오전 11:11

        -- 여러명이 편집가능한 글에서 글삭제
        delimiter //
        create procedure 글삭제(in postIdInput bigint, in emailInput varchar(255))
        begin
        declare authorId bigint;
        확장
        message.txt
        1KB
        김선국_강사 — 2025. 6. 2. 오전 11:23
        delimiter //
        create procedure 대량글쓰기(in countInput bigint, in emailInput varchar(255))
        begin
        -- declare는 begin밑에 위치
        declare authorIdInput bigint;
        declare postIdInput bigint;
        확장
        message.txt
        1KB
        김선국_강사 — 2025. 6. 2. 오후 4:06
        {"name":"hong", "email":"hong@daum.net", "age":30}
        김선국_강사 — 2025. 6. 3. 오후 5:02
        kimseonguk197
        1)commit남아있게 가져가기
        .git폴더 유지 -> git remote set-url origin 레포주소 -> git push origin main

        2)commit이 없는채로 가져가기
        .git폴더 삭제 -> git init -> git checkout -b main -> git remote add origin 레포주소 -> add, commit, push
        SWCAMP 16기_정지완 — 2025. 6. 4. 오후 2:15
        git config pull.rebase false
        맥은 이거 추가하면 문제 해결됩니다
        김선국_강사 — 2025. 6. 4. 오후 4:46
        1.최신화된 main에서 브랜치 생성.
        2.코드 수정하고 commit 하고, git push origin feat1
        3.pr을 생성 -> 충돌시
        3-1)UI상에서 해결
        3-2)origin에 push전에 git pull origin main하여 미리해결
        4.팀원들이 pr사항을 검토후 review 및 merge
        김선국_강사 — 2025. 6. 5. 오전 9:38
<기반기술프로젝트산출물목록>
프로젝트 기획서 및 요구사항 정의서
        WBS
        ERD모델링 및 DB아키텍처
        테스트 DML쿼리
        김선국_강사 — 2025. 6. 9. 오전 9:01
@everyone 금일 14시까지 산출물정리해주시고, github readme로 올려주세요~!
        발표순서 : 6팀 -> 3팀 -> 4팀  -> 7팀 -> 2팀 -> 1팀 -> 5팀
        김선국_강사 — 2025. 6. 9. 오후 5:29
        [16기 기반기술 교과목 평가]
        시간:  20분
        시험이 끝나면 제출후 노트북을 덮고 대기해주세요.
        검색 등 치팅 금지입니다.
        https://forms.gle/YwspLLJE9PHMfoVX7
        Google Docs
        한화시스템 BEYOND SW CAMP 16기
        교과목 평가_기반기술_25문항

        기반기술_ Linux
        이미지
        김선국_강사 — 2025. 6. 10. 오전 10:23
public class test {
    public static void main(String[] args) {
        System.out.println("hello world");
    }
}
김선국_강사 — 2025. 6. 11. 오후 3:49

//        라벨링없는 풀이
        boolean check=false;
        for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[i].length; j++){
        if(arr[i][j]==11){
        확장
        message.txt
        1KB
        SWCAMP 16기_정지완 — 2025. 6. 11. 오후 4:19
        라벨링 활용해봤는데 맞는지는 모르겠습니다...
        labelC:
        for (int i = 100; i <= 200; i++) {
        for (int j = 2; j < Math.sqrt(i)+1; j++) {
        if(i%j == 0) {
        break;
        }
        확장
        message.txt
        1KB
        김선국_강사 — 2025. 6. 11. 오후 4:29
        loop:
        for (int i = 100; i < 201; i++) {
        for (int j = 2; j < Math.sqrt(i)+1; j++) {
        if (i % j == 0) {
        continue loop;
        }
        확장
        message.txt
        1KB

//        100~200까지 수 중에서 가장 작은 소수를 출력하라
        loop1:
        for (int i = 100; i <= 200; i++) {
        loop2:
        for (int j = 2; j*j <= i; j++) {
        확장
        message.txt
        1KB
        김선국_강사 — 2025. 6. 12. 오후 4:48
//        선택정렬 알고리즘 직접구현 : 1)min값찾기 2)자리change 3)2중for문(index주의)
        int[] arr = {17,12,20,10,15};
//        자리를 결정
        for(){
//            min값을 찾기위한 for문
        for(){
        확장
        message.txt
        1KB
        김선국_강사 — 2025. 6. 19. 오전 10:17
//        계좌개설 및 입출금 서비스 : id(auto_increment), accountNumber(String), balance(int).
//        주의사항1 : main메서드에서 입출력 처리를 하고, deposit, withdraw, transfer 메서드는 BankAccount클래스에 생성.
//        주의사항2 : 프로그램은 항상 실행될수 있도록 전체코드를 while(true)처리
//        서비스번호를 입력하세요. 1.개설 2.조회 3.입금 4.출금 5.송금
//        1.계좌개설 : 계좌번호와 현재가지고 계신돈을 입력하세요. -> 자동으로 id값 증가되어 세팅
//        2.계좌조회 : 계좌조회서비스입니다. 계좌번호를 입력해주세요. -> 잔고출력
//        3.입금 : 계좌입금서비스입니다. 계좌번호와 입금금액을 입력해주세요. -> 현재 계좌에 얼마가 있습니다. 출력.
//        4.출금 : 계좌출금서비스입니다. 계좌번호와 출금금액을 입력해주세요.(잔액검증) -> 남은 금액은 얼마입니다. 출력.
//        5.송금 : 송금서비스입니다. 본인의 계좌번호를 입력해주세요. 보내고자 하는 상대방의 계좌번호를 입력해주세요. 송금금액을 입력해주세요.(잔액검증)
        김선국_강사 — 2025. 6. 19. 오후 3:01
//        1.회원가입 : 이름, 이메일, 비밀번호, id값(auto_increment)
//        2.회원 전체 목록 조회 : id, email
//        3.회원 상세 조회(id로 조회) : id, email, name, password, 작성글수
//        4.게시글 작성 : 제목, 내용, 작성자Email -> author_id를 찾아서 author_id로 변경 입력, id값(auto_increment)
//        5.게시물 목록 조회 : id(post), title
//        6.게시물 상세 조회 : id(post), title, contents, 작성자email
//        7.서비스 종료
        김선국_강사 — 2025. 6. 20. 오전 9:35
        기본언어 : kotlin
        프레임워크 : node(nestjs), django
        프레임워크심화 : Spring TDD
        기타솔루션 : elastic search(오픈서치), kafka, firebase
        인프라 : 테라폼(인프라자동화기술), jenkins
        김선국_강사 — 2025. 6. 20. 오전 10:14
        package C02ClassBasic;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;
        확장
        message.txt
        7KB
        김선국_강사 — 오전 9:50
        package C07ExceptionFileParsing;

        import java.io.IOException;
        import java.nio.file.Files;
        import java.nio.file.Path;
        import java.nio.file.Paths;
        import java.security.InvalidParameterException;
        import java.sql.SQLException;
        import java.util.NoSuchElementException;
        import java.util.Scanner;

public class C01Exception {
    public static void main(String[] args) {
////        일반적인 예외처리 방식 : 예외가 발생시에 프로그램이 중지되지 않도록 하는 프로그래밍.
//        System.out.println("나눗셈 프로그램입니다.");
//        Scanner sc = new Scanner(System.in);
////        예외처리 : 예외가 발생할 것으로 예상되는 코드를 try로 감싼다.
//        try {
//            System.out.println("분자를 입력해주세요");
//            int head = Integer.parseInt(sc.nextLine());
//            System.out.println("분모를 입력해주세요");
//            int tail = Integer.parseInt(sc.nextLine());
//            int result = head/tail; //여기서 예외 발생시 try내부의 하단의 코드는 실행되지 않음.
//            System.out.println("두 수를 나눈 결과 값은 " + result);
////            catch를 통해 예상되는 예외클래스를 분기처리한다.
//        }catch (ArithmeticException e){
//            System.out.println("0으로 나누시면 안됩니다.");
////            아래와 같은 방식으로 시스템 로그를 기록.
//            e.printStackTrace();
//            System.out.println(e.getMessage()); //메시지만 간략히 출력
//        }catch (NumberFormatException e){
//            System.out.println("문자를 입력하시면 안됩니다.");
//            e.printStackTrace();
////        Exception은 모든 예외의 조상 클래스
//        }catch (Exception e){
//            System.out.println("예상치 못한 에러가 발생했습니다.");
//            e.printStackTrace();
//        }finally {
////            예외가 발생하든 하지 않든 무조건 실행되는 구문
//            System.out.println("무조건 실행되는 문구 입니다.");
//        }

////        의도된 예외 강제 발생 : 특정 시점에 프로그램을 강제 중지.
//        System.out.println("로그인을 위한 비밀번호를 입력해주세요");
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        login(input);

//        checked exception의 경우
//        1)호출받는 쪽에서 반드시 예외처리를 하거나
        try {
            String result = fileRead("src/C07ExceptionFileParsing/test.txt");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
//        2)throws를 통해서 checked예외처리를 위임받게되면, 호출하는 쪽에서 예외처리
//        String result= null;
//        try {
//            result = fileRead("src/C07ExceptionFileParsing/test.txt");
//        } catch (IOException e) {
//            throw new RuntimeException("입출력 과정에서 예외가 발생 했습니다.");
//        }
        System.out.println(result);
    }

    //    throws키워드를 통해 예외를 위임.
//    다만, unchecked예외에서는 예외처리가 강제가 아니므로, thorws가 큰의미는 없음.
//    그러나, checked예외에서는 예외처리가 강제되므로, throws가 의미가 있음.
    static boolean login(String password) throws IllegalArgumentException, NoSuchElementException {
        if (password.equals("1234")) {
            return true;
        } else if (password == null) {
//            예외를 강제 발생시킴으로서 이 시점에서 해당 메서드 강제 종료
//            예외는 기본적으로 해당 메서드를 호출한 쪽으로 전파
            throw new IllegalArgumentException("비밀번호를 잘못 입력하였습니다.");
        } else {
            throw new NoSuchElementException("그러한 비밀번호 없습니다.");
        }
    }

    //    static String fileRead(String path) throws IOException {
    static String fileRead(String path) throws RuntimeException {
        Path filePath = Paths.get(path);
//        checked Exception의 경우 예외처리가 강제
//        방법1.checked를 try catch한 이후에 unchecked예외를 다시 throw
        String text = null;
        try {
            text = Files.readString(filePath);
        } catch (IOException e) {
//            System.out.println("입출력 과정에서 예외가 발생했습니다.");
//            보통은 코드중지목적으로 unchecked exception으로 다시 throw.
            throw new RuntimeException("입출력 과정에서 예외가 발생했습니다.");
        }
////        방법2. 현재 메서드를 호출하는 쪽으로 예외를 위임(throws).
//        String text = Files.readString(filePath);
        return text;
    }


...(2
    줄 남음)
    접기
    message.txt
5KB
﻿
        package C07ExceptionFileParsing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.InvalidParameterException;
import java.sql.SQLException;
import java.util.NoSuchElementException;
import java.util.Scanner;

    public class C01Exception {
        public static void main(String[] args) {
////        일반적인 예외처리 방식 : 예외가 발생시에 프로그램이 중지되지 않도록 하는 프로그래밍.
//        System.out.println("나눗셈 프로그램입니다.");
//        Scanner sc = new Scanner(System.in);
////        예외처리 : 예외가 발생할 것으로 예상되는 코드를 try로 감싼다.
//        try {
//            System.out.println("분자를 입력해주세요");
//            int head = Integer.parseInt(sc.nextLine());
//            System.out.println("분모를 입력해주세요");
//            int tail = Integer.parseInt(sc.nextLine());
//            int result = head/tail; //여기서 예외 발생시 try내부의 하단의 코드는 실행되지 않음.
//            System.out.println("두 수를 나눈 결과 값은 " + result);
////            catch를 통해 예상되는 예외클래스를 분기처리한다.
//        }catch (ArithmeticException e){
//            System.out.println("0으로 나누시면 안됩니다.");
////            아래와 같은 방식으로 시스템 로그를 기록.
//            e.printStackTrace();
//            System.out.println(e.getMessage()); //메시지만 간략히 출력
//        }catch (NumberFormatException e){
//            System.out.println("문자를 입력하시면 안됩니다.");
//            e.printStackTrace();
////        Exception은 모든 예외의 조상 클래스
//        }catch (Exception e){
//            System.out.println("예상치 못한 에러가 발생했습니다.");
//            e.printStackTrace();
//        }finally {
////            예외가 발생하든 하지 않든 무조건 실행되는 구문
//            System.out.println("무조건 실행되는 문구 입니다.");
//        }

////        의도된 예외 강제 발생 : 특정 시점에 프로그램을 강제 중지.
//        System.out.println("로그인을 위한 비밀번호를 입력해주세요");
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        login(input);

//        checked exception의 경우
//        1)호출받는 쪽에서 반드시 예외처리를 하거나
            try {
                String result = fileRead("src/C07ExceptionFileParsing/test.txt");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
//        2)throws를 통해서 checked예외처리를 위임받게되면, 호출하는 쪽에서 예외처리
//        String result= null;
//        try {
//            result = fileRead("src/C07ExceptionFileParsing/test.txt");
//        } catch (IOException e) {
//            throw new RuntimeException("입출력 과정에서 예외가 발생 했습니다.");
//        }
            System.out.println(result);
        }

        //    throws키워드를 통해 예외를 위임.
//    다만, unchecked예외에서는 예외처리가 강제가 아니므로, thorws가 큰의미는 없음.
//    그러나, checked예외에서는 예외처리가 강제되므로, throws가 의미가 있음.
        static boolean login(String password) throws IllegalArgumentException, NoSuchElementException {
            if (password.equals("1234")) {
                return true;
            } else if (password == null) {
//            예외를 강제 발생시킴으로서 이 시점에서 해당 메서드 강제 종료
//            예외는 기본적으로 해당 메서드를 호출한 쪽으로 전파
                throw new IllegalArgumentException("비밀번호를 잘못 입력하였습니다.");
            } else {
                throw new NoSuchElementException("그러한 비밀번호 없습니다.");
            }
        }

        //    static String fileRead(String path) throws IOException {
        static String fileRead(String path) throws RuntimeException {
            Path filePath = Paths.get(path);
//        checked Exception의 경우 예외처리가 강제
//        방법1.checked를 try catch한 이후에 unchecked예외를 다시 throw
            String text = null;
            try {
                text = Files.readString(filePath);
            } catch (IOException e) {
//            System.out.println("입출력 과정에서 예외가 발생했습니다.");
//            보통은 코드중지목적으로 unchecked exception으로 다시 throw.
                throw new RuntimeException("입출력 과정에서 예외가 발생했습니다.");
            }
////        방법2. 현재 메서드를 호출하는 쪽으로 예외를 위임(throws).
//        String text = Files.readString(filePath);
            return text;
        }


    }
}