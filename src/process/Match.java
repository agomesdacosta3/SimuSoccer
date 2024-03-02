package process;

import java.util.Random;

import data.Ball;
import data.Team;

public class Match {

	private Team team_dom ;
	private Team team_ext ;
	
	private int time_match = 90;

	private Ball ball ;
	
	public Team getTeamDom() {
		return team_dom;
	}

	public void setTeamDom(Team team_dom) {
		this.team_dom = team_dom;
	}

	public Team getTeamExt() {
		return team_ext;
	}

	public void setTeamExt(Team team_ext) {
		this.team_ext = team_ext;
	}

	public int getTime_match() {
		return time_match;
	}

	public void setTime_match(int time_match) {
		this.time_match = time_match;
	}

	public Ball getBall() {
		return ball;
	}

	public void setBall(Ball ball) {
		this.ball = ball;
	}
	
	

	public Match(Team team_dom, Team team_ext, int time_match, Ball ball) {
		super();
		this.team_dom = team_dom;
		this.team_ext = team_ext;
		this.time_match = time_match;
		this.ball = ball;
	}

	public void firstEngagement() {

		Random random = new Random();
		int nb;
		nb = random.nextInt(2);
				
		if (nb == 1) { // si le nombre aléatoire génère 1, ce sera l'équipe domicile qui engagera
			
			team_dom.getSquad().get(8).setX(440);
			team_dom.getSquad().get(8).setY(315);
			team_dom.getSquad().get(8).setBall(true);
			
		} else { // sinon ce sera l'équipe extérieure qui engagera
			
			team_ext.getSquad().get(8).setX(440);
			team_ext.getSquad().get(8).setY(315);
			team_ext.getSquad().get(8).setBall(true);
		}

	}
}
