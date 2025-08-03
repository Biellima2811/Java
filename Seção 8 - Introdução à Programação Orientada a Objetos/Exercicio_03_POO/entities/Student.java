package entities;

// A versão correta da classe Student
public class Student {

    // 1. Possui os 3 atributos necessários para guardar as notas individuais
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    /**
     * 2. O método notaFinal() tem a lógica correta: somar as 3 notas.
     * Ele usa os dados específicos deste aluno.
     */
    public double notaFinal() {
        return nota1 + nota2 + nota3;
    }

    /**
     * 3. O método de gerar relatório é 'void' porque sua função é imprimir, não retornar um valor.
     * Ele usa a nota final correta para tomar as decisões.
     */
    public void gerarRelatorioFinal() {
        double finalGrade = notaFinal();

        System.out.printf("FINAL GRADE = %.2f\n", finalGrade);

        if (finalGrade >= 60.0) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            double pontosFaltantes = 60.0 - finalGrade;
            System.out.printf("MISSING %.2f POINTS\n", pontosFaltantes);
        }
    }
}