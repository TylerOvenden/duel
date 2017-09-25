package duel;

public class CharacterA implements Dueler {
	private int hp;
	private boolean load = false;
	
	


	@Override
	public void taunt() {
		if (Math.random() < .5) {
		System.out.println("You can't possibly defeat me!");	
		} 
		else {
		System.out.println("Haha! Try again?");
		}
		
	}


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return("Quick R");
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
				load = false;
				return 1;
		}   		return 2; 
	}

		else	 {
			if 	(Math.random() < .5) { 
				load = true;
				return 0;
		}   		return 2; 
	}
	}

	@Override
	public void hit(Object caller) {
		// TODO Auto-generated method stub
		if (caller instanceof TheDuel) {
			this.hp -= 10;
		}
	}


}
