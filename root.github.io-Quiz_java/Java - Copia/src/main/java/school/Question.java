package school;

import java.util.ArrayList;

public class Question {

	private String pergunta;
	private ArrayList<String> alternativas;
	private String answer;

	public Question(String pergunta, String[] alternativas, String answer){

		this.pergunta = pergunta;
		this.alternativas = new ArrayList<String>();

		for (int i = 0; i < alternativas.length; i++){
			this.alternativas.add(alternativas[i]);
		}
		this.answer = answer;
	}

	public String getQuestion(){
		return this.pergunta;
	}

	public ArrayList<String> getAlternativas() {
		return this.alternativas;
	}

	public String getAnswer() {
		return this.answer;
	}


}