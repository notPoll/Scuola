package Scuola.INFORMATICA.JAVA.GUI.EsVen10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Finestra extends JFrame implements ActionListener {
    private JPanel pTot = new JPanel();
    private JPanel pGrid = new JPanel();
    private JPanel pColor = new JPanel();
    private JButton bRed = new JButton("Red");
    private JButton bGreen = new JButton("Green");
    private JButton bCasuale= new JButton("Casuale");
    private JLabel SceltaColore = new JLabel("Scegli Colore");
    public Finestra() {
    super("Cambia Colore");  
    pTot.setLayout(new BorderLayout());
    pGrid.setLayout(new GridLayout(3,1));
    pGrid.add(bRed);
    pGrid.add(bGreen);
    pGrid.add(bCasuale);
    pTot.add(SceltaColore,"North");
    pTot.add(pGrid,"West");
    pTot.add(pColor,"Center");
    bRed.addActionListener(this);
    bGreen.addActionListener(this);
    bCasuale.addActionListener(this);
    getContentPane().add(pTot);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        String Event=e.getActionCommand();
        if(Event.equals("Red")) {
            pColor.setBackground(Color.RED);
        }
        if(Event.equals("Green")) {
            pColor.setBackground(Color.GREEN);
        }
        if(Event.equals("Casuale")) {
            int R = (int)(Math.random()*256);
            int G = (int)(Math.random()*256);
            int B = (int)(Math.random()*256);
            pColor.setBackground(new Color(R,G,B));
        }
    }
}
class MainColore {
    public static void main(String[] args) {
        Finestra F = new Finestra();
        F.setVisible(true);
        F.setSize(300,300);
        F.setLocation(100,100);
        F.setResizable(false);
    }
}