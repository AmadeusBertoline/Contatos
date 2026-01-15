package dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Contato;

public class ContatoDAOImpl implements ContatoDAO{
	
	private Connection con;
	
	//conexão ao banco (construtor)
	public ContatoDAOImpl() {
		
		try {
			
			// 1. Carregar o driver e conectar
			Class.forName("org.mariadb.jdbc.Driver");
			// 2. Usa o driver manager, que está com o jdbc, com o método para conectar neste banco
			//neste endereço
			con = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3307/fzl_poo_noite", "root", "alunofatec"
					);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	

	@Override
	public void criar(Contato c) {
		
		try {
			
			//O PreparedStatement substitui as '?' pelos valores, evitando SQL injection
			String sql = "INSERT INTO contato (nome, telefone, email, nascimento) VALUES (?, ?, ?, ?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, c.getNome());
			pst.setString(2, c.getTelefone());
			pst.setString(3, c.getEmail());
			pst.setDate(4, java.sql.Date.valueOf(c.getNascimento()));
			pst.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Contato> lerTodos() {
		
		List<Contato> lista = new ArrayList<>();
		try {
			
			String sql = "SELECT * FROM contato";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery(); //Executa a consulta e guarda no result set
			while(rs.next()) {
				
				Contato c = new Contato();
				c.setId(rs.getLong("id"));
				c.setNome(rs.getString("nome"));
				c.setNascimento(rs.getDate("nascimentso").toLocalDate());
				lista.add(c);
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}

	@Override
	public void atualizar(long id, Contato c) {
		
		
		
	}

	@Override
	public void apagar(long ide) {
		// TODO Auto-generated method stub
		
	}

}
