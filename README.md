# ReqResInApiTests
  Testes elaborados para o processo seletivo da Datum. 
  * Para executar os testes de API foi utilizada a linguagem de programação JAVA. 
  * Para descrever os cenários em BDD, a linguagem Gherkin. 
  * Para estruturar e executar as chamadas de serviço, bem como validar seus retornos, a biblioteca JAVA Restassured. 
  * Os endpoints e a BASEURI foram organizados em um arquivo de propriedades.
  * O Gerenciador de dependências do projeto é o Maven.
  * A IDE utilizada foi o Intellij IDEA Community
  * Os testes podem ser executados através do maven ou de dentro de uma IDE com o plugin do Cucumber instalado executando os testes de dentro dos arquivos com extensão .feature
  
  Na primeira versão do projeto foram feitos cenários de teste para os dominios de LOGIN e USERS. Foram desenvolvidos cenários de sucesso e fracasso, dadas as possibilidades que o sistema permite. 
  A aplicação contém diversos pontos fracos como contratos fracos que permitem a execução de um post sem dados no corpo do POST, assim como permite a duplicidade de dados, cadastrando com IDs diferentes entidades idênticas. Dado que essa é uma aplicação para fins de exercícios e fins de teste, esses pontos foram relevados.
