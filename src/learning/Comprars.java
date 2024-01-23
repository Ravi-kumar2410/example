package learning;
import java.util.Arrays;
//import java.util.EventObject;
class Circle implements Comparable
{
	int radious;
	Circle(int r){
          radious=r;
	}
	public int compareTo(Object o)
	{
		return radious-((Circle)o).radious;
	}
	public String toString()
	{
		return"circle radious="+radious+"]";
	}
}
public class Comprars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle[]arr= {  new Circle(40),
						new Circle(20),
						new Circle(10),
						new Circle(60),
						new Circle(30),
						new Circle(80),
		};
		Arrays.sort(arr);
		for(Circle c:arr)
		{
			System.out.println(c);
		}
	}

}
