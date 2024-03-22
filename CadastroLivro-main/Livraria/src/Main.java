import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Livros> livrosCadastrados = new ArrayList<>();
        boolean cadastro = true;
        String continuarCadastro;
       new teste();

        while (cadastro) {
            Livros livro = new Livros(); // Move a criação do objeto para dentro do loop
            System.out.println("Título: ");
            livro.setTitulo(JButton);
            System.out.println("Autor: ");
            livro.setAutor(input.nextLine());
            System.out.println("Ano de publicação: ");
            livro.setAnoDePublicacao(input.nextInt());
            System.out.println("Quantidade de páginas: ");
            livro.setQuantidadeDePaginas(input.nextInt());
            input.nextLine();

            livrosCadastrados.add(livro);

            do {
                System.out.println("Deseja cadastrar mais livros? (S/N)");
                continuarCadastro = input.nextLine();

                if (continuarCadastro.equalsIgnoreCase("N")) {
                    cadastro = false;
                } else if (continuarCadastro.equalsIgnoreCase("S")) {
                    cadastro = true;
                } else {
                    System.out.println("Opção inválida, digite (S/N)");
                }
            } while (!continuarCadastro.equalsIgnoreCase("S") && !continuarCadastro.equalsIgnoreCase("N"));
        }

        mostrarDetalhesLivros(livrosCadastrados);
    }


    public static void mostrarDetalhesLivros(ArrayList<Livros> livros) {

        for (int i = 0; i < livros.size(); i++) {
            Livros livroAtual = livros.get(i);
            System.out.println((i + 1) + " Livros cadastrados :");
            System.out.println("Titulo: " + livroAtual.getTitulo());
            System.out.println("Autor: " + livroAtual.getAutor());
            System.out.println("Ano de publicação: " + livroAtual.getAnoDePublicacao());
            System.out.println("Quantidade de paginas: " + livroAtual.getQuantidadeDePaginas());
        }
    }
}
