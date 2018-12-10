package sdc;

import java.util.ArrayList;
import java.util.Stack;

public class ViewSymbol implements Symbol{

	@Override
	public boolean parse(String s) {
		return s.equals("view");
	}

	@Override
	public void execute(Stack<Value> s) throws ShutdownException, IncompatibleTypeException {
		if (s.size() < 1) {return;}
		int count = s.size();
		for (Value v : s){
			System.out.println((count)+ " ----> "+ v+ " \n");
			count --;
		}
		
	}
	
}
