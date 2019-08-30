package oopModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RaptorPack extends ArrayList<Velociraptor> {
	
	private List<Velociraptor> ourPack = new ArrayList<Velociraptor>();
	
	public static int packSize = 0;
//	public static int casualties = 0;
	
	
	public RaptorPack() {
		// Auto-generated constructor stub
	}
	
	public int getPackSize() {
		packSize = ourPack.size();
		return packSize;
	}
	
	public void joinPack(Velociraptor name) {
		ourPack.add(name);
	}
	
	public void hunt(Tyrannosaurus rex) {
		float totalWeight=0;
//		raptorPop--;
		System.out.println("Size of the velociraptor pack: " + Velociraptor.raptorPop);
	
	}
	
//	public void death() {
//		ourPack.remove(0);
//	}
	
//	public void hunt(Tyrannosaurus rex) {
//		int deaths = 1-(packSize/2);
//		packSize=packSize/2;
//		CollectionDriver.aftermath(deaths);
//	}
	
	
//	public String roster(int i) {
//			String rosterEntry = toString(ourPack.get(i));
//			return rosterEntry;
//		}
	}


