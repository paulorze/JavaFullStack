package mjsd3;

public abstract class Flier implements IContract{
	boolean canLand;

	public Flier(boolean canLand) {
		super();
		this.canLand = canLand;
	}

	public abstract void setCanLand();
}
