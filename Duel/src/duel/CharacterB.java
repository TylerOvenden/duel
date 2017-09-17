package duel;

public class CharacterB implements Dueler {
	private int hp;
	
	


	@Override
	public void taunt() {
		if (Math.random() < .5) {
		System.out.println("You are bad at this");	
		}else {
		System.out.println("You're going to lose!");
		}
		
	}


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return("doge");
	}


	@Override
	public void setStartingHP(int hp) {
		
		
	}


	@Override
	public int getHP() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public int getAction(Object caller) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void hit(Object caller) {
		// TODO Auto-generated method stub
		
	}



}
