# Chuck Norris Cipher Encoder (Java)

Um projeto desenvolvido em Java para codificação e decodificação de mensagens utilizando a cifra unária de **Chuck Norris** (onde os dados são representados exclusivamente utilizando sequências de zeros e espaços).

Projeto desenvolvido como parte da trilha da **JetBrains Academy / Hyperskill**.

---

## 📌 Sobre o Projeto

A cifra de Chuck Norris é um método de codificação unário baseado na conversão binária (7-bit ASCII) de caracteres. Ao invés de transmitir zeros e uns tradicionais, a mensagem binária é dividida em blocos de bits consecutivos idênticos e representada em blocos de zeros (`0`):

1. **Primeiro bloco (identificador do bit):**
   - `0` indica uma sequência de bits `1`.
   - `00` indica uma sequência de bits `0`.
2. **Segundo bloco (quantidade):**
   - A quantidade de `0`s consecutivos define quantos bits daquele valor estão presentes na sequência.
3. Os blocos são separados por espaços.

### Exemplo de Codificação:
Para o caractere `'C'` (código ASCII 67):
- **Binário de 7 bits:** `1000011`
- **Agrupamentos:**
  - `1` (um bit 1) $\rightarrow$ `0 0`
  - `0000` (quatro bits 0) $\rightarrow$ `00 0000`
  - `11` (dois bits 1) $\rightarrow$ `0 00`
- **Resultado codificado:** `0 0 00 0000 0 00`

---

## ✨ Funcionalidades

- **Codificação de texto (`encode`):**
  - Converte qualquer texto de entrada para a representação unária de Chuck Norris em 7-bit.
- **Decodificação de texto (`decode`):**
  - Converte sequências codificadas de volta para o texto legível original.
- **Validação de entradas:**
  - Detecta caracteres inválidos (diferentes de `0` e espaços).
  - Valida se os blocos identificadores iniciam estritamente com `0` ou `00`.
  - Verifica se o número total de blocos é par.
  - Assegura que o comprimento do binário decodificado seja múltiplo de 7.
- **Interface de Linha de Comando (CLI) Interativa:**
  - Menu em loop contínuo com opções para codificar, decodificar ou sair (`exit`).

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java 11+
- **Build System:** Gradle (com wrapper `gradlew`)
- **Plataforma:** JetBrains Academy / Hyperskill EduTools

---

## 📂 Estrutura do Projeto

```
Chuck Norris Cipher Encoder (Java)/
├── .gitignore
├── README.md
├── build.gradle
├── settings.gradle
├── gradlew / gradlew.bat
├── course-info.yaml
└── Chuck Norris Cipher Encoder (Java)/
    ├── lesson-info.yaml
    ├── Analyze the words/
    ├── The binary world/
    ├── Chuck Norris encrypts only with zeros/
    ├── Try to understand it/
    ├── Cooler than Chuck Norris/
    └── task/
        ├── src/
        │   └── chucknorris/
        │       └── Main.java       # Ponto de entrada da aplicação
        └── test/
            └── ChuckNorrisTest.java # Testes automatizados do curso
```

### Etapas do Curso (Stages):
1. **Stage 1 (Analyze the words):** Introdução à leitura de entrada e espaçamento de caracteres.
2. **Stage 2 (The binary world):** Conversão de caracteres para representação binária de 7 bits.
3. **Stage 3 (Chuck Norris encrypts only with zeros):** Implementação do algoritmo de codificação unária.
4. **Stage 4 (Try to understand it):** Implementação da lógica inversa para decodificação.
5. **Stage 5 (Cooler than Chuck Norris):** Interface interativa, menu de operações e tratamento completo de erros.

---

## 🚀 Como Executar

### Pré-requisitos
- JDK 11 ou superior instalado.

### Executando pelo terminal com Gradle
No Windows (PowerShell / CMD):
```powershell
.\gradlew.bat run
```

Ou compilando e executando diretamente com `javac` / `java`:
```powershell
javac "Chuck Norris Cipher Encoder (Java)\task\src\chucknorris\Main.java" -d out
java -cp out chucknorris.Main
```

### Executando os testes
```powershell
.\gradlew.bat test
```

---

## 💻 Exemplo de Uso

```text
Please input operation (encode/decode/exit):
> encode
Input string:
> Hey!
Encoded string:
0 0 00 00 0 0 00 000 0 00 00 00 0 0 00 0 0 00000 00 00 0 0 00 0 0 0 00 0000 0 0

Please input operation (encode/decode/exit):
> decode
Input encoded string:
> 0 0 00 00 0 0 00 000 0 00 00 00 0 0 00 0 0 00000 00 00 0 0 00 0 0 0 00 0000 0 0
Decoded string:
Hey!

Please input operation (encode/decode/exit):
> exit
Bye!
```
