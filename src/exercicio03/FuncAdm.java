package exercicio03;

public class FuncAdm extends Funcionario {

    private String setor;
    private String funcao;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "FuncAdm{" +
                "setor='" + setor + '\'' +
                ", funcao='" + funcao + '\'' +
                "} " + super.toString();
    }
}
