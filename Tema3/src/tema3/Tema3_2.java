//2. Se citeste un numar natural n, se citesc 
//   primul termen si ratia unei progresii,
//   sa se calculeze recursiv termenul n al progresiei
package tema3;

import javax.swing.JOptionPane;

public class Tema3_2 {
    public static int progresieAritmetica(int n, int primulTermen, int ratie){
        return primulTermen + (n-1)*ratie;
    }
    public static void main(String[] args){
        int n, primulTermen, ratie;
        n = Integer.parseInt(JOptionPane.showInputDialog("Introdu indicele termenului pe care doresti sa il afli: "));
        primulTermen = Integer.parseInt(JOptionPane.showInputDialog("Introdu primul termen al progresiei: "));
        ratie = Integer.parseInt(JOptionPane.showInputDialog("Introdu ratia progresiei: "));
        System.out.println("Al " + n + "-lea termen al progresiei este: " + progresieAritmetica(n, primulTermen, ratie));
    }
}
