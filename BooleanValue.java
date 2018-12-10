package sdc;

public class BooleanValue extends Value {
	
	private boolean value;
	
	public BooleanValue () {
		this.value = false;
	}
	
	public BooleanValue (Value v) {
		this.value = ((BooleanValue) v).value;
	}
	
	public BooleanValue (boolean value) {
		this.value = value;
	}
	
	
	@Override
	public boolean parse(String s) {
		if (s.equals("true")) {
			this.value = true;
			return true;
		}
		else if (s.equals("false")) {
			this.value = false;
			return true;
		}
		return false;
		
	}
	
	public Value and (Value b) throws IncompatibleTypeException {
		if (!(b instanceof BooleanValue)) {
			throw new IncompatibleTypeException();
		}
		else {
			return new BooleanValue(this.value && ((BooleanValue) b).value);
		}
	}
	
	public Value or (Value b) throws IncompatibleTypeException {
		if (!(b instanceof BooleanValue)) {
			throw new IncompatibleTypeException();
		}
		else {
			return new BooleanValue(this.value || ((BooleanValue) b).value);
		}
	}
	
	public Value not () throws IncompatibleTypeException {
		return new BooleanValue(!(this.value));
	}

	@Override
	public Value multiply(Value v) throws IncompatibleTypeException{
		// TODO Auto-generated method stub
		throw new IncompatibleTypeException();
	}

	@Override
	public Value divide(Value v) throws IncompatibleTypeException {
		// TODO Auto-generated method stub
		throw new IncompatibleTypeException();
	}

	@Override
	public Value add(Value v) throws IncompatibleTypeException {
		// TODO Auto-generated method stub
		throw new IncompatibleTypeException();
	}

	@Override
	public Value substract(Value v) throws IncompatibleTypeException {
		// TODO Auto-generated method stub
		throw new IncompatibleTypeException();
	}

	@Override
	public Value abs() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		if (this.value) {
			return "true";
		}
		else {
			return "false";
		}
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
		return new BooleanValue( ((BooleanValue) v).value == this.value);
	}
	
	
	
}
