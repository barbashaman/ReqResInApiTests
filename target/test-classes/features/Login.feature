#language: pt
@Login
Funcionalidade: Teste de Saúde da API

  @LoginSucesso
  Esquema do Cenário: Login com sucesso

    Dado que o usuário informa email: <email> e password: <password>
    Quando efetuar o login
    Então o sistema retorna a resposta corretamente
    Exemplos:
      | email                | password     |
      | "eve.holt@reqres.in" | "cityslicka" |

  @LoginInvalido
  Esquema do Cenário:Login sem sucesso - usuário inválido

    Dado que o usuário informa email: <email> e password: <password>
    Quando efetuar o login
    Então o sistema informa que não foi capaz de encontrar o usuário
    Exemplos:
      | email                | password     |
      | "matheus.barbachan@gmail.com" | "123" |