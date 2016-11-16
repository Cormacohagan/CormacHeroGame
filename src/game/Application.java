package game;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Application extends JFrame {

	//Icons
	private URL applicationIconFilePath;
	private ImageIcon applicationIcon;
	
	//Page Manager
	private JPanel pages;
	private CardLayout cardLayout;
	
	//Pages
	private PageSplash splashScreen;
	private PageMenu menuScreen;
	private CharSelect charSelectScreen;
	private MainGame mainGameScreen;
	private PageInstructions instructionPage;
	
	//Starts the program from the Splash Screen
	public Application(){
		this.initApplication();
		this.setApplicationIcon("/imgTHEFACE.png");
		this.initPages();
		this.selectPage("SPLASH");
		
		this.setVisible(true);
	}
	
	//Set Application window properties
	public void initApplication(){
		this.setTitle("My game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800,550);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
	}
	
	//Set application icon
	public void setApplicationIcon(String iconPath){
		this.applicationIconFilePath = getClass().getResource(iconPath);
		this.applicationIcon = new ImageIcon(this.applicationIconFilePath);
		this.setIconImage(this.applicationIcon.getImage());
	}

	public void initPages(){
		this.pages = new JPanel(new CardLayout());
		//Construct Pages
		this.splashScreen = new PageSplash(this);
		this.menuScreen = new PageMenu(this);
		this.charSelectScreen = new CharSelect(this);
		this.mainGameScreen = new MainGame(this);
		this.instructionPage = new PageInstructions(this);
		
		//Add pages
		this.pages.add(this.splashScreen, "SPLASH");
		this.pages.add(this.menuScreen, "MENU");
		this.pages.add(this.charSelectScreen, "CHARSELECT");
		this.pages.add(this.mainGameScreen,  "MAINGAME");
		this.pages.add(this.instructionPage, "INSTRUCTIONS");
		
		//Finalize layout
		this.cardLayout = (CardLayout)(this.pages.getLayout());
		this.getContentPane().add(this.pages, BorderLayout.CENTER);
	}
	
	//Method used to select a page throughout the program
	public void selectPage(String page){
		this.cardLayout.show(this.pages, page);
		switch(page){
		case "SPLASH":
			this.splashScreen.requestFocus();
			break;
		case "MENU":
			this.menuScreen.requestFocus();
			break;
		case "CHARSELECT":
			this.charSelectScreen.requestFocus();
			break;
		case "MAINGAME":
			this.mainGameScreen.requestFocus();
			break;
		case "INSTRUCTIONS":
			this.instructionPage.requestFocus();
			break;
		}
		
	}
}


