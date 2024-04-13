package livraria;

import java.util.ArrayList;

public class livraria {
    
 public ArrayList<livro> livros;

 public livraria(){
    this.livros = new ArrayList<>();
 }

public void cadastrarlivro(livro livros){ 
     this.livros.add(livros); 
  }
public String listarlivros(){

 String listarlivros = "";
 for (livro l : this.livros) {
    listarlivros += l.id + " - " + l.titulo + "\n";
 }
return listarlivros;

}

}
