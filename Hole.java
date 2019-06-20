
public class Hole {
	Vector point;
	double radius;
	
	public Hole(Vector point, double radius)
	{
		this.point = point;
		this.radius= radius;
	}
	public boolean isInHole(Vector pointOfContact)
	{
		if (Vector.pointsToVector(point, pointOfContact).vecLength() < radius)
		{
			//System.out.println("Asdf");
			return true;
		}
		return false;
	}
}
