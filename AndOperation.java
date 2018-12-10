package sdc;

public class AndOperation extends BinaryOperation {

	@Override
	public boolean parse(String s) {
		// TODO Auto-generated method stub
		return s.equals("&");
	}

	@Override
	public Value compute(Value v1, Value v2) throws IncompatibleTypeException {
		
		return ((BooleanValue) v1).and((BooleanValue) v2);
	}

}
