package process;

import java.util.ArrayList;
import java.util.Random;

import data.Ball;
import data.Player;
import data.Team;
import delimitations.Goal;
import delimitations.Surface;

public class Match {

	private Team team_dom ;
	private Team team_ext ;
	
	private int time_match = 90;

	private Ball ball ;
	
	public enum process_type {
		PASS, THROW, CORNER, SHOT, GOAL, KICKOFF ;
	}
	
	private boolean blockMovement = false ;
	
	private process_type process_type ;
	
	private Boolean is_process_ongoing = false ; 
	
	private ArrayList<Player> pass_players = new ArrayList<>();
	
	private ArrayList<Integer> shot_aim_positions = new ArrayList<>();


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

	public boolean isBlockMovement() {
		return blockMovement;
	}

	public void setBlockMovement(boolean blockMovement) {
		this.blockMovement = blockMovement;
	}

	public Match(Team team_dom, Team team_ext, int time_match, Ball ball) {
		super();
		this.team_dom = team_dom;
		this.team_ext = team_ext;
		this.time_match = time_match;
		this.ball = ball;
	}

	public void firstKickoff() {
		
		System.out.println("Start of the Game !\n");

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
	
	public void kickoff (String kickoff_side) {
		
		KickoffPlacement.placeKickoffPositions(team_dom, team_ext, kickoff_side) ;
		
		if (kickoff_side == "dom") {
			
			team_dom.getSquad().get(8).setX(440);
			team_dom.getSquad().get(8).setY(315);
			team_dom.getSquad().get(8).setBall(true);
			
		} else if (kickoff_side == "ext") {
						
			team_ext.getSquad().get(8).setX(440);
			team_ext.getSquad().get(8).setY(315);
			team_ext.getSquad().get(8).setBall(true);
			
		} else {
			// return error message or code
		}
		
		ball.setPositionx_Ball(440);
		ball.setPositiony_Ball(306);
		
		setIsProcessOngoing(false);
		setProcessType(process_type.PASS);
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
	
	public void initPassProcess () {
		
		setIsProcessOngoing(true);
		setProcessType(process_type.PASS);
		setBlockMovement(false);

		if (team_dom.isTeamHaveBall()) {
			designPassBallPlayer(team_dom);
			designPassBallReceiver(team_dom);
		} else {
			designPassBallPlayer(team_ext);
			designPassBallReceiver(team_ext);
		}
	}
	
	public void passProcessing () {

		double receiver_x_position = pass_players.get(1).getX();
		double receiver_y_position = pass_players.get(1).getY();
		
		double ball_x_position = ball.getPositionx_Ball();
		double ball_y_position = ball.getPositiony_Ball();
		
		int tolerance = 10 ;
		
		if ( (Math.abs(ball_x_position - receiver_x_position) < tolerance) && (Math.abs(ball_y_position - receiver_y_position) < tolerance) ) {
			
			pass_players.get(0).setBall(false);
			pass_players.get(1).setBall(true);
			
			if (team_dom.isTeamHaveBall()) {
			
				ball.setPositionx_Ball(pass_players.get(1).getX() + 6);
				ball.setPositiony_Ball(pass_players.get(1).getY());
				
				if (pass_players.get(1).isInShotSituation("dom")) {
									
					System.out.println("Shot made by the home team");
					setIsProcessOngoing(true);
					setProcessType(process_type.SHOT);
					setBlockMovement(true);
					
				} else {
					setIsProcessOngoing(false);
					setProcessType(null);
				}
				
			} else if (team_ext.isTeamHaveBall()) {
				
				ball.setPositionx_Ball(pass_players.get(1).getX() - 6);
				ball.setPositiony_Ball(pass_players.get(1).getY());
				
				if (pass_players.get(1).isInShotSituation("ext")) {
				
					System.out.println("Shot made by the away team");
					setIsProcessOngoing(true);
					setProcessType(process_type.SHOT);
					setBlockMovement(true);
					
				} else {
					setIsProcessOngoing(false);
					setProcessType(null);
				}
				
			} else {
				// return error message or code
			}
			
			pass_players.clear();
			
		} else {
			
		    double distance = Math.sqrt(Math.pow(receiver_x_position - ball_x_position, 2) + Math.pow(receiver_y_position - ball_y_position, 2));

		    double ratio = 15 / distance;

		    double deltaX = ratio * (receiver_x_position - ball_x_position);
		    double deltaY = ratio * (receiver_y_position - ball_y_position);

		    ball.setPositionx_Ball(ball_x_position + deltaX);
		    ball.setPositiony_Ball(ball_y_position + deltaY);
		
			
		}
		
	}
	
	public void shotProcessing() {
		
		Player shot_player = findBallPlayer() ;
				
		Random random_y = new Random();
		
		if (shot_aim_positions.isEmpty()) {
			
			if (team_dom.isTeamHaveBall()) {
				
				int shot_aim_position_y = random_y.nextInt(Goal.getGoalDroitBasY() - Goal.getGoalDroitHautY()) + Goal.getGoalDroitHautY();
				
				shot_aim_positions.add(Goal.getGoalDroitX() + 10);
				shot_aim_positions.add(shot_aim_position_y);
				
			} else if (team_ext.isTeamHaveBall()) {
				
				int shot_aim_position_y = random_y.nextInt(Goal.getGoalGaucheBasY() - Goal.getGoalGaucheHautY()) + Goal.getGoalGaucheHautY();
								
				shot_aim_positions.add(Goal.getGoalGaucheX() - 10);
				shot_aim_positions.add(shot_aim_position_y);
				
			} else {
				// return error message or code
			}	
			
		} else {
			
			int tolerance = 10 ;
			
			if ( ( (ball.getPositionx_Ball() > Goal.getGoalDroitX()) && (Math.abs(ball.getPositiony_Ball() - shot_aim_positions.get(1)) < tolerance) && (team_dom.isTeamHaveBall()) ) || ( (ball.getPositionx_Ball() < Goal.getGoalGaucheX()) && (Math.abs(ball.getPositiony_Ball() - shot_aim_positions.get(1)) < tolerance) && (team_ext.isTeamHaveBall()) ) ) {
						
				setProcessType(process_type.GOAL);
				
				shot_aim_positions.clear();
				
			} else {
				
			    double distance = Math.sqrt(Math.pow(shot_aim_positions.get(0) - ball.getPositionx_Ball(), 2) + Math.pow(shot_aim_positions.get(1) - ball.getPositiony_Ball(), 2));

			    double ratio = 15 / distance;

			    double deltaX = ratio * (shot_aim_positions.get(0) - ball.getPositionx_Ball());
			    double deltaY = ratio * (shot_aim_positions.get(1) - ball.getPositiony_Ball());

			    ball.setPositionx_Ball(ball.getPositionx_Ball() + deltaX);
			    ball.setPositiony_Ball(ball.getPositiony_Ball() + deltaY);		}
			
		}
		
	}
	
	public void goalProcessing() {
		
		setIsProcessOngoing(true);
		setProcessType(process_type.KICKOFF);
		
		String kickoff_side = null ;
		
		if (team_dom.isTeamHaveBall()) {
			
			team_dom.setScoreTeam(team_dom.getScoreTeam() + 1 );
			kickoff_side = "ext" ;
			
		} else if (team_ext.isTeamHaveBall()) {
			
			team_ext.setScoreTeam(team_ext.getScoreTeam() + 1 );			
			kickoff_side = "dom" ;
			
		} else {
			// return error message or code
		}
		
		Player ball_player = findBallPlayer();
		ball_player.setBall(false);
		
		kickoff(kickoff_side) ;
	
	}

	public void MoveDefender() {
		
		if (team_dom.isTeamHaveBall()) {
			
			for (int i = 1; i < 5; i++) {
				
				if (team_dom.getSquad().get(i).getX() < 440) {
		    		team_dom.getSquad().get(i).setX(team_dom.getSquad().get(i).getX() + 7);
				}
				
				if (team_ext.getSquad().get(i).getX() < Surface.getSurfacedroiteHautGaucheX() + 50) {
					team_ext.getSquad().get(i).setX(team_ext.getSquad().get(i).getX() + 7);
				}
			}
			
		} else {
			
			for (int i = 1; i < 5; i++) {
				
				if (team_dom.getSquad().get(i).getX() > Surface.getSurfacegaucheHautDroiteX() - 50) {
		    		team_dom.getSquad().get(i).setX(team_dom.getSquad().get(i).getX() - 7);
				}
				
				if (team_ext.getSquad().get(i).getX() > 440) {
					team_ext.getSquad().get(i).setX(team_ext.getSquad().get(i).getX() - 7);
				}
			}
			
		}

	}
	
	public void MoveMidfielder() {
		
		if (team_dom.isTeamHaveBall()) {
			
			for (int i = 5; i < 8; i++) {
				
				if (team_dom.getSquad().get(i).getX() < Surface.getSurfacedroiteHautGaucheX() - 80 ) {
					team_dom.getSquad().get(i).setX(team_dom.getSquad().get(i).getX() + 7);
				}
				
				if (team_ext.getSquad().get(i).getX() < Surface.getSurfacedroiteHautGaucheX() - 15 ) {
					team_ext.getSquad().get(i).setX(team_ext.getSquad().get(i).getX() + 7);
				}
			}
			
		} else {
			
			for (int i = 5; i < 8; i++) {
				
				if (team_dom.getSquad().get(i).getX() > Surface.getSurfacegaucheHautDroiteX() + 15 ) {
					team_dom.getSquad().get(i).setX(team_dom.getSquad().get(i).getX() - 7);
				}
				
				if (team_ext.getSquad().get(i).getX() > Surface.getSurfacegaucheHautDroiteX() + 80 ) {
					team_ext.getSquad().get(i).setX(team_ext.getSquad().get(i).getX() - 7);
				}
			}
			
		}
		
	}

	public void MoveForward() {
		
		if (team_dom.isTeamHaveBall()) {
			
			for (int i = 8; i < 11; i++) {
				
				if (team_dom.getSquad().get(i).getX() < Surface.getSurfacedroiteHautGaucheX() + 50 ) {
					team_dom.getSquad().get(i).setX(team_dom.getSquad().get(i).getX() + 7);
				}
				
				if (team_ext.getSquad().get(i).getX() < 490 ) {
					team_ext.getSquad().get(i).setX(team_ext.getSquad().get(i).getX() + 7);
				}
			}
			
		} else {
			
			for (int i = 8; i < 11; i++) {
				
				if (team_dom.getSquad().get(i).getX() > 390) {
					team_dom.getSquad().get(i).setX(team_dom.getSquad().get(i).getX() - 7);
				}
				
				if (team_ext.getSquad().get(i).getX() > Surface.getSurfacegaucheHautDroiteX() - 50 ) {
					team_ext.getSquad().get(i).setX(team_ext.getSquad().get(i).getX() - 7);
				}
			}
			
		}
		
	}
	
	public Player findBallPlayer() {
		
		if (team_dom.isTeamHaveBall()) {
			
			for (int i = 0; i < team_dom.getSquad().size(); i++) { 
	    		if(team_dom.getSquad().get(i).isBall() == true ) {
	    			return team_dom.getSquad().get(i) ;
	    		}
			}
			
		} else if (team_ext.isTeamHaveBall()) {
			
			for (int i = 0; i < team_ext.getSquad().size(); i++) { 
	    		if(team_ext.getSquad().get(i).isBall() == true ) {
	    			return team_ext.getSquad().get(i) ;
	    		}
			}
			
		} else {
			// Display error message or code
		}
		return null;
	}
	
}
