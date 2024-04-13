package livraria;

import java.util.Scanner;

public class Sistema {
    
public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      int opcao = 0;
      livraria livraria = new livraria();
     
        while (opcao != 4) {
           System.out.println( "1 - Adicionar livro");
           System.out.println("2 - Listar livros");
           System.out.println("3 - Detalhar livro");
           System.out.println("4 - Sair");
         opcao = sc.nextInt();

          switch (opcao) {
            case 1:
             System.out.println("Adicionando livro");
             int id;String titulo;String nomeAutor;String anoPublicacao;String editora;
             System.out.println("Id: ");
             id = sc.nextInt();
             sc.nextLine();
             System.out.println("Título");
             titulo = sc.nextLine();
             System.out.println("Autor");
             nomeAutor = sc.nextLine();
             System.out.println("Ano");
             anoPublicacao = sc.nextLine();
             System.out.println("Editora");
             editora = sc.nextLine();

                 livro l = new livro(id, titulo, nomeAutor, anoPublicacao, editora);
                livraria.cadastrarlivro(l);
                break;
             case 2:
             System.out.println("Listando livro");
             System.out.println(livraria.listarlivros());
                break;
             case 3:
             System.out.println("Detalhando livro");
                break;
             case 4:
             System.out.println("Encerrando o sistema");
                break;
            default:
            System.out.println("Opcao invalida");
                break;
          }
          sc.close();
        }
    }
}
  
