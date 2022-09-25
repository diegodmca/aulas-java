package Construtores;
import Construtores.Aluno.STATUS;
import Construtores.Aluno.MATRICULA;

    public class Construtor {

        public static void main(String[] args) {
            Aluno alu = new Aluno( 8,  8,  8);
            // media
            double mediaAlunoFinal = alu.calcularMediaAluno();

            // Checar a nota
                if (mediaAlunoFinal < 6 ) {
                alu.situacaoAluno = STATUS.REPROVADO;
            } else {
                alu.situacaoAluno = STATUS.APROVADO;
            }
            System.out.println("A media do aluno e: " + alu.calcularMediaAluno() + " e o aluno esta " + alu.situacaoAluno);

                //usa enum MATRICULA
            alu.situacaoMatricula = MATRICULA.MATRICULADO;
            System.out.println("O aluno esta: " + alu.situacaoMatricula);


        }
    }

