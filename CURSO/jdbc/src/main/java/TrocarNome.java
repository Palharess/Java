import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TrocarNome {

    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConexao();

        Scanner entrada = new Scanner(System.in);
        int codigo = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Novo: ");
        String novo = entrada.nextLine();
        String sql2 = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
        PreparedStatement stmt2 = conexao.prepareStatement(sql2);
        stmt2.setString(1, novo);
        stmt2.setInt(2, codigo);
        stmt2.execute();
        stmt2.close();



    }
}
