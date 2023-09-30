package mjsd3;

public class Balloon extends Flier{

	public Balloon() {
		super(false);
	}

	@Override
	public boolean compliesContract() {
		return false;
	}

	@Override
	public void setCanLand() {
		this.canLand = true;
	}

}
