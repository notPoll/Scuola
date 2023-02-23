package Scuola.INFORMATICA.JAVA.GUI.Palle;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Finestre extends JFrame implements ActionListener {
    private JPanel P = new JPanel();
    private JPanel P1 = new JPanel();
    private JPanel P2 = new JPanel();
    private JPanel P3 = new JPanel();
    private JPanel P4 = new JPanel();
    private JTextField Cognome = new JTextField(0);
    private JTextField Nome = new JTextField(0);
    private JLabel L1 = new JLabel();
    private JLabel L2 = new JLabel();
    private JButton btnOK = new JButton("OK");
    private JButton btnANN = new JButton("Annulla");
    public Finestre() {
        super("Dati Anagrafici");
        P.setLayout(new BorderLayout());
        P2.setLayout(new GridLayout());
        P3.setLayout(new BorderLayout());
        P4.setLayout(new BorderLayout());
        P3.add(btnOK);
        P3.add(btnANN);
        P4.add(Cognome, "East");
        P4.add(Nome, "Center");
        btnANN.addActionListener(this);
        btnOK.addActionListener(this);
        getContentPane().add(P1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
        public void actionPerformed(ActionEvent e) {
            String Event=(e.getActionCommand());
            if (Event.equals("Annulla")) {
                Cognome.setText("");
                Nome.setText("");
            }
        }
}
class MainFin {
    public static void main(String[] args) {
        Finestre F = new Finestre();
        F.setSize(300, 300);
        F.setLocation( 300, 400);
        F.setVisible(true);
    }
}