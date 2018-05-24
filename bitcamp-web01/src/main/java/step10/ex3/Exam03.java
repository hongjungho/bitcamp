// 세션 : 무효화하기
package step10.ex3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/step10/ex3/exam03")
public class Exam03 extends HttpServlet {
    @Override
    protected void doGet(
            HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        // 세션을 무효화하면 기존 세션 객체는 제거된다.
        // 다음에 새 세션 객체가 사용될 것이다.
        session.invalidate();
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("세션을 무효화 했습니다.");
        
// 쿠키를 클라이언트로 보내는 HTTP 프로토콜?
//        HTTP/1.1 200
//        Set-Cookie: JSESSIONID=24B19874611FD03800EE3DF36109B236; Path=/bitcamp-web01; HttpOnly
//        Content-Type: text/plain;charset=UTF-8
//        Content-Length: 119
//        Date: Wed, 23 May 2018 05:29:36 GMT
    }
}








