package game;

public class Character {

	private int maxEnergy = 100, maxAction, currentEnergy, currentAction, state;
	private String status, name;
	
	public Character (){
		this.maxEnergy = 100;
		this.maxAction = 150;
		this.currentEnergy = maxEnergy;
		this.currentAction = maxAction;
		this.state = 1;
		this.status = "Superhero";
		this.name = "Default Character";
		
	}
	
	public int getMaxEnergy(){
		return this.maxEnergy;
	}
	
	public int getMaxAction(){
		return this.maxAction;
	}
	
	public int getCurrentEnergy(){
		return this.currentEnergy;
	}
	
	public int getCurrentAction(){
		return this.currentAction;
	}
	
	public int getState(){
		return this.state;
	}
	
	public String getStatus(){
		return this.status;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setMaxEnergy(int maxEnergy){
		this.maxEnergy = maxEnergy;
	}
	
	public void setMaxAction(int maxAction){
		this.maxAction = maxAction;
	}
	
	public void setCurrentEnergy(int currentEnergy){
		this.currentEnergy = currentEnergy;
	}
	
	public void setCurrentAction(int currentAction){
		this.currentAction = currentAction;
	}
	
	public void setState(int state){
		this.state = state;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setStatus(String status){
		this.status = status;
	}
	
	
}
