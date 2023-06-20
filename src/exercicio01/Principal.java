package exercicio01;

public class Principal {

    public static void main(String[] args){

        Principal principal = new Principal();

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Elcio");
        pessoa.setIdade(53);
        pessoa.setEndereco("Santo André, SP");
        principal.imprimePessoa(pessoa);

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Jose");
        funcionario.setIdade(32);
        funcionario.setEndereco("Curitiba, PR");
        funcionario.setSalario(2300.00);
        principal.imprimePessoa(funcionario);

        Professor professor = new Professor();
        professor.setNome("Marcelo");
        professor.setIdade(71);
        professor.setEndereco("Jundia, SP");
        professor.setSalario(6300.00);
        professor.setDisciplina("Linguagem de Programação");
        principal.imprimePessoa(professor);

        FuncAdm funcAdm = new FuncAdm();
        funcAdm.setNome("Joana");
        funcAdm.setIdade(26);
        funcAdm.setEndereco("Recive, PE");
        funcAdm.setSalario(8300.00);
        funcAdm.setFuncao("Secretária");
        funcAdm.setSetor("Coordenação");
        principal.imprimePessoa(funcAdm);

        Aluno aluno = new Aluno();
        aluno.setNome("Ricardo");
        aluno.setIdade(22);
        aluno.setEndereco("São Bernardo, SP");
        aluno.setCurso("Ciência da Computação");
        aluno.setSemestre("2");
        principal.imprimePessoa(aluno);

    }

    private void imprimePessoa(Pessoa pessoa){
        System.out.println(pessoa.toString());
    }

}
