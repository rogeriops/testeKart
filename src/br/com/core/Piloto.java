package br.com.core;

public class Piloto implements Comparable<Piloto> {

	private Integer numeracao;
	private int numeroVoltas;
	private long tempoVolta;
	private double velocidadeVolta;
	private Long horarioFinalização;
	private String nome;
	private long tempoTotal;
	
	

	public long getTempoTotal() {
		return tempoTotal;
	}

	public void setTempoTotal(long tempoTotal) {
		this.tempoTotal = tempoTotal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Piloto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Piloto(long horarioFinalização, int numeracao, String nome, int numeroVoltas, long tempoVolta,
			long velocidadeVolta) {
		super();
		this.numeracao = numeracao;
		this.numeroVoltas = numeroVoltas;
		this.tempoVolta = tempoVolta;
		this.velocidadeVolta = velocidadeVolta;
		this.horarioFinalização = horarioFinalização;
		this.nome = nome;
	}

	public Integer getNumeracao() {
		return numeracao;
	}

	public void setNumeracao(Integer numeracao) {
		this.numeracao = numeracao;
	}

	public int getNumeroVoltas() {
		return numeroVoltas;
	}

	public void setNumeroVoltas(int numeroVoltas) {
		this.numeroVoltas = numeroVoltas;
	}

	public long getTempoVolta() {
		return tempoVolta;
	}

	public void setTempoVolta(long tempoVolta) {
		this.tempoVolta = tempoVolta;
	}

	public double getVelocidadeVolta() {
		return velocidadeVolta;
	}

	public void setVelocidadeVolta(double velocidadeVolta) {
		this.velocidadeVolta = velocidadeVolta;
	}

	public Long getHorarioFinalização() {
		return horarioFinalização;
	}

	public void setHorarioFinalização(long horarioFinalização) {
		this.horarioFinalização = horarioFinalização;
	}

	@Override
	public String toString() {
		return "\t"+numeracao + "\t\t"   + nome + " \t" + numeroVoltas + "\t\t\t" + Util.formatTempo(tempoVolta)  ;
	}

	@Override
	public int compareTo(Piloto piloto) {
		if (this.horarioFinalização < piloto.getHorarioFinalização()) {
			return -1;
		}
		if (this.horarioFinalização > piloto.horarioFinalização) {
			return 1;
		}
		return 0;
	}
}
