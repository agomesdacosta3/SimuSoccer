package data;

public class Ball {
	
	private double positionx_Ball = 450 ;
	private double positiony_Ball = 450 ;


	public double getPositionx_Ball() {
		return positionx_Ball;
	}

	public Ball(double positionx_Ball, double positiony_Ball) {
		super();
		this.positionx_Ball = positionx_Ball;
		this.positiony_Ball = positiony_Ball;
	}

	public void setPositionx_Ball(double positionx_Ball) {
		this.positionx_Ball = positionx_Ball;
	}

	public double getPositiony_Ball() {
		return positiony_Ball;
	}

	public void setPositiony_Ball(double positiony_Ball) {
		this.positiony_Ball = positiony_Ball;
	}
}
