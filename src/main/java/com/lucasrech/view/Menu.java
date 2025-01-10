package com.lucasrech.view;

import com.lucasrech.model.Book;
import com.lucasrech.service.BookService;
import com.lucasrech.service.UserService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Menu {
    private final BookService bookService;
    private final UserService userService;
    private final Scanner scanner;

    public Menu(BookService bookService, UserService userService) {
        this.bookService = bookService;
        this.userService = userService;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            mostrarMenu();
            int option = obterOpcao();

            switch (option) {
                case 1:
                    adicionarLivro();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    return;
            }
        }
    }

    private void mostrarMenu() {
        System.out.print("1. Adicionar livro\n2. Adicionar usuário\nEscolha uma opção: ");
    }

    private int obterOpcao() {
        return scanner.nextInt();
    }

    private void adicionarLivro() {
        scanner.nextLine();

        System.out.print("Digite o nome do livro: ");
        String nomeLivro = scanner.nextLine();
        System.out.print("Digite o autor do livro: ");
        String autorLivro = scanner.nextLine();
        System.out.print("Digite o gênero do livro: ");
        String genero = scanner.nextLine();
        System.out.print("Digite a data de publicação do livro (Ex: dd-MM-yyyy): ");
        String dataLivro = scanner.nextLine();
        System.out.print("Digite a quantidade total do livro: ");
        int quantidadeLivro = scanner.nextInt();

        //TODO: Tratar erros
        try {
            bookService.addNewBook(new Book(
                    nomeLivro,
                    autorLivro,
                    genero,
                    parseDate(dataLivro),
                    quantidadeLivro
            ));
        } catch (ParseException e) {
            System.out.println("Erro ao adicionar livro. Formato de data inválido.");;
        }

        System.out.println("Livro adicionado com sucesso!");
    }

    private void removerLivro() {
        System.out.println("Informe o ID do livro a ser removido.");
        int id = scanner.nextInt();
        bookService.removeBook(id);

    }

    public void closeScanner() {
        scanner.close();
    }

    public static Date parseDate(String data) throws ParseException {
        SimpleDateFormat parser = new SimpleDateFormat("dd-MM-yyyy");
        return parser.parse(data);
    }
}

