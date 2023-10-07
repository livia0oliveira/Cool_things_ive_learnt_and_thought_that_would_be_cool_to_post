// making the window :D

package leMain;

import javax.swing.JFrame;

public class First {
	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Cool game :D");
		
		GamePanel gamePanel = new GamePanel();
		window.add(gamePanel);
		window.pack();
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}

}
