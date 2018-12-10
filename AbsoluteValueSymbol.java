package sdc;

import java.util.Stack;

public class AbsoluteValueSymbol implements Symbol {

	@Override
	public boolean parse(String s) {
		return s.equals("||");
	}

	@Override
	public void execute(Stack<Value> s) throws ShutdownException, IncompatibleTypeException {
		// TODO Auto-generated method stub
		System.out.println(s.pop().abs());
	}

}
