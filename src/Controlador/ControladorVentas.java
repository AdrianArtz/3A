package Controlador;

// @author samaelhg
import Modelo.Ventas;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorVentas<E> {

    private Ventas venta = new Ventas();
    private Ventas listadoVentas[];

    public void HacerVenta(Ventas ventas, Ventas listaVentas[]) {
        this.venta = ventas;
        this.listadoVentas = listaVentas;
    }

    public void Imprimir(Ventas venta) {
        for (int i = 0; i < listadoVentas.length; i++) {
            System.out.println(listadoVentas[i].Imprimir());
        }

    }

    public String[][] mostrarVentas() {
        String listaDatos[][] = new String[listadoVentas.length][4];
        for (int i = 0; i < listadoVentas.length; i++) {
            listaDatos[i][0] = "" + listadoVentas[i].getFecha().getDate();
            listaDatos[i][1] = listadoVentas[i].getMes();
            listaDatos[i][2] = listadoVentas[i].getAgencia().getNombre();
            listaDatos[i][3] = "" + listadoVentas[i].getVenta();
        }
        return listaDatos;

    }

    public String[][] mostrarVentasporMes(String mes) {
        Ventas listaOrdenada[] = null;
        int count = 0;
        for (int i = 0; i < listadoVentas.length; i++) {
            if (Integer.parseInt(mes) != listadoVentas[i].getFecha().getMonth()) {
                count++;
            }
        }
        listaOrdenada = new Ventas[listadoVentas.length - count];
        for (int i = 0, j = 0; j < listaOrdenada.length; i++) {
            if (Integer.parseInt(mes) == listadoVentas[i].getFecha().getMonth()) {
                listaOrdenada[j] = listadoVentas[i];
                j++;
            }
        }

        String listaDatos[][] = new String[listaOrdenada.length][4];
        for (int i = 0; i < listaOrdenada.length; i++) {
            listaDatos[i][0] = "" + listaOrdenada[i].getFecha().getDate();
            listaDatos[i][1] = listaOrdenada[i].getMes();
            listaDatos[i][2] = listaOrdenada[i].getAgencia().getNombre();
            listaDatos[i][3] = "" + listaOrdenada[i].getVenta();
        }
        return listaDatos;

    }

    public String[][] mostrarVentasporAgencia(String agencia) {
        Ventas listaOrdenada[] = null;
        int count = 0;
        for (int i = 0; i < listadoVentas.length; i++) {
            if (!agencia.equals(listadoVentas[i].getAgencia().getNombre())) {
                count++;
            }
        }
        listaOrdenada = new Ventas[listadoVentas.length - count];
        for (int i = 0, j = 0; j < listaOrdenada.length; i++) {
            if (agencia.equals(listadoVentas[i].getAgencia().getNombre())) {
                listaOrdenada[j] = listadoVentas[i];
                j++;
            }
        }

        String listaDatos[][] = new String[listaOrdenada.length][4];
        for (int i = 0; i < listaOrdenada.length; i++) {
            listaDatos[i][0] = "" + listaOrdenada[i].getFecha().getDate();
            listaDatos[i][1] = listaOrdenada[i].getMes();
            listaDatos[i][2] = listaOrdenada[i].getAgencia().getNombre();
            listaDatos[i][3] = "" + listaOrdenada[i].getVenta();
        }
        return listaDatos;

    }

    public void guardar() {
        if (listadoVentas != null) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsoString = gson.toJson(listadoVentas);
            try {
                FileWriter fw = new FileWriter("C:\\Users\\jandr\\Documents\\UNL\\sandbox\\ESTRUCTURA DE DATOS\\U1\\AdrianHernandezPractica1\\src\\Archivos\\Ventas.json", true);
                fw.write("\n");
                fw.write(jsoString);
                fw.close();

            } catch (IOException ex) {
                Logger.getLogger(ControladorVentas.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 

    }
}
