import javax.swing.*;
import java.util.ArrayList;

public class Asd extends JDialog {
    private JPanel contentPane;
    private JButton Raschet;
    private JTextField JtextReal1;
    private JTextField JtextMnimoeB1;
    private JTextField JtextFieldUserNumb;
    private JTextArea textModProvod;
    private JTextArea textArgComplProvodimosty;
    ArrayList<ComplexRezist> numbList;

    public Asd() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(Raschet);
        numbList = new ArrayList<ComplexRezist>();
        int currendInd = -1;
    }

    public static void main(String[] args) {
        Asd dialog = new Asd();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
