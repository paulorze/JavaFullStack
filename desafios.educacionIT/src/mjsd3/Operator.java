package mjsd3;

public class Operator {
	int landedFliers;
	
	public Operator() {
		this.landedFliers = 0;
	}
	
	public void authorizeLanding(Flier Flier) {
		if (Flier.canLand && Flier.compliesContract()) {
			System.out.println("El Volador puede aterrizar en la pista 1.");
			return;
		}
		if (!Flier.compliesContract()&& this.landedFliers <= 2) {
			System.out.println("El Volador puede aterrizar en la pista 2.");
			Flier.setCanLand();
			setLandedFliers();
			return;
		}
		System.out.println("El Volador no puede aterrizar en ninguna pista");
		return;
	};
	
	private void setLandedFliers() {
		this.landedFliers += 1;
	};
}
