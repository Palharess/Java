import br.api.Calculadora;
import br.pacote.CalcImpl;

module app.calculo {
    requires transitive app.api;
    requires java.base;
    exports br.pacote;
    provides Calculadora with CalcImpl;
}