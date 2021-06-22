
public class Point2d{
	private double xCord;
	private double yCord;
	
	public Point2d() {
		xCord = 0;
		yCord = 0;
	}
	
	public Point2d(double x, double y) {
		xCord = x;
		yCord = y;
	}
	
	public double getX() {
		return xCord;
	}
	public double getY() {
		return yCord;
	}
	
	public void setX(double x) {
		xCord = x;
	}
	public void setY(double y) {
		yCord = y;
	}
}