package tac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TACGenerator {

	private final List<Instruction> instructions;
	private final Map<String, Operand> symbolTable;

	private int tempCounter;
	private int labelCounter;

	public TACGenerator() {
		symbolTable = new HashMap<>();
		instructions = new ArrayList<>();
		tempCounter = 0;
		labelCounter = 0;
	}

	private Operand newTemp() {
		return new Operand("t" + (tempCounter++));
	}

	private Operand generateLabel() {
		return new Operand("L" + (labelCounter++));
	}

	public Operand generateBinaryOp(String op, Operand arg1, Operand arg2) {
		Operand temp = newTemp();
		instructions.add(new Instruction(Operation.getOp(op), temp, arg1, arg2));
		return temp;
	}

	public Operand generateUnaryOp(String op, Operand arg) {
		Operand temp = newTemp();
		instructions.add(new Instruction(Operation.getOp(op), temp, arg));
		return temp;
	}

	public Operand lookup(String name) {
		Operand operand = symbolTable.get(name);

		if (operand == null) {
			throw new IllegalArgumentException("Unknown variable: " + name);
		}

		return operand;
	}

	public void enter(String name) {
		if (symbolTable.containsKey(name)) {
			throw new IllegalArgumentException("Variable already defined: " + name);
		}

		symbolTable.put(name, new Operand(name));
	}

	public void generateAssignment(String id, Operand arg) {
		instructions.add(new Instruction(Operation.ASSIGN, lookup(id), arg));
	}

	public void generateGoto(String label) {
		instructions.add(new Instruction(Operation.GOTO, label));
	}

	public List<Instruction> getInstructions() {
		return instructions;
	}

	public Operand generateLiteral(Integer value) {
		return new Operand(Integer.toString(value));
	}

	public Operand generateLiteral(Boolean value) {
		return new Operand(Boolean.toString(value));
	}

}

