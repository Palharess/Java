package oo.comp;

public class Motor {
    double f = 1;
    boolean ligado = false;

    int giros(){
        if(ligado == false) return 0;
        else return (int) Math.round(f * 3000);
    }
}
