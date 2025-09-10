
import java.awt.Graphics;
import javax.swing.JPanel;

class HelloWorldApplet extends JPanel {
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Hello, World!", 20, 20);
    }
}