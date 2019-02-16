package duel;
public class CharacterA implements Dueler {
	private int hp;
	private int loaded = 0;
	private boolean round1 = true;


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
		if(d.getHP() == hp)
			return true;
		else
			return false;
	}
	

	public int getAction(Object caller) {
			if (caller instanceof TheDuel) {
				if (round1) {
					round1 = false;
					loaded = 1;
					return 0;
				}
				if(loaded == 0) {
					if(Math.random() > .2) {
						loaded = 1;
						return 0;
					}
					else return 2;
				}
				else 
					if(Math.random() > .5) {
						loaded = 0;
						return 1;
					}
					else return 2;
			} else
				return 3;
	}

	public void hit(Object caller) {
			if (caller instanceof TheDuel) {
				this.hp -= 10;
			}
	}
}

