package step27;

public class Exam03 {
    static interface Player {
        void play();
    }
    
    static void testPlayer(Player player) {
        player.play();
    }
    public static void main(String[] args) {
        Player player = () -> System.out.println("실횅~~~");
                
            
         testPlayer(player);
    }
}
