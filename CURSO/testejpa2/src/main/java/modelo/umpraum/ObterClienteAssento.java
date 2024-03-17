package modelo.umpraum;

import infra.DAO;

public class ObterClienteAssento {
    public static void main(String[] args) {
        DAO<Cliente> dao = new DAO<>(Cliente.class);
        Cliente cliente = dao.obterClienteId(1);
        System.out.println(cliente.getAssento().getCliente().getNome());
    }
}
