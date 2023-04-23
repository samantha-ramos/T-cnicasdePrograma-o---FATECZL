package com.mycompany.exerciciotp;
import javax.swing.JOptionPane;


public class ExercicioTP {

   public static void main(String[] args) {
   double consumo = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu consumo: "));
   EstimaFin estima1 = new EstimaFin(consumo);
   estima1.fornecimento(consumo);
   estima1.faturaEstimada();
    }
}
