# JPR-006 – Switch

## 🎯 Objetivos da Aula

Aprender a utilizar a estrutura `switch` para criar múltiplas decisões de forma organizada, entendendo quando ela é mais adequada do que o `if/else if` e conhecendo o funcionamento do `break`, `default` e do comportamento chamado **fall-through**.

---

# O que é o Switch?

O `switch` é uma estrutura de decisão utilizada quando uma variável pode assumir **valores específicos**.

Em vez de utilizar vários `if` e `else if`, podemos organizar o código de forma mais simples e legível.

Exemplo:

```java
switch (opcao) {

    case 1:
        System.out.println("Novo Jogo");
        break;

    case 2:
        System.out.println("Continuar");
        break;

    default:
        System.out.println("Opção inválida");
}
```

---

# Estrutura do Switch

```java
switch (variavel) {

    case valor1:
        // código
        break;

    case valor2:
        // código
        break;

    default:
        // código
}
```

---

# Componentes

## switch

Recebe a variável que será analisada.

Exemplo:

```java
switch (codigo)
```

---

## case

Cada `case` representa um valor possível da variável.

Exemplo:

```java
case 1:
```

Significa:

> Se o valor da variável for igual a **1**, execute este bloco.

---

## break

O `break` encerra a execução do `switch`.

Após executá-lo, o programa continua normalmente após o fechamento da estrutura.

Exemplo:

```java
case 2:
    System.out.println("Fevereiro");
    break;
```

---

## default

O `default` funciona como o `else` do `if`.

Ele será executado quando nenhum `case` corresponder ao valor informado.

Exemplo:

```java
default:
    System.out.println("Opção inválida");
```

---

# Quando utilizar o Switch?

O `switch` é indicado quando trabalhamos com **valores fixos**.

Exemplos:

* Menus
* Dias da semana
* Meses do ano
* Opções de sistemas
* Status
* Códigos

Exemplo:

```java
switch (mes) {

    case 1:
        System.out.println("Janeiro");
        break;

    case 2:
        System.out.println("Fevereiro");
        break;

    default:
        System.out.println("Mês inválido");
}
```

---

# Quando NÃO utilizar?

O `switch` não é indicado para comparações envolvendo intervalos.

Exemplos:

```java
if (nota >= 7)
```

```java
if (idade < 18)
```

Nesses casos, devemos utilizar `if`, `else if` e `else`.

---

# Fall-through

Quando esquecemos o `break`, o Java continua executando todos os próximos `case`.

Exemplo:

```java
switch (codigo) {

    case 1:
        System.out.println("Janeiro");

    case 2:
        System.out.println("Fevereiro");

    case 3:
        System.out.println("Março");

    default:
        System.out.println("Mês inválido");
}
```

Se o usuário informar:

```text
1
```

O resultado será:

```text
Janeiro
Fevereiro
Março
Mês inválido
```

Esse comportamento recebe o nome de **fall-through**.

---

# Uso intencional do Fall-through

Em algumas situações, vários `case` executam exatamente a mesma ação.

Nesses casos, podemos utilizar o fall-through de forma proposital.

Exemplo:

```java
switch (dia) {

    case 1:
    case 7:
        System.out.println("Fim de semana");
        break;

    default:
        System.out.println("Dia útil");
}
```

Assim evitamos repetir o mesmo código em vários `case`.

---

# Boas práticas

* Sempre utilizar `break`, exceto quando o fall-through for intencional.
* Utilizar `default` para tratar valores inesperados.
* Preferir `switch` quando houver várias opções fixas.
* Utilizar `if/else` para comparações envolvendo intervalos.
* Manter cada `case` simples e organizado.

---

# Exercícios desenvolvidos

Durante esta aula foram desenvolvidos os seguintes exercícios:

1. Seleção de meses (Janeiro, Fevereiro e Março).
2. Menu de opções de um jogo.
3. Dias da semana.
4. Turno de estudo (Matutino, Vespertino e Noturno).

Também foi realizado um experimento removendo os `break` para compreender o comportamento do **fall-through**.

---

# Conceitos aprendidos

Ao final desta aula o aluno é capaz de:

* Utilizar a estrutura `switch`.
* Criar múltiplos `case`.
* Utilizar corretamente o `break`.
* Utilizar o `default`.
* Identificar quando usar `switch` ou `if/else`.
* Compreender o comportamento do **fall-through**.
* Utilizar o fall-through de forma intencional quando necessário.

---

# Resumo

Nesta aula aprendemos a estrutura `switch`, uma alternativa ao `if/else if` quando trabalhamos com valores fixos. Estudamos a função dos comandos `case`, `break` e `default`, realizamos exercícios práticos e entendemos o comportamento do **fall-through**, descobrindo tanto os problemas causados pela ausência do `break` quanto os casos em que esse comportamento pode ser utilizado de forma intencional para evitar repetição de código.

---

## Próxima Aula

**JPR-007 – Estruturas de Repetição (while, do-while e for)**

Nesta aula aprenderemos a fazer programas repetirem instruções automaticamente, criando laços de repetição para resolver problemas que exigem executar uma mesma tarefa várias vezes.
