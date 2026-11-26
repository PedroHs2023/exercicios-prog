# Two Fer

Bem-vindo ao Two Fer na trilha Java do Exercism.
Se você precisar de ajuda para rodar os testes ou enviar seu código, confira o `HELP.md`.

## Introduction

Em alguns sotaques do inglês, quando você diz "two for" rapidamente, soa como "two fer".
Two-for-one é uma forma de dizer que, se você comprar um, também ganha outro de graça.
Por isso, a expressão "two-fer" geralmente dá a entender uma oferta two-for-one.

Imagine uma padaria com uma promoção de feriado em que você pode comprar dois biscoitos pelo preço de um ("two-fer one!").
Você aceita a oferta e (muito generosamente) decide dar o biscoito extra para outra pessoa na fila.

## Instructions

Sua tarefa é decidir o que você vai dizer ao entregar o biscoito extra.

Se você souber o nome da pessoa (por exemplo, se ela se chama Do-yun), você vai dizer:

```text
One for Do-yun, one for me.
```

Se você não souber o nome da pessoa, você vai dizer _you_ no lugar.

```text
One for you, one for me.
```

Aqui estão alguns exemplos:

| Nome   | Diálogo                     |
| :----- | :-------------------------- |
| Alice  | One for Alice, one for me.  |
| Bohdan | One for Bohdan, one for me. |
|        | One for you, one for me.    |
| Zaphod | One for Zaphod, one for me. |

## Implementação

Antes de começar, certifique-se de que você entende como escrever código que consiga passar nos casos de teste.
Para mais contexto, dê uma olhada neste [tutorial].

A maioria dos exercícios de Java inclui vários casos de teste.
Esses casos são estruturados para dar suporte a um processo útil conhecido como [desenvolvimento orientado a testes (TDD)][tdd].
O TDD envolve repetir um ciclo estruturado que ajuda quem programa a construir funcionalidades complexas peça por peça, em vez de tudo de uma vez.
Esse ciclo pode ser descrito assim:

1. Adicione um teste que descreva uma parte da funcionalidade desejada que seu código ainda não tem.
2. Rode os testes para verificar que esse teste recém-adicionado falha.
3. Atualize seu código atual até que:
    - Todos os testes antigos continuem passando;
    - O novo teste também passe.
4. [Faça uma limpeza][refactoring] no seu código, garantindo que todos os testes continuem passando.
   Isso normalmente envolve renomear variáveis, remover trechos de lógica duplicados, remover logs esquecidos etc.
5. Volte ao passo 1 até que toda a funcionalidade desejada esteja pronta!

Os arquivos de teste desta track contêm _todos_ os testes que sua solução precisa passar para ser considerada válida.
Isso não parece, à primeira vista, compatível com o ciclo descrito acima, no qual os testes são escritos um a um.
No entanto, a ferramenta que usamos para escrever nossos testes, o [JUnit][junit],
oferece uma [anotação][java-annotation] [@Disabled][junit-disabled] que pode ser usada para ignorar temporariamente um teste já escrito.
Usando essa anotação, garantimos que os arquivos de teste que entregamos a você seguem estas regras:

- O primeiro teste de qualquer arquivo de teste _não_ é ignorado por padrão.
- Todos os testes de qualquer arquivo de teste, exceto o primeiro, _são_ ignorados por padrão.

Isso permite que você simule o ciclo TDD seguindo estes passos um pouco modificados:

1. Rode os testes para verificar que _no máximo um_ teste está falhando no momento.
2. Atualize seu código atual até que todos os testes não ignorados passem.
3. Faça uma limpeza no seu código, garantindo que todos os testes não ignorados continuem passando.
4. Remova a primeira anotação `@Disabled` do arquivo de teste.
5. Volte ao passo 1 até que nenhum teste seja ignorado e todos os testes passem!

[java-annotation]: https://docs.oracle.com/javase/tutorial/java/annotations/
[junit]: https://junit.org/junit5/
[junit-disabled]: https://junit.org/junit5/docs/current/api/org.junit.jupiter.api/org/junit/jupiter/api/Disabled.html
[refactoring]: https://en.wikipedia.org/wiki/Code_refactoring
[tdd]: https://en.wikipedia.org/wiki/Test-driven_development
[tutorial]: https://github.com/exercism/java/blob/main/exercises/practice/hello-world/.docs/instructions.append.md#tutorial

## Source

### Created by

- @Smarticles101

### Contributed to by

- @FridaTveit
- @ikhadykin
- @jmrunkle
- @jssander
- @kytrinyx
- @lemoncurry
- @msomji
- @muzimuzhi
- @rdavid1099
- @sjwarner-bp
- @SleeplessByte
- @sshine
- @stkent
- @uzilan
- @Valkryst
- @ymoskovits

### Based on

https://github.com/exercism/problem-specifications/issues/757