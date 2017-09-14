package duel;

public interface Dueler

	this.name = name;
	

	//print a taunt
	//later: the taunt must be different each time the method is called
	void taunt();{
		
		System.out.println(taunts);
	}
	
	//returns the name of the Dueler
	public String getName();{
		
		System.out.println(name);
	}
	//set the value of a field. Write this in such a way that it can only be called once (by the Duel, at the start)
	void setStartingHP(int hp);
	//returns the value of HP, can be called as often as anyone wants
	int getHP();
	
	//This method is called by the Duel and can be used by the dueler
	//return true if d has hp of given level
	boolean determineIfOpponentIsFair(Dueler d, int hp);
}
