import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DBExemploConexao {
	public static void main (String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("org.postgresql.Driver");
		Connection c = DriverManager.getConnection(
				"jdbc:postgresql://localhost/livraria",
				"postgres",
				"aluno");

		ClientesDAO cs = new ClientesDAO(); 

		//apagar todos clientes
		System.out.println("Apagando todos clientes...");
		for (Cliente temp : cs.buscarTodos())
			cs.excluir(temp);
		
		//inserindo clientes
		
		
		System.out.println("Inserindo Clientes...");
		Cliente c1 = new Cliente (1, "Fulano");
		Cliente c2 = new Cliente (2, "Beltrano");
		Cliente c3 = new Cliente (3, "Ciclano");
		cs.inserir(c1);
		cs.inserir(c2);
		cs.inserir(c3);
		
		
		
		
		/*PreparedStatement p = c.prepareStatement(
				"INSERT INTO clientes (codigo, nome) VALUES (?,?)");
		p.setInt(1,1);
		p.setString(2, "fulano");
		p.execute();
		p.setInt(1,2);
		p.setString(2, "beltrano");
		p.execute();
		p.setInt(1,3);
		p.setString(2, "cliclano");
		p.execute();
		p.setInt(1,4);
		p.setString(2, "ciclano");
		p.execute();
		*/
		
		// listar clientes
		//ClientesDAO cs = new ClientesDAO();
		
		System.out.println("Listando todos os clientes...");
		for (Cliente temp : cs.buscarTodos())
			System.out.println(temp.getCodigo() + " - " + temp.getNome());
		
		/*
		Statement s = c.createStatement();
		System.out.println("Listando todos os clientes...");
		ResultSet rs = s.executeQuery("SELECT * FROM clientes");
		while (rs.next())
			System.out.println(rs.getInt("codigo") + " - " + rs.getString("nome"));
		*/
		
		//alterar clientes
		System.out.println ("Alterando o cliente 1...");
		c1.setNome("Fulano de Tal");
		cs.alerar(c1);
				
		/*p = c.prepareStatement(
				"UPDATE clientes SET nome = ? WHERE codigo = 1");
		p.setString(1, "Fulano de Tal");
		p.execute();
		
		*/
		
		//apagar todos clientes
		System.out.println("Apagando todos clientes...");
		for (Cliente temp : cs.buscarTodos())
			cs.excluir(temp);
		//s.executeUpdate ("DELETE FROM clientes");

	}

}
