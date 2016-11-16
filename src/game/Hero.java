package game;

public class Hero extends Character {
	
	private int actionBonus;

	public Hero() {
		super();
		//super.setEnergy(100);
	}
	
	public void itemMaxEnergy(){
		super.setMaxEnergy(super.getMaxEnergy() + 50);
	}
	
	public void itemMaxAction(){
		super.setMaxAction(super.getMaxAction() + 10);
	}
	
	public void itemCurrentEnergy(){
		super.setCurrentEnergy(super.getCurrentEnergy() + 50);
	}
	
	public void itemCurrentAction(){
		super.setCurrentAction(super.getCurrentAction() + 50);
	}
	
	
	public void smallCrime(){
		if (super.getCurrentEnergy() > 10){
		super.setCurrentEnergy(super.getCurrentEnergy() - 10);
		}
		
		//else GO TO GAME OVER SCREEN WHICH DOES NOT YET EXIST... :(
		
		actionBonus = (super.getMaxAction() - super.getCurrentAction()) /2;
		
		if (super.getCurrentAction() <=(super.getMaxAction() - 10)){
		super.setCurrentAction(super.getCurrentAction() + actionBonus);
		}
	}
	
	public void mediumCrime(){
		if (super.getCurrentEnergy() > 15){
		super.setCurrentEnergy(super.getCurrentEnergy() - 15);
		}
		
		//else GO TO GAME OVER SCREEN WHICH DOES NOT YET EXIST... :(
		
		actionBonus = (super.getMaxAction() - super.getCurrentAction()) /2;
		
		if (super.getCurrentAction() <=(super.getMaxAction() - 20)){
		super.setCurrentAction(super.getCurrentAction() + actionBonus);
		}
	}
	
	public void bigCrime(){
		if (super.getCurrentEnergy() > 20){
		super.setCurrentEnergy(super.getCurrentEnergy() - 20);
		}
		
		//else GO TO GAME OVER SCREEN WHICH DOES NOT YET EXIST... :(
		
		actionBonus = (super.getMaxAction() - super.getCurrentAction()) /2;
		
		if (super.getCurrentAction() <=(super.getMaxAction() - 30)){
		super.setCurrentAction(super.getCurrentAction() + actionBonus);
		}
	}

}
