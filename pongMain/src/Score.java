import java.awt.*;

import javax.swing.ImageIcon;

public class Score extends Rectangle{

	static int GAME_WIDTH;
	static int GAME_HEIGHT;
	int player1;
	int player2;
	ImageIcon ic=new ImageIcon("C:\\Users\\Likhith\\Pictures\\mine.jpg");
	Image img=ic.getImage();
	Score(int GAME_WIDTH, int GAME_HEIGHT){
		Score.GAME_WIDTH = GAME_WIDTH;
		Score.GAME_HEIGHT = GAME_HEIGHT;
	}
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.setFont(new Font("Consolas",Font.PLAIN,60));
		
		//g.drawImage(img, (GAME_WIDTH/2)*2-100, 20, 100, 100, null);

		g.setColor(Color.green);
		g.drawLine(0,GAME_HEIGHT/10, GAME_WIDTH, GAME_HEIGHT/10);
		g.drawLine(0,GAME_HEIGHT*(9/10), GAME_WIDTH, GAME_HEIGHT*(9/10));
		g.drawLine(0,9*(GAME_HEIGHT/10), GAME_WIDTH, 9*(GAME_HEIGHT/10));

		g.setColor(Color.white);
		g.drawLine(GAME_WIDTH/2, 0, GAME_WIDTH/2, GAME_HEIGHT);
		g.drawString(String.valueOf(player1/10)+String.valueOf(player1%10), (GAME_WIDTH/2)-85, 50);
		g.drawString(String.valueOf(player2/10)+String.valueOf(player2%10), (GAME_WIDTH/2)+20, 50);
	}
}
