package data;

import java.util.ArrayList;

public class Team {
	
	public String nameTeam;
	
	private static int default_x_gardien_dom = 100;
	private static int default_y_gardien_dom = 305;

	private static int default_x_defenseur1_dom = 200;
	private static int default_y_defenseur1_dom= 100;

	private static int default_x_defenseur2_dom = 200;
	private static int default_y_defenseur2_dom = 265;

	private static int default_x_defenseur3_dom = 200;
	private static int default_y_defenseur3_dom = 350;

	private static int default_x_defenseur4_dom = 200;
	private static int default_y_defenseur4_dom = 500;

	private static int default_x_milieu1_dom = 270;
	private static int default_y_milieu1_dom = 100;

	private static int default_x_milieu2_dom = 270;
	private static int default_y_milieu2_dom = 265;

	private static int default_x_milieu3_dom = 270;
	private static int default_y_milieu3_dom = 350;

	private static int default_x_milieu4_dom = 270;
	private static int default_y_milieu4_dom = 500;

	private static int default_x_attaquant1_dom = 360;
	private static int default_y_attaquant1_dom = 260;

	private static int default_x_attaquant2_dom = 360;
	private static int default_y_attaquant2_dom = 350;

	private static int default_x_gardien_ext = 790;
	private static int default_y_gardien_ext = 305;

	private static int default_x_defenseur1_ext = 690;
	private static int default_y_defenseur1_ext = 100;

	private static int default_x_defenseur2_ext = 690;
	private static int default_y_defenseur2_ext = 265;

	private static int default_x_defenseur3_ext = 690;
	private static int default_y_defenseur3_ext = 350;

	private static int default_x_defenseur4_ext = 690;
	private static int default_y_defenseur4_ext = 500;

	private static int default_x_milieu1_ext = 620;
	private static int default_y_milieu1_ext = 100;

	private static int default_x_milieu2_ext = 620;
	private static int default_y_milieu2_ext = 265;

	private static int default_x_milieu3_ext = 620;
	private static int default_y_milieu3_ext = 350;

	private static int default_x_milieu4_ext = 620;
	private static int default_y_milieu4_ext = 500;

	private static int default_x_attaquant1_ext = 530;
	private static int default_y_attaquant1_ext = 265;

	private static int default_x_attaquant2_ext = 530;
	private static int default_y_attaquant2_ext = 350;
	
	public ArrayList<Player> squad = new ArrayList<Player>();
	

	public String getNameTeam() {

		return nameTeam;
	}

	public void setNameTeam(String nameTeam) {
		this.nameTeam = nameTeam;
	}

	public ArrayList<Player> getPlayers() {
		return squad;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.squad = players;
	}


	@Override
	public String toString() {
		return "Team [nameTeam=" + nameTeam + ", squad=" + squad + "]";
	}

	public Team(String nameTeam, ArrayList<Player> players) {
		super();
		this.nameTeam = nameTeam;
		this.squad = players;
		createteams();

	}

	public static ArrayList<Player> squad_dom = new ArrayList<>();
	public static ArrayList<Player> squad_ext = new ArrayList<>();

	private static Player.position GOAL = Enum.valueOf(Player.position.class, "GOALKEEPER");

	private static Player.position DEF = Enum.valueOf(Player.position.class, "DEFENDER");

	private static Player.position MID = Enum.valueOf(Player.position.class, "MIDFIELDER");

	private static Player.position ATT = Enum.valueOf(Player.position.class, "FORWARD");

	public static void createteams() {
		
		Player p1 = new Player("1",20, 30, 40, 80, 90, 1, GOAL, default_x_gardien_dom, default_y_gardien_dom,false);
		Player p2 = new Player("2",30, 50, 40, 70, 60, 2, DEF, default_x_defenseur1_dom, default_y_defenseur1_dom,true);
		Player p3 = new Player("3",20, 40, 40, 70, 60, 3, DEF, default_x_defenseur2_dom, default_y_defenseur2_dom,false);
		Player p4 = new Player("4",30, 30, 40, 70, 70, 4, DEF, default_x_defenseur3_dom, default_y_defenseur3_dom,false);
		Player p5 = new Player("5",30, 40, 40, 70, 60, 5, DEF, default_x_defenseur4_dom, default_y_defenseur4_dom,false);

		Player p6 = new Player("6",60, 40, 60, 20, 70, 7, MID, default_x_milieu1_dom, default_y_milieu1_dom,false);
		Player p7 = new Player("7",60, 50, 70, 30, 60, 8, MID, default_x_milieu2_dom, default_y_milieu2_dom,false);
		Player p8 = new Player("8",50, 30, 50, 40, 80, 9, MID, default_x_milieu3_dom, default_y_milieu3_dom,false);
		Player p9 = new Player("9",60, 40, 60, 20, 70, 7, MID, default_x_milieu4_dom, default_y_milieu4_dom,false);

		Player p10 = new Player("10",80, 80, 50, 40, 80, 10, ATT, default_x_attaquant1_dom, default_y_attaquant1_dom,false);
		Player p11 = new Player("11",100, 90, 100, 50, 100, 11, ATT, default_x_attaquant2_dom, default_y_attaquant2_dom,false);

		squad_dom.add(p1);

		squad_dom.add(p2);
		squad_dom.add(p3);
		squad_dom.add(p4);
		squad_dom.add(p5);

		squad_dom.add(p6);
		squad_dom.add(p7);
		squad_dom.add(p8);
		
		squad_dom.add(p9);
		squad_dom.add(p10);
		squad_dom.add(p11);

		Player p21 = new Player("12",40, 50, 30, 40, 60, 11, DEF, default_x_defenseur1_ext, default_y_defenseur1_ext,false);
		Player p22 = new Player("13",30, 45, 40, 30, 65, 10, DEF, default_x_defenseur2_ext, default_y_defenseur2_ext,false);
		Player p23 = new Player("14",35, 40, 50, 45, 70, 9, DEF, default_x_defenseur3_ext, default_y_defenseur3_ext,false);
		Player p24 = new Player("15",45, 40, 45, 35, 70, 8, DEF, default_x_defenseur4_ext, default_y_defenseur4_ext,false);

		Player p25 = new Player("16",60, 30, 60, 80, 0, 7, MID, default_x_milieu1_ext, default_y_milieu1_ext,false);
		Player p26 = new Player("17",65, 40, 50, 85, 0, 6, MID, default_x_milieu2_ext, default_y_milieu2_ext,false);
		Player p27 = new Player("18",70, 45, 65, 90, 0, 5, MID, default_x_milieu3_ext, default_y_milieu3_ext,false);
		
		Player p28 = new Player("19",75, 50, 55, 70, 0, 4, MID, default_x_milieu4_ext, default_y_milieu4_ext,false);
		Player p29 = new Player("20",90, 85, 85, 55, 90, 3, ATT, default_x_attaquant1_ext, default_y_attaquant1_ext,false);
		Player p210 = new Player("21",95, 90, 80, 50, 100, 2, ATT, default_x_attaquant2_ext, default_y_attaquant2_ext,false);

		Player p211 = new Player("22",50, 60, 30, 90, 90, 1, GOAL, default_x_gardien_ext, default_y_gardien_ext,false);

		squad_ext.add(p211);
		squad_ext.add(p210);
		squad_ext.add(p29);
		squad_ext.add(p28);
		squad_ext.add(p27);
		squad_ext.add(p26);
		squad_ext.add(p25);
		squad_ext.add(p24);
		squad_ext.add(p23);
		squad_ext.add(p22);
		squad_ext.add(p21);
		
	//Team.parcoursListPlayer(squad_dom);
	//Team.parcoursListPlayer(squad_ext);

	}

	public Player searchByNameSquadDom(String name) { 
    	for(int i = 0; i < squad_dom.size(); i++) { 
    		if(squad_dom.get(i).getName().equals(name)) {
    			return squad_dom.get(i);
    		}
    	}
    	return null;
	}
	
	
	public static void parcoursListPlayer(ArrayList<Player> list) {

		for (Player p : list) {

			p.toString();
			System.out.println(p);

		}

	}

}
