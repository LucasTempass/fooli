package tac;

public enum Operation {
	ADD, MUL, ASSIGN, GOTO, WHILE, IF, LABEL, NOT, NEG, LT, LE, GT, GE, EQ, NE, OR, AND;

	static Operation getOp(String op) {
		switch (op) {
			case "+":
				return ADD;
			case "*":
				return MUL;
			case "=":
				return ASSIGN;
			case "goto":
				return GOTO;
			case "if":
				return IF;
			case "label":
				return LABEL;
			case "!":
				return NOT;
			case "-":
				return NEG;
			case "<":
				return LT;
			case "<=":
				return LE;
			case ">":
				return GT;
			case ">=":
				return GE;
			case "==":
				return EQ;
			case "!=":
				return NE;
			case "||":
				return OR;
			case "&&":
				return AND;
			default:
				throw new IllegalArgumentException("Unknown operation: " + op);
		}
	}

}
