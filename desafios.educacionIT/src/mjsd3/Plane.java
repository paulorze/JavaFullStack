package mjsd3;

public class Plane extends Flier {

	public Plane() {
		super(true);
	}

	@Override
	public boolean compliesContract() {
		return true;
	}

	@Override
	public void setCanLand() {
		this.canLand = true;
	};

}
