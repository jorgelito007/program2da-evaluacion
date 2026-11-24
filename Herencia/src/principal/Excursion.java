package principal;

public class Excursion {

    public static final int MAX_PARTICIPANTES = 25;

    private String codigo;
    private Destino destino;
    private int numeroParticipantes;
    private double distanciaRecorrida;
    private double duracion;

    public Excursion(String codigo, Destino destino, int numeroParticipantes,
                     double distanciaRecorrida, double duracion) {
        this.codigo = codigo;
        this.destino = destino;
        this.numeroParticipantes = numeroParticipantes;
        this.distanciaRecorrida = distanciaRecorrida;
        this.duracion = duracion;
    }

    public Excursion(String codigo, String destino, int numeroParticipantes,
                     double distanciaRecorrida, double duracion) {
        this.codigo = codigo;
        this.destino = convertirDestino(destino);
        this.numeroParticipantes = numeroParticipantes;
        this.distanciaRecorrida = distanciaRecorrida;
        this.duracion = duracion;
    }

    private Destino convertirDestino(String destino) {
        if (destino == null) {
            return Destino.INDEFINIDO;
        }

        switch (destino.trim().toUpperCase()) {
        case "MONTANA":
            return Destino.MONTANA;
        case "PLAYA":
            return Destino.PLAYA;
        case "CIUDAD":
            return Destino.CIUDAD;
        default:
            return Destino.INDEFINIDO;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
	public String toString() {
		return "Excursion [codigo=" + codigo + ", destino=" + destino + ", numeroParticipantes=" + numeroParticipantes
				+ ", distanciaRecorrida=" + distanciaRecorrida + ", duracion=" + duracion + "]";
	}

	public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public int getNumeroParticipantes() {
        return numeroParticipantes;
    }

    public void setNumeroParticipantes(int numeroParticipantes) {
        this.numeroParticipantes = numeroParticipantes;
    }

    public double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(double distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public boolean grupoCompleto() {
        return numeroParticipantes >= MAX_PARTICIPANTES;
    }

    public double obtenerVelocidadMedia() {
        if (duracion == 0) {
            return 0;
        }
        return distanciaRecorrida / duracion;
    }

    public void mostrarDatos() {
        System.out.println("Código: " + codigo);
        System.out.println("Destino: " + destino);
        System.out.println("Participantes: " + numeroParticipantes);
        System.out.println("Distancia: " + distanciaRecorrida + " km");
        System.out.println("Duración: " + duracion + " horas");
        System.out.println("Velocidad media: " + obtenerVelocidadMedia() + " km/h");
        System.out.println("----------------------------------------");
    }
    
    public double calcularPrecio() {
    	return (this.numeroParticipantes*50);
    }
    
    
    
}
