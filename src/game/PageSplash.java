package game;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PageSplash extends JPanel implements KeyListener {

	private Image splashImage;
	private URL splashIconFilePath;
	private ImageIcon splashIcon;
	
	private Application window;
	
	//Set window properties
	public PageSplash(Application window){
		this.window = window;
		this.setFocusable(true);
		
		//this.splashIconFilePath = getClass().getResource("/imgsplash.png");
		this.splashIconFilePath = getClass().getResource("/myGifScape.jpg");
		
		this.splashIcon = new ImageIcon(this.splashIconFilePath);
		this.splashImage = this.splashIcon.getImage();
		this.addKeyListener(this);
		
		//JLabel copyLabel = new JLabel(splashIcon); 
        //add(copyLabel);
	}
	
	@Override
	//Set background image
	public void paintComponent(Graphics g){
		g.drawImage(this.splashImage,0,0,null);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//Add listener to go to the Menu window on key press
		if (e.getKeyCode() == KeyEvent.VK_ENTER){
			window.selectPage("MENU");
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
