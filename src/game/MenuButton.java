package game;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MenuButton extends JButton implements MouseListener{

	private URL btnIconFilePath, btnRollOverFilePath;
	private ImageIcon btnIcon, rollOverIcon;
	private Application window;
	private String type;
	private Sound rollOver;
	
	//Create buttons for the PageMenu page
	public MenuButton(String text, Application window){
		this.setText("");
		this.type = text;
		this.window = window;
		this.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.setRolloverEnabled(true);
		
		switch (this.type){
		//Set Start button icon
		case "Start":
			this.btnIconFilePath = getClass().getResource("/ButtonTemplateNewGame2.png");
			this.btnIcon = new ImageIcon(btnIconFilePath);

			//set Start button rollover icon
			this.btnRollOverFilePath = getClass().getResource("/ButtonTemplateNewGame2MO.png");
			this.rollOverIcon = new ImageIcon(btnRollOverFilePath);
			this.setRolloverIcon(rollOverIcon);
			this.setRolloverEnabled(true);
			this.addMouseListener(this);
			break;
			
		case "Instructions":
			this.btnIconFilePath = getClass().getResource("/ButtonTemplateInstructions.png");
			this.btnIcon = new ImageIcon(btnIconFilePath);
			
			//set Instructions button rollover icon
			this.btnRollOverFilePath = getClass().getResource("/ButtonTemplateInstructionsMO.png");
			this.rollOverIcon = new ImageIcon(btnRollOverFilePath);
			this.setRolloverIcon(rollOverIcon);
			this.setRolloverEnabled(true);
			this.addMouseListener(this);
			break;
			
			
		case "Load":
			this.btnIconFilePath = getClass().getResource("/ButtonTemplateLoadGame.png");
			this.btnIcon = new ImageIcon(btnIconFilePath);
			
			//set Load button rollover icon
			this.btnRollOverFilePath = getClass().getResource("/ButtonTemplateLoadGameMO.png");
			this.rollOverIcon = new ImageIcon(btnRollOverFilePath);
			this.setRolloverIcon(rollOverIcon);
			this.setRolloverEnabled(true);
			this.addMouseListener(this);
			break;
			
			
		case "Exit":
			this.btnIconFilePath = getClass().getResource("/ButtonTemplateExitGame.png");
			this.btnIcon = new ImageIcon(btnIconFilePath);
			
			//set Exit Game button rollover icon
			this.btnRollOverFilePath = getClass().getResource("/ButtonTemplateExitGameMO.png");
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
		this.setPreferredSize(new Dimension(260,40));
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Play a sound when the mouse enters the region of a button
		this.rollOver = new Sound("/buttonBoop.wav");
		rollOver.play();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Stop rollover sound from playing when the mouse leaves the button region
		rollOver.stop();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
}
