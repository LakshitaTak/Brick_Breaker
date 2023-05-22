 /* import javax.swing.JFrame;

public class Game {

    public static void main(String[] args){
        JFrame obj = new JFrame();  //constructor created which is frame
        GamePlay gameplay = new GamePlay(); // creating obj of GamePlay class which is panel
        obj.setBounds(10,10,700,600); //matrix size set
        obj.setTitle("Brick Breaker");
        obj.setResizable(false); // so that user cant change window size
        obj.setVisible(true); // to present window to user
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //game ends as user closes the window
        obj.add(gameplay); // adding panel into frame --> frame.add(panel)

    }
}
*/

 import javax.swing.*;

 public class Game {

     public static void main(String[] args) {
         JFrame obj = new JFrame();
         GamePlay gameplay = new GamePlay();
         obj.setBounds(10, 10, 700, 600);
         obj.setTitle("Brick Breaker");
         obj.setResizable(false);
         obj.setVisible(true);
         obj.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         obj.add(gameplay);
     }
 }