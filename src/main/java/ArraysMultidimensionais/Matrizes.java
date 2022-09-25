package ArraysMultidimensionais;
import javax.swing.*;

public class Matrizes {
    public static void main(String[] args) {
        //Vetor Alunos
        String[] alunos = { "JOAO", "MARIA", "JOSE"};
        //Matriz das Notas
        float [][] notas = new float[3][4];
        float somaNotas, mediaAluno;
        String statusAluno;

        for(int i = 0;1 < 3;i++){
            System.out.println("Aluno: " + alunos[i]);
            //laco interno
            somaNotas = 0;
            mediaAluno = 0;
            for(int j = 0; j < 4; j++){
                notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Digite a " + (j+1) + " nota do " + alunos[i]));
                somaNotas = somaNotas + notas[i][j];
            }
            mediaAluno = somaNotas / 4;
            if(mediaAluno < 5.5){
                statusAluno = "REPROVADO";
            }else if (mediaAluno >= 5.5 && mediaAluno <= 7.5) {
                statusAluno = "EM RECUPERACAO";
            }else {
                statusAluno = "APROVADO";
                }
            //Imprime boletim
            System.out.println("\n**********BOLETIM************");
            System.out.println("Aluno: " + alunos[i]);
            System.out.println("Notas");
            //imprime resultado final da media
            for (int k = 0; k < 4; k++){
                System.out.println((k+1) + " - " + notas[i][k]);
            }
            System.out.println("Media: " + mediaAluno + " - " + statusAluno);
        }
    }
}
