package bitcamp.java106.pms;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import bitcamp.java106.pms.controller.Controller;
import bitcamp.java106.pms.server.ServerRequest;
import bitcamp.java106.pms.server.ServerResponse;


//------------------------------------------------------------------------------
public class HTTPServer {
    int port;
    ApplicationContainer applicationContainer;
    public HTTPServer(int port, ApplicationContainer applicationContainer) {
        this.port = port;
        this.applicationContainer = applicationContainer;
    }

    //---------------------------------------------------------------------
    public void execute() throws Exception {
        // 서버 소켓 준비
        ServerSocket serverSocket = new ServerSocket(this.port);
        System.out.println("서버 실행 했음!");

        while (true) {
            // 대기열에서 기다리고 있는 클라이언트 중에서 먼저 연결된 클라이언트를 꺼낸다. 
            Socket socket = serverSocket.accept();
            System.out.println("서버 요청 기다리는중");
            // 클라이언트 요청을 처리할 코드를 기존의 실행흐름에서 분리한다.
            new RequestProcessorThread(socket).start();
            // 그리고 기존의 실행은 위의 t 스레드와 상관업이 계속 진행한다.
        }
    }
    // 기준의 실행 흐름과 분리하여 명령을 처리할 클래스
    class RequestProcessorThread extends Thread{
        Socket socket;
        public RequestProcessorThread(Socket socket) {
            this.socket = socket;
        }
        
        // 기존의 실행 흐름에서 분기되어 독립적으로 실행할 코드를 이 메서드에 두어라!
        @Override
        public void run() {

            PrintWriter out = null;
            Scanner in = null;

            try {
                out = new PrintWriter(socket.getOutputStream());
                in = new Scanner(socket.getInputStream());
                //----------------------------------------------------------------------------- 기존코드에서 추가부분
                // HTTP 프로토콜에서 요청 정보를 읽는다.
                String line = null;
                boolean firstLine = true;
                String requestURI = null;

                while (true) {
                    line = in.nextLine(); // 라인하나 읽어온다.
                    if(line.equals("")) // 만약 빈문자열이면
                        break; //끝낸다.

                    if(!firstLine) // 아닐경우
                        continue; //그냥넘긴다

                    //HTTP 요청 프로토콜에서 첫 번째 줄에 있는 요청 URI 정보를 추출한다.
                    // 이쪽문은 1번만 실행된다.
                    requestURI = line.split(" ")[1]; //아닌경우 공백을짜르고 1번것만 가져온다.
                    firstLine = false;   //  처음에만 한번 실행한다.
                                         
                }
                //AppContainer에게 실행을 요청한다.
                String result = applicationContainer.execute(requestURI);

                // HTTP 프로토콜에 따라 응답한다.
                //나는 프로토콜에 의해서 응답해줘야된다.
                //이렇게 응답을해준다
                out.println("HTTP/1.1 200 OK");
                out.println("Content-Type: text/plain; charset=UTF-8");
                out.println(); // 마지막 빈문자열 응답해줌
                out.println(result); // result를 출력해야된다.

                //-------------------------------------------------------------------
            } catch (Exception e) {
                out.println("서버 오류!");
                e.printStackTrace(out);
                out.println();
            } finally {
                out.close();
                in.close();
                try {socket.close();} catch (Exception e) {}
            }
        }
        }

    }