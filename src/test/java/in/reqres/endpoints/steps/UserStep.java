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

    @Então("^o sistema retorna os dados desse usuário$")
    public void oSistemaRetornaOsDadosDesseUsuário() {
        action.validaBuscaUsuario();
    }
}
