package Scuola.INFORMATICA.JAVA.GUI.CODICEFISCALE;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class CodFiscale extends JFrame implements ActionListener {
    private JPanel Ptot = new JPanel();
    private JPanel PLabel = new JPanel();
    private JPanel PInput = new JPanel();
    private JPanel PRisultato = new JPanel();
    private JPanel PSesso = new JPanel();
    private JPanel PData = new JPanel();

    private JTextField TCognome = new JTextField(20);
    private JTextField TNome = new JTextField(20);
    private JTextField TGiorno = new JTextField(4);
    private JTextField TAnno = new JTextField(8);
    private JTextField TComune = new JTextField(20);
    private JTextField TRisultato = new JTextField(20);

    private JLabel LCognome = new JLabel("Cognome");
    private JLabel LNome = new JLabel("Nome");
    private JLabel LSesso = new JLabel("Sesso");
    private JLabel LData = new JLabel("Data");
    private JLabel LComune = new JLabel("Comune");

    private JRadioButton RM = new JRadioButton("Maschio");
    private JRadioButton RF = new JRadioButton("Femmina");

    private JComboBox CMSE = new JComboBox<>();
    
    private JButton BRisultato = new JButton("Calcola Codice FIscale");
    public CodFiscale(boolean False) {
        super("Codice Fiscale");
        ButtonGroup BG = new ButtonGroup();
        BG.add(RM);
        BG.add(RF);
        CMSE.addItem("Gennaio");
        CMSE.addItem("Febbraio");
        CMSE.addItem("Marzo");
        CMSE.addItem("Aprile");
        CMSE.addItem("Maggio");
        CMSE.addItem("Giugno");
        CMSE.addItem("Luglio");
        CMSE.addItem("Agosto");
        CMSE.addItem("Settembre");
        CMSE.addItem("Ottobre");
        CMSE.addItem("Novembre");
        CMSE.addItem("Dicembre");
        TRisultato.setEditable(false);
        RM.setSelected(true);
        Ptot.setLayout(new BorderLayout());
        PLabel.setLayout(new GridLayout(4,1));
        PLabel.add(LCognome);
        PLabel.add(LNome);
        PLabel.add(LSesso);
        PLabel.add(LData);
        PLabel.add(LComune);
        Ptot.add(PLabel,"West");
        PInput.setLayout(new GridLayout(4,1));
        PInput.add(TCognome);
        PInput.add(TNome);
        PSesso.setLayout(new GridLayout(1,2));
        PSesso.add(RM);
        PSesso.add(RF);
        PData.setLayout(new BorderLayout());
        PData.add(TGiorno,"West");
        PData.add(CMSE,"Center");
        PData.add(TAnno,"East");
        PInput.add(PSesso);
        PInput.add(PData);
        PInput.add(TComune);
        PRisultato.setLayout(new GridLayout(2,1));
        PRisultato.add(BRisultato);
        PRisultato.add(TRisultato);
        Ptot.add(PRisultato, "South");
        BRisultato.addActionListener(this);
        getContentPane().add(Ptot);
        setSize(250,400);
        setVisible(true);
        setResizable(false);
    }
    public void actionPerformed(ActionEvent e) {
        String Event = e.getActionCommand();
        if(Event.equals("Calcola codice fiscale")) {
            if(TCognome.getText().equals("") || TNome.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Inverti tutti i valori","Errore" , JOptionPane.ERROR_MESSAGE);
            }
            int n;
            String tmp = TCognome.getText() + TNome.getText();
            n = JOptionPane.showMessageDialog(this, "Risultato:" + tmp , "Conserva", JOptionPane.YES_NO_OPTION , JOptionPane.QUESTION_MESSAGE);
            if(n == JOptionPane.YES_NO_OPTION) {
                System.exit(0);
            }
        }     
    }
}
class CodFiscaleMain {
   public static void main(String[] args) {
    CodFiscale F = new CodFiscale(true);
    F.setVisible(true);
    F.setSize(300,300);
    F.setLocation(100,100);
    F.setResizable(false);
    F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   } 
} 