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
    private JTextField T1 = new JTextField("Cognome");
    private JTextField T2 = new JTextField("Nome");
    private JLabel L1 = new JLabel();
    private JLabel L2 = new JLabel();
    private JButton btnOK = new JButton();
    private JButton btnANN = new JButton();
    public Finestre() {
        super("Dati Anagrafici");
        P.setLayout(new BorderLayout());
        P2.setLayout(new GridLayout());
        P3.setLayout(new BorderLayout());
        P4.setLayout(new BorderLayout());

        P3.add(btnOK);
        P3.add(btnANN);
        P4.add(T1, "East");
        P4.add(T2, "Center");
        btnANN.addActionListener(this);
        btnOK.addActionListener(this);
        getContentPane().add(P1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
        public void actionPerformed(ActionEvent e) {
            String Event=(e.getActionCommand());
            if (Event.equals("Annulla")) {

            }
        }
}
class MainFin {
    public static void main(String[] args) {
    
    }
}