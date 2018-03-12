package bitcamp.java106.pms;

import bitcamp.java106.pms.domain.Member;
import bitcamp.java106.pms.domain.Team;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args){
        Scanner keyScan = new java.util.Scanner(System.in);
        Team[] teams = new Team[1000];
        int teamIndex = 0;
        Member[] members = new Member[1000];
        int memberIndex = 0;
        
        
    while(true) {
        
        System.out.print("명령> ");
        String[] arr = keyScan.nextLine().toLowerCase().split(" ");
            String menu = arr[0];
            String option = null; //주소없음
            if (arr.length == 2) {
                option = arr[1];
            }

        if (menu.equals("quit")) {
            System.out.println("안녕히 가세요!");
            break;
        } else if (menu.equals("help")) {
            System.out.println("[명령어 창]\n");

            System.out.println("팀 등록 명령 : team/add");
            System.out.println("팀 조회 명령 : team/list");
            System.out.println("팀 상세조회 명령 : team/view 팀명");
            System.out.println("회원 등록 명령 : member/add");
            System.out.println("회원 조회 명령 : member/list");
            System.out.println("회원 상세조회 명령 : member/view 아이디");
            System.out.println("종료 : quit");
            System.out.println();
            continue;
        } else if (menu.equals("team/add")) {
            System.out.println("[팀 정보 입력]\n");
            Team team = new Team();
            
            System.out.printf("팀명: ");
            team.name = keyScan.nextLine();
            System.out.printf("설명: ");
            team.text = keyScan.nextLine();
            System.out.printf("최대인원: ");
            team.person = keyScan.nextInt();
            keyScan.nextLine(); 
            System.out.printf("시작일: ");
            team.start = keyScan.nextLine();
            System.out.printf("종료일: ");
            team.end = keyScan.nextLine();
            teams[teamIndex++] = team;
            
            continue;
        } else if (menu.equals("team/list")) {
            System.out.println("[팀 목록]");
                for (int i=0; i < teamIndex; i++) {
                    System.out.printf("%s, %d, %s ~ %s\n",
                    teams[i].name,teams[i].person,teams[i].start,teams[i].end);
                    System.out.println();

                }
        } else if (menu.equals("team/view")){
            
            if (option == null) {
                System.out.println("정보를 입력하시오.");
                continue;
            }
        
        Team team = null;
            for (int i =0; i < teamIndex; i++) {
                if(option.equals(teams[i].name.toLowerCase())) {
                    team = teams[i];
                    break;
                    }
                }
                if(team == null) {
                    System.out.println("해당 이름의 팀이 없습니다.");
                } else {
                    System.out.println("[팀 정보 조회]");
                    System.out.printf("팀명: %s\n", team.name);
                    System.out.printf("설명: %s\n", team.text);
                    System.out.printf("최대인원: %d\n", team.person);
                    System.out.printf("기간: %s ~ %s\n", team.start,team.end);

                }
            
            }else if (menu.equals("member/add")) {
                Member member = new Member();
                System.out.println("아이디: ");
                member.id = keyScan.nextLine();
                System.out.println("비밀번호: ");
                member.password = keyScan.nextLine();
                System.out.println("이메일: ");
                member.email = keyScan.nextLine();
                
                members[memberIndex++] = member ;
                continue;
            }else if (menu.equals("member/list")) {
                System.out.println("멤버의 리스트");
                for(int i=0; i<memberIndex; i++){
                    System.out.printf("%s,%s,%s\n",members[i].id,members[i].password,members[i].email);
                }
            }else if (menu.equals("member/view")) {
                if(option == null) {
                    System.out.println("아이디를 입력하시오!!");
                    continue;
                }
            Member member = null;
                for(int i=0; i < memberIndex; i++) {
                    if(option.equals(members[i].id.toLowerCase())){
                    member = members[i];
                    break;
                    }
                }
                if(member == null){
                    System.out.println("아이디가 없습니다!!");
                }else{
                    System.out.printf("아이디: %s\n", member.id);
                    System.out.printf("이메일: %s\n", member.email);
                    System.out.printf("암호: %s\n", member.password);
                }    
                }
            else {
                System.out.println("입력값이 틀립니다");
            }
            }
        
    } 


}
