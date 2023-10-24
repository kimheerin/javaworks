package componets;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JBotton1 {

   public static void main(String[] args) {
      
      JFrame frame = new JFrame("레이아웃 해제");
      frame.setSize(250,120);
      frame.setLocation(200,100);
      
      //버튼 
      JButton btn1 = new JButton("북");
      frame.add(btn1 , BorderLayout.NORTH);
      
      JButton btn2 = new JButton("남");
      frame.add(btn2 , BorderLayout.SOUTH);
      
      JButton btn3 = new JButton("동");
      frame.add(btn3 , BorderLayout.EAST);
      
      JButton btn4 = new JButton("서");
      frame.add(btn4 , BorderLayout.WEST);
      
      JButton btn5 = new JButton("중앙");
      frame.add(btn5 , BorderLayout.CENTER);
      
      //디스플레이
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}