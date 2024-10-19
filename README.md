# estrutura-dados

# Implementação de Pilha em Java

Este documento fornece uma visão geral da implementação de uma pilha em Java usando uma estrutura de lista encadeada. Explicaremos as classes `Pilha`, `No` e a classe principal `Main`. Também discutiremos as correções e melhorias realizadas.

## Visão Geral das Classes

### 1. Classe `Pilha`

A classe `Pilha` implementa uma estrutura de dados do tipo pilha. Uma pilha segue o princípio LIFO (Last In, First Out), onde o último elemento adicionado é o primeiro a ser removido.

#### Atributos
- `private No refNoEntradaPilha;`: Uma referência ao nó do topo da pilha.

#### Construtor
```java
public Pilha() {
    this.refNoEntradaPilha = null;
}
