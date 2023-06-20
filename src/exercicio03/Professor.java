package exercicio03;

public class Professor extends Funcionario {

    private String disciplina;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String retornaNomeFormatado() {
        return "Professor:"+ getNome();
    }

    @Override
    public String toString() {
        return "Professor{" +
                "disciplina='" + disciplina + '\'' +
                "} " + super.toString();
    }
}
