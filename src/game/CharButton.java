package game;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class CharButton extends JButton implements MouseListener{

	private URL btnIconFilePath, btnRollOverFilePath;
	private ImageIcon btnIcon, rollOverIcon;
	private Application window;
	private String type;
	private Sound rollOver;
	
	//Creating buttons for the Character Select page
	public CharButton(String text, Application window){
		this.setText("");
		this.type = text;
		this.window = window;
		this.setAlignmentX(Component.LEFT_ALIGNMENT);
		this.setRolloverEnabled(true);
		
		switch (this.type){
		case "Hero":
			//Set Hero button icon
			this.btnIconFilePath = getClass().getResource("/Herobig.png");
			this.btnIcon = new ImageIcon(btnIconFilePath);
			
			//set Hero button rollover icon
			this.btnRollOverFilePath = getClass().getResource("/Herobigscaled.jpg");
			this.rollOverIcon = new ImageIcon(btnRollOverFilePath);
			this.setRolloverIcon(rollOverIcon);
			this.setRolloverEnabled(true);
			this.addMouseListener(this);
			break;
			//Set Villain button icon
		case "Villain":
			this.btnIconFilePath = getClass().getResource("/villianbig.jpg");
			this.btnIcon = new ImageIcon(btnIconFilePath);
			
			//set Villain button rollover icon
			this.btnRollOverFilePath = getClass().getResource("/villainbigscaled.jpg");
			this.rollOverIcon = new ImageIcon(btnRollOverFilePath);
			this.setRolloverIcon(rollOverIcon);
			this.setRolloverEnabled(true);
			this.addMouseListener(this);
			break;
		}
		
		//Set button properties
		this.setBackground(null);
		this.setForeground(null);
		this.setContentAreaFilled(false);
		this.setBorder(BorderFactory.createEmptyBorder());
		this.setBorderPainted(false);
		this.setOpaque(false);
		this.setIcon(this.btnIcon);
		this.setPreferredSize(new Dimension(140,250));
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// Play a sound when the mouse enters the region of a button
		this.rollOver = new Sound("/buttonBoop.wav");
		rollOver.play();
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}

