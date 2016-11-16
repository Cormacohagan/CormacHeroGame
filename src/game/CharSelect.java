package game;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class CharSelect extends JPanel implements ActionListener, KeyListener {

	private Application window;
	private CharButton btnHero, btnVillain;
	private Image charImage;
	private URL charIconFilePath;
	private ImageIcon charIcon;
	
	//Set CharSelect window properties
	public CharSelect(Application window) {
		this.window = window;
		//this.setBackground(Color.RED);
		
		//this.splashIconFilePath = getClass().getResource("/imgsplash.png");
		this.charIconFilePath = getClass().getResource("/imgCharacterSelect.jpg");		
		//this.charIconFilePath = getClass().getResource("/Cityscapegif.gif");		
		this.charIcon = new ImageIcon(this.charIconFilePath);
		this.charImage = this.charIcon.getImage();
		
		//adding buttons from CharButton class
		this.btnHero = new CharButton("Hero", window);
		this.btnHero.addActionListener(this);
		
		this.btnVillain = new CharButton("Villain", window);
		this.btnVillain.addActionListener(this);
		
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		this.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		this.add(Box.createRigidArea(new Dimension(105,0)));
		this.add(this.btnHero);
		
		this.add(Box.createRigidArea(new Dimension(305,0)));
		this.add(this.btnVillain);

		this.addKeyListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	//Set background image
	public void paintComponent(Graphics g) {
		g.drawImage(this.charImage, 0, 0, null);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//Add listener to go to the Menu window on key press
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE){
			window.selectPage("MENU");
		}
		
		else
			
		if (e.getKeyCode() == KeyEvent.VK_ENTER){
			window.selectPage("MAINGAME");
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
