package game;

import java.awt.EventQueue;

public class Executable {

	public static void main(String[] args) {
		//Run the application
		Runnable runner = new Runnable() {
			public void run() {
				new Application();
			}
		};
		EventQueue.invokeLater(runner);
	}

}
