# Cozinhe sua lasanha

Bem-vindo ao Cozinhe sua lasanha na trilha Java do Exercism.
Se você precisar de ajuda para rodar os testes ou enviar seu código, confira o `HELP.md`.
Se você ficar travado no exercício, confira o `HINTS.md`, mas tente resolvê-lo sem usar essas dicas primeiro :)

## Introduction

## Básico

Java é uma linguagem de tipagem estática, o que significa que o tipo de uma variável é conhecido em tempo de compilação.
Atribuir um valor a um nome é chamado de definir uma variável.
Uma variável é definida especificando explicitamente seu tipo.

```java
int explicitVar = 10;
```

Atualizar o valor de uma variável é feito com o operador `=`.
Aqui, `=` não representa igualdade matemática.
Ele simplesmente atribui um valor a uma variável.
Depois de definida, o tipo de uma variável nunca pode mudar.

```java
int count = 1; // Assign initial value
count = 2;     // Update to new value

// Compiler error when assigning a different type
// count = false;
```

Java é uma [linguagem orientada a objetos][object-oriented-programming] e exige que todas as funções sejam definidas em uma _classe_.
A palavra-chave `class` é usada para definir uma classe.

```java
class Calculator {
    // ...
}
```

Uma função dentro de uma classe é chamada de _método_.
Cada método pode ter zero ou mais parâmetros.
Todos os parâmetros devem ter tipo explícito; não há inferência de tipo para parâmetros.
Da mesma forma, o tipo de retorno também deve ser explícito.
Valores são retornados de métodos usando a palavra-chave `return`.
Para permitir que um método seja chamado por outras classes, o modificador de acesso `public` deve ser adicionado.

```java
class Calculator {
    public int add(int x, int y) {
        return x + y;
    }
}
```

Invocar/chamar um método é feito especificando o nome da classe e do método e passando argumentos para cada um dos parâmetros do método.

```java
int sum = new Calculator().add(1, 2);  // here the  "add" method has been called to perform the task of addition
```

O escopo em Java é definido entre os caracteres `{` e `}`.

Java dá suporte a dois tipos de comentários.
Comentários de uma linha são precedidos por `//` e comentários de várias linhas são inseridos entre `/*` e `*/`.

[object-oriented-programming]: https://docs.oracle.com/javase/tutorial/java/javaOO/index.html

## Instructions

Neste exercício, você vai escrever um código para ajudar a preparar uma lasanha incrível do seu livro de receitas favorito.

Você tem quatro tarefas, todas relacionadas ao tempo gasto preparando a lasanha.

## 1. Defina o tempo esperado no forno em minutos

Defina o método `expectedMinutesInOven()` que não recebe nenhum parâmetro e retorna quantos minutos a lasanha deve ficar no forno. De acordo com o livro de receitas, o tempo esperado no forno em minutos é 40:

```java
Lasagna lasagna = new Lasagna();
lasagna.expectedMinutesInOven();
// => 40
```

## 2. Calcule o tempo restante no forno em minutos

Defina o método `remainingMinutesInOven()` que recebe como parâmetro os minutos atuais que a lasanha passou no forno e retorna quantos minutos a lasanha ainda precisa permanecer no forno, com base no tempo esperado no forno em minutos da tarefa anterior.

```java
Lasagna lasagna = new Lasagna();
lasagna.remainingMinutesInOven(30);
// => 10
```

## 3. Calcule o tempo de preparo em minutos

Defina o método `preparationTimeInMinutes()` que recebe como parâmetro o número de camadas que você adicionou à lasanha e retorna quantos minutos você gastou preparando a lasanha, supondo que cada camada leva 2 minutos para preparar.

```java
Lasagna lasagna = new Lasagna();
lasagna.preparationTimeInMinutes(2);
// => 4
```

## 4. Calcule o tempo total de trabalho em minutos

Defina o método `totalTimeInMinutes()` que recebe dois parâmetros: o primeiro parâmetro é o número de camadas que você adicionou à lasanha, e o segundo parâmetro é o número de minutos que a lasanha esteve no forno. A função deve retornar quantos minutos no total você trabalhou no preparo da lasanha, que é a soma do tempo de preparo em minutos com o tempo em minutos que a lasanha passou no forno no momento atual.

```java
Lasagna lasagna = new Lasagna();
lasagna.totalTimeInMinutes(3, 20);
// => 26
```

## Source

### Created by

- @mirkoperillo