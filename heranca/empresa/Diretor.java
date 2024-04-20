package heranca.empresa;

public class Diretor extends Funcionario {
    

private Integer quantidadeGerenciais;


private Diretor(){}

  public Diretor(String nome, Integer cpf, Integer telefone, Double salario, Integer quantidadeGerenciais) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.salario = salario;
        this.quantidadeGerenciais = quantidadeGerenciais;
    }


    

    public Integer getQuantidadeGerenciais() {
        return this.quantidadeGerenciais;
    }

    public void setQuantidadeGerenciais(Integer quantidadeGerenciais) {
        this.quantidadeGerenciais = quantidadeGerenciais;
    }

    public Double getBonificacao(){
        return this.salario * 0.35;
    }


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", salario='" + getSalario() + "'" +
            ", quantidadeGerenciais='" + getQuantidadeGerenciais() + "'" +
            ", bonificacao='" + getBonificacao() + "'" +
            "}";
    }

}

