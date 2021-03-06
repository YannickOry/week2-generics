package be.pxl.generics.opdracht1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TeamMatchResultTest {

	@Test
	public void testOurTeamLostTest() {
		Team<SoccerPlayer> ourTeam = new Team<SoccerPlayer>("OurTeam");
		Team<SoccerPlayer> opponentTeam = new Team<SoccerPlayer>("OpponentTeam");
		assertEquals(0, ourTeam.getPlayed());
		assertEquals(0, opponentTeam.getPlayed());
		ourTeam.matchResult(opponentTeam, 5, 9);
		assertEquals(1, ourTeam.getPlayed());
		assertEquals(1, opponentTeam.getPlayed());
		assertEquals(0, ourTeam.getWon());
		assertEquals(0, ourTeam.getTied());
		assertEquals(1, ourTeam.getLost());
		assertEquals(1, opponentTeam.getWon());
		assertEquals(0, opponentTeam.getTied());
		assertEquals(0, opponentTeam.getLost());
	}
	
	@Test
	public void testOurTeamWonTest() {
		Team<SoccerPlayer> ourTeam = new Team<SoccerPlayer>("OurTeam");
		Team<SoccerPlayer> opponentTeam = new Team<SoccerPlayer>("OpponentTeam");
		assertEquals(0, ourTeam.getPlayed());
		assertEquals(0, opponentTeam.getPlayed());
		ourTeam.matchResult(opponentTeam, 9, 5);
		assertEquals(1, ourTeam.getPlayed());
		assertEquals(1, opponentTeam.getPlayed());
		assertEquals(1, ourTeam.getWon());
		assertEquals(0, ourTeam.getTied());
		assertEquals(0, ourTeam.getLost());
		assertEquals(0, opponentTeam.getWon());
		assertEquals(0, opponentTeam.getTied());
		assertEquals(1, opponentTeam.getLost());
	}
	
	@Test
	public void testOurTeamTiedTest() {
		Team<SoccerPlayer> ourTeam = new Team<SoccerPlayer>("OurTeam");
		Team<SoccerPlayer> opponentTeam = new Team<SoccerPlayer>("OpponentTeam");
		assertEquals(0, ourTeam.getPlayed());
		assertEquals(0, opponentTeam.getPlayed());
		ourTeam.matchResult(opponentTeam, 5, 5);
		assertEquals(1, ourTeam.getPlayed());
		assertEquals(1, opponentTeam.getPlayed());
		assertEquals(0, ourTeam.getWon());
		assertEquals(1, ourTeam.getTied());
		assertEquals(0, ourTeam.getLost());
		assertEquals(0, opponentTeam.getWon());
		assertEquals(1, opponentTeam.getTied());
		assertEquals(0, opponentTeam.getLost());
	}
}
