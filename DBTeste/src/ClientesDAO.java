import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;


public class ClientesDAO {

	public Connection abrir() {
		Connection c = null;
		try {
			Class.forName(BD.JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println("Não encontrou o driver chamado "
					+ BD.JDBC_DRIVER + " na memoria");
		}
		try {
			c = DriverManager.getConnection(BD.URL_CONEXAO, BD.USUARIO,
					BD.SENHA);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}

	public void inserir(Cliente c) {
		Connection conexao = abrir();
		try {
			PreparedStatement ps = conexao
					.prepareStatement("INSERT INTO clientes (codigo, nome) VALUES (?, ?)");
			ps.setInt(1, c.getCodigo());
			ps.setString(2, c.getNome());
			ps.execute();
			ps.close();
			conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void alerar(Cliente c) {
		Connection conexao = abrir();
		try {
			PreparedStatement ps = conexao
					.prepareStatement("UPDATE clientes SET nome = ? WHERE codigo = ?");
			ps.setString(1, c.getNome());
			ps.setInt(2, c.getCodigo());
			ps.execute();
			ps.close();
			conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void excluir(Cliente c) {
		Connection conexao = abrir();
		try {
			PreparedStatement ps = conexao
					.prepareStatement("DELETE FROM clientes WHERE codigo = ?");
			ps.setInt(1, c.getCodigo());
			ps.execute();
			ps.close();
			conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Cliente buscar(Cliente c) {
		return null;
	}

	public Collection<Cliente> buscarTodos() {
		Connection conexao = abrir();
		Collection<Cliente> clientes = new ArrayList<Cliente>();
		try {
			Statement s = conexao.createStatement();
			ResultSet rs = s.executeQuery("SELECT * FROM clientes");
			while (rs.next()) {
				Cliente temp = new Cliente();
				temp.setCodigo(rs.getInt("codigo"));
				temp.setNome(rs.getString("nome"));
				clientes.add(temp);
			}
			rs.close();
			conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clientes;
	}
}
