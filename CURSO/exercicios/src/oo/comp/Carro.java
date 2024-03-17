package oo.comp;

public class Carro {
    Motor m = new Motor();

    void acelerar(){
        m.f += 0.4;
    }
    void desacelerar(){
        m.f -= 0.4;
    }
}
