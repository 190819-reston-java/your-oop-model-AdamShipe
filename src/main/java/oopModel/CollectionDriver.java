package oopModel;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.nio.file.Paths;

public class CollectionDriver {
	

	public static int request;

	private static Scanner myScan = new Scanner(System.in);

	public static void main(String[] args) {	

		//Collection of Velociraptors		
		RaptorPack pack1 = new RaptorPack();
		
		pack1.add(new Velociraptor("Sharon", true));
		pack1.add(new Velociraptor("Harold", false));
		pack1.add(new Velociraptor("Zeke", true));
		pack1.add(new Velociraptor("Lola", true));
		pack1.add(new Velociraptor("Eddy", true));

		System.out.println("Meet the friendly pack of velociraptors:");
		for(int i = 0; i<pack1.size(); i++) {
			System.out.println(" "+pack1.get(i));
		}
		System.out.println('\n'+"The " + pack1.size() + " of them are going on the hunt"+'\n');
		

		//Modifying list
		System.out.println(pack1.get(0).getName()+" was stepped on by a brontosaurus");
		pack1.remove(0);

		String recentlyDead = pack1.get(0).getName();
		System.out.println(pack1.get(0).getName()+" fell into an active volcano");
		pack1.remove(0);

		System.out.println(pack1.get(0).getName()+" died following " + recentlyDead);
		pack1.remove(0);
		pack1.add(new Velociraptor("Jason", true));
		pack1.add(new Velociraptor("Sue", true));
		System.out.println('\n'+ "     ...that leaves: " + pack1.size() + " in the velociraptor pack" + '\n'+'\n');
		


		//Sorted by name
		System.out.println("...who is left?");
		System.out.println("Everyone stand to the right of someone younger than you!");
		SortedSet<Velociraptor> sortedPack1 = new TreeSet<Velociraptor>(new RaptorRank());
		sortedPack1.addAll(pack1);		
		System.out.println(sortedPack1);
		
		// Tyrannosaurus class
		System.out.println('\n'+"A tyrannosaurus emerges");
		Tyrannosaurus trex1 = new Tyrannosaurus();
		System.out.println(trex1);
		trex1.hunt();
		

		
		
		//handling unchecked ArrayIndexOutOfBounds
		try {
			request = 7;
			System.out.println('\n'+"What happened to member " + request +" of the Raptor Pack?"+'\n');
			System.out.println(pack1.get(request));		
		}catch (Exception e){
			System.out.println("ERROR:  Index value too high, your raptor doesn't exist");
			System.out.println("  Let's try something lower, like index value " + request/3 +'\n');
			System.out.println(pack1.get(request/3));
			
		}

		//handling checked Exception
		System.out.println('\n' + "Let's edit your velociraptor database!");
		try {
			Path userPath = Files.createFile(Paths.get("/C/MyVelociraptorDatabase"));
		} catch (IOException e) {
			System.out.println("Sorry.  Your Velociraptor database cannot be located on the C drive");
		} finally {
			System.out.println("      -Why even live?-");
			System.exit(1);
		}

	}
	
}
