package Scuola.INFORMATICA.JAVA.GUI.Menu;
import java.io.*;
import java.awt.*;
import javax.swing.*;
class MainMenu {
    public static void main(String[] args) {
        JFrame F = new JFrame();
        JPanel P = new JPanel();
        JPanel P1 = new JPanel();
        JPanel P2 = new JPanel();
        JPanel P3 = new JPanel();
        JPanel P4 = new JPanel();
        JPanel P5 = new JPanel();
        JButton BOk = new JButton("Ok");
        JButton BAn = new JButton("Annulla");
        JLabel Text1 = new JLabel("Inserisci il tuo pranzo");
        JCheckBox CheckP = new JCheckBox("Primo");
        JCheckBox CheckP1 = new JCheckBox("Secondo");
        JLabel Porzioni = new JLabel("Porzioni Primo");
        JLabel Porzioni2 = new JLabel("Porzioni Secondo");
        JTextField TPrimo = new JTextField(4);
        JTextField TSecondo = new JTextField(4);
        P1.add(Text1);
        P2.setLayout(new GridLayout(2,2));
        
    }
}