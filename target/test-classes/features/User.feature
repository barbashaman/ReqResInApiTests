#language: pt
@Usuario
Funcionalidade: Usuário

  @BuscaUsuario
  Esquema do Cenário: Busca do Usuário pelo Id
    Dado que é informado o Id <id>
    Quando é efetuada a busca do usuário pelo Id
    Então o sistema retorna os dados desse usuário
    Exemplos:
      | id |
      | 1  |

