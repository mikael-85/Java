public class Cliente {
	private Integer codigo;
	private String nome;

	public Cliente(Integer codigo, String nome) {
		// TODO Auto-generated constructor stub
		setCodigo(codigo);
		setNome(nome);
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}
}
