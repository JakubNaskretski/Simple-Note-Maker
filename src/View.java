import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class View {


    JTextArea textArea;
    JScrollPane scrollPane;
    JMenuBar mb;
    JMenu menu1, menu2, submenu1, menu3;
    JMenuItem i1, i2, i3, i4, j1, j2, j3, k1, k2, k3;

    public View(String title) {
        JFrame frame = new JFrame(title);
        mb = new JMenuBar();
        frame.setJMenuBar(mb);
        frame.getContentPane();
        frame.setSize(500, 500);
        addComponentsToPane(frame.getContentPane(), mb);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        // Display frame
        frame.pack();
        frame.setVisible(true);}

    //Creates and adds to pane UI elements
    public void addComponentsToPane(Container pane, JMenuBar mb){

        menu1 = new JMenu("File");
        i1 = new  JMenuItem("Open");
        i2 = new  JMenuItem("Save");
        i3 = new  JMenuItem("Save as");
        i4 = new  JMenuItem("Exit");

        menu1.add(i1);
        menu1.add(i2);
        menu1.add(i3);
        menu1.add(i4);

        mb.add(menu1);

        menu2 = new JMenu("Edit");
        submenu1 = new JMenu("Adresy");
        j1 = new  JMenuItem("Praca");
        j2 = new  JMenuItem("Dom");
        j3 = new  JMenuItem("Szkoła");

        submenu1.add(j1);
        submenu1.add(j2);
        submenu1.add(j3);

        menu2.add(submenu1);

        mb.add(menu2);

        menu3 = new JMenu("Options");
        k1 = new  JMenuItem("Foreground");
        k2 = new  JMenuItem("Background");
        k3 = new  JMenuItem("Font size");

        menu3.add(k1);
        menu3.add(k2);
        menu3.add(k3);

        mb.add(menu3);

        textArea = new JTextArea(15,25);
        scrollPane = new JScrollPane(textArea);
        pane.add(scrollPane, BorderLayout.CENTER);

    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public void setTextArea( JTextArea textArea ) {
        this.textArea = textArea;
    }

    public JMenu getMenu1() {
        return menu1;
    }

    public void setSubmenu( JMenu menu1 ) {
        this.menu1 = menu1;
    }
}
