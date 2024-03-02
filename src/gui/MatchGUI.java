package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import chrono.Chronometer;
import chrono.CyclicCounter;

import process.Match;

/**
 * Main GUI class for chronometer.
 * 
 * @author
 **/
public class MatchGUI extends JFrame implements Runnable {
	
	//private static final Dimension IDEAL_MAIN_DIMENSION = new Dimension(1100, 800);
	private static final Dimension IDEAL_DASHBOARD_DIMENSION = new Dimension(900, 650);

	private static Font font = new Font(Font.MONOSPACED, Font.BOLD, 20);

	/**
	 * The normal speed is 1000, e.q. one refresh per second (1000 milliseconds).
	 */
	private static final int CHRONO_SPEED = 500;

	public Chronometer getChronometer() {
		return chronometer;
	}

	private static final long serialVersionUID = 1L;

	/**
	 * The core functional part : the chronometer.
	 */
	private Chronometer chronometer = new Chronometer();

	private JButton startButton = new JButton(" Start ");
	//private JButton clearButton = new JButton(" Clear ");
	
	/**
	 * The dashboard part is managed in a separate class.
	 */
	private Dashboard dashboard = new Dashboard();
	
	private JLabel score_squad_dom_label = new JLabel(dashboard.getTeam_dom().getDashboardNameTeam());
	private JLabel score_separator_label = new JLabel("-");
	private JLabel score_space_label = new JLabel(" ");
    private JLabel score_squad_ext_label = new JLabel(dashboard.getTeam_ext().getDashboardNameTeam());

    private JLabel score_squad_dom_value = new JLabel(String.valueOf(dashboard.getTeam_dom().getScoreTeam()));
    private JLabel score_squad_ext_value = new JLabel(String.valueOf(dashboard.getTeam_ext().getScoreTeam()));

	private JLabel minuteLabel = new JLabel("Minute:");
	private JLabel secondLabel = new JLabel("Second:");

	private JLabel minuteValue = new JLabel("");
	private JLabel secondValue = new JLabel("");

	private JPanel control = new JPanel();
	
	private Match match = new Match(dashboard.getTeam_dom(), dashboard.getTeam_ext(), 90, dashboard.getBall());

	/**
	 * This instance is used in the inner classes for different action listeners.
	 */
	private MatchGUI instance = this;

	/**
	 * Initial status of for the start button.
	 */
	private boolean stop = true;

	public MatchGUI(String title) {
		super(title);
		init();
	}

	private void init() {
		
		dashboard.getTeam_dom().createSquad("dom");
		dashboard.getTeam_ext().createSquad("ext");
		
		match.firstEngagement();

		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		score_squad_dom_label.setFont(font);
        control.add(score_squad_dom_label);
        
        score_space_label.setFont(font);
        control.add(score_space_label);
        
        score_squad_dom_value.setFont(font);
        control.add(score_squad_dom_value);
        
        score_space_label.setFont(font);
        control.add(score_space_label);
        
        score_separator_label.setFont(font);
        control.add(score_separator_label);
        
        score_space_label.setFont(font);
        control.add(score_space_label);
              
        score_squad_ext_value.setFont(font);
        control.add(score_squad_ext_value);
        
        score_space_label.setFont(font);
        control.add(score_space_label);
        
        score_squad_ext_label.setFont(font);
        control.add(score_squad_ext_label);
        
        score_space_label.setFont(font);
        control.add(score_space_label);
        
		control.setLayout(new FlowLayout(FlowLayout.CENTER));

		minuteLabel.setFont(font);
		control.add(minuteLabel);
		minuteValue.setFont(font);
		control.add(minuteValue);

		secondLabel.setFont(font);
		control.add(secondLabel);
		secondValue.setFont(font);
		control.add(secondValue);

		startButton.setFont(font);
		startButton.addActionListener(new StartStopAction());
		control.add(startButton);

		/*clearButton.setFont(font);
		clearButton.addActionListener(new ClearAction());
		control.add(clearButton);*/

		contentPane.add(BorderLayout.NORTH, control);

		dashboard.setPreferredSize(IDEAL_DASHBOARD_DIMENSION);
		contentPane.add(BorderLayout.SOUTH, dashboard);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		setPreferredSize(new Dimension(900, 650));
		setResizable(false);
	}

	private void updateValues() {
		
		// this part is for textual score printing.
		
		/* Match scoreteam1 = match.getScore();
		scoreteam1Value.setText(scoreteam1.toString() + " ");
		
		Match scoreteam2 = match.getScore();
		scoreteam2Value.setText(scoreteam2.toString() + " "); */
		
		// This part is for textual time printing.
	
		CyclicCounter minute = chronometer.getMinute();
		minuteValue.setText(minute.toString() + " ");

		CyclicCounter second = chronometer.getSecond();
		secondValue.setText(second.toString() + " ");
		
		// Test mouvement
		
		//dashboard.getTeam_dom().getSquad().get(0).setX(dashboard.getTeam_dom().getSquad().get(0).getX()+ 10);
				

		// The dashboard needs to be reprinted when hour, minute or second values change.*/
		
		dashboard.repaint();
	}

	/**
	 * Defines what to do for each time unit (by default 1 second) : it increments the chronometer
	 */
	@Override
	public void run() {
		while (!stop) {
			try {
				Thread.sleep(CHRONO_SPEED);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			chronometer.increment();
			
			// Ensure that the chronometer is not stopped during the iteration.
			if (!stop) {
				updateValues();
				//ChangePlayers(chronometer);
			}
		}
	}
	
	private class StartStopAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (!stop) {
				stop = true;
				startButton.setText(" Start ");
			} else {
				stop = false;
				startButton.setText(" Pause ");
				Thread chronoThread = new Thread(instance);
				chronoThread.start();
				
			//	Ball ballon = new Ball(250,150);
			//	Pass.get_Player_Ball(ballon,Team.squad_dom,Team.squad_ext );
			//	Pass.pass_sequence(ballon,Team.squad_dom,Team.squad_ext );
			}
		}
	}

	/*
	private class ClearAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			stop = true;
			startButton.setText(" Start ");
			chronometer.init();
			updateValues();
		}

	}
	*/ 
	 
	public static void main(String[] args) {
		new MatchGUI("Simu soccer");
	}

}
