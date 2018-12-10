package sdc;

public class RationalValue extends Value{

	private int N;
	private int D;

	public RationalValue () {
		this.N = 0;
		this.D = 1;
	}

	public RationalValue (int n, int d){
		this.N = n;
		this.D = d;
	}


	@Override
	public boolean parse(String s) {
		// TODO Auto-generated method stub
		if (s.matches("^-?[0-9]+#-?[0-9]+$")) {

			this.N = Integer.parseInt(s.split("#")[0]);
			this.D = Integer.parseInt(s.split("#")[1]);
			
			if (this.D == 0) {
				System.out.println("Division par 0");
				return false;
			}
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public Value multiply(Value v) throws IncompatibleTypeException {
		// TODO Auto-generated method stub
		if (!(v instanceof RationalValue)) {
			throw new IncompatibleTypeException ("Types incompatibles");
		}
		else {
			return new RationalValue(this.N * ((RationalValue) v).N,this.D * ((RationalValue) v).D );
		}

	}

	@Override
	public Value divide(Value v) throws IncompatibleTypeException {
		// TODO Auto-generated method stub
		if (!(v instanceof RationalValue)) {
			throw new IncompatibleTypeException ("Types incompatibles");
		}
		else {
			return new RationalValue(this.N * ((RationalValue) v).D, this.D * ((RationalValue) v).N );
		}

	}

	@Override
	public Value add(Value v) throws IncompatibleTypeException {
		// TODO Auto-generated method stub
		if (!(v instanceof RationalValue)) {
			throw new IncompatibleTypeException ("Types incompatibles");
		}
		else {
			int numV = ((RationalValue) v).N;
			int	denV = 	((RationalValue) v).D;
			int numRes = this.N *denV + numV*this.D;
			int denRes = this.D * denV;
			return new RationalValue(numRes,denRes);
		}
	}

	@Override
	public Value substract(Value v) throws IncompatibleTypeException {
		// TODO Auto-generated method stub
		if (!(v instanceof RationalValue)) {
			throw new IncompatibleTypeException ("Types incompatibles");
		}
		else {
			int numV = ((RationalValue) v).N;
			int	denV = 	((RationalValue) v).D;
			int numRes = this.N *denV - numV*this.D;
			int denRes = this.D * denV;
			return new RationalValue(numRes,denRes);
		}
	}

	@Override
	public Value abs() {
		
		if (this.N < 0 && this.D < 0) {
			return new RationalValue(this.N, this.D);
		}
		else {
			if (this.N < 0) {
				return new RationalValue(-1 * this.N, this.D);
			}
			else if (this.D < 0) {
				return new RationalValue(-1 * this.N, this.D);
			}
		}
		return new RationalValue(this.N, this.D);
		
	}

	
	//Renvoie le rationnel reduit
	//Pas active car les tests ne sont pas configures pour
	private RationalValue reduce () {
		int pgcd = pgcd (this.N, this.D);
		return new RationalValue (this.N / pgcd, this.D / pgcd);
	}

	private int pgcd(int a, int b) {
		return b == 0 ? a : pgcd(b, a % b);
	}

	public String toString() {
		return (this.N+"#"+this.D);
	}

	@Override
	public Value inferior(Value v) throws IncompatibleTypeException {
		// TODO Auto-generated method stub
		double n = ((RationalValue) v).N;
		double d = ((RationalValue) v).N;
		double N = this.N;
		double D = this.D;
		return new BooleanValue((N/D) > (n/d) );
	}

	@Override
	public Value superior(Value v) throws IncompatibleTypeException {
		// remet au meme denominateur et compare les toString
		double n = ((RationalValue) v).N;
		double d = ((RationalValue) v).N;
		double N = this.N;
		double D = this.D;
		return new BooleanValue((N/D) < (n/d) );
	}

	@Override
	public Value equals(Value v) throws IncompatibleTypeException {
		// remet au meme denominateur et compare les toString
		double n = ((RationalValue) v).N;
		double d = ((RationalValue) v).D;
		double N = this.N;
		double D = this.D;
		return new BooleanValue((n/d) == (N/D));
	}

}
