package duel;

public class CharacterB implements Dueler {
	private int hp;
	boolean isLoaded = false;
	boolean round1 = false;
	
	
 

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
		if (caller instanceof TheDuel) {
			if(round1) {
				round1 = false;
				isLoaded = true;
				return 0;
			}
			if(!isLoaded)
				if((Math.random()) < .5) {
					isLoaded = true;
					return 0;
				}
				else
					return 2;
			else
				if((Math.random()) < .5) {
					isLoaded = false;
					return 1;
				}
				else
					return 2;
		}
		else
			return 3;
	}
	@Override
	public void hit(Object caller) {
		// TODO Auto-generated method stub
		if (caller instanceof TheDuel) {
			this.hp -= 10;
		}
	}


}
