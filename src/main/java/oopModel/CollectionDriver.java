package oopModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CollectionDriver {

	public static void main(String[] args) {

		List<Velociraptor>raptorPack = new ArrayList<Velociraptor>();
		raptorPack.add(new Velociraptor());
		raptorPack.add(new Velociraptor("Harold", false));
		raptorPack.add(new Velociraptor("Zeke", true, 2.0f));
		raptorPack.add(new Velociraptor("Lola", true, 1.6f));
		raptorPack.add(new Velociraptor("Sharon", true, 1.9f));
		raptorPack.add(new Velociraptor("Maryanne", true, 1.8f));		
		
		 Tyrannosaurus Kelly = new Tyrannosaurus();
		 
		System.out.println(raptorPack);
		

		Map<String, Velociraptor>raptorMap = new HashMap<String, Velociraptor>();
		
		for (Velociraptor r:raptorPack) {
			System.out.println();
			System.out.print("Raptor Pack:");
			raptorMap.put(r.getName(), r);
			System.out.println();
			System.out.println(raptorMap);
		}

		System.out.println("Size of the velociraptor pack: " + Velociraptor.packSize);
		
		
	}
	
}
