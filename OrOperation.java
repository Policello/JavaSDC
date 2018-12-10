package sdc;

public class OrOperation extends BinaryOperation {

	@Override
	public boolean parse(String s) {
		// TODO Auto-generated method stub
		return s.equals("|");
	}

	@Override
	public Value compute(Value v1, Value v2) throws IncompatibleTypeException {
		// TODO Auto-generated method stub
		return ((BooleanValue) v1).or((BooleanValue) v2);
	}
	
}
