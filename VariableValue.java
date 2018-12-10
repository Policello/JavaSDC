package sdc;

public class VariableValue extends Value {
	
	private String name;
	private Value value;
	
	public VariableValue () {
		this.name = "";
		this.value = null;
	}
	
	public VariableValue (String name) {
		this.name = name;
	}
	
	public VariableValue (Value v) {
		this.value = v;
	}
	
	public VariableValue ( Value v1, Value v2) {
		this.name = v1.toString();
		this.value = v2;
	}
	
	@Override
	public boolean parse (String s) {
		// TODO Auto-generated method stub
		
		if (s.matches("^\\$[A-z]*$")) {
			//System.out.println(this.value.toString());
			return true;
		}
		
		return false;

	}
	
	
	public String toString() {
		return (this.value.toString());
	}
	
	
	@Override
	public Value add(Value v) throws IncompatibleTypeException {
		
		// TODO Auto-generated method stub
		if (v instanceof IntegerValue) {
			return ((IntegerValue) v).add(((IntegerValue)this.value)); 
		}
		
		else if (v instanceof RationalValue) {
			return ((RationalValue) v).add(((RationalValue)this.value)); 
		}
		
		else if (v instanceof VariableValue) {
			return new VariableValue(((VariableValue) v).value.add(this.value)); 
		}
		
		
		return null;
		
	}
	
	
	@Override
	public Value multiply(Value v) throws IncompatibleTypeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Value divide(Value v) throws IncompatibleTypeException {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public Value substract(Value v) throws IncompatibleTypeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Value abs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Value inferior(Value v) throws IncompatibleTypeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Value superior(Value v) throws IncompatibleTypeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Value equals(Value v) throws IncompatibleTypeException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
