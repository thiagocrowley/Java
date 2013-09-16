//http://www.giulianoprado.xpg.com.br/dai/arquivos/exercicios_heranca.pdf

package br.com.estudo.logicaesintaxe;

public class Animal {

	public String nome,
		   cor,
		   ambiente;
	
	int comprimento,
		patas = 4;

	float velocidade;
	
	public Animal(String nome, String cor, String ambiente, int comprimento, int patas, float velocidade) {
		this.nome = nome;
		this.cor = cor;
		this.ambiente = ambiente;
		this.comprimento = comprimento;
		this.patas = patas;
		this.velocidade = velocidade;
	}
	
	void setNome(String nome) {
		
	}
	
	String getNome() {
		return this.nome;
	}
	
	void setComprimento(int comprimento) {
		
	}
	
	int getComprimento() {
		return this.comprimento;
	}
	
	void setPatas(int patas) {
		
	}
	
	int getPatas() {
		return this.patas;
	}
	
	void setCor(String cor) {
		
	}
	
	String getcor() {
		return this.cor;
	}
	
	void setAmbiente(String ambiente) {
		
	}
	
	String getAmbiente() {
		return this.ambiente;
	}
	
	void setVelocidade(float velocidade) {
		
	}

	float getVelocidade() {
		return this.velocidade;
	}

	void dados() {
		
	}
}
