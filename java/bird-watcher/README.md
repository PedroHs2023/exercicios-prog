# Observador de pássaros

Bem-vindo ao Observador de pássaros na trilha Java do Exercism.
Se você precisar de ajuda para rodar os testes ou enviar seu código, confira o `HELP.md`.
Se você ficar travado no exercício, confira o `HINTS.md`, mas tente resolvê-lo sem usar essas dicas primeiro :)

## Introduction

## Arrays

Em Java, arrays são uma forma de armazenar vários valores do mesmo tipo em uma única estrutura.
Diferente de outras estruturas de dados, arrays têm um tamanho fixo depois de criados.
Os elementos podem ser atribuídos a um array ou recuperados dele usando um índice.
Os arrays em Java usam indexação a partir de zero: o índice do primeiro elemento é 0, o do segundo é 1, etc.

Veja a sintaxe padrão para inicializar um array:

```java
type[] variableName = new type[size];
```

O `type` é o tipo dos elementos no array, que pode ser um tipo primitivo (por exemplo, `int`) ou uma classe (por exemplo, `String`).

O `size` é o número de elementos que esse array vai conter (o que não pode ser alterado depois).
Depois de criar o array, os elementos são inicializados com seus valores padrão (normalmente `0`, `false` ou `null`).

```java
// Declare array with explicit size (size is 2)
int[] twoInts = new int[2];
```

Arrays também podem ser definidos usando uma notação abreviada que permite criar o array e definir seu valor:

```java
// Two equivalent ways to declare and initialize an array (size is 3)
int[] threeIntsV1 = new int[] { 4, 9, 7 };
int[] threeIntsV2 = { 4, 9, 7 };
```

Como o compilador agora consegue saber quantos elementos o array terá, o comprimento pode ser omitido.

Os elementos de um array podem ser atribuídos e acessados usando uma notação de índice entre colchetes:

```java
// Assign second element by index
twoInts[1] = 8;

// Retrieve the second element by index and assign to the int element
int secondElement = twoInts[1];
```

Acessar um índice que está fora dos índices válidos do array resulta em uma `IndexOutOfBoundsException`.

Arrays podem ser manipulados chamando os métodos ou propriedades de uma instância de array, ou usando os métodos estáticos definidos na classe `Arrays` (normalmente usados apenas em código genérico).
A propriedade `length` contém o comprimento de um array.
Ela pode ser acessada assim:

```java
int arrayLength = someArray.length;
```

Java também fornece uma classe utilitária bastante útil [`java.util.Arrays`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Arrays.html) que tem vários métodos úteis relacionados a arrays (por exemplo, `Arrays.equals`).

Java também suporta [arrays multidimensionais](https://www.programiz.com/java-programming/multidimensional-array) como `int[][] arr = new int[3][4];`, o que pode ser muito útil.

O fato de um array também ser uma _coleção_ significa que, além de acessar valores por índice, você pode iterar sobre _todos_ os seus valores usando um laço `for-each`:

```java
char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

for(char vowel: vowels) {
    // Output the vowel
    System.out.print(vowel);
}

// => aeiou
```

Se você quiser mais controle sobre quais valores iterar, pode usar um laço `for`:

```java
char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

for (int i = 0; i < 3; i++) {
    // Output the vowel
    System.out.print(vowels[i]);
}

// => aei
```

## Instructions

Você adora observar pássaros e acompanha quantos visitaram seu jardim nos últimos sete dias.

Você tem seis tarefas, todas lidando com os números de pássaros que visitaram seu jardim.

## 1. Verifique quais foram as contagens da semana passada

Para fins de comparação, você sempre mantém por perto uma cópia das contagens da semana passada, que foram: 0, 2, 5, 3, 7, 8 e 4. Implemente o método `BirdWatcher.getLastWeek()` que retorna as contagens da semana passada:

```java
BirdWatcher.getLastWeek();
// => [0, 2, 5, 3, 7, 8, 4]
```

## 2. Verifique quantos pássaros visitaram hoje

Implemente o método `BirdWatcher.getToday()` para retornar quantos pássaros visitaram seu jardim hoje. As contagens de pássaros estão ordenadas por dia, com o primeiro elemento sendo a contagem do dia mais antigo, e o último elemento sendo a contagem de hoje.

```java
int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.getToday();
// => 1
```

## 3. Incremente a contagem de hoje

Implemente o método `BirdWatcher.incrementTodaysCount()` para incrementar a contagem de hoje:

```java
int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.incrementTodaysCount();
birdCount.getToday();
// => 2
```

## 4. Verifique se houve um dia sem pássaros visitantes

Implemente o método `BirdWatcher.hasDayWithoutBirds()` que retorna `true` se houve um dia em que zero pássaros visitaram o jardim; caso contrário, retorne `false`:

```java
int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.hasDayWithoutBirds();
// => true
```

## 5. Calcule o número de pássaros visitantes nos primeiros dias

Implemente o método `BirdWatcher.getCountForFirstDays()` que retorna o número de pássaros que visitaram seu jardim desde o início da semana, mas limite a contagem ao número especificado de dias a partir do começo da semana.

```java
int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.getCountForFirstDays(4);
// => 14
```

## 6. Calcule o número de dias movimentados

Alguns dias são mais movimentados que outros. Um dia movimentado é aquele em que cinco ou mais pássaros visitaram seu jardim.
Implemente o método `BirdWatcher.getBusyDays()` para retornar o número de dias movimentados:

```java
int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.getBusyDays();
// => 2
```

## Source

### Created by

- @samuelteixeiras
- @ystromm

### Contributed to by

- @jagdish-15