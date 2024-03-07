package process;

import java.util.ArrayList;
import java.util.Random;

import data.Ball;
import data.Player;
import data.Team;

public class Match {

	private Team team_dom ;
	private Team team_ext ;
	
	private int time_match = 90;

	private Ball ball ;
	
	public enum process_type {
		PASS, SHOT, KICKOFF, CORNER, THROW, MOVEMENT;
	}
	
	private process_type process_type ;
	
	private Boolean is_process_ongoing = false ; 
	
	ArrayList<Player> pass_players = new ArrayList<>();


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
	
	public process_type getProcessType() {
		return process_type;
	}

	public void setProcessType(process_type process_type) {
		this.process_type = process_type;
	}

	public Boolean getIsProcessOngoing() {
		return is_process_ongoing;
	}

	public void setIsProcessOngoing(Boolean is_process_ongoing) {
		this.is_process_ongoing = is_process_ongoing;
	}
	
	public ArrayList<Player> getPass_players() {
		return pass_players;
	}

	public void setPass_players(ArrayList<Player> pass_players) {
		this.pass_players = pass_players;
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
	
	public void designPassBallPlayer (Team team_with_ball) {
				
		for (int i = 0; i < team_with_ball.getSquad().size(); i++) { 
    		if(team_with_ball.getSquad().get(i).isBall() == true ) {
    			pass_players.add(team_with_ball.getSquad().get(i)) ;
    		}
		}
	}
	
	public void designPassBallReceiver (Team team_with_ball) {
		
        Random random_index_of_receiver_player = new Random();
        int index_of_receiver_player = random_index_of_receiver_player.nextInt(10) + 1;
        
		pass_players.add(team_with_ball.getSquad().get(index_of_receiver_player)) ;
	}
	
	public void initPassProcess (Team team_with_ball, Team team_without_ball) {

		setIsProcessOngoing(true);
		setProcessType(process_type.PASS);

		designPassBallPlayer(team_with_ball);
		designPassBallReceiver(team_with_ball);	
	}
	
	public void passProcessing () {

		int receiver_x_position = pass_players.get(1).getX();
		int receiver_y_position = pass_players.get(1).getY();
		
		int ball_x_position = ball.getPositionx_Ball();
		int ball_y_position = ball.getPositiony_Ball();
		
		if ( (Math.abs(ball_x_position - receiver_x_position) < 10) && (Math.abs(ball_y_position - receiver_y_position) < 10) ) {
			
			pass_players.get(0).setBall(false);
			pass_players.get(1).setBall(true);
			
			pass_players.clear();
			
			setIsProcessOngoing(false);
			setProcessType(null);
			
		} else {
			
			if (ball_x_position > receiver_x_position ) {
				ball.setPositionx_Ball(ball.getPositionx_Ball() - 10);
			} else {
				ball.setPositionx_Ball(ball.getPositionx_Ball() + 10);
			}
			
			
			if (ball_y_position > receiver_y_position ) {
				ball.setPositiony_Ball(ball.getPositiony_Ball() - 10);
			} else {
				ball.setPositiony_Ball(ball.getPositiony_Ball() + 10);
			}
			
			
		}
		
	}
	
}
