## Projeto DIO Banco

Bem vindo ao meu projeto, este projeto foi realizado para a resolução de um desafio proposto pela DIO (Digital Innovation One), no curso "Formação Java Developer"
## Desafios:
O maior desafio encontrado ao realizar este projeto foi a seguinte linha de código : scanner.nextLine();ao executar este comando "scanner.nextLine()" o interpretador pulava a linha e não permitia a entrada de dados do usuário, utilizar o "scanner.next()" não permitiria que o usuario entrasse com seu nome composto exemplo : "MARIO ANDRADE", ao pesquisar me deparei com o seguinte artigo "https://pt.stackoverflow.com/questions/507845/uso-do-nextline-em-java" e consegui resolver o problema em questão.
O problema ocorria porque o scanner.nextInt() não consome o caracter de quebra de linha, para resolver este problema é necessário utilizar o scanner.nextLine() para que ele consuma a linha. 
