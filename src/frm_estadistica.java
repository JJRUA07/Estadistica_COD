import javax.swing.*;

public class frm_estadistica extends JFrame {

    public frm_estadistica() {

        //Formulario
        setSize(600,300);
        setTitle("Estadistica");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        //Etiqueta
        JLabel IdlDato=new JLabel("Dato");
        IdlDato.setBounds(50, 10, 100, 25);
        getContentPane().add(IdlDato);

        JLabel IdlMuestra=new JLabel("Muestra");
        IdlMuestra.setBounds(300, 10, 100, 25);
        getContentPane().add(IdlMuestra);

        //Caja de texto
        JTextField txtDato=new JTextField("");
        txtDato.setBounds(110, 10, 100, 25);
        getContentPane().add(txtDato);

        JTextField txtDesviacion=new JTextField("");
        txtDesviacion.setBounds(250, 200, 100, 25);
        getContentPane().add(txtDesviacion);
        
        //Botones
        JButton btnAgregar=new JButton("Agregar");
        btnAgregar.setBounds(110, 50, 100, 25);
        getContentPane().add(btnAgregar);

        JButton btnQuitar=new JButton("Quitar");
        btnQuitar.setBounds(120, 80, 80, 25);
        getContentPane().add(btnQuitar);

        JButton btnDesviacion=new JButton("Desviacion");
        btnDesviacion.setBounds(140, 200, 100, 25);
        getContentPane().add(btnDesviacion);

        

    }
}