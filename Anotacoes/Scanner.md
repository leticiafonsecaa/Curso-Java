# ☕ JPR-003 — Entrada de Dados com Scanner

## 🎯 Objetivos da Aula

Ao final desta aula você será capaz de:

- Receber dados digitados pelo usuário.
- Utilizar a classe Scanner.
- Ler textos e números.

---

# 📖 O que é Scanner?

O Scanner é uma classe do Java utilizada para capturar informações digitadas pelo usuário.

Antes do Scanner:

```
Os dados estavam escritos diretamente no código.
```

Com o Scanner:

```
O usuário informa os dados durante a execução.
```

---

# 💻 Código

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.println("Olá, " + nome);

        teclado.close();

    }
}
```

---

# 🧠 Explicando cada parte

## Importação

```java
import java.util.Scanner;
```

Importa a classe Scanner.

---

## Criando o Scanner

```java
Scanner teclado = new Scanner(System.in);
```

Cria um objeto responsável por ler o teclado.

---

## nextLine()

Lê um texto completo.

```java
String nome = teclado.nextLine();
```

---

## nextInt()

Lê um número inteiro.

```java
int idade = teclado.nextInt();
```

---

## nextDouble()

Lê um número decimal.

```java
double nota = teclado.nextDouble();
```

---

## close()

Fecha o Scanner.

```java
teclado.close();
```

---

# 💡 Analogia

Imagine um atendente.

```
Programa

↓

"Qual seu nome?"

↓

Usuário responde

↓

Scanner recebe

↓

Programa continua
```

O Scanner funciona como um intermediário entre o usuário e o programa.

---

# 💼 Onde isso é usado no mercado?

Hoje o Scanner é utilizado principalmente para:

- Exercícios.
- Programas de console.
- Testes rápidos.
- Protótipos.

Em aplicações maiores, as informações costumam ser recebidas por interfaces gráficas, páginas web ou APIs.

---

# ⭐ Boas práticas

- Feche o Scanner utilizando `close()`.
- Escolha o método correto (`nextInt`, `nextDouble`, `nextLine`).
- Dê nomes significativos para o Scanner.

Exemplo:

```java
Scanner teclado = new Scanner(System.in);
```

---

# 🚫 Erros comuns

### Esquecer o import

Sem:

```java
import java.util.Scanner;
```

O programa não compila.

---

### Utilizar o tipo errado

Errado:

```java
String idade = teclado.nextLine();
```

Se deseja comparar a idade:

```java
int idade = teclado.nextInt();
```

---

### Esquecer de fechar

```java
teclado.close();
```

É uma boa prática fechar o Scanner quando ele não será mais utilizado.

---

# 📝 Resumo

Nesta aula aprendemos:

- Importar o Scanner.
- Ler textos.
- Ler números.
- Fechar o Scanner.

---

## 🎯 Próxima Aula

**JPR-004 — Operadores**