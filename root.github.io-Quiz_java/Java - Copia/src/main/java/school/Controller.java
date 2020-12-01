package school;

public class Controller implements RepositorioUsers{

    public Repositorio repo = new Repositorio();

    @Override
    public void cadastro(Users user) {

        repo.salvar(user);

    }

    @Override
    public void login(String login, String senha) {

        repo.verificar(login,senha);
    }
}
