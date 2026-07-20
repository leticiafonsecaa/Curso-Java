# ☕ JPR-001 — Hello World

## 🎯 Objetivos da Aula

Ao final desta aula você será capaz de:

- Criar seu primeiro programa em Java.
- Entender a estrutura básica de uma aplicação Java.
- Compilar um programa utilizando o `javac`.
- Executar um programa utilizando o `java`.

---

# 📖 O que é o Hello World?

O **Hello World** é tradicionalmente o primeiro programa desenvolvido ao aprender uma nova linguagem de programação.

Seu objetivo não é ensinar lógica, mas confirmar que o ambiente está funcionando corretamente e apresentar a estrutura básica da linguagem.

---

# 💻 Código

```java
public class Main {

    public static void main(String[] args) {

        System.out.println("Olá, mundo!");

    }
}
```

---

# 🧠 Entendendo cada parte

## public class Main

Define uma classe chamada **Main**.

Em Java, todo código precisa estar dentro de uma classe.

Neste curso utilizaremos a classe `Main` na maioria das aulas.

---

## public static void main(String[] args)

É o método principal do programa.

Quando executamos:

```bash
java Main
```

o Java procura exatamente este método para iniciar a execução.

Podemos pensar nele como a **porta de entrada** da aplicação.

---

## System.out.println()

É responsável por exibir informações no console.

Exemplo:

```java
System.out.println("Olá!");
```

Saída:

```
Olá!
```

---

# 📦 Compilando o programa

Para transformar o código Java em um arquivo que a JVM consiga executar, utilizamos:

```bash
javac Main.java
```

Será criado um arquivo chamado:

```
Main.class
```

---

# ▶️ Executando

Depois da compilação:

```bash
java Main
```

Saída:

```
Olá, mundo!
```

---

# 🖥️ Como funciona?

```
Main.java
        │
        ▼
 javac Main.java
        │
        ▼
 Main.class
        │
        ▼
 java Main
        │
        ▼
 JVM executa o programa
```

---

# 💡 Analogia

Imagine que você escreveu um livro em português.

Nem todo mundo entende português.

Você precisa de um tradutor.

Na programação acontece algo parecido.

```
Você escreve Java
        │
        ▼
Compilador (javac)
        │
        ▼
Bytecode (.class)
        │
        ▼
JVM
        │
        ▼
Computador executa
```

O compilador traduz seu código para um formato que a JVM consegue interpretar.

---

# 💼 Onde isso é usado no mercado?

Sempre.

Toda aplicação Java possui um ponto de entrada.

Mesmo utilizando frameworks como Spring Boot, existe uma classe principal responsável por iniciar a aplicação.

---

# ⭐ Boas práticas

- Nomeie a classe com letras maiúsculas (`Main`).
- Organize a indentação.
- Salve o arquivo antes de compilar.
- Mantenha um código limpo e bem formatado.

---

# 🚫 Erros comuns

### Esquecer de salvar o arquivo

Se alterar o código e executar apenas:

```bash
java Main
```

o programa continuará executando a versão anterior.

É necessário recompilar:

```bash
javac Main.java
java Main
```

---

### Nome do arquivo diferente da classe

Errado:

Arquivo:

```
main.java
```

Classe:

```java
public class Main
```

Resultado:

```
error: class Main is public, should be declared in a file named Main.java
```

O nome do arquivo deve ser exatamente igual ao da classe pública.

---

### Esquecer de compilar

Sempre que modificar o código:

```bash
javac Main.java
```

Depois:

```bash
java Main
```

---

# 📝 Resumo

Nesta aula aprendemos:

- O que é uma classe.
- O método `main`.
- Como utilizar `System.out.println()`.
- Como compilar um programa Java.
- Como executar um programa Java.

---

## 🎯 Próxima Aula

**JPR-002 — Variáveis e Tipos de Dados**

Vamos aprender como armazenar informações na memória utilizando variáveis.