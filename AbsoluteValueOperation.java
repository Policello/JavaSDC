package sdc;

public class AbsoluteValueOperation extends UnaryOperation {

	@Override
	public boolean parse(String s) {
		// TODO Auto-generated method stub
		return s.equals("||");
	}

	@Override
	public Value compute(Value v1) throws IncompatibleTypeException {
		// TODO Auto-generated method stub
		return v1.abs();
	}

}
