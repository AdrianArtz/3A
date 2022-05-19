package Vista;

import Controlador.ControladorVentas;
import Modelo.Agencia;
import Modelo.Ventas;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Date;
import javax.swing.JOptionPane;

//@author samaelhg
public class RegistrarVenta extends javax.swing.JFrame implements ItemListener {

    private int encender = 0;
    private Agencia agencia1;
    private ControladorVentas CV = new ControladorVentas();
    private Ventas listaVentas[] = new Ventas[1];

    public RegistrarVenta() {
        initComponents();
        setLocationRelativeTo(this);
        comboAgencias.addItemListener(this);
        comboDia.addItemListener(this);
        comboMes.addItemListener(this);
        if (encender == 0) {
          comboResumir.setEnabled(false);
          resumirBttn.setEnabled(false);
          defaultBttn.setEnabled(false);
        }
        if (comboResumir.isEnabled()) {
            comboResumir.addItemListener(this);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaResumenMes = new javax.swing.JTable();
        comboAgencias = new javax.swing.JComboBox<>();
        comboMes = new javax.swing.JComboBox<>();
        comboDia = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        MontoTXT = new javax.swing.JTextField();
        botonVender = new javax.swing.JButton();
        comboResumir = new javax.swing.JComboBox<>();
        resumirBttn = new javax.swing.JButton();
        defaultBttn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        guardarySalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agencia Mirasol");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setText("MIRASOL");

        tablaResumenMes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Dia", "Mes", "Agencia", "Venta"
            }
        ));
        tablaResumenMes.setEnabled(false);
        jScrollPane2.setViewportView(tablaResumenMes);

        comboAgencias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AGENCIAS", "Agencia 1", "Agencia 2", "Agencia 3", "Agencia 4", "Agencia 5" }));

        comboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MES", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        comboDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DIA", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel2.setText("INGRESAR MONTO");

        MontoTXT.setBorder(null);

        botonVender.setText("VENDER");
        botonVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVenderActionPerformed(evt);
            }
        });

        comboResumir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ORDENAR POR", "Mes", "Agencia" }));

        resumirBttn.setText("RESUMIR");
        resumirBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resumirBttnActionPerformed(evt);
            }
        });

        defaultBttn.setText("DEFAULT");
        defaultBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultBttnActionPerformed(evt);
            }
        });

        jLabel3.setText("Autor: Adrián Hernández");

        guardarySalir.setText("GUARDAR");
        guardarySalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarySalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MontoTXT)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(comboAgencias, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboDia, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonVender, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(471, 471, 471))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(defaultBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(resumirBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(guardarySalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(comboResumir, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(477, 477, 477))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboAgencias, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MontoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(botonVender)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(comboResumir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resumirBttn)
                    .addComponent(defaultBttn)
                    .addComponent(guardarySalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVenderActionPerformed
        if (MontoTXT.getText().isEmpty()) {
            System.out.println("Aún no llena los campos");
        } else {
            vender();
            System.out.println("Venta Realizada ");
            MontoTXT.setText("");
            mostrarDatos();
            reiniciarCombo();
            encender++;
            if (encender == 1) {
                comboResumir.setEnabled(true);
                resumirBttn.setEnabled(true);
                defaultBttn.setEnabled(true);
            }
        }

    }//GEN-LAST:event_botonVenderActionPerformed

    private void resumirBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resumirBttnActionPerformed
        ordenar();
    }//GEN-LAST:event_resumirBttnActionPerformed

    private void defaultBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaultBttnActionPerformed
        mostrarDatos();
        reiniciarCombo();
        MontoTXT.setText("");
    }//GEN-LAST:event_defaultBttnActionPerformed

    private void guardarySalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarySalirActionPerformed
        CV.guardar();
        dispose();
    }//GEN-LAST:event_guardarySalirActionPerformed
    public void vender() {
        String diaElegido = comboDia.getSelectedItem().toString();
        String mesElegido = comboMes.getSelectedItem().toString();
        String agenciaElegida = comboAgencias.getSelectedItem().toString();
        Date fecha = new Date(121, elegirMes(mesElegido), elegirDia(mesElegido, diaElegido));
        Ventas nuevaVenta = new Ventas(elegirAgencia(agenciaElegida), fecha, Double.parseDouble(MontoTXT.getText()));
        if (listaVentas[0] == null) {
            listaVentas[0] = nuevaVenta;
        } else {
            Ventas aux[] = new Ventas[listaVentas.length + 1];
            aux[aux.length - 1] = nuevaVenta;
            for (int i = 0; i < listaVentas.length; i++) {
                aux[i] = listaVentas[i];
            }
            this.listaVentas = aux;
        }
        CV.HacerVenta(nuevaVenta, listaVentas);
        CV.Imprimir(nuevaVenta);
    }

    public void ordenar() {
        String dato;
        String list[][];
        if (comboMes.isEnabled()) {
            dato = comboMes.getSelectedItem().toString();
            list = CV.mostrarVentasporMes(String.valueOf(elegirMes(dato)));
            tablaResumenMes.setModel(new javax.swing.table.DefaultTableModel(
                    list,
                    new String[]{
                        "Dia", "Mes", "Agencia", "Venta"
                    }));
        } else if (comboAgencias.isEnabled()) {
            dato = comboAgencias.getSelectedItem().toString();
            list = CV.mostrarVentasporAgencia(dato);
            tablaResumenMes.setModel(new javax.swing.table.DefaultTableModel(
                    list,
                    new String[]{
                        "Dia", "Mes", "Agencia", "Venta"
                    }));
        }
    }

    public void mostrarDatos() {
        String list[][] = CV.mostrarVentas();
        tablaResumenMes.setModel(new javax.swing.table.DefaultTableModel(
                list,
                new String[]{
                    "Dia", "Mes", "Agencia", "Venta"
                }));
    }
    public int elegirMes(String mes) {
        int mesDevueltoenNumero;
        if (mes.equals("MES")) {
            JOptionPane.showMessageDialog(this, "NO HA SELECCIONADO EL MES");
        }
        switch (mes) {
            case "Enero":
                mesDevueltoenNumero = 0;
                break;
            case "Febrero":
                mesDevueltoenNumero = 1;
                break;
            case "Marzo":
                mesDevueltoenNumero = 2;
                break;
            case "Abril":
                mesDevueltoenNumero = 3;
                break;
            case "Mayo":
                mesDevueltoenNumero = 4;
                break;
            case "Junio":
                mesDevueltoenNumero = 5;
                break;
            case "Julio":
                mesDevueltoenNumero = 6;
                break;
            case "Agosto":
                mesDevueltoenNumero = 7;
                break;
            case "Septiembre":
                mesDevueltoenNumero = 8;
                break;
            case "Octubre":
                mesDevueltoenNumero = 9;
                break;
            case "Noviembre":
                mesDevueltoenNumero = 10;
                break;
            case "Diciembre":
                mesDevueltoenNumero = 11;
                break;
            default:
                throw new AssertionError();
        }
        return mesDevueltoenNumero;
    }

    public int elegirDia(String mes, String day) {
        int diaDevueltoenNumero;
        while (day.equals("DIA")) {
            System.out.println("ERROR, ELEGIR BIEN");
        }
        switch (day) {
            case "1":
                diaDevueltoenNumero = 1;
                break;
            case "2":
                diaDevueltoenNumero = 2;
                break;
            case "3":
                diaDevueltoenNumero = 3;
                break;
            case "4":
                diaDevueltoenNumero = 4;
                break;
            case "5":
                diaDevueltoenNumero = 5;
                break;
            case "6":
                diaDevueltoenNumero = 6;
                break;
            case "7":
                diaDevueltoenNumero = 7;
                break;
            case "8":
                diaDevueltoenNumero = 8;
                break;
            case "9":
                diaDevueltoenNumero = 9;
                break;
            case "10":
                diaDevueltoenNumero = 10;
                break;
            case "11":
                diaDevueltoenNumero = 11;
                break;
            case "12":
                diaDevueltoenNumero = 12;
                break;
            case "13":
                diaDevueltoenNumero = 13;
                break;
            case "14":
                diaDevueltoenNumero = 14;
                break;
            case "15":
                diaDevueltoenNumero = 15;
                break;
            case "16":
                diaDevueltoenNumero = 16;
                break;
            case "17":
                diaDevueltoenNumero = 17;
                break;
            case "18":
                diaDevueltoenNumero = 18;
                break;
            case "19":
                diaDevueltoenNumero = 19;
                break;
            case "20":
                diaDevueltoenNumero = 20;
                break;
            case "21":
                diaDevueltoenNumero = 21;
                break;
            case "22":
                diaDevueltoenNumero = 22;
                break;
            case "23":
                diaDevueltoenNumero = 23;
                break;
            case "24":
                diaDevueltoenNumero = 24;
                break;
            case "25":
                diaDevueltoenNumero = 25;
                break;
            case "26":
                diaDevueltoenNumero = 26;
                break;
            case "27":
                diaDevueltoenNumero = 27;
                break;
            case "28":
                diaDevueltoenNumero = 28;
                break;
            case "29":
                if (mes.equals("Febrero")) {
                    System.out.println("No existe este dia en febrero");
                    diaDevueltoenNumero = 28;
                } else {
                    diaDevueltoenNumero = 29;
                }
                break;
            case "30":
                if (mes.equals("Febrero")) {
                    System.out.println("No existe este dia en febrero");
                    diaDevueltoenNumero = 28;
                } else {
                    diaDevueltoenNumero = 30;
                }
                break;
            case "31":
                if (mes.equals("Febrero")) {
                    System.out.println("No existe este dia en febrero");
                    diaDevueltoenNumero = 28;
                } else {
                    diaDevueltoenNumero = 31;
                }
                break;
            default:
                throw new AssertionError();
        }
        return diaDevueltoenNumero;
    }

    public Agencia elegirAgencia(String ag) {
        switch (ag) {
            case "Agencia 1":
                agencia1 = new Agencia(ag);
                break;
            case "Agencia 2":
                agencia1 = new Agencia(ag);
                break;
            case "Agencia 3":
                agencia1 = new Agencia(ag);
                break;
            case "Agencia 4":
                agencia1 = new Agencia(ag);
                break;
            case "Agencia 5":
                agencia1 = new Agencia(ag);
                break;
            default:
                throw new AssertionError();
        }
        return agencia1;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MontoTXT;
    private javax.swing.JButton botonVender;
    private javax.swing.JComboBox<String> comboAgencias;
    private javax.swing.JComboBox<String> comboDia;
    private javax.swing.JComboBox<String> comboMes;
    private javax.swing.JComboBox<String> comboResumir;
    private javax.swing.JButton defaultBttn;
    private javax.swing.JButton guardarySalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton resumirBttn;
    private javax.swing.JTable tablaResumenMes;
    // End of variables declaration//GEN-END:variables

    @Override
    public void itemStateChanged(ItemEvent e) {
        String dato = comboResumir.getSelectedItem().toString();
        switch (dato) {
            case "ORDENAR POR":
                comboAgencias.setEnabled(true);
                comboMes.setEnabled(true);
                comboDia.setEnabled(true);
                break;
            case "Mes":
                JOptionPane.showMessageDialog(this, "Elegir el mes en el combo Agencias");
                comboAgencias.setEnabled(false);
                comboMes.setEnabled(true);
                comboDia.setEnabled(false);
                break;
            case "Agencia":
                JOptionPane.showMessageDialog(this, "Elegir la agencia en el combo Agencias");
                comboAgencias.setEnabled(true);
                comboMes.setEnabled(false);
                comboDia.setEnabled(false);
                break;
            default:
                throw new AssertionError();
        }
    }

    public void reiniciarCombo() {
        comboAgencias.setSelectedIndex(0);
        comboDia.setSelectedIndex(0);
        comboMes.setSelectedIndex(0);
    }
}
