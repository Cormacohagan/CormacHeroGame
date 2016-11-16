package game;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class Sound {

	AudioClip sound;
	URL soundPath;
	
	//Constructor for adding sounds
	public Sound(String path){
		this.soundPath = getClass().getResource(path);
		this.sound = Applet.newAudioClip(this.soundPath);
	}
	
	public void play(){
		this.sound.play();
	}
	
	public void loop(){
		this.sound.loop();
	}
	
	public void stop(){
		this.sound.stop();
	}
}
