package duel;

public class CharacterB implements Dueler {
	private int hp;
	private boolean load = false;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
 

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
		this.hp = hp;
	}


	@Override
	public int getHP() {
		// TODO Auto-generated method stub
		return this.hp;
	}

	@Override
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		if (d.getHP() == 100) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int getAction(Object caller) {
		// TODO Auto-generated method stub

		if(caller instanceof CharacterB) {
			return 3;
		}
		if (load) {
			if 	(Math.random() < .5) { 
				load = true;
				return 1;
		}   		return 2; 
	}

		else	 {
			if 	(Math.random() < .5) { 
				load = false;
				return 0;
		}   		return 2; 
	}
	}

	
	public void hit(Object caller) {
		// TODO Auto-generated method stub
		if (caller.getClass() == TheDuel.class) {
			this.hp -= 10;
		}
	}



}
