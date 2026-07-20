# ☕ JPR-002 — Variáveis e Tipos de Dados

## 🎯 Objetivos da Aula

Ao final desta aula você será capaz de:

- Entender o conceito de variável.
- Conhecer os principais tipos de dados do Java.
- Armazenar informações em memória.
- Exibir valores utilizando o `System.out.println()`.

---

# 📖 O que é uma variável?

Uma variável é um espaço reservado na memória do computador para armazenar informações.

Podemos imaginar uma variável como uma caixa identificada por um nome.

Exemplo:

```
Nome  → Letícia
Idade → 22
Curso → ADS
```

Sempre que precisarmos dessas informações, basta utilizar o nome da variável.

---

# 💻 Código

```java
public class Main {

    public static void main(String[] args) {

        String nome = "Letícia";
        int idade = 22;
        String curso = "ADS";
        double nota = 9.5;
        boolean aprovado = true;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("Nota: " + nota);
        System.out.println("Aprovado: " + aprovado);

    }
}
```

---

# 🧠 Tipos de Dados

## String

Armazena textos.

```java
String nome = "Letícia";
```

---

## int

Armazena números inteiros.

```java
int idade = 22;
```

---

## double

Armazena números com casas decimais.

```java
double nota = 9.5;
```

---

## boolean

Armazena apenas dois valores.

```java
true
false
```

Exemplo:

```java
boolean aprovado = true;
```

---

# 💡 Analogia

Imagine um armário com várias gavetas.

Cada gaveta possui uma etiqueta.

```
┌───────────────┐
│ Nome          │ → Letícia
├───────────────┤
│ Idade         │ → 22
├───────────────┤
│ Curso         │ → ADS
├───────────────┤
│ Nota          │ → 9.5
└───────────────┘
```

Cada variável é uma gaveta onde guardamos um tipo específico de informação.

---

# 💼 Onde isso é usado no mercado?

Praticamente em qualquer sistema.

Exemplos:

- Cadastro de clientes
- Produtos
- Funcionários
- Pedidos
- Usuários
- Bancos
- Jogos
- Aplicativos

Sempre que um sistema precisa armazenar uma informação, utiliza variáveis.

---

# ⭐ Boas práticas

- Utilize nomes claros para as variáveis.
- Evite abreviações sem necessidade.
- Mantenha um padrão de escrita.

Bom exemplo:

```java
String nomeAluno;
double notaFinal;
```

Evite:

```java
String n;
double x;
```

---

# 🚫 Erros comuns

### Esquecer as aspas em textos

Errado:

```java
String nome = Letícia;
```

Correto:

```java
String nome = "Letícia";
```

---

### Utilizar o tipo errado

Errado:

```java
String idade = "22";
```

Se a idade será utilizada em cálculos, o correto é:

```java
int idade = 22;
```

---

# 📝 Resumo

Nesta aula aprendemos:

- O que é uma variável.
- Os tipos `String`, `int`, `double` e `boolean`.
- Como declarar variáveis.
- Como exibir seus valores.

---

## 🎯 Próxima Aula

**JPR-003 — Scanner**