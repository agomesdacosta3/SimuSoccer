package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import data.Player;
import data.Team;

public class Player17 extends JFrame{
	private String name = "17";
	private JPanel panel = new JPanel();
	private JLabel label = new JLabel("Caract�ristique");
	private JTextArea h;

	public Player17() {
		
		this.setTitle("Joueur 17");
		this.setSize(500,500);
		h = new JTextArea(10,50);
		h.setText(toString(name));
		
		panel.add(label);
		panel.add(h);
		  
		 
		  this.setContentPane(panel);
	} 
	
	public String toString(String name) {
		Team.createteams();
		String result = "";
			for(int i = 0; i < Team.players2.size(); i++) { 
	    		if(Team.players2.get(i).getName().equals(name)) {
	    			result = Team.players2.get(i).toString();
	    		}
	    	}
			return result;
		}

}
