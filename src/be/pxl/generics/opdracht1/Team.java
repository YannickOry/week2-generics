package be.pxl.generics.opdracht1;

import java.util.ArrayList;

public class Team<T extends Player> {
	private String name;
	private int played;
	private int won;
	private int lost;
	private int tied;
	
	private ArrayList<T> members = new ArrayList<T>();

	public Team(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getPlayed() {
		return played;
	}

	public int getWon() {
		return won;
	}

	public int getLost() {
		return lost;
	}

	public int getTied() {
		return tied;
	}

	public ArrayList<T> getMembers() {
		return members;
	}

	public void addPlayer(T speler) {

		if (!members.contains(speler)) {
			members.add(speler);
		}

	}

	public int numberOfPlayers() {
		return members.size();
	}

	public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
		if (ourScore > theirScore) {
			won++;
		} else if (ourScore == theirScore) {
			tied++;
		} else {
			lost++;
		}
		played++;
		if(opponent != null) {
			opponent.matchResult(null, theirScore, ourScore);
		}
	
	}

	public int ranking() {
		return (3 * won) + tied;
		
	}

}
