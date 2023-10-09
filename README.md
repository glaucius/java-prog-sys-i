# java-prog-sys-i
MAPA - ESOFT - PROGRAMAÇÃO DE SISTEMAS I - 53/2023

Efetue a criação de um programa Java para a leitura e manipulação de registros em um arquivo CSV.

Um arquivo CSV é um arquivo de dados em formato de estrutura de tabela, onde os dados que representam as colunas são separados por vírgula, e cada linha corresponde a um registro da tabela. O arquivo a ser lido contém os registros de doações de sangue. Cada registro (linha do arquivo) inclui as seguintes informações: código (da doação), nome (do doador), CPF (doador), data de nascimento (do doador), tipo sanguíneo (do doador) e a quantidade em ml de sangue doado.
Antes de começar, salve o conteúdo abaixo em um arquivo texto simples (sem formatação), e salve-o como doacoes.csv em uma pasta de fácil acesso como “C:\CSV\”.

1,Marcio dos Santos,521523159-57,2023-10-01,O+,150

2,Jose Eduardo,457896549-85,2023-12-01,O-,300

3,Adriana Jardim,123845678-12,2023-09-15,AB+,280

4,Carlos Roberto,341524981-35,2023-05-25,A+,380

5,Vinicius Cosatto,531765566-47,2023-04-14,A-,450

6,Felipe Neves,665977825-87,2023-10-17,O+,600

7,Alicia Flores,654895159-48,2023-07-22,AB+,650

8,Natalia Costa,977455987-12,2023-11-12,O-,720

9,Gertrudes Menezes,377551298-44,2023-09-11,O+,460

10,Henrique Martins,259886411-58,2023-18-10,O-,350
 
Efetue a criação do programa, de acordo com os seguintes requisitos:

1. O usuário deverá informar o caminho e nome do arquivo CSV.

2. Efetuar a leitura do arquivo e apresentar na tela o seu conteúdo.

3. Efetuar a inserção de uma nova doação (linha) no final do arquivo, obedecendo o mesmo formato dos registros contidos no arquivo (código, nome, cpf, data_nascimento, tipo_sanguíneo e mls_doados).

4. Efetuar a deleção de linhas do arquivo de acordo com o código da doação especificado.

5. Os itens 2, 3 e 4 devem ser implementados por meio de métodos/funções estáticas.

6. Efetue o tratamento de exceções relacionadas à manlipulação de arquivos.

7. Apresentar um menu, permitindo a seleção e execução das funcionalidades 2, 3 e 4.

8. Efetuar a documentação JavaDOC do programa gerado.
 
​Dicas:
- Você pode utilizar a expressão: String[] campos = linhaCsv.split(","), para quebrar o conteúdo de uma linha lida do arquivo CSV em um array de substrings, podendo, assim, acessar cada um dos campos de forma independete.

Como entregar a atividade:

Você deve entregar um arquivo no formato texto (Word) ou PDF – no template da atividade, contendo os seguintes itens:

- Código Java do programa.

- A captura de tela do output, na execução de cada uma das funcionalidades na ordem:

1 leitura arquivo;

2 inserção de um registro;

3 leitura arquivo;

4 deleção de um registro;

5 leitura do arquivo; 

6 sair do programa.
