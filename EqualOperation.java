package sdc;

public class EqualOperation extends BinaryOperation {

	@Override
	public boolean parse(String s) {
		// TODO Auto-generated method stub
		return s.equals("=");
	}

	@Override
	public Value compute(Value v1, Value v2) throws IncompatibleTypeException {
		// TODO Auto-generated method stub
		return new BooleanValue(v1.equals(v2));
	}
	
}