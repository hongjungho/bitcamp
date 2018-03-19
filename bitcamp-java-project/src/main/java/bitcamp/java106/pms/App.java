package bitcamp.java106.pms;

import bitcamp.java106.pms.domain.Board;
import bitcamp.java106.pms.controller.TeamController;
import bitcamp.java106.pms.controller.MemberController;
import bitcamp.java106.pms.util.Console;
import java.util.Scanner;

public class App {
    static Scanner keyScan = new Scanner(System.in);
    public static String option = null; 
    static int getBoardIndex(String title) {
        
    }

    static void onQuit() {
        System.out.println("안녕히 가세요!");
    }
    static void onHelp() {
        System.out.println("[도움말]");
        System.out.println("팀 등록 명령 : team/add");
        System.out.println("팀 조회 명령 : team/list");
        System.out.println("팀 상세조회 명령 : team/view 팀명");
        System.out.println("회원 등록 명령 : member/add");
        System.out.println("회원 조회 명령 : member/list");
        System.out.println("회원 상세조회 명령 : member/view 아이디");
        System.out.println("종료 : quit");
    }
    
    public static void main(String[] args) {
        // 클래스를 사용하기 전에 필수 값을 설정한다.
        TeamController.keyScan = keyScan;
        MemberController.keyScan = keyScan; //ㅁㄴㅇ9ㅂㅈㅇ90ㅂ저1
        Console.keyScan = keyScan;
        Board[] boards = new Board[1000];
        int boardIndex = 0;
        
        
        while (true) {
            String[] arr = Console.prompt();
            String menu = arr[0];
            String option = null; // 문자열 없음!
            if (arr.length == 2) {
                option = arr[1];
            }
            
            if (menu.equals("quit")) {
                onQuit();
                break;
            } else if (menu.equals("help")) {
                onHelp();
            } else if (menu.startsWith("team/")) {
                TeamController.service(menu , option);
            } else if (menu.startsWith("member/")) {
                MemberController.service(menu , option);
            } else if (menu.equals("board/add")) {
                System.out.println("[게시글 등록]");
                Board board = new Board();

                System.out.print("제목? ");
                board.title = keyScan.nextLine();

                System.out.print("내용? ");
                board.text = keyScan.nextLine();

                System.out.print("등록일? ");
                board.start = keyScan.nextLine();

                boards[boardIndex++] = board;
            } else if (menu.equals("board/list")) {
                System.out.println("[게시판 목록]");
                for(int i=0; i < boardIndex; i++) {
                    System.out.printf("%s ,%s , %s\n",boards[i].title,
                                        boards[i].text,boards[i].start);
                }
            } else if (menu.equals("board/view")) {
                System.out.println("[게시글 조회]");

                if (option == null) {
                    System.out.println("제목을 입력하세요");
                    continue;
                }
                Board board = null;
                for(int i =0; i < boardIndex; i++) {
                    if(option.equals(boards[i].title.toLowerCase())) {
                        board = boards[i];
                        break;
                    }
                } 
                if(board == null) { 
                    System.out.println("입력된 제목이 없습니다");
                    }
                else {
                    System.out.printf("제목: %s\n", board.title);
                    System.out.printf("내용: %s\n", board.text);
                    System.out.printf("등록일: %s\n",board.start);
                    }
            }else if (menu.equals("board/update")) {
                System.out.println("[게시글 변경]");
                
                if (option == null) {
                    System.out.println("아이디를 입력하시기 바랍니다.");
                    return;
                }
                
                Board board = null;
                int i;
                for (i = 0; i < boardIndex; i++) {
                    if (boards[i] == null) 
                    continue;
                    if (option.equals(boards[i].title.toLowerCase())) {
                        board = boards[i];
                        break;
                    }
                }
        
                if (board == null) {
                    System.out.println("해당 아이디의 회원이 없습니다.");
                } else {
                    Board updateBoard = new Board();
                    System.out.printf("제목(%s): ", board.title);
                    updateBoard.title = keyScan.nextLine();
                    System.out.printf("내용(%s): ",board.text);
                    updateBoard.text = keyScan.nextLine();
                    updateBoard.start = board.start;
                    boards[i] = updateBoard;
                    System.out.println("변경하였습니다.");
                }
                
            } else if (menu.equals("board/delete")){
                System.out.println("[게시글 삭제]");
                if (option == null) {
                System.out.println("제목을 입력 하시기 바랍니다.");
                return;
                }
        
                Board board = null;
                int i;
                for (i = 0; i < boardIndex; i++) {
                    if (option.equals(boards[i].title.toLowerCase())) {
                        board = boards[i];
                         break;
                        }
                    }

                if (board == null) {
                System.out.println("해당 게시판의 제목이 아닙니다.");
                } else {
                System.out.print("정말 삭제하시겠습니까?(y/N) ");
                String input = keyScan.nextLine().toLowerCase();
                    if (input.equals("y")) {
                        boards[i] = null;
                        System.out.println("삭제하였습니다.");
                        }
                    }
                }
                 
                else 
                System.out.println("명령어가 올바르지 않습니다.");
                

        }
    }
}