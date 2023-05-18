import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Modulo_Pagamento extends JFrame implements ActionListener {
private JPanel pTot;
private JPanel Pannello1;
private JPanel PannelloLab;
private JPanel Pannello2;
private JLabel Nome;
private JLabel Cognome;
private JLabel Indirizzo;
private JLabel Citta;
private JLabel Importo;
private JTextField AreaNome;
private JTextField AreaCognome;
private JTextField AreaIndirizzo;
private JComboBox SceltaCitta;
private JTextField AreaCitta;
private JRadioButton Contanti;
private JRadioButton CartaDiCredito;
private JButton Cancella;
private JButton Conferma;
private JButton Termina;
public Modulo_Pagamento() {
    super("Modulo pagamento");
    pTot = new JPanel();
    Pannello1 = new JPanel();
    PannelloLab = new JPanel();
    Pannello2 = new JPanel();
    Nome = new JLabel("Nome");
    Cognome = new JLabel("Cognome");
    Indirizzo = new JLabel("Indirizzo");
    SceltaCitta = new JComboBox();
    Importo = new JLabel("Importo");
    AreaNome = new JTextField(15);
    AreaCognome = new JTextField(15);
    AreaIndirizzo = new JTextField(15);
    AreaCitta = new JTextField(15);
    Contanti = new JRadioButton("Contanti");
    CartaDiCredito = new JRadioButton("Carta di credito: ");
    Cancella = new JButton("Cancella");
    Conferma = new JButton("Conferma");
    Termina = new JButton("Termina");
    Pannello1.setLayout(new BorderLayout());
    Pannello2.setLayout(new BorderLayout());
    PannelloLab.setLayout(new GridLayout( 5 , 1));
    PannelloLab.add(Nome);
    PannelloLab.add(Cognome);
    PannelloLab.add(Indirizzo);
    PannelloLab.add(Citta);
    PannelloLab.add(Importo);
    Pannello1.add(PannelloLab , "West");
    getContentPane.add(pTot);
    setDefaultCloseOperation(EXIT_ON_CLOSE);   
    JOptionPane.showMessageDialog(this , DatiInseritiDalUtente ,"Dati Inseriti" , JOptionPane.INFORMATION_MESSAGE );
}
    public void actionPerformed(ActionEvent e) {
        String Event = e.getActionCommand();
        if(Event.equals("Cancella")) {
            AreaNome.setText("");
        }
    }
}
class MainVer {
    public static void main(String[] args) {
    Modulo_Pagamento Finestra = new Modulo_Pagamento();
    Finestra.setDefaultCloseOperation(EXIT_ON_CLOSE);
    Finestra.setSize(500, 500);
    Finestra.setResizable(false);
    }
}