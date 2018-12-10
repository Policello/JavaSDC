package sdc;

public class IntializeOperation extends BinaryOperation {

	@Override
	public boolean parse(String s) {
		// TODO Auto-generated method stub
		return s.equals("=>");
	}
	
	@Override
	public Value compute(Value v1, Value v2) throws IncompatibleTypeException {
		// TODO Auto-generated method stub
		return new VariableValue(v1, v2);
	}

}
