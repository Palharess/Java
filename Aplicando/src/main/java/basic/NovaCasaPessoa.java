package basic;

import entity.Casa;
import entity.Pessoas;
import infra.DAO;

public class NovaCasaPessoa {
    public static void main(String[] args) {
        Casa casa = new Casa();
        casa.setEndereco("rua frei");
        Pessoas pessoa = new Pessoas("Gabriel", "08821365697", "gabrielpalhares333@gmail.com", casa);
        DAO <Object> dao = new DAO<>();
        dao.abrirT().incluir(casa).incluir(pessoa).fecharT().fechar();


    }
}
