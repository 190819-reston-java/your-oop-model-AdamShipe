package oopModel;

import java.util.Comparator;

public class RaptorRank implements Comparator<Velociraptor>{
	
	public int compare(Velociraptor o1, Velociraptor o2) {
		int x = 0;
		double raptor1Age = o1.getVisibleAge();
		double raptor2Age = o2.getVisibleAge();
		x = (int) (raptor1Age - raptor2Age);	
		
		if(x == 0) {
			x = o1.compareTo(o2);
		}
		return x;
	}
}
