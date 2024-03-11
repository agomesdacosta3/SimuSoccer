package process;

import data.Team;

public class KickoffPlacement {
	
	// Position par défaut Equipe Domicile

	private static int default_x_goalkeeper_dom = 100;
	private static int default_y_goalkeeper_dom = 305;
	
	private static int default_x_defender1_dom = 200;
	private static int default_y_defender1_dom= 100;
	
	private static int default_x_defender2_dom = 200;
	private static int default_y_defender2_dom = 245;
	
	private static int default_x_defender3_dom = 200;
	private static int default_y_defender3_dom = 370;
	
	private static int default_x_defender4_dom = 200;
	private static int default_y_defender4_dom = 500;
	
	private static int default_x_midfielder1_dom = 275;
	private static int default_y_midfielder1_dom = 300;
	
	private static int default_x_midfielder2_dom = 330;
	private static int default_y_midfielder2_dom = 220;
	
	private static int default_x_midfielder3_dom = 330;
	private static int default_y_midfielder3_dom = 380;
	
	private static int default_x_forward1_dom = 400;
	private static int default_y_forward1_dom = 306;
	
	private static int default_x_forward2_dom = 380;
	private static int default_y_forward2_dom = 150;
	
	private static int default_x_forward3_dom = 380;
	private static int default_y_forward3_dom = 450;
	
	
	// Position par défaut Equipe Extérieure
			
	private static int default_x_goalkeeper_ext = 790;
	private static int default_y_goalkeeper_ext = 305;

	private static int default_x_defender1_ext = 690;
	private static int default_y_defender1_ext = 100;

	private static int default_x_defender2_ext = 690;
	private static int default_y_defender2_ext = 245;

	private static int default_x_defender3_ext = 690;
	private static int default_y_defender3_ext = 370;

	private static int default_x_defender4_ext = 690;
	private static int default_y_defender4_ext = 500;
	
	private static int default_x_midfielder1_ext = 600;
	private static int default_y_midfielder1_ext = 300;

	private static int default_x_midfielder2_ext = 550;
	private static int default_y_midfielder2_ext = 220;

	private static int default_x_midfielder3_ext = 550;
	private static int default_y_midfielder3_ext = 380;
	
	private static int default_x_forward1_ext = 480;
	private static int default_y_forward1_ext = 306;

	private static int default_x_forward2_ext = 500;
	private static int default_y_forward2_ext = 150;
	
	private static int default_x_forward3_ext = 500;
	private static int default_y_forward3_ext = 450;
	
	
	
	public static int getDefault_x_goalkeeper_dom() {
		return default_x_goalkeeper_dom;
	}

	public static void setDefault_x_goalkeeper_dom(int default_x_goalkeeper_dom) {
		KickoffPlacement.default_x_goalkeeper_dom = default_x_goalkeeper_dom;
	}

	public static int getDefault_y_goalkeeper_dom() {
		return default_y_goalkeeper_dom;
	}

	public static void setDefault_y_goalkeeper_dom(int default_y_goalkeeper_dom) {
		KickoffPlacement.default_y_goalkeeper_dom = default_y_goalkeeper_dom;
	}

	public static int getDefault_x_defender1_dom() {
		return default_x_defender1_dom;
	}

	public static void setDefault_x_defender1_dom(int default_x_defender1_dom) {
		KickoffPlacement.default_x_defender1_dom = default_x_defender1_dom;
	}

	public static int getDefault_y_defender1_dom() {
		return default_y_defender1_dom;
	}

	public static void setDefault_y_defender1_dom(int default_y_defender1_dom) {
		KickoffPlacement.default_y_defender1_dom = default_y_defender1_dom;
	}

	public static int getDefault_x_defender2_dom() {
		return default_x_defender2_dom;
	}

	public static void setDefault_x_defender2_dom(int default_x_defender2_dom) {
		KickoffPlacement.default_x_defender2_dom = default_x_defender2_dom;
	}

	public static int getDefault_y_defender2_dom() {
		return default_y_defender2_dom;
	}

	public static void setDefault_y_defender2_dom(int default_y_defender2_dom) {
		KickoffPlacement.default_y_defender2_dom = default_y_defender2_dom;
	}

	public static int getDefault_x_defender3_dom() {
		return default_x_defender3_dom;
	}

	public static void setDefault_x_defender3_dom(int default_x_defender3_dom) {
		KickoffPlacement.default_x_defender3_dom = default_x_defender3_dom;
	}

	public static int getDefault_y_defender3_dom() {
		return default_y_defender3_dom;
	}

	public static void setDefault_y_defender3_dom(int default_y_defender3_dom) {
		KickoffPlacement.default_y_defender3_dom = default_y_defender3_dom;
	}

	public static int getDefault_x_defender4_dom() {
		return default_x_defender4_dom;
	}

	public static void setDefault_x_defender4_dom(int default_x_defender4_dom) {
		KickoffPlacement.default_x_defender4_dom = default_x_defender4_dom;
	}

	public static int getDefault_y_defender4_dom() {
		return default_y_defender4_dom;
	}

	public static void setDefault_y_defender4_dom(int default_y_defender4_dom) {
		KickoffPlacement.default_y_defender4_dom = default_y_defender4_dom;
	}

	public static int getDefault_x_midfielder1_dom() {
		return default_x_midfielder1_dom;
	}

	public static void setDefault_x_midfielder1_dom(int default_x_midfielder1_dom) {
		KickoffPlacement.default_x_midfielder1_dom = default_x_midfielder1_dom;
	}

	public static int getDefault_y_midfielder1_dom() {
		return default_y_midfielder1_dom;
	}

	public static void setDefault_y_midfielder1_dom(int default_y_midfielder1_dom) {
		KickoffPlacement.default_y_midfielder1_dom = default_y_midfielder1_dom;
	}

	public static int getDefault_x_midfielder2_dom() {
		return default_x_midfielder2_dom;
	}

	public static void setDefault_x_midfielder2_dom(int default_x_midfielder2_dom) {
		KickoffPlacement.default_x_midfielder2_dom = default_x_midfielder2_dom;
	}

	public static int getDefault_y_midfielder2_dom() {
		return default_y_midfielder2_dom;
	}

	public static void setDefault_y_midfielder2_dom(int default_y_midfielder2_dom) {
		KickoffPlacement.default_y_midfielder2_dom = default_y_midfielder2_dom;
	}

	public static int getDefault_x_midfielder3_dom() {
		return default_x_midfielder3_dom;
	}

	public static void setDefault_x_midfielder3_dom(int default_x_midfielder3_dom) {
		KickoffPlacement.default_x_midfielder3_dom = default_x_midfielder3_dom;
	}

	public static int getDefault_y_midfielder3_dom() {
		return default_y_midfielder3_dom;
	}

	public static void setDefault_y_midfielder3_dom(int default_y_midfielder3_dom) {
		KickoffPlacement.default_y_midfielder3_dom = default_y_midfielder3_dom;
	}

	public static int getDefault_x_forward1_dom() {
		return default_x_forward1_dom;
	}

	public static void setDefault_x_forward1_dom(int default_x_forward1_dom) {
		KickoffPlacement.default_x_forward1_dom = default_x_forward1_dom;
	}

	public static int getDefault_y_forward1_dom() {
		return default_y_forward1_dom;
	}

	public static void setDefault_y_forward1_dom(int default_y_forward1_dom) {
		KickoffPlacement.default_y_forward1_dom = default_y_forward1_dom;
	}

	public static int getDefault_x_forward2_dom() {
		return default_x_forward2_dom;
	}

	public static void setDefault_x_forward2_dom(int default_x_forward2_dom) {
		KickoffPlacement.default_x_forward2_dom = default_x_forward2_dom;
	}

	public static int getDefault_y_forward2_dom() {
		return default_y_forward2_dom;
	}

	public static void setDefault_y_forward2_dom(int default_y_forward2_dom) {
		KickoffPlacement.default_y_forward2_dom = default_y_forward2_dom;
	}

	public static int getDefault_x_forward3_dom() {
		return default_x_forward3_dom;
	}

	public static void setDefault_x_forward3_dom(int default_x_forward3_dom) {
		KickoffPlacement.default_x_forward3_dom = default_x_forward3_dom;
	}

	public static int getDefault_y_forward3_dom() {
		return default_y_forward3_dom;
	}

	public static void setDefault_y_forward3_dom(int default_y_forward3_dom) {
		KickoffPlacement.default_y_forward3_dom = default_y_forward3_dom;
	}

	public static int getDefault_x_goalkeeper_ext() {
		return default_x_goalkeeper_ext;
	}

	public static void setDefault_x_goalkeeper_ext(int default_x_goalkeeper_ext) {
		KickoffPlacement.default_x_goalkeeper_ext = default_x_goalkeeper_ext;
	}

	public static int getDefault_y_goalkeeper_ext() {
		return default_y_goalkeeper_ext;
	}

	public static void setDefault_y_goalkeeper_ext(int default_y_goalkeeper_ext) {
		KickoffPlacement.default_y_goalkeeper_ext = default_y_goalkeeper_ext;
	}

	public static int getDefault_x_defender1_ext() {
		return default_x_defender1_ext;
	}

	public static void setDefault_x_defender1_ext(int default_x_defender1_ext) {
		KickoffPlacement.default_x_defender1_ext = default_x_defender1_ext;
	}

	public static int getDefault_y_defender1_ext() {
		return default_y_defender1_ext;
	}

	public static void setDefault_y_defender1_ext(int default_y_defender1_ext) {
		KickoffPlacement.default_y_defender1_ext = default_y_defender1_ext;
	}

	public static int getDefault_x_defender2_ext() {
		return default_x_defender2_ext;
	}

	public static void setDefault_x_defender2_ext(int default_x_defender2_ext) {
		KickoffPlacement.default_x_defender2_ext = default_x_defender2_ext;
	}

	public static int getDefault_y_defender2_ext() {
		return default_y_defender2_ext;
	}

	public static void setDefault_y_defender2_ext(int default_y_defender2_ext) {
		KickoffPlacement.default_y_defender2_ext = default_y_defender2_ext;
	}

	public static int getDefault_x_defender3_ext() {
		return default_x_defender3_ext;
	}

	public static void setDefault_x_defender3_ext(int default_x_defender3_ext) {
		KickoffPlacement.default_x_defender3_ext = default_x_defender3_ext;
	}

	public static int getDefault_y_defender3_ext() {
		return default_y_defender3_ext;
	}

	public static void setDefault_y_defender3_ext(int default_y_defender3_ext) {
		KickoffPlacement.default_y_defender3_ext = default_y_defender3_ext;
	}

	public static int getDefault_x_defender4_ext() {
		return default_x_defender4_ext;
	}

	public static void setDefault_x_defender4_ext(int default_x_defender4_ext) {
		KickoffPlacement.default_x_defender4_ext = default_x_defender4_ext;
	}

	public static int getDefault_y_defender4_ext() {
		return default_y_defender4_ext;
	}

	public static void setDefault_y_defender4_ext(int default_y_defender4_ext) {
		KickoffPlacement.default_y_defender4_ext = default_y_defender4_ext;
	}

	public static int getDefault_x_midfielder1_ext() {
		return default_x_midfielder1_ext;
	}

	public static void setDefault_x_midfielder1_ext(int default_x_midfielder1_ext) {
		KickoffPlacement.default_x_midfielder1_ext = default_x_midfielder1_ext;
	}

	public static int getDefault_y_midfielder1_ext() {
		return default_y_midfielder1_ext;
	}

	public static void setDefault_y_midfielder1_ext(int default_y_midfielder1_ext) {
		KickoffPlacement.default_y_midfielder1_ext = default_y_midfielder1_ext;
	}

	public static int getDefault_x_midfielder2_ext() {
		return default_x_midfielder2_ext;
	}

	public static void setDefault_x_midfielder2_ext(int default_x_midfielder2_ext) {
		KickoffPlacement.default_x_midfielder2_ext = default_x_midfielder2_ext;
	}

	public static int getDefault_y_midfielder2_ext() {
		return default_y_midfielder2_ext;
	}

	public static void setDefault_y_midfielder2_ext(int default_y_midfielder2_ext) {
		KickoffPlacement.default_y_midfielder2_ext = default_y_midfielder2_ext;
	}

	public static int getDefault_x_midfielder3_ext() {
		return default_x_midfielder3_ext;
	}

	public static void setDefault_x_midfielder3_ext(int default_x_midfielder3_ext) {
		KickoffPlacement.default_x_midfielder3_ext = default_x_midfielder3_ext;
	}

	public static int getDefault_y_midfielder3_ext() {
		return default_y_midfielder3_ext;
	}

	public static void setDefault_y_midfielder3_ext(int default_y_midfielder3_ext) {
		KickoffPlacement.default_y_midfielder3_ext = default_y_midfielder3_ext;
	}

	public static int getDefault_x_forward1_ext() {
		return default_x_forward1_ext;
	}

	public static void setDefault_x_forward1_ext(int default_x_forward1_ext) {
		KickoffPlacement.default_x_forward1_ext = default_x_forward1_ext;
	}

	public static int getDefault_y_forward1_ext() {
		return default_y_forward1_ext;
	}
	public static void setDefault_y_forward1_ext(int default_y_forward1_ext) {
		KickoffPlacement.default_y_forward1_ext = default_y_forward1_ext;
	}

	public static int getDefault_x_forward2_ext() {
		return default_x_forward2_ext;
	}

	public static void setDefault_x_forward2_ext(int default_x_forward2_ext) {
		KickoffPlacement.default_x_forward2_ext = default_x_forward2_ext;
	}

	public static int getDefault_y_forward2_ext() {
		return default_y_forward2_ext;
	}

	public static void setDefault_y_forward2_ext(int default_y_forward2_ext) {
		KickoffPlacement.default_y_forward2_ext = default_y_forward2_ext;
	}

	public static int getDefault_x_forward3_ext() {
		return default_x_forward3_ext;
	}

	public static void setDefault_x_forward3_ext(int default_x_forward3_ext) {
		KickoffPlacement.default_x_forward3_ext = default_x_forward3_ext;
	}

	public static int getDefault_y_forward3_ext() {
		return default_y_forward3_ext;
	}

	public static void setDefault_y_forward3_ext(int default_y_forward3_ext) {
		KickoffPlacement.default_y_forward3_ext = default_y_forward3_ext;
	}

	public static void placeKickoffPositions(Team team_dom, Team team_ext, String kickoff_side) {
	
		// Home Team
		
		// Goalkeeper
		
		team_dom.getSquad().get(0).setX(default_x_goalkeeper_dom) ;
		team_dom.getSquad().get(0).setY(default_y_goalkeeper_dom) ;
		
		// Defender
		
		team_dom.getSquad().get(1).setX(default_x_defender1_dom) ;
		team_dom.getSquad().get(1).setY(default_y_defender1_dom) ;
		
		team_dom.getSquad().get(2).setX(default_x_defender2_dom) ;
		team_dom.getSquad().get(2).setY(default_y_defender2_dom) ;
		
		team_dom.getSquad().get(3).setX(default_x_defender3_dom) ;
		team_dom.getSquad().get(3).setY(default_y_defender3_dom) ;
		
		team_dom.getSquad().get(4).setX(default_x_defender4_dom) ;
		team_dom.getSquad().get(4).setY(default_y_defender4_dom) ;
		
		// Midfielder
		
		team_dom.getSquad().get(5).setX(default_x_midfielder1_dom) ;
		team_dom.getSquad().get(5).setY(default_y_midfielder1_dom) ;
		
		team_dom.getSquad().get(6).setX(default_x_midfielder2_dom) ;
		team_dom.getSquad().get(6).setY(default_y_midfielder2_dom) ;
		
		team_dom.getSquad().get(7).setX(default_x_midfielder3_dom) ;
		team_dom.getSquad().get(7).setY(default_y_midfielder3_dom) ;
		
		// Forward
		
		if (kickoff_side == "ext") {
			
			team_dom.getSquad().get(8).setX(default_x_forward1_dom) ;
			team_dom.getSquad().get(8).setY(default_y_forward1_dom) ;
			
		}
		
		team_dom.getSquad().get(9).setX(default_x_forward2_dom) ;
		team_dom.getSquad().get(9).setY(default_y_forward2_dom) ;
		
		team_dom.getSquad().get(10).setX(default_x_forward3_dom) ;
		team_dom.getSquad().get(10).setY(default_y_forward3_dom) ;
		
		
		
		// Away Team
		
		// Goalkeeper
		
		team_ext.getSquad().get(0).setX(default_x_goalkeeper_ext) ;
		team_ext.getSquad().get(0).setY(default_y_goalkeeper_ext) ;
		
		// Defender
		
		team_ext.getSquad().get(1).setX(default_x_defender1_ext) ;
		team_ext.getSquad().get(1).setY(default_y_defender1_ext) ;
		
		team_ext.getSquad().get(2).setX(default_x_defender2_ext) ;
		team_ext.getSquad().get(2).setY(default_y_defender2_ext) ;
		
		team_ext.getSquad().get(3).setX(default_x_defender3_ext) ;
		team_ext.getSquad().get(3).setY(default_y_defender3_ext) ;
		
		team_ext.getSquad().get(4).setX(default_x_defender4_ext) ;
		team_ext.getSquad().get(4).setY(default_y_defender4_ext) ;
		
		// Midfielder
		
		team_ext.getSquad().get(5).setX(default_x_midfielder1_ext) ;
		team_ext.getSquad().get(5).setY(default_y_midfielder1_ext) ;
		
		team_ext.getSquad().get(6).setX(default_x_midfielder2_ext) ;
		team_ext.getSquad().get(6).setY(default_y_midfielder2_ext) ;
		
		team_ext.getSquad().get(7).setX(default_x_midfielder3_ext) ;
		team_ext.getSquad().get(7).setY(default_y_midfielder3_ext) ;
		
		// Forward
		
		if (kickoff_side == "dom") {
			
			team_ext.getSquad().get(8).setX(default_x_forward1_ext) ;
			team_ext.getSquad().get(8).setY(default_y_forward1_ext) ;
			
		}
		
		team_ext.getSquad().get(9).setX(default_x_forward2_ext) ;
		team_ext.getSquad().get(9).setY(default_y_forward2_ext) ;
		
		team_ext.getSquad().get(10).setX(default_x_forward3_ext) ;
		team_ext.getSquad().get(10).setY(default_y_forward3_ext) ;
			
				
	}


}
