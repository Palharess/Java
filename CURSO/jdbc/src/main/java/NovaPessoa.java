import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConexao();
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o nome: ");
        String nome = entrada.nextLine();
        String sql = "INSERT INTO pessoas (nome) values (?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1,nome);
        stmt.execute();

        entrada.close();
    }
}
