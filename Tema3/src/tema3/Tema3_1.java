/*
1. 
    Se citesc n1 si n2 capetele interval inchis,
    sa se afiseze daca exista cel puitin un nr prim
*/
package tema3;
import javax.swing.*;

public class Tema3_1 {
    static Boolean isPrime(int numar) {
        if (numar == 2)
            return true;
        else if (numar % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(numar); i += 2) {
            if (numar % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Introdu capatul din stanga: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Introdu capatul din dreapta: "));
        boolean flag = false;
        for(int i=n1; i<=n2; i++)
        {
            if(isPrime(i))
                flag = true;
        }
        if(flag)
            System.out.println("Exista");
        else
            System.out.println("Nu exista");
    }
    
}