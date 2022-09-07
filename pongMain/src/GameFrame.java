import java.awt.*;
import javax.swing.*;
public class GameFrame extends JFrame{
	JButton jb;
	GamePanel panel;
	GameFrame(){
		panel=new GamePanel();
		this.add(panel);
		this.setTitle("PING PONG");
		this.setResizable(false);
		ImageIcon im=new ImageIcon("likhi.jpg");
		this.setIconImage(im.getImage());
		this.setBackground(new Color(20,20,40));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
}
