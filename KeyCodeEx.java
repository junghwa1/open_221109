package PROJECT221109;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyCodeEx extends JFrame {
   /**
    * 
    */
   private static final long serialVersionUID = 1L;
   private JLabel la = new JLabel();

   public KeyCodeEx() {
      setTitle("Key Code 예제 : F1키:초록색, % 키 노란색");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container c = getContentPane();

      c.addKeyListener(new MyKeyListener());
      c.add(la);

      setSize(300,150);
      setVisible(true);

      c.setFocusable(true);
      c.requestFocus();
   }
   
   class MyKeyListener extends KeyAdapter {
      @SuppressWarnings("null")
      public void keyPressed(KeyEvent e) {
         la.setText(KeyEvent.getKeyText(e.getKeyCode()));

         Frame contentPane = null;
         if(e.getKeyChar() == '%')
            contentPane.setBackground(Color.YELLOW);
         else if(e.getKeyCode() == KeyEvent.VK_F1)
            contentPane.setBackground(Color.GREEN);
      }   
   }
   public static void main(String [] args) {
      new KeyCodeEx();
   }
}