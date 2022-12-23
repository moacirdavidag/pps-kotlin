# Design Patterns em Kotlin 

Exemplos básicos de código seguindo os padrões **Command** e **Observer** implementados em Kotlin, para avaliação de seminário em vídeo da disciplina de **Padrões de Projeto de Software** do curso de **Análise e Desenvolvimento de Sistemas** do **IFPB - Campus Cajazeiras**. 


## Command 
O *Design Pattern Command* é um padrão que visa resolver o problema de encapsulamento forte entre objetos que solicitam ações daqueles que recebem essas solicitações. Uma definição mais formal seria:

O Command _"encapsula uma solicitação (comando) como um objeto, permitindo que os comandos sejam parametrizados, e haja desacoplamento entre o objeto que faz a solicitação e o que recebe"_.

(DIAGRAMA_DE_CLASSE)

**Quando usar**
* Para desacoplar o objeto que envia solicitações do que recebe;
* Quando o comando deve ser tratado como objeto;
* Quando for necessário que haja a possibilidade de comandos serem feitos e desfeitos.

**Vantagens**
* Permite a criação de comandos simples ou complexos (compostos);
* Implementa o “fazer” e “desfazer” nos comandos;
* Desacopla o objeto que faz a solicitação do que recebe.

**Desvantagens**
* A criação de muitas classes deixa o código mais complexo e de difícil leitura. 

## Observer

Já o padrão *Observer* define "_uma dependência de um para muitos entre objetos, de modo que, quando um objeto muda de estado, todos os seus dependentes são automaticamente notificados e atualizados_”.

(DIAGRAMA_DE_CLASSES)

**Quando usar**
* Quando a mudança de estado em um objeto impacta outros, precisando gerar uma notificação para os seus objetos dependentes e não sabemos quantos são;
* Quando precisamos trocar mensagens/informações entre objetos e não sabemos quantos são.

**Vantagens**
* O *Observer* segue o padrão SRP e OCP;
* Facilita que os objetos se comuniquem entre si em tempo de execução.

**Desvantagens**
* A ordem de envio das notificações entre objetos pode ser complexa. 
