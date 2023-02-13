package Scuola.INFORMATICA.JAVA.GUI.MerdaSecca;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Finestre extends JFrame implements ActionListener {
    private JPanel pTot = new JPanel();
    private JButton bSuperiore = new JButton("Superiore");
    private JButton bInferiore = new JButton("Inferiore");
    private JTextArea Text = new JTextArea();
    public Finestre() {
        super("Pulsanti");
        pTot.setLayout(new BorderLayout());
        pTot.add(bSuperiore,"North");
        pTot.add(bInferiore,"South");
        pTot.add(Text,"Center");
        bInferiore.addActionListener(this);
        bSuperiore.addActionListener(this);
        getContentPane().add(pTot);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }     
    public void actionPerformed(ActionEvent e) {
        String Event = e.getActionCommand();
        if(Event.equals("Superiore")) {
            Text.append("è stato premuto Superiore");
        }
        if(Event.equals("Inferiore")) {
            Text.append("è stato premuto Inferiore");
        }
    }
}
class MainFinestre {
    public static void main(String[] args) {
        Finestre F = new Finestre();
        F.setSize(300,200);
        F.setLocation(100,200);
        F.setResizable(false);
        F.setVisible(true); 
    }
}
