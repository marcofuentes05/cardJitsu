package Clases;

public class Perfil {
    private Estadistica estadisticas;
    private Recompensa recompensas;

    public Estadistica getEstadisticas() {
        return estadisticas;
    }

    public void actualizarEstadisticas(){

    }

    public void setEstadisticas(Estadistica estadisticas) {
        this.estadisticas = estadisticas;
    }

    public Recompensa getRecompensas() {
        return recompensas;
    }

    public void setRecompensas(Recompensa recompensas) {
        this.recompensas = recompensas;
    }
}
