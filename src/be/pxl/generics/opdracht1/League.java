package be.pxl.generics.opdracht1;

import java.util.ArrayList;

public class League <T extends Player>{
	
	private ArrayList<Team<T>> teams;
	
	public League(){
		
	}
	public void addTeam(Team<T> team) {
		if (teams.contains(team)) {
			System.out.println(team.getName() + " is already in this League");
			return;
		}
		teams.add(team);
		System.out.println("Team toegevoegd");
		
	}
	public void printTeams() {
		for (Team<T> ploeg : teams ) {
			System.out.println(ploeg.getName() + " " + ploeg.ranking());
		}
	}
	
	

}
