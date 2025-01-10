# Sistema de Biblioteca

Este projeto é um **Sistema de Biblioteca** simples baseado em terminal, desenvolvido em **Java** com foco em **Programação Orientada a Objetos (POO)**. Ele permite gerenciar livros, usuários e realizar operações de empréstimo e devolução de livros. A aplicação segue boas práticas de organização de código e modularidade.

---

## **Funcionalidades**

### **Gerenciamento de Livros**
- Adicionar livros ao acervo.
- Remover livros do acervo.
- Listar todos os livros disponíveis.
- Verificar disponibilidade e número de cópias de um livro.

### **Gerenciamento de Usuários**
- Cadastrar novos usuários.
- Remover usuários existentes.
- Listar todos os usuários registrados.

### **Operações de Empréstimo e Devolução**
- Emprestar livros para usuários:
    - Atualiza a lista de livros emprestados do usuário.
    - Diminui o número de cópias disponíveis no acervo.
- Devolver livros emprestados:
    - Remove o livro da lista de livros emprestados do usuário.
    - Aumenta o número de cópias disponíveis no acervo.

### **Interface de Menu**
- Menu interativo no terminal para navegar entre as funcionalidades.
- Navegação simples com opções numéricas.

---

## **Estrutura do Projeto**

O projeto está organizado em pacotes para facilitar a modularidade e a separação de responsabilidades:

### **Pacote `data`**
- **`Library`**: Centraliza as listas de usuários e livros.

### **Pacote `model`**
- **`Book`**: Representa um livro com atributos como ID, título, autor e número de cópias disponíveis.
- **`User`**: Representa um usuário com atributos como ID, nome e lista de livros emprestados.

### **Pacote `service`**
- **`BookService`**: Gerencia operações relacionadas a livros.
- **`UserService`**: Gerencia operações relacionadas a usuários.

### **Pacote `view`**
- **`Menu`**: Classe responsável pela interface de interação via terminal.

### **Outras Classes**
- **`Container`**: Configura os componentes e injeta dependências necessárias.
- **`Main`**: Ponto de entrada do programa.

---

## **Como Executar**

1. **Clone o Repositório**:
   ```bash
   git clone https://github.com/lucas-rech/sistema-biblioteca.git
   ```

2. **Abra o Projeto em Sua IDE Favorita**:
    - Recomendado: IntelliJ IDEA, Eclipse ou VS Code com suporte para Java.

3. **Compile o Projeto**:
    - Certifique-se de que o Java 11 ou superior está instalado.
    - Compile e execute a classe `Main`.

4. **Interaja com o Sistema**:
    - Siga as instruções do menu exibido no terminal para gerenciar livros, usuários e realizar empréstimos.

---

## **Tecnologias Utilizadas**
- **Java**: Linguagem principal.
- **JDK 11+**: Compatível com versões mais recentes do Java.
- **Maven**: Utilizado Maven para build de projeto.

---

## **Futuros objetivos**
O intuito é futuramente escalonar o sistema para uso de um banco de dados SQL e habilitar endpoints via API Restful.
   

## **Licença**
Este projeto está licenciado sob a [MIT License](LICENSE).

---

## **Autor**
- **Lucas Rech**
    - GitHub: [lucas-rech](https://github.com/lucas-rech)
    - LinkedIn: [rechlucas](https://linkedin.com/in/rechlucas)

