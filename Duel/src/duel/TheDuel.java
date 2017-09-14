package duel;

public interface Dueler {
	
}


public class TheDuel implements Dueler{

	

	private Dueler d1;
	private Dueler d2;
	
	private int dueler1HP = 30;
	private int dueler2HP = 30;
	
	
	public static void main(String[] args){
		TheDuel duel = new TheDuel();
		duel.dukeItOut();
	}
	
	public TheDuel() {
		d1 = new CharacterA();
		d2 = new CharacterB();
	}
	public void dukeItOut(){
		System.out.print(d1.getName());
		pause(600);
		System.out.print(" vs ");
		pause(600);
		System.out.println(d2.getName());
		pause(600);
		d1.taunt();
		pause(2000);
		d2.taunt();
		pause(2000);
		d1.setStartingHP(dueler1HP);
		d2.setStartingHP(dueler2HP);
		
	}
	
	/**
	 * This method involves "Threads" which we will get to much later in the year, essentially, it
	 * creates a pause in the execution of the program, which makes it more dramatic
	 * @param time
	 */
	public void pause(long time){
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


}
