package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import data.Ball;
import data.Team;
import delimitations.Sortie;
import delimitations.Surface;

/**
 * This class manages the dashboard (minute, second) of chronometer GUI.
 * 
 * This class is only responsible of graphical result printing.
 * 
 * There is no algorithmic processing in this class.
 * 
 * @author
 * 
 */
public class Dashboard extends JPanel {
	
	private Team team_dom = new Team("Equipe Domicile", "DOM", 0);
	private Team team_ext = new Team("Equipe Extérieure", "EXT", 0);
	
	private Ball ball = new Ball(440,306) ;

	
	public Dashboard() {
		super();
	}

	private static final long serialVersionUID = 1L;

	/**
	 * Hour, minute and second have their initial positions.
	 */

	private ImageIcon icon = new ImageIcon("src/img/stade.jpg");
	Image pitch = icon.getImage();

	/**
	 * Defines what to do when the repaint() method is called.
	 */
	
	public Team getTeam_dom() {
		return team_dom;
	}

	public void setTeam_dom(Team team_dom) {
		this.team_dom = team_dom;
	}

	public Team getTeam_ext() {
		return team_ext;
	}

	public void setTeam_ext(Team team_ext) {
		this.team_ext = team_ext;
	}

	public Ball getBall() {
		return ball;
	}

	public void setBall(Ball ball) {
		this.ball = ball;
	}
	
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.drawImage(pitch, 20, 20, 850, 590, null);

		/* Test dimension */

		g.setColor(Color.BLACK);
		
		g.drawOval(ball.getPositionx_Ball(), ball.getPositiony_Ball(), 10, 10);
		g.fillOval(ball.getPositionx_Ball(), ball.getPositiony_Ball(), 10, 10);
		
		g.setColor(Color.PINK);
		
		g.drawLine(Sortie.getSortieHautGaucheX(), Sortie.getSortieHautGaucheY(), Sortie.getSortieHautDroiteX(), Sortie.getSortieHautDroiteY());
		g.drawLine(Sortie.getSortieHautGaucheX(), Sortie.getSortieHautGaucheY(), Sortie.getSortieBasGaucheX(), Sortie.getSortieBasGaucheY());
		g.drawLine(Sortie.getSortieBasDroiteX(), Sortie.getSortieBasDroiteY(), Sortie.getSortieHautDroiteX(), Sortie.getSortieHautDroiteY());
		g.drawLine(Sortie.getSortieBasGaucheX(), Sortie.getSortieBasGaucheY(), Sortie.getSortieBasDroiteX(), Sortie.getSortieBasDroiteY());
		
		g.setColor(Color.CYAN);
		
		g.drawLine(Surface.getSurfacegaucheHautGaucheX(), Surface.getSurfacegaucheHautGaucheY(), Surface.getSurfacegaucheHautDroiteX(), Surface.getSurfacegaucheHautDroiteY());
		g.drawLine(Surface.getSurfacegaucheHautGaucheX(), Surface.getSurfacegaucheHautGaucheY(), Surface.getSurfacegaucheBasGaucheX(), Surface.getSurfacegaucheBasGaucheY());
		g.drawLine(Surface.getSurfacegaucheBasDroiteX(), Surface.getSurfacegaucheBasDroiteY(), Surface.getSurfacegaucheHautDroiteX(), Surface.getSurfacegaucheHautDroiteY());
		g.drawLine(Surface.getSurfacegaucheBasGaucheX(), Surface.getSurfacegaucheBasGaucheY(), Surface.getSurfacegaucheBasDroiteX(), Surface.getSurfacegaucheBasDroiteY());
		
		g.drawLine(Surface.getSurfacedroiteHautGaucheX(), Surface.getSurfacedroiteHautGaucheY(), Surface.getSurfacedroiteHautDroiteX(), Surface.getSurfacedroiteHautDroiteY());
		g.drawLine(Surface.getSurfacedroiteHautGaucheX(), Surface.getSurfacedroiteHautGaucheY(), Surface.getSurfacedroiteBasGaucheX(), Surface.getSurfacedroiteBasGaucheY());
		g.drawLine(Surface.getSurfacedroiteBasDroiteX(), Surface.getSurfacedroiteBasDroiteY(), Surface.getSurfacedroiteHautDroiteX(), Surface.getSurfacedroiteHautDroiteY());
		g.drawLine(Surface.getSurfacedroiteBasGaucheX(), Surface.getSurfacedroiteBasGaucheY(), Surface.getSurfacedroiteBasDroiteX(), Surface.getSurfacedroiteBasDroiteY());
		
		// g.setColor(Color.ORANGE);
		
	    g.setColor(Color.BLUE);
		
		// Equipe domicile

		// Gardien

        g.drawRect(team_dom.getSquad().get(0).getX(), team_dom.getSquad().get(0).getY(), 10, 10);
        g.fillRect(team_dom.getSquad().get(0).getX(), team_dom.getSquad().get(0).getY(), 10, 10);
		
        // Défenseur
        
        g.drawRect(team_dom.getSquad().get(1).getX(), team_dom.getSquad().get(1).getY(), 10, 10);
        g.drawRect(team_dom.getSquad().get(2).getX(), team_dom.getSquad().get(2).getY(), 10, 10);
        g.drawRect(team_dom.getSquad().get(3).getX(), team_dom.getSquad().get(3).getY(), 10, 10);
        g.drawRect(team_dom.getSquad().get(4).getX(), team_dom.getSquad().get(4).getY(), 10, 10);
        g.fillRect(team_dom.getSquad().get(1).getX(), team_dom.getSquad().get(1).getY(), 10, 10);
        g.fillRect(team_dom.getSquad().get(2).getX(), team_dom.getSquad().get(2).getY(), 10, 10);
        g.fillRect(team_dom.getSquad().get(3).getX(), team_dom.getSquad().get(3).getY(), 10, 10);
        g.fillRect(team_dom.getSquad().get(4).getX(), team_dom.getSquad().get(4).getY(), 10, 10);

        // Milieu
        
        g.drawRect(team_dom.getSquad().get(5).getX(), team_dom.getSquad().get(5).getY(), 10, 10);
        g.drawRect(team_dom.getSquad().get(6).getX(), team_dom.getSquad().get(6).getY(), 10, 10);
        g.drawRect(team_dom.getSquad().get(7).getX(), team_dom.getSquad().get(7).getY(), 10, 10);
        g.fillRect(team_dom.getSquad().get(5).getX(), team_dom.getSquad().get(5).getY(), 10, 10);
        g.fillRect(team_dom.getSquad().get(6).getX(), team_dom.getSquad().get(6).getY(), 10, 10);
        g.fillRect(team_dom.getSquad().get(7).getX(), team_dom.getSquad().get(7).getY(), 10, 10);
      
       // Attaquant
        
        g.drawRect(team_dom.getSquad().get(8).getX(), team_dom.getSquad().get(8).getY(), 10, 10);
        g.drawRect(team_dom.getSquad().get(9).getX(), team_dom.getSquad().get(9).getY(), 10, 10);
        g.drawRect(team_dom.getSquad().get(10).getX(), team_dom.getSquad().get(10).getY(), 10, 10);
        g.fillRect(team_dom.getSquad().get(8).getX(), team_dom.getSquad().get(8).getY(), 10, 10);
        g.fillRect(team_dom.getSquad().get(9).getX(), team_dom.getSquad().get(9).getY(), 10, 10);
        g.fillRect(team_dom.getSquad().get(10).getX(), team_dom.getSquad().get(10).getY(), 10, 10);
        

        // Equipe extérieure
        
        g.setColor(Color.RED);
        
        // Gardien

        g.drawRect(team_ext.getSquad().get(0).getX(), team_ext.getSquad().get(0).getY(), 10, 10);
        g.fillRect(team_ext.getSquad().get(0).getX(), team_ext.getSquad().get(0).getY(), 10, 10);
		
        // Défenseur
        
        g.drawRect(team_ext.getSquad().get(1).getX(), team_ext.getSquad().get(1).getY(), 10, 10);
        g.drawRect(team_ext.getSquad().get(2).getX(), team_ext.getSquad().get(2).getY(), 10, 10);
        g.drawRect(team_ext.getSquad().get(3).getX(), team_ext.getSquad().get(3).getY(), 10, 10);
        g.drawRect(team_ext.getSquad().get(4).getX(), team_ext.getSquad().get(4).getY(), 10, 10);
        g.fillRect(team_ext.getSquad().get(1).getX(), team_ext.getSquad().get(1).getY(), 10, 10);
        g.fillRect(team_ext.getSquad().get(2).getX(), team_ext.getSquad().get(2).getY(), 10, 10);
        g.fillRect(team_ext.getSquad().get(3).getX(), team_ext.getSquad().get(3).getY(), 10, 10);
        g.fillRect(team_ext.getSquad().get(4).getX(), team_ext.getSquad().get(4).getY(), 10, 10);

        // Milieu
        
        g.drawRect(team_ext.getSquad().get(5).getX(), team_ext.getSquad().get(5).getY(), 10, 10);
        g.drawRect(team_ext.getSquad().get(6).getX(), team_ext.getSquad().get(6).getY(), 10, 10);
        g.drawRect(team_ext.getSquad().get(7).getX(), team_ext.getSquad().get(7).getY(), 10, 10);
        g.fillRect(team_ext.getSquad().get(5).getX(), team_ext.getSquad().get(5).getY(), 10, 10);
        g.fillRect(team_ext.getSquad().get(6).getX(), team_ext.getSquad().get(6).getY(), 10, 10);
        g.fillRect(team_ext.getSquad().get(7).getX(), team_ext.getSquad().get(7).getY(), 10, 10);
      
       // Attaquant
        
        g.drawRect(team_ext.getSquad().get(8).getX(), team_ext.getSquad().get(8).getY(), 10, 10);
        g.drawRect(team_ext.getSquad().get(9).getX(), team_ext.getSquad().get(9).getY(), 10, 10);
        g.drawRect(team_ext.getSquad().get(10).getX(), team_ext.getSquad().get(10).getY(), 10, 10);
        g.fillRect(team_ext.getSquad().get(8).getX(), team_ext.getSquad().get(8).getY(), 10, 10);
        g.fillRect(team_ext.getSquad().get(9).getX(), team_ext.getSquad().get(9).getY(), 10, 10);
        g.fillRect(team_ext.getSquad().get(10).getX(), team_ext.getSquad().get(10).getY(), 10, 10);
        
	}

}
