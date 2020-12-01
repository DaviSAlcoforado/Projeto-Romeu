package school;

import java.util.*; 
import java.util.concurrent.TimeUnit;
 
public class principal {

	public static void main (String[] args) throws InterruptedException {

		int a = 0;
		String resposta;
		Scanner sc = new Scanner(System.in);    //System.in is a standard input stream  
		Data banco = new Data(0, 0, 0);
		Controller app = new Controller();

		do{

			System.out.println("------------------------------------");
			System.out.println("----Bem vindo à plataforma _____----");
			System.out.println("------------------------------------");
			System.out.println("O que deseja fazer? Digite:");
			System.out.println("(1) Para realizar o nosso Quiz.");
			System.out.println("(2) Para realizar login o cadastrar-se na nossa plataforma.");
			System.out.println("(3) Para sair.\n");

			System.out.println("Sua resposta: ");

			resposta = sc.nextLine();

			if(resposta.equals("1")){

				//-------------------------
				//SE QUISER FAZER O QUIZ
				Quiz q = new Quiz();

				banco.setAcertosIndividuais(q.comecar()); 
				banco.somaAosAcertosTotais(banco.getAcertosIndividuais());

				verificarPosicao(banco.getAcertosIndividuais(), banco.getAcertosTotais(), banco.getParticipantes());

				banco.zeraAcertosIndividuais();

				//-------------------------
			}

			else if (resposta.equals("2")){


				System.out.println("------------------------------------");
				System.out.println("--------____ Cadastro _____---------");
				System.out.println("------------------------------------");

				System.out.println("(1) Para realizar o login.");
				System.out.println("(2) Para realizar o cadastro.");
				System.out.println("(3) Para sair.\n");

				System.out.println("Sua resposta: ");

				resposta = sc.nextLine();

				if (resposta.equals("1")) {

					System.out.println("Login: ");
					String login = sc.nextLine();
					System.out.println("Senha: ");
					String senha = sc.nextLine();
					app.login(login, senha);


				} else if (resposta.equals("2"))  {

					Users usuario = new Users ();

					System.out.println("Nome: ");
					String nome = sc.nextLine();

					System.out.println("Login: ");
					String login = sc.nextLine();

					System.out.println("Senha: ");
					String senha = sc.nextLine();

					usuario.setNome(nome);
					usuario.setLogin(login);
					usuario.setSenha(senha);
					app.cadastro(usuario);

				}	else if(resposta.equals("3")){

					System.out.println("Obrigado irmão. Foi um prazer.\n");
					System.exit(1);
				}
				else{
					System.out.println("Desculpe, formatação de resposta errada. Tente digitar 1, 2 ou 3.\n");
				}


			}
			else if(resposta.equals("3")){
				System.out.println("Obrigado irmão. Foi um prazer.\n");
				System.exit(1);
			}
			else{
				System.out.println("Desculpe, formatação de resposta errada. Tente digitar 1, 2 ou 3.\n");
			}

			TimeUnit.SECONDS.sleep(2);

		} while (a == 0);
	}

	//LEMBRAR DE USAR ISSO AQUI PRA ALGUMA COISAAAAAAAAAAAAAAA !!!!!!!!!!!!!!!!!!!!!!
	public static void verificarPosicao(int acertosindividuais, int acertostotais, int participantes) {
		if (acertosindividuais > acertostotais/participantes)
			System.out.println("\nVocê está acima da média, entre os homens que responderam esse questionário, no quesito machista.\n");
		else
			System.out.println("\nVocê está abaixo da média, entre os homens que responderam esse questionário, no quesito machista.\n");
	}

}