package br.pacote;

import br.api.Calculadora;

public class CalcImpl implements Calculadora{
    @Override
    public double soma(double... args) {
        double total = 0;
        for(int i = 0; i < args.length; i++){
            total += args[i];
        }
        return total;
    }

}
