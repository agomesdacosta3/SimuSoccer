package data;

import java.util.ArrayList;

public class Team {
	
	private String nameTeam;
	
	private String dashboardNameTeam ;
	
	private int scoreTeam = 0 ;
	
	public ArrayList<Player> squad = new ArrayList<Player>();
	

	public String getNameTeam() {
		return nameTeam;
	}

	public void setNameTeam(String nameTeam) {
		this.nameTeam = nameTeam;
	}

	public String getDashboardNameTeam() {
		return dashboardNameTeam;
	}

	public void setDashboardNameTeam(String dashboardNameTeam) {
		this.dashboardNameTeam = dashboardNameTeam;
	}

	public int getScoreTeam() {
		return scoreTeam;
	}

	public void setScoreTeam(int scoreTeam) {
		this.scoreTeam = scoreTeam;
	}

	public ArrayList<Player> getSquad() {
		return squad;
	}

	public void setSquad(ArrayList<Player> squad) {
		this.squad = squad;
	}


	@Override
	public String toString() {
		return "Team [nameTeam=" + nameTeam + ", dashboardNameTeam=" + dashboardNameTeam + ", scoreTeam=" + scoreTeam
				+ ", squad=" + squad + "]";
	}

	public Team(String nameTeam, String dashboardNameTeam, int scoreTeam) {
		super();
		this.nameTeam = nameTeam;
		this.dashboardNameTeam = dashboardNameTeam;
		this.scoreTeam = scoreTeam;
	}

	public void createSquad(String side) {
	
		// Position par défaut Equipe Domicile
		
		int default_x_goalkeeper_dom = 100;
		int default_y_goalkeeper_dom = 305;
		
		int default_x_defender1_dom = 200;
		int default_y_defender1_dom= 100;

		int default_x_defender2_dom = 200;
		int default_y_defender2_dom = 245;

		int default_x_defender3_dom = 200;
		int default_y_defender3_dom = 370;

		int default_x_defender4_dom = 200;
		int default_y_defender4_dom = 500;

		int default_x_midfielder1_dom = 275;
		int default_y_midfielder1_dom = 300;

		int default_x_midfielder2_dom = 330;
		int default_y_midfielder2_dom = 220;
		
		int default_x_midfielder3_dom = 330;
		int default_y_midfielder3_dom = 380;

		int default_x_forward1_dom = 400;
		int default_y_forward1_dom = 306;

		int default_x_forward2_dom = 380;
		int default_y_forward2_dom = 150;
		
		int default_x_forward3_dom = 380;
		int default_y_forward3_dom = 450;
		
		
		// Position par défaut Equipe Extérieure
		
		int default_x_goalkeeper_ext = 790;
		int default_y_goalkeeper_ext = 305;

		int default_x_defender1_ext = 690;
		int default_y_defender1_ext = 100;

		int default_x_defender2_ext = 690;
		int default_y_defender2_ext = 245;

		int default_x_defender3_ext = 690;
		int default_y_defender3_ext = 370;

		int default_x_defender4_ext = 690;
		int default_y_defender4_ext = 500;
		
		int default_x_midfielder1_ext = 600;
		int default_y_midfielder1_ext = 300;

		int default_x_midfielder2_ext = 550;
		int default_y_midfielder2_ext = 220;

		int default_x_midfielder3_ext = 550;
		int default_y_midfielder3_ext = 380;
		
		int default_x_forward1_ext = 480;
		int default_y_forward1_ext = 306;

		int default_x_forward2_ext = 500;
		int default_y_forward2_ext = 150;
		
		int default_x_forward3_ext = 500;
		int default_y_forward3_ext = 450;

		Player.position GOAL = Enum.valueOf(Player.position.class, "GOALKEEPER");

		Player.position DEF = Enum.valueOf(Player.position.class, "DEFENDER");

		Player.position MID = Enum.valueOf(Player.position.class, "MIDFIELDER");

		Player.position FOR = Enum.valueOf(Player.position.class, "FORWARD");
		
		
		Player goalkeeper_dom = new Player("1",20, 30, 40, 80, 90, 1, GOAL, default_x_goalkeeper_dom, default_y_goalkeeper_dom,false);
		
		Player defender1_dom = new Player("2",30, 50, 40, 70, 60, 2, DEF, default_x_defender1_dom, default_y_defender1_dom,false);
		Player defender2_dom = new Player("3",20, 40, 40, 70, 60, 3, DEF, default_x_defender2_dom, default_y_defender2_dom,false);
		Player defender3_dom = new Player("4",30, 30, 40, 70, 70, 4, DEF, default_x_defender3_dom, default_y_defender3_dom,false);
		Player defender4_dom = new Player("5",30, 40, 40, 70, 60, 5, DEF, default_x_defender4_dom, default_y_defender4_dom,false);

		Player midfielder1_dom = new Player("6",60, 40, 60, 20, 70, 7, MID, default_x_midfielder1_dom, default_y_midfielder1_dom,false);
		Player midfielder2_dom = new Player("7",60, 50, 70, 30, 60, 8, MID, default_x_midfielder2_dom, default_y_midfielder2_dom,false);
		Player midfielder3_dom = new Player("8",50, 30, 50, 40, 80, 9, MID, default_x_midfielder3_dom, default_y_midfielder3_dom,false);

		Player forward1_dom = new Player("9",80, 80, 50, 40, 80, 10, FOR, default_x_forward1_dom, default_y_forward1_dom,false);
		Player forward2_dom = new Player("10",100, 90, 100, 50, 100, 11, FOR, default_x_forward2_dom, default_y_forward2_dom,false);
		Player forward3_dom = new Player("11",60, 40, 60, 20, 70, 7, FOR, default_x_forward3_dom, default_y_forward3_dom,false);
		
		
		Player goalkeeper_ext = new Player("1",20, 30, 40, 80, 90, 1, GOAL, default_x_goalkeeper_ext, default_y_goalkeeper_ext,false);
		
		Player defender1_ext = new Player("2",30, 50, 40, 70, 60, 2, DEF, default_x_defender1_ext, default_y_defender1_ext,false);
		Player defender2_ext = new Player("3",20, 40, 40, 70, 60, 3, DEF, default_x_defender2_ext, default_y_defender2_ext,false);
		Player defender3_ext = new Player("4",30, 30, 40, 70, 70, 4, DEF, default_x_defender3_ext, default_y_defender3_ext,false);
		Player defender4_ext = new Player("5",30, 40, 40, 70, 60, 5, DEF, default_x_defender4_ext, default_y_defender4_ext,false);

		Player midfielder1_ext = new Player("6",60, 40, 60, 20, 70, 7, MID, default_x_midfielder1_ext, default_y_midfielder1_ext,false);
		Player midfielder2_ext = new Player("7",60, 50, 70, 30, 60, 8, MID, default_x_midfielder2_ext, default_y_midfielder2_ext,false);
		Player midfielder3_ext = new Player("8",50, 30, 50, 40, 80, 9, MID, default_x_midfielder3_ext, default_y_midfielder3_ext,false);

		Player forward1_ext = new Player("9",80, 80, 50, 40, 80, 10, FOR, default_x_forward1_ext, default_y_forward1_ext,false);
		Player forward2_ext = new Player("10",100, 90, 100, 50, 100, 11, FOR, default_x_forward2_ext, default_y_forward2_ext,false);
		Player forward3_ext = new Player("11",60, 40, 60, 20, 70, 7, FOR, default_x_forward3_ext, default_y_forward3_ext,false);

		if (side == "dom") {
			
			squad.add(goalkeeper_dom);

			squad.add(defender1_dom);
			squad.add(defender2_dom);
			squad.add(defender3_dom);
			squad.add(defender4_dom);

			squad.add(midfielder1_dom);
			squad.add(midfielder2_dom);
			squad.add(midfielder3_dom);
			
			squad.add(forward1_dom);
			squad.add(forward2_dom);
			squad.add(forward3_dom);
			
		} else if (side == "ext") {
			
			squad.add(goalkeeper_ext);

			squad.add(defender1_ext);
			squad.add(defender2_ext);
			squad.add(defender3_ext);
			squad.add(defender4_ext);

			squad.add(midfielder1_ext);
			squad.add(midfielder2_ext);
			squad.add(midfielder3_ext);
			
			squad.add(forward1_ext);
			squad.add(forward2_ext);
			squad.add(forward3_ext);
			
		} else {
			// ajouter la gestion de l'erreur
		}
		
		
	//Team.parcoursListPlayer(squad_dom);
	//Team.parcoursListPlayer(squad_ext);

	}

	public Player searchPlayerByNameInSquad(ArrayList <Player> squad, String name) { 
    	for(int i = 0; i < squad.size(); i++) { 
    		if(squad.get(i).getName().equals(name)) {
    			return squad.get(i);
    		}
    	}
    	return null;
	}
	
	
	public static void parcoursListPlayer(ArrayList<Player> squad) {
		for (Player p : squad) {
			p.toString();
			System.out.println(p);
		}
	}

}
