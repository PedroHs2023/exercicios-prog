# Carros, à montagem!

Bem-vindo ao Carros, à montagem! na trilha Java do Exercism.
Se você precisar de ajuda para rodar os testes ou enviar seu código, confira o `HELP.md`.
Se você ficar travado no exercício, confira o `HINTS.md`, mas tente resolvê-lo sem usar essas dicas primeiro :)

## Introduction

## Números

Existem dois tipos diferentes de números em Java:

- Inteiros: números sem dígitos depois do separador decimal (números inteiros).
  Alguns exemplos são `-6`, `0`, `1`, `25`, `976` e `-500000`.
- Números de ponto flutuante: números com zero ou mais dígitos depois do separador decimal.
  Alguns exemplos são `-20.4`, `0.1`, `2.72`, `16.984025` e `1024.0`.

Os dois tipos numéricos mais comuns em Java são `int` e `double`.
Um `int` é um número inteiro de 32 bits e um `double` é um número de ponto flutuante de 64 bits.

A aritmética é feita usando os operadores aritméticos padrão.
Os números podem ser comparados usando os operadores de comparação numérica padrão (por exemplo, `5 > 4` e `4 <= 5`) e os operadores de igualdade (`==`) e desigualdade (`!=`).

Java tem dois tipos de conversão numérica:

1. Conversões implícitas: nenhum dado será perdido e nenhuma sintaxe adicional é necessária.
2. Conversões explícitas: dados podem ser perdidos e é necessária uma sintaxe adicional na forma de um _cast_.

Como um `int` tem menos precisão que um `double`, converter de um `int` para um `double` é seguro e, portanto, é uma conversão implícita.
No entanto, converter de um `double` para um `int` pode significar perder dados, então isso exige uma conversão explícita.

## Condicionais if-else

### A condicional _if-then_

A instrução de fluxo de controle mais básica em Java é a condicional _if-then_.
Essa instrução é usada para executar um trecho de código somente se uma determinada condição for `true`.
Uma condicional _if-then_ é definida usando a cláusula `if`:

```java
class Car {
    void drive() {
        // the "if" clause: the car needs to have fuel left to drive
        if (fuel > 0) {
            // the "then" clause: the car drives, consuming fuel
            fuel--;
        }
    }
}
```

No exemplo acima, se o carro estiver sem combustível, chamar o método `Car.drive` não fará nada.

### A condicional _if-then-else_

A condicional _if-then-else_ fornece um caminho alternativo de execução para quando a condição na cláusula `if` for avaliada como `false`.
Esse caminho alternativo de execução vem depois de uma cláusula `if` e é definido usando a cláusula `else`:

```java
class Car {
    void drive() {
        if (fuel > 0) {
            fuel--;
        } else {
            stop();
        }
    }
}
```

No exemplo acima, se o carro estiver sem combustível, chamar o método `Car.drive` chamará outro método para parar o carro.

A condicional _if-then-else_ também dá suporte a várias condições usando a cláusula `else if`:

```java
class Car {
    void drive() {
        if (fuel > 5) {
            fuel--;
        } else if (fuel > 0) {
            turnOnFuelLight();
            fuel--;
        } else {
            stop();
        }
    }
}
```

No exemplo acima, dirigir o carro quando o combustível for menor ou igual a `5` fará o carro andar, mas acenderá a luz de combustível.
Quando o combustível chegar a `0`, o carro para de andar.

## Instructions

Neste exercício, você vai escrever código para analisar a produção de uma linha de montagem em uma fábrica de carros. A velocidade da linha de montagem pode variar de `0` (desligada) a `10` (máxima).

Na velocidade mais baixa (`1`), são produzidos `221` carros por hora. A produção aumenta linearmente com a velocidade. Então, com a velocidade em `4`, ela deve produzir `4 * 221 = 884` carros por hora. Porém, velocidades mais altas aumentam a probabilidade de que carros com defeito sejam produzidos, e esses carros precisam ser descartados. A tabela a seguir mostra como a velocidade influencia a taxa de sucesso:

- `1` a `4`: 100% de taxa de sucesso.
- `5` a `8`: 90% de taxa de sucesso.
- `9`: 80% de taxa de sucesso.
- `10`: 77% de taxa de sucesso.

Você tem duas tarefas.

## 1. Calcule a taxa de produção por hora

Implemente o método `CarsAssemble.productionRatePerHour()` para calcular a taxa de produção por hora da linha de montagem, levando em conta a velocidade atual da linha de montagem e a taxa de sucesso:

```Java
CarsAssemble.productionRatePerHour(6)
// => 1193.4
```

Repare que o valor retornado é um `double`.

## 2. Calcule o número de itens funcionais produzidos por minuto

Implemente o método `CarsAssemble.workingItemsPerMinute()` para calcular quantos carros funcionais são produzidos por minuto:

```Java
CarsAssemble.workingItemsPerMinute(6)
// => 19
```

Repare que o valor retornado é um `int`.

## Source

### Created by

- @TalesDias