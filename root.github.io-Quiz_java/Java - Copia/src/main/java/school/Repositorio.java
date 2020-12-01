package school;

import java.util.*;

public class Repositorio {

    List<Users> lista = new ArrayList<Users>();


    public void salvar (Users user) {

        lista.add(user);
    }

    public void verificar (String login, String senha) {

        for (int i = 0; i < lista.size(); i++) {
            Users user = lista.get(i);

            if (user.getLogin().equals(login)){
                if (user.getSenha().equals(senha)){
                    System.out.println("Bem vindo " + user.getNome());

                }else {
                    System.out.println("Senha incorreta, tente novamente.");

                }
            } else {
                System.out.println("Login incorreto, tente novamente.");

            }
        }

    }







}
