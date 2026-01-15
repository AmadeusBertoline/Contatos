package model;

import java.time.LocalDate;

public class Contato {
	
	private long id = 0;
	private String nome = "";
	private String telefone = "";
	private String email = "";
	private LocalDate nascimento = LocalDate.now();
	
	public long getId() {
		
		return this.id;
		
	}
	public void setId(long id) {
	
		this.id = id;
		
	}
	
	public String getNome() {
		
		return this.nome;
		
	}
	public void setNome(String nome) {
		
		this.nome = nome;
		
	}

	public String getTelefone() {
		
		return this.telefone;
	}
	public void setTelefone(String telefone) {
		
		this.telefone = telefone;
		
	}
	
	public String getEmail() {
		
		return this.email;
		
	}
	public void setEmail(String email) {
		
		this.email = email;
		
	}
	
	public LocalDate getNascimento() {
		
		return this.nascimento;
		
	}
	public void setNascimento(LocalDate nascimento) {
		
		this.nascimento = nascimento;
		
	}
}
