package in.reqres.endpoints.steps;

import in.reqres.endpoints.actions.LoginAction;
import in.reqres.endpoints.utils.RestStep;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class LoginStep {

    private LoginAction action;


    public LoginStep(){
        this.action=new LoginAction();
    }

    @Então("^o sistema retorna a resposta corretamente$")
    public void oSistemaRetornaARespostaCorretamente() {
        action.validaLogin();
        
    }

    @Quando("^efetuar o login$")
    public void efetuarOLogin() {
        action.efetuarLogin();
    }

    @Dado("^que o usuário informa email: \"(.*?)\" e password: \"(.*?)\"$")
    public void queOUsuárioInformaEmailEmailEPasswordPasswordCorretos(String email, String password) {
        action.informaEmailEPassword(email, password);
    }

    @Então("o sistema informa que não foi capaz de encontrar o usuário")
    public void oSistemaInformaQueNãoFoiCapazDeEncontrarOUsuário() {
        action.validaUsuarioInvalido();
    }
}