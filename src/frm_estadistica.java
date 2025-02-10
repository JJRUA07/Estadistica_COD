import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class frm_estadistica extends JFrame {

    JTextField txtDato;
    JList lstMuestra;
    JTextField txtEstadistica;

    public frm_estadistica() {

        // Formulario
        setSize(400, 300);
        setTitle("Estadistica");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        // Etiqueta
        JLabel IdlDato = new JLabel("Dato");
        IdlDato.setBounds(50, 10, 100, 25);
        getContentPane().add(IdlDato);

        JLabel IdlMuestra = new JLabel("Muestra");
        IdlMuestra.setBounds(240, 10, 100, 25);
        getContentPane().add(IdlMuestra);

        // Caja de texto
        txtDato = new JTextField("");
        txtDato.setBounds(110, 10, 100, 25);
        getContentPane().add(txtDato);

        JTextField txtEstadistica = new JTextField("");
        txtEstadistica.setBounds(240, 190, 100, 25);
        getContentPane().add(txtEstadistica);

        // Botones
        JButton btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(110, 50, 100, 25);
        getContentPane().add(btnAgregar);

        JButton btnQuitar = new JButton("Quitar");
        btnQuitar.setBounds(120, 80, 80, 25);
        getContentPane().add(btnQuitar);

        JButton btnEstadistica = new JButton("Calcular");
        btnEstadistica.setBounds(40, 190, 100, 25);
        getContentPane().add(btnEstadistica);

        // Lista
        lstMuestra = new JList();
        JScrollPane spMuestra = new JScrollPane(lstMuestra);
        spMuestra.setBounds(240, 40, 110, 140);
        getContentPane().add(spMuestra);

        JComboBox cmbEstadistica = new JComboBox();
        String[] opciones = new String[] { "Sumatoria", "Promedio", "Desviación", "Maximo", "Minimo", "Moda" };
        DefaultComboBoxModel mdlEstadistica = new DefaultComboBoxModel(opciones);
        cmbEstadistica.setModel(mdlEstadistica);
        cmbEstadistica.setBounds(140, 190, 100, 25);
        getContentPane().add(cmbEstadistica);

        // eventos de la GUI
        btnAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                agregarDato();
            }
        });

        btnQuitar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                quitarDato();
            }
        });

    }

    // declarar el arreglo que almacenara los datos de la muestra
    private double[] muestra = new double[1000];
    private int totalDatos = -1;

    private void agregarDato() {
        try{
        double dato = Double.parseDouble(txtDato.getText());
        totalDatos++;
        muestra[totalDatos] = dato;
        txtDato.setText("");
        mostrarMuestra();
        }
        catch(Exception ex){
            txtDato.setText("");
            JOptionPane.showMessageDialog(null, "Debe especificar un valor numerico");
        }
    }

    private void mostrarMuestra() {
        String[] strMuestra = new String[totalDatos + 1];
        for (int i = 0; i <= totalDatos; i++) {
            strMuestra[i] = String.valueOf(muestra[i]);
        }
        lstMuestra.setListData(strMuestra);
    }

    private void quitarDato() {
        // obtener la posicion escogida
        int posicion = lstMuestra.getSelectedIndex();
        if(posicion <= 0){
        // retirar la posicion del vector
        for (int i = posicion; i < totalDatos; i++) {
            muestra[i] = muestra[i + 1];
        }
        totalDatos--;
        mostrarMuestra();
        } else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar una posición");

        }

    }

}