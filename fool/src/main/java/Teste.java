import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class Teste {

	public static void main(String[] args) {
		try {
			File file = new File("fool/src/main/resources/example.fool");
			Reader reader = new FileReader(file);
			Lexer scanner = new Lexer(reader);
			LexParse parser = new LexParse(scanner);

			// lança exceção caso inválido
			parser.parse();

			System.out.println("Sucesso");
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
