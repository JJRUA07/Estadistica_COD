import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class frm_estadistica extends JFrame {

    JTextField txtDato;
    JList lstMuestra;
<<<<<<< HEAD
    JTextField txtEstadistica;
=======
>>>>>>> c5896b599e488a944309e44230117579231ca02e

    public frm_estadistica() {

        // Formulario
<<<<<<< HEAD
        setSize(400, 300);
=======
        setSize(600, 300);
>>>>>>> c5896b599e488a944309e44230117579231ca02e
        setTitle("Estadistica");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        // Etiqueta
        JLabel IdlDato = new JLabel("Dato");
        IdlDato.setBounds(50, 10, 100, 25);
        getContentPane().add(IdlDato);

        JLabel IdlMuestra = new JLabel("Muestra");
<<<<<<< HEAD
        IdlMuestra.setBounds(240, 10, 100, 25);
=======
        IdlMuestra.setBounds(300, 10, 100, 25);
>>>>>>> c5896b599e488a944309e44230117579231ca02e
        getContentPane().add(IdlMuestra);

        // Caja de texto
        txtDato = new JTextField("");
        txtDato.setBounds(110, 10, 100, 25);
        getContentPane().add(txtDato);

<<<<<<< HEAD
        JTextField txtEstadistica = new JTextField("");
        txtEstadistica.setBounds(240, 190, 100, 25);
        getContentPane().add(txtEstadistica);
=======
        JTextField txtDesviacion = new JTextField("");
        txtDesviacion.setBounds(180, 190, 100, 25);
        getContentPane().add(txtDesviacion);
>>>>>>> c5896b599e488a944309e44230117579231ca02e

        // Botones
        JButton btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(110, 50, 100, 25);
        getContentPane().add(btnAgregar);

        JButton btnQuitar = new JButton("Quitar");
        btnQuitar.setBounds(120, 80, 80, 25);
        getContentPane().add(btnQuitar);

<<<<<<< HEAD
        JButton btnEstadistica = new JButton("Calcular");
        btnEstadistica.setBounds(40, 190, 100, 25);
        getContentPane().add(btnEstadistica);

        // Lista
        lstMuestra = new JList();
        JScrollPane spMuestra=new JScrollPane(lstMuestra);
        spMuestra.setBounds(240, 40, 110, 140);
        getContentPane().add(spMuestra);

        JComboBox cmbEstadistica=new JComboBox();
        String[] opciones=new String[]{"Sumatoria", "Promedio", "Desviación", "Maximo", "Minimo", "Moda"};
        DefaultComboBoxModel mdlEstadistica=new DefaultComboBoxModel(opciones);
        cmbEstadistica.setModel(mdlEstadistica);
        cmbEstadistica.setBounds(140,190,100,25);
        getContentPane().add(cmbEstadistica);

        // eventos de la GUI
=======
        JButton btnDesviacion = new JButton("Desviacion");
        btnDesviacion.setBounds(70, 190, 100, 25);
        getContentPane().add(btnDesviacion);

        // Lista
        lstMuestra = new JList();
        lstMuestra.setBounds(300, 40, 110, 180);
        getContentPane().add(lstMuestra);

        // evntos de la GUI
>>>>>>> c5896b599e488a944309e44230117579231ca02e
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
<<<<<<< HEAD
    }

    // declarar el arreglo que almacenara los datos de la muestra
    private double[] muestra = new double[1000];
    private int totalDatos = -1;

    private void agregarDato() {
        double dato = Double.parseDouble(txtDato.getText());
        totalDatos++;
        muestra[totalDatos] = dato;
        mostrarMuestra();
    }

    private void mostrarMuestra() {
        String[] strMuestra = new String[totalDatos + 1];
        for (int i = 0; i <= totalDatos; i++) {
            strMuestra[i] = String.valueOf(muestra[i]);
        }
        lstMuestra.setListData(strMuestra);
    }

    private void quitarDato() {
        JOptionPane.showMessageDialog(null, "Hizo clic en QUITAR");
=======
>>>>>>> c5896b599e488a944309e44230117579231ca02e
    }

    // declarar el arreglo que almacenara los datos de la muestra
    private double[] muestra = new double[1000];
    private int totalDatos = -1;

    private void agregarDato() {
        double dato = Double.parseDouble(txtDato.getText());
        totalDatos++;
        muestra[totalDatos] = dato;
        mostrarMuestra();
    }

    private void mostrarMuestra() {
        String[] strMuestra = new String[totalDatos+1];
        for (int i = 0; i <= totalDatos; i++) {
            strMuestra[i] = String.valueOf(muestra[i]);
        }
        lstMuestra.setListData(strMuestra);
    }

    private void quitarDato() {
        JOptionPane.showMessageDialog(null, "Hizo clic en QUITAR");
    }
}
