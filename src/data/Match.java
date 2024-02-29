package data;

import java.util.ArrayList;
import java.util.Random;

public class Match {

	public static ArrayList<Player> squad1 = new ArrayList<>();
	public static ArrayList<Player> squad2 = new ArrayList<>();

	private Team dom_team = new Team("DOM", squad1);
	private Team ext_team = new Team("EXT", squad2);
	
	private int score_dom_team;
	private int score_ext_team;
	private int time_match = 90;

	private Ball ball = new Ball(250,150);
	
	public Team getDom_team() {
		return dom_team;
	}

	public void setDom_team(Team dom_team) {
		this.dom_team = dom_team;
	}

	public Team getExt_team() {
		return ext_team;
	}

	public void setExt_team(Team ext_team) {
		this.ext_team = ext_team;
	}

	public int getScore_dom_team() {
		return score_dom_team;
	}

	public void setScore_dom_team(int score_dom_team) {
		this.score_dom_team = score_dom_team;
	}

	public int getScore_ext_team() {
		return score_ext_team;
	}

	public void setScore_ext_team(int score_ext_team) {
		this.score_ext_team = score_ext_team;
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

	public static void engagement() {

		Random random = new Random();
		int nb;
		nb = random.nextInt(2);
		Team.createteams();
		// si le nombre aléatoire génère 1, ce sera l'équipe domicile qui engagera
		if (nb == 1) {
			Team.squad_dom.get(10).setX(440);
			Team.squad_dom.get(10).setY(305);
			Team.squad_dom.get(9).setX(440);
			Team.squad_dom.get(9).setY(325);
			Team.squad_dom.get(10).setBall(true);
		} else {
			Team.squad_ext.get(10).setX(440);
			Team.squad_ext.get(10).setY(305);
			Team.squad_ext.get(9).setX(440);
			Team.squad_ext.get(9).setY(325);
			Team.squad_ext.get(10).setBall(true);
		}

	}
}
