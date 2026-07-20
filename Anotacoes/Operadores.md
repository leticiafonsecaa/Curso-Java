# ☕ JPR-004 — Operadores

## 🎯 Objetivos da Aula

Ao final desta aula você será capaz de:

- Realizar operações matemáticas.
- Comparar valores.
- Trabalhar com condições.
- Utilizar operadores lógicos.

---

# 📖 O que são operadores?

Operadores são símbolos utilizados para realizar cálculos ou comparações.

Exemplo:

```java
5 + 3
```

O operador é:

```
+
```

---

# Operadores Matemáticos

| Operador | Significado |
|----------|-------------|
| + | Soma |
| - | Subtração |
| * | Multiplicação |
| / | Divisão |
| % | Resto da divisão |

Exemplo:

```java
double media = (nota1 + nota2) / 2;
```

---

# Operadores Relacionais

São utilizados para comparar valores.

| Operador | Significado |
|----------|-------------|
| > | Maior que |
| < | Menor que |
| >= | Maior ou igual |
| <= | Menor ou igual |
| == | Igual |
| != | Diferente |

Exemplo:

```java
idade >= 18
```

Resultado:

```
true
```

ou

```
false
```

---

# Operadores Lógicos

São utilizados para combinar condições.

## && (E)

As duas condições precisam ser verdadeiras.

```java
idade >= 18 && passouNoExame
```

---

## || (OU)

Basta uma condição ser verdadeira.

```java
estudante || idoso
```

---

## ! (NÃO)

Inverte o valor booleano.

```java
!true
```

Resultado:

```
false
```

---

# 💡 Analogia

Imagine uma porta com duas fechaduras.

Para abrir:

```
Ter a chave A

E

Ter a chave B
```

Isso representa:

```java
A && B
```

Se faltar uma chave, a porta continua fechada.

---

# 💼 Onde isso é usado no mercado?

Operadores estão presentes em praticamente todos os sistemas.

Exemplos:

- Login
- Cadastro
- Controle de estoque
- Validação de formulários
- Regras de negócio
- Cálculo de impostos
- Aprovação de alunos
- Controle financeiro

---

# ⭐ Boas práticas

Utilize parênteses para deixar expressões mais claras.

Exemplo:

```java
double media = (nota1 + nota2) / 2;
```

Também mantenha espaços entre operadores:

```java
idade >= 18
```

em vez de

```java
idade>=18
```

---

# 🚫 Erros comuns

### Esquecer os parênteses

Errado:

```java
double media = nota1 + nota2 / 2;
```

Correto:

```java
double media = (nota1 + nota2) / 2;
```

---

### Confundir "=" com "=="

```
=
```

Atribuição.

```
==
```

Comparação.

---

### Comparar texto com número

Errado:

```java
String idade = "22";

idade > 18
```

O correto é:

```java
int idade = 22;
```

---

# 📝 Resumo

Nesta aula aprendemos:

- Operadores matemáticos.
- Operadores relacionais.
- Operadores lógicos.
- Como utilizá-los para resolver problemas.

---

## 🎯 Próxima Aula

**JPR-005 — Estruturas de Decisão (`if`, `else` e `else if`)**