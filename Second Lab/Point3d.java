
public class Point3d extends Point2d {
	private double zCord;
	
	public Point3d() {
		super(0, 0);
		zCord = 0;	
	}
	
	public Point3d(double x, double y, double z) {
		super(x, y);
		zCord = z;	
	}
	
	public double getZ(){
		return zCord;
	}
	
	public void setZ(double z) {
		zCord = z;
	}
	// метод проверка на равенство двух объектов
	public boolean isEqual(Point3d point) {
		
		boolean result;
		double x1 = this.getX();
		double x2 = point.getX();
		double y1 = this.getY();
		double y2 = point.getY();
		double z1 = this.getZ();
		double z2 = point.getZ();
		
		if ((x1 == x2) && (y1 == y2) && (z1 == z2))
			result = true;
		else
			result = false;
		return result;
	}
	// метод расчета растояния между точками
	public double distanceTo(Point3d point) {
		
		double x1 = this.getX();
		double x2 = point.getX();
		double y1 = this.getY();
		double y2 = point.getY();
		double z1 = this.getZ();
		double z2 = point.getZ();
		
		double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) + Math.pow(z1 - z2, 2));
		
		double scale = Math.pow(10, 3);
		distance *= scale;
		distance = Math.round(distance) / scale;
		
		return distance;
	}
}