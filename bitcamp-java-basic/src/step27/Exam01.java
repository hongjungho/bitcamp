package step27;

public class Exam01 {
    static interface Player {
        void play();
    }
    
    static void testPlayer(Player player) {
        player.play();
    }
    public static void main(String[] args) {
        Player player = new Player() {

            @Override
            public void play() {
                System.out.println("실횅~~~");
                
            }
            
         };
         testPlayer(player);
    }
}
