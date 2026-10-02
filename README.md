# Padrão State 

## Sobre a atividade

Esta atividade tem como objetivo aplicar o padrão de projeto comportamental **State (Estado)** em Java.

O exercício original, que representava os diferentes estados de um aluno, foi adaptado para o contexto de um **documento**, mantendo a mesma estrutura e lógica do padrão de projeto.

O padrão State permite que o comportamento de um objeto seja alterado conforme o seu estado atual, evitando a concentração de várias regras condicionais em uma única classe.

## Estados do Documento

O documento pode assumir os seguintes estados:

* **Em Elaboração**
* **Aprovado**
* **Arquivado**
* **Cancelado**
* **Rejeitado**
* **Publicado**

Cada estado possui comportamentos específicos. Algumas operações são permitidas e provocam uma mudança de estado, enquanto outras são recusadas.

Por exemplo, um documento em elaboração pode ser aprovado, arquivado, cancelado, rejeitado ou publicado. Já um documento cancelado não pode realizar nenhuma dessas operações.

## Estrutura do Projeto

A implementação é dividida em uma classe principal, uma classe abstrata de estado e classes concretas para cada estado:

* `Documento`
* `DocumentoEstado`
* `DocumentoEstadoEmElaboracao`
* `DocumentoEstadoAprovado`
* `DocumentoEstadoArquivado`
* `DocumentoEstadoCancelado`
* `DocumentoEstadoRejeitado`
* `DocumentoEstadoPublicado`
* `DocumentoTest`

As classes de estado utilizam o padrão **Singleton**, garantindo uma única instância de cada estado.

## Testes

A classe `DocumentoTest` utiliza **JUnit 5** para verificar as transições de estado.

Os testes validam tanto as operações permitidas quanto as operações que devem ser recusadas em cada estado do documento.

## Objetivo

O principal objetivo da atividade é compreender na prática como o padrão **State** permite organizar diferentes comportamentos de um objeto de acordo com seu estado atual, tornando o código mais organizado, modular e fácil de manter.
