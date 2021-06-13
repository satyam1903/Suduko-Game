import java.util.Objects;

public class coordinates {
	private final int X;
	private final int Y;
	public coordinates(int x, int y) {
		super();
		X = x;
		Y = y;
	}
	public int getX() {
		return X;
	}
	public int getY() {
		return Y;
	}
	@Override
	public boolean equals(Object o)
	{
		if(this==o) return true;
		if(o==null || getClass()!=o.getClass() ) return false;
		coordinates that=(coordinates) o;
		return X==that.X && Y==that.Y;
	}
	@Override
	public int hashcode()
	{
		return Objects.hash(X,Y);
	}
	

}
