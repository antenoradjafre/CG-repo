/* BasicJPanel.java
  This is a somewhat more sophisticated drawing program.
  It uses a new child of JPanel as the drawing surface
  for a JFrame, to avoid the problems with drawing
  directly on a JFrame.

  A custom JPanel child class called BasicJPanel is created
  with its own paintComponent method, which contains our
  drawing code.
 
  A generic JFrame is then created to hold the BasicJPanel
  object, the BasicJPanel is created, made into the JPanel's
  content pane, and our paintComponent method is called
  automatically. *Whew!*
  mag-28Apr2008
  Source: http://beginwithjava.blogspot.com.br/2008/07/very-basic-java-graphics-3-examples.html

*/

// Import the basic graphics classes.
import javax.swing.*;
import java.awt.*;

class BasicJPanel extends JPanel{

    // Create a constructor method
    public BasicJPanel(){
        super();
    }

    // The following methods are instance methods.

    /* Create a paintComponent() method to override the one in
      JPanel.This is where the drawing happens. We don't have
      to call it in our program, it gets called automatically
      whenever the panel needs to be redrawn, like when it is
      made visible or moved or whatever.
    */
    public void paintComponent(Graphics g){
        g.drawLine(10,10,150,150); // Draw a line from (10,10) to (150,150)
    }

    public static void main(String arg[]){
        JFrame frame = new JFrame("BasicJPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);

        // Create a new identifier for a BasicJPanel called "panel",
        // then create a new BasicJPanel object for it to refer to.
        BasicJPanel panel = new BasicJPanel();

        // Make the panel object the content pane of the JFrame.
        // This puts it into the drawable area of frame, and now
        // we do all our drawing to panel, using paintComponent(), above.
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}