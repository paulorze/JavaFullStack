package mjsd3;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {		
		ArrayList <Flier> Fliers = new ArrayList<>();
		Flier Plane1 = new Plane();
		Flier Plane2 = new Plane();
		Flier Helicopter1 = new Helicopter();
		Flier Helicopter2 = new Helicopter();
		Flier Balloon1 = new Balloon();
		Flier Balloon2 = new Balloon();
		Flier Plane3 = new Plane();
		
		Fliers.add(Plane1);
		Fliers.add(Plane2);
		Fliers.add(Helicopter1);
		Fliers.add(Helicopter2);
		Fliers.add(Balloon1);
		Fliers.add(Balloon2);
		Fliers.add(Plane3);
		
		Operator Operator = new Operator();
		
		for (Flier Flier : Fliers) {
			Operator.authorizeLanding(Flier);
		};
	}
}
