package util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquais {

    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(33, 55);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(33, 55);

        boolean existe = lista.contains(cc3);

        System.out.println("Já Existe? " + existe);

        for (Conta conta : lista) {
            if (conta.equals(cc3)) {
                System.out.println("Já tenho essa conta!");
            }
        }

        for (Conta conta : lista) {

            System.out.println(conta);
        }
    }

}
