import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoa2 {

    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
        Connection conexao = FabricaConexao.getConexao();
        String letras = entrada.nextLine();
        List<String> lista = Arrays.asList(letras.split(" "));
        StringBuilder sql = new StringBuilder("SELECT * FROM pessoas where nome like ");
        int tamanho = lista.size();
        int contador = 0;
        while(tamanho > 0){
            sql.append("'%").append(lista.get(contador));
            if( tamanho - 1 != 0) sql.append("%' or nome like ");
            else sql.append("%'");
            contador++;

            tamanho--;
        }
        System.out.println(sql.toString());
        PreparedStatement stmt = conexao.prepareStatement(sql.toString());
        ResultSet result = stmt.executeQuery();
        while(result.next()){
            System.out.println(result.getString("nome"));
        }


        conexao.close();
    }
}
