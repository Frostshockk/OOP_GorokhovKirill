
public class Lab4{
	public static void main(String args[]){
		Point3d point1 = new Point3d(3, 2, 6);
		Point3d point2 = new Point3d(1, 7, 2);
		Point3d point3 = new Point3d(2, 0, 4);
		
		double s = computeArea(point1, point2, point3);
				
		System.out.println("Triangle area = " + s);
	}
	// метод поиска площади треугольника по 3-м вершинам
	public static double computeArea(Point3d p1, Point3d p2, Point3d p3)	{
		double st1 = p1.distanceTo(p2);
		double st2 = p2.distanceTo(p3);
		double st3 = p3.distanceTo(p1);
		double p = (st1 + st2 + st3) / 2;
		
		double s = Math.sqrt(p * (p - st1) * (p - st2) * (p - st3));
		
		double scale = Math.pow(10, 3);
		s *= scale;
		s = Math.round(s) / scale;
		
		return s;
	}
}