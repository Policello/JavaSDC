package sdc;

public class InferiorOperation extends BinaryOperation {

	@Override
	public boolean parse(String s) {
		// TODO Auto-generated method stub
		return s.equals("<");
	}

	@Override
	public Value compute(Value v1, Value v2) throws IncompatibleTypeException {
		// TODO Auto-generated method stub
		return new BooleanValue(v1.inferior(v2));
	}
	
}
