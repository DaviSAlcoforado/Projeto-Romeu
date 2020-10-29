import java.util.Scanner;
import java.util.ArrayList;

public class Quiz {

	private ArrayList<Question> questionario;

	public Quiz() {
		questionario = new ArrayList<Question>();
		String q = "Você já realizou alguma das práticas abaixo?";
		String[] a = {"Disse que mulher é pior que homem dirigindo", "Disse que homem não pode chorar, isso é coisa de mulher", "Não mostrei meus sentimentos por medo de ser julgado"};
		questionario.add(new Question(q, a, "Não"));
		//
		q = "Você acha que visitar psicólogo não é coisa de 'macho'?";
		a = new String[]{"Sim", "Não"};

		questionario.add(new Question(q, a, "Sim"));

		q = "Você acha que algumas mulheres peder para ser assediadas";
		a = new String[]{"Sim", "Não"};

		questionario.add(new Question(q, a, "Não"));
	}

	public void comecar() {
		Scanner scan = new Scanner(System.in);

		int contador = 0;

		for(int a = 0; a < questionario.size(); a++){

			System.out.println(questionario.get(a).getQuestion());
			int numeroDeEscolhas = questionario.get(a).getAlternativas().size();

			//mostrar alternativas
			for (int b = 0; b< numeroDeEscolhas; b++){

				System.out.println((b + 1) + ": " + questionario.get(a).getAlternativas().get(b));
			}

			String resposta = scan.nextLine();

			if (resposta.equals("Sim"))
				contador ++;


		}

		scan.close();
		
		if (contador > 0)
			System.out.println("Você é machista.");

		else 
			System.out.println("Sério? parabéns =)).");

	}
}