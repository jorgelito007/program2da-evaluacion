package principal;

public class ExcursionBuceo extends Excursion{

	 private boolean certificado;
	 private int profundidad;
	 private boolean alquilerEquipo;
	public ExcursionBuceo(String codigo, Destino destino, int numeroParticipantes, double distanciaRecorrida,
			double duracion, boolean certificado, int profundidad, boolean alquilerEquipo) {
		super(codigo, destino, numeroParticipantes, distanciaRecorrida, duracion);
		this.certificado = certificado;
		this.profundidad = profundidad;
		this.alquilerEquipo = alquilerEquipo;
	}
	@Override
	public String toString() {
		return super.toString()+ "\nExcursionBuceo [certificado=" + certificado + ", profundidad=" + profundidad + ", alquilerEquipo="
				+ alquilerEquipo + "]";
	}
	 
	 
}
