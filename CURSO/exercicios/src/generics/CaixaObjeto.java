package generics;

public class CaixaObjeto<T> {
    private T coisa;

    public void aguardar(T coisa){
        this.coisa = coisa;
    }
    public T abrir(){
        return coisa;
    }
}
