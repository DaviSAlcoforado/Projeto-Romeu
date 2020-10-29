
public class principal {

	public static void main (String[] args) {

		int acertostotais = 0;
		int acertosindividuais;
		int participantes = 0;


		Quiz q = new Quiz();
		acertosindividuais = q.comecar();
		participantes +=1;
		acertostotais += acertosindividuais;

		verificarPosicao(acertosindividuais, acertostotais, participantes);

		acertosindividuais = q.comecar();
		participantes +=1;
		acertostotais += acertosindividuais;

		verificarPosicao(acertosindividuais, acertostotais, participantes);

		acertosindividuais = q.comecar();
		participantes +=1;
		acertostotais += acertosindividuais;

		verificarPosicao(acertosindividuais, acertostotais, participantes);

		// fazer multiplos quizes
	}

	public static void verificarPosicao(int acertosindividuais, int acertostotais, int participantes) {
		if (acertosindividuais > acertostotais/participantes)
			System.out.println("\nVocê está acima da média, entre os homens que responderam esse questionário, no quesito machista.\n");
		else
			System.out.println("\nVocê está abaixo da média, entre os homens que responderam esse questionário, no quesito machista.\n");
	}

}