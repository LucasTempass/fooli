package tac;

public class Instruction {
	Operation op;
	Operand result;
	Operand arg1;
	Operand arg2;
	String label;

	Instruction(Operation op, Operand result, Operand arg1, Operand arg2) {
		this.op = op;
		this.result = result;
		this.arg1 = arg1;
		this.arg2 = arg2;
	}

	Instruction(Operation op, Operand result, Operand arg1) {
		this(op, result, arg1, null);
	}

	Instruction(Operation op, String label) {
		this.op = op;
		this.label = label;
	}

	@Override
	public String toString() {
		if (op == Operation.GOTO || op == Operation.LABEL) {
			return op + " " + label;
		} else if (arg2 != null) {
			return result + " = " + arg1 + " " + op + " " + arg2;
		} else {
			return result + " = " + arg1;
		}
	}

}
