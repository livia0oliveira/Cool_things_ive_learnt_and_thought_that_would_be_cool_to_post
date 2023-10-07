// actual window propotions and thingys

package leMain;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel {

	//le screen settings
	
	final int OriginalTileSize = 16; //16x16 tile
	final int scale = 3;
	
	final int TileSize = OriginalTileSize * scale; // 48 tile soize
	final int maxWindowCol = 19;
	final int maxWindowRow = 13;
	final int screenWidth = maxWindowCol * TileSize; // 768 pixels
	final int screenHeight = maxWindowRow * TileSize; // 624 pixels
	
	public GamePanel() {
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
		
	}
	
}
