package step25.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//JDBC 드라이버 다운로드 및 설정
//2) 빌드도구를 이용하여 라이브버리 관리하기.
//- java-basic/lib 폴더 생성
//- c:\Program Files (x86)\MySQL\Connector J x.x\mysql-connector-java-x.x.jar 복사
//- java-basic/lib 폴더에 붙여넣기
//- 컴파일과 실행할 때 .jar 파일을 사용할 수 있도록 CLASSPATH에 추가한다.
//project 컨텍스트 메뉴/build path/configure build path.../Libraries/Add Jars...
//
public class Exam02_select {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("JDBC 드라이버 로딩 및 등록 완료!");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false&user=java106&password=1111",
                 "java106", "1111");
        // 당장 select 할 때 파라미터 값을 넣지않는다 하더라도
        // 나중에 넣을 것을 대비해서 그냥 preparedStatement 를 사용하라
        PreparedStatement stmt = con.prepareStatement(
                "select bno,titl,rdt from ex_board");

        ResultSet rs = stmt.executeQuery();


        while (rs.next()) { 
            System.out.printf("%d,%s,%s\n", 
                    rs.getInt("bno"),       // select 결과의 컬럼 번호이다. 1부터 시작 //bno
                    rs.getString("titl"),   //titl 컬럼값
                    rs.getDate("rdt"));    // rdt 컬럼값

        }



        // 자원해제
        // => 파일과 마찬가지로 DBMS에 연결한 후 더이상 사용하지 않으면 연결을 해제해야 한다.
        rs.close();
        stmt.close();
        con.close();


    }
}
