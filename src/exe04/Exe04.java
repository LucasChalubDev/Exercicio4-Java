
package exe04;

import javax.swing.JOptionPane;

public class Exe04 {

    public static void main(String[] args) {
        int mediaAritimetica = 0;
        int valoresPares = 0;
        int valoresImpares = 0;
        int porcentValorPar;
        int porcentValorImpar;
        int soma = 0;
        int cont = 0;
 
        int valorA = 1;
        while (valorA != (0)) {
            System.out.println("Informe um número inteiro e positivo;");
            valorA = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro e positivo"));
 
            if (valorA >= 0) {
                soma = soma + valorA;
                cont = cont + 1;
 
                if (valorA % 2 == 0) {
                    valoresPares = valoresPares + 1;
                } else {
                    valoresImpares = valoresImpares + 1;
                }
            }
        }
 
        mediaAritimetica = soma / cont;
 
 
        porcentValorPar = valoresPares * 100 / cont;
        porcentValorImpar = valoresImpares * 100 / cont;

        JOptionPane.showMessageDialog(null, "A média aritimética é: " + mediaAritimetica + "\nA quantidade de valores lidos PARES é: " + valoresPares + "\nA quantidade de valores lidos IMPARES é: " + valoresImpares + "\nO percentual de PARES é: " + porcentValorPar + "\nO percentual de IMPARES é: " + porcentValorImpar);
    }

}   

