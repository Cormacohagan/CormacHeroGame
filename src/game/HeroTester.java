package game;

public class HeroTester {
	public static void main (String[] args){

			Hero newHero = new Hero();
			
			newHero.itemMaxEnergy();
			
			System.out.println(newHero.getState());
			System.out.println(newHero.getStatus());
			System.out.println(newHero.getName());

			System.out.println("");
			System.out.println("Max Energy " + newHero.getMaxEnergy());	
			System.out.println("Max Action " + newHero.getMaxAction());
			System.out.println("Current Energy " + newHero.getCurrentEnergy());
			System.out.println("Current Action " + newHero.getCurrentAction());
			
			int newEnergy = newHero.getCurrentEnergy() - 50;
			System.out.println(newEnergy);
			
			newHero.smallCrime();
			
			System.out.println(newHero.getCurrentEnergy());
			System.out.println(newHero.getCurrentAction());
			
			
	
	}
}
