#language: pt
@Usuario
Funcionalidade: Usuário

  @BuscaUsuario
  Esquema do Cenário: Busca do Usuário pelo Id
    Dado que é informado o Id <id>
    Quando é efetuada a busca do usuário pelo Id
    Então a consulta do usuário é efetuada com sucesso
    Exemplos:
      | id |
      | 1  |

#    TODO Criação de Usuários
  @CriaUsuario
  Esquema do Cenario: Cria um Usuário com dados fornecidos
    Dado que são informados os dados do novo Usuário:  <email>, <first_name>, <last_name>
    Quando efetuo o cadastro do usuário
    Então o usuário é inserido com sucesso
    Exemplos:
      | email                         | first_name | last_name           |
      | "matheus.barbachan@gmail.com" | "Matheus"  | "Barbachan e Silva" |
      | "fake@mail.com"               | "Fake"     | "Person"            |

#    TODO Busca por lista de usuários