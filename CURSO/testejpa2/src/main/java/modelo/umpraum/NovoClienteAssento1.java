package modelo.umpraum;

import infra.DAO;

public class NovoClienteAssento1 {
    public static void main(String[] args) {
        Assento assento = new Assento("16C");
        Cliente cliente = new Cliente("Ana", assento);

        DAO<Object> dao = new DAO<>();
        dao.abrirT().incluir(assento).incluir(cliente).fecharT().fechar();
    }
}
