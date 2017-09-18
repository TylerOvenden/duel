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
		
		this.hp = 100;
	}


	@Override
	public int getHP() {
		// TODO Auto-generated method stub
		return hp;
	}


	@Override
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		if (d.hp == 100) {
			return true;}
		else {
			return false;}
	}


	@Override
	public int getAction(Object caller) {
		// TODO Auto-generated method stub
		;
	}


	@Override
	public void hit(Object caller) {
		// TODO Auto-generated method stub
		
	}



}
