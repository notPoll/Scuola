import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Finestra extends JFrame implements ActionListener {
    private JPanel pTtot = new JPanel();
    private JRadioButton rMButton = new JRadioButton();
    private JRadioButton rFButton = new JRadioButton();
    public Finestra() {
        super("ProvaRadioButton");
        ButtonGroup BG = new ButtonGroup();
        pTtot.setLayout(new GridLayout(2,1));
        BG.add(rMButton);
        BG.add(rFButton);
        rMButton.setSelected(true);
        pTtot.add(rFButton);
        pTtot.add(rMButton);
        rMButton.addActionListener(this);
        rFButton.addActionListener(this);
        getContentPane().add(pTtot);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        String event = e.getActionCommand();
        if(event.equals("Maschio")) {
            JOptionPane.showMessageDialog(this, "Hai selezionato Maschio", "Info", JOptionPane.INFORMATION_MESSAGE );
        }
        else {
            JOptionPane.showMessageDialog(this, "Hai selezionato Femmina", "Info", JOptionPane.INFORMATION_MESSAGE );
        }
    }
}
class MainFin {
    public static void main(String[] args) {
    Finestra F = new Finestra();
    F.setSize(100, 200);
    F.setVisible(true);
    F.setResizable(false);
    }
}