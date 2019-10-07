package fr.dauphine.ja.bahthiernomoussa.shapes;

/**
 * Hello world!
 *
 */
public class Point 
{
	
	private int x;
	private int y;
	
	static int nbre_points;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		
		nbre_points++;
	}
	
	public Point(Point p) {
		p = new Point(this.x, this.y);
	}
    public static void main( String[] args )
    {
        //Point p = new Point();
        
        //System.out.println(p.x+" "+p.y);
    }
}
