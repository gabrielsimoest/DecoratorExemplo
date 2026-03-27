# Padrão de Projeto Decorator — Exemplo em Java

Exemplo acadêmico do padrão de projeto **Decorator** (Estrutural), implementado em Java com o contexto de uma cafeteria.

## O que é o Padrão Decorator?

O **Decorator** é um padrão de projeto estrutural que permite adicionar comportamentos a um objeto dinamicamente, envolvendo-o em objetos "decoradores". É uma alternativa flexível à herança para estender funcionalidades, seguindo o princípio **Aberto/Fechado** — aberto para extensão, fechado para modificação.

## Estrutura do Projeto

```
Cafe.java              → Component (interface)
CafeSimples.java       → Concrete Component
CafeDecorator.java     → Decorator abstrato
Leite.java             → Concrete Decorator
Chocolate.java         → Concrete Decorator
Main.java              → Demonstração
```

### Participantes

| Papel | Classe | Descrição |
|---|---|---|
| **Component** | `Cafe` | Interface que define o contrato (`getDescricao`, `getCusto`) |
| **Concrete Component** | `CafeSimples` | Implementação base — café puro a R$ 2,00 |
| **Decorator** | `CafeDecorator` | Classe abstrata que envolve um `Cafe` e delega as chamadas |
| **Concrete Decorator** | `Leite` | Adiciona leite (+R$ 0,50) |
| **Concrete Decorator** | `Chocolate` | Adiciona chocolate (+R$ 0,75) |

## Como Funciona

Os decoradores envolvem o componente original (ou outro decorador) em camadas, acumulando descrição e custo a cada nível:

```java
Cafe cafe = new CafeSimples();          // "Café Simples"          R$ 2,00
cafe = new Leite(cafe);                 // "Café Simples, Leite"   R$ 2,50
cafe = new Chocolate(cafe);             // + ", Chocolate"         R$ 3,25
cafe = new Chocolate(cafe);             // + ", Chocolate"         R$ 4,00
```

## Saída Esperada

```
Pedido : Café Simples
Custo  : R$ 2,00
------------------------------------------
Pedido : Café Simples, Leite
Custo  : R$ 2,50
------------------------------------------
Pedido : Café Simples, Leite, Chocolate
Custo  : R$ 3,25
------------------------------------------
Pedido : Café Simples, Leite, Chocolate, Chocolate
Custo  : R$ 4,00
------------------------------------------
```

## Como Executar

```bash
javac *.java
java Main
```

## Por que usar o Decorator?

- Evita explosão de subclasses (ex: `CafeComLeiteEChocolate`, `CafeComDuploCafé`, etc.)
- Permite combinar comportamentos em tempo de execução
- Cada decorador tem uma única responsabilidade
