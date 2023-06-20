package exercicio03;

public class Funcionario extends Pessoa {

    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setSalario(String salario) {
        this.salario = Double.parseDouble(salario);
    }


    public String retornaNomeFormatado(){
        return "Funcionário: "+getNome();
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "salario=" + salario +
                "} " + super.toString();
    }
}
