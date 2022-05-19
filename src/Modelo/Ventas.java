package Modelo;

// @author samaelhg
import java.util.Date;

public class Ventas {

    private Date fecha;
    private Double venta;
    private Agencia agencia;

    public Ventas() {

    }

    public Ventas(Agencia agencia, Date fecha, Double venta) {
        this.fecha = fecha;
        this.venta = venta;
        this.agencia = agencia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMes() {
        String month;
        switch (getFecha().getMonth()) {
            case 0:
                month = "Enero";
                break;
            case 1:
                month = "Febrero";
                break;
            case 2:
                month = "Marzo";
                break;
            case 3:
                month = "Abril";
                break;
            case 4:
                month = "Mayo";
                break;
            case 5:
                month = "Junio";
                break;
            case 6:
                month = "Julio";
                break;
            case 7:
                month = "Agosto";
                break;
            case 8:
                month = "Septiembre";
                break;
            case 9:
                month = "Octubre";
                break;
            case 10:
                month = "Noviembre";
                break;
            case 11:
                month = "Diciembre";
                break;
            default:
                throw new AssertionError();
        }
        return month;
    }

    public Double getVenta() {
        return venta;
    }

    public void setVenta(Double venta) {
        this.venta = venta;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public String Imprimir() {
        return "Mirasol " + getAgencia().getNombre() + " :\n"
                + "Fecha: " + getFecha().getDate() + " - " + getFecha().getMonth() + " - " + getFecha().getYear() + "\n"
                + "Monto: $" + getVenta();
    }
}
