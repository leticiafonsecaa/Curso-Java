# JPR-005 – Estruturas de Decisão (if, else e else if)

## Objetivo

Aprender a controlar o fluxo de execução de um programa através de estruturas de decisão, permitindo que o sistema execute diferentes ações de acordo com determinadas condições.

---

# O que aprendemos

## Estrutura `if`

O `if` executa um bloco de código apenas quando uma condição é verdadeira.

### Sintaxe

```java
if (condicao) {

    // código executado se a condição for verdadeira

}
```

### Exemplo

```java
if (nota >= 7) {

    System.out.println("Aprovado!");

}
```

---

## Estrutura `if` + `else`

O `else` é executado quando a condição do `if` for falsa.

### Sintaxe

```java
if (condicao) {

    // verdadeiro

} else {

    // falso

}
```

### Exemplo

```java
if (idade >= 18) {

    System.out.println("Pode entrar.");

} else {

    System.out.println("Entrada proibida.");

}
```

---

## Estrutura `else if`

Utilizada quando existem mais de duas possibilidades.

### Sintaxe

```java
if (condicao1) {

} else if (condicao2) {

} else {

}
```

O Java verifica as condições de cima para baixo. Assim que encontra uma condição verdadeira, executa aquele bloco e encerra a estrutura.

---

# Operadores de comparação

| Operador | Significado    |
| -------- | -------------- |
| `>`      | Maior que      |
| `<`      | Menor que      |
| `>=`     | Maior ou igual |
| `<=`     | Menor ou igual |
| `==`     | Igual          |
| `!=`     | Diferente      |

---

# Operadores lógicos

## AND (`&&`)

Retorna verdadeiro apenas quando todas as condições são verdadeiras.

```java
idade >= 18 && idade <= 69
```

---

## OR (`||`)

Retorna verdadeiro quando pelo menos uma das condições é verdadeira.

```java
idade < 16 || idade >= 70
```

---

# Operador módulo (%)

O operador `%` retorna o resto de uma divisão.

Exemplo:

```java
10 % 2 = 0
9 % 2 = 1
```

É muito utilizado para descobrir se um número é par ou ímpar.

```java
numero % 2 == 0
```

---

# Boas práticas

* Utilizar nomes claros para as variáveis.
* Escolher o tipo de dado adequado (`int`, `double`, etc.).
* Evitar repetir condições desnecessárias.
* Aproveitar a ordem dos `if` e `else if` para simplificar o código.
* Sempre fechar o `Scanner` com `teclado.close()` ao final do programa.

---

# Exercícios desenvolvidos

* Verificar se uma pessoa é maior de idade.
* Identificar se um número é positivo ou negativo.
* Verificar se um número é par ou ímpar.
* Aplicar desconto em uma compra.
* Classificar temperatura.
* Classificar notas (Aprovado, Recuperação e Reprovado).
* Classificar faixa etária.
* Classificar salário.
* Classificar situação de voto.

---

# Conceitos aprendidos

Ao final desta aula o aluno é capaz de:

* Criar decisões utilizando `if`.
* Trabalhar com duas possibilidades utilizando `else`.
* Criar múltiplas condições utilizando `else if`.
* Utilizar operadores de comparação.
* Utilizar operadores lógicos (`&&` e `||`).
* Escrever programas que tomam decisões com base nos dados informados pelo usuário.

---

# Resumo

Nesta aula aprendemos como fazer um programa tomar decisões. Utilizamos as estruturas `if`, `else` e `else if` para controlar o fluxo de execução, além dos operadores de comparação e dos operadores lógicos para criar condições mais completas. Também resolvemos diversos exercícios práticos, consolidando a lógica de programação e preparando a base para estruturas de decisão mais avançadas.

---

## Próxima Aula

**JPR-006 – Switch**

Nesta aula aprenderemos quando utilizar o `switch`, suas vantagens em relação ao `if/else if` e como criar menus e sistemas com múltiplas opções de forma organizada.
