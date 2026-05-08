public class Cliente {

    private String nombre;
    private String identificacion;
    private String tipoTransaccion;
    private String horaLlegada;

    public Cliente(String nombre, String identificacion, String tipoTransaccion, String horaLlegada) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.tipoTransaccion = tipoTransaccion;
        this.horaLlegada = horaLlegada;
    }
    public String getNombre() {
        return nombre;
    }
    @Override
    public String toString() {
        return "Cliente{" + "nombre='" + nombre + '\'' + ", identificacion='" + identificacion + '\'' + ", transaccion='" + tipoTransaccion + '\'' + ", hora='" + horaLlegada + '\'' +'}';
    }
}