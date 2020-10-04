package in.reqres.endpoints.steps;

import in.reqres.endpoints.actions.UserAction;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class UserStep {

    UserAction action;

    public UserStep() {
        this.action = new UserAction();
    }

    @Dado("^que é informado o Id (\\d+)$")
    public void queÉInformadoOId(int id) {
        action.setUserId(id);
    }

    @Quando("^é efetuada a busca do usuário pelo Id$")
    public void éEfetuadaABuscaDoUsuárioPeloId() {
        action.buscaUsuario();
    }

    @Então("^a consulta do usuário é efetuada com sucesso$")
    public void aConsultaDoUsuarioEhEfetuadaComSucesso() {
        action.validaBuscaUsuario();
    }

    @Dado("^que são informados os dados do novo Usuário:  \"(.*?)\", \"(.*?)\", \"(.*?)\"$")
    public void queSãoInformadosOsDadosDoNovoUsuárioEmailFirst_nameLast_name(String email, String first_name, String last_name) {
        action.setUserCreationData(email,first_name,last_name);
    }

    @Quando("^efetuo o cadastro do usuário$")
    public void efetuoOCadastroDoUsuário() {
        action.cadastraUsuario();
    }

    @Então("^o usuário é inserido com sucesso$")
    public void oUsuárioÉInseridoComSucesso() {
        action.validaCadastroUsuario();
    }
}
