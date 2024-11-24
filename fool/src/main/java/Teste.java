import java_cup.runtime.Symbol;
import tac.Instruction;
import tac.TACGenerator;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		try {
			File file = new File("fool/src/main/resources/example.fool");
			Reader reader = new FileReader(file);
			Lexer scanner = new Lexer(reader);
			LexParse parser = new LexParse(scanner);

			// lança exceção caso inválido
			Symbol res = parser.parse();

			List<Instruction> instructions = ((TACGenerator) res.value).getInstructions();

			instructions.forEach(System.out::println);

			System.out.println("Sucesso");
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
