package game;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PageMenu extends JPanel implements MouseListener {

	private Application window;
	private MenuButton btnStart,btnLoad,btnExit,btnInstructions;
	private Image menuImage;
	private URL menuIconFilePath;
	private ImageIcon menuIcon;
	
	//Set window properties
	public PageMenu(Application window) {
		this.window = window;
		//this.setBackground(Color.RED);
		
		//this.splashIconFilePath = getClass().getResource("/imgsplash.png");
		this.menuIconFilePath = getClass().getResource("/MainMenuBG2.png");		
		//this.menuIconFilePath = getClass().getResource("/Cityscapegif.gif");		
		this.menuIcon = new ImageIcon(this.menuIconFilePath);
		this.menuImage = this.menuIcon.getImage();


		//Add buttons from MenuButton class
		this.btnStart = new MenuButton("Start", window);
		this.btnStart.addMouseListener(this);
		
		this.btnLoad = new MenuButton("Load", window);
		this.btnLoad.addMouseListener(this);
		
		this.btnInstructions = new MenuButton("Instructions", window);
		this.btnInstructions.addMouseListener(this);
		
		this.btnExit = new MenuButton("Exit", window);
		this.btnExit.addMouseListener(this);
		
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		
		this.add(Box.createRigidArea(new Dimension(0,245)));
		this.add(this.btnStart);
		this.add(Box.createRigidArea(new Dimension(0,20)));
		this.add(this.btnInstructions);
		this.add(Box.createRigidArea(new Dimension(0,20)));
		this.add(this.btnLoad);
		this.add(Box.createRigidArea(new Dimension(0,20)));
		this.add(this.btnExit);
		
	}
	
	@Override
	//Set background image
	public void paintComponent(Graphics g) {
		g.drawImage(this.menuImage, 0, 0, null);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	//Add button functioanlity on mouse press
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == this.btnStart){
			window.selectPage("CHARSELECT");
		}
		else if (e.getSource() == this.btnLoad){
			//window.selectPage("LOAD");
		}
		else if (e.getSource() == this.btnInstructions){
			window.selectPage("INSTRUCTIONS");
		}
		else if (e.getSource() == this.btnExit){
			System.exit(0);
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
