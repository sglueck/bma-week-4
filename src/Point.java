public class Point {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	Point() {
		this(0, 0);
	}
	
	public String toString() {
		return "Point(x:"+x+", y:"+y+")";
	}
	
	public static void main(String[] args) {
		Point[] points = new Point[]{
			new Point(10, 33),
			new Point()
		};
		System.out.println("Printing points array");
		for( Point point : points ) {
			System.out.println(point);
		}
		
		Point aPoint = points[0];
		aPoint.y = -255;
		
		System.out.println("Printing points array");
		for( Point point : points ) {
			System.out.println(point);
		}
	}
}
