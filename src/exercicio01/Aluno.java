package exercicio01;

public class Aluno extends Pessoa{

    private String semestre;
    private String curso;

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "semestre='" + semestre + '\'' +
                ", curso='" + curso + '\'' +
                "} " + super.toString();
    }
}
