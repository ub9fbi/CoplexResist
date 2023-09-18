import javax.swing.*;
import java.awt.event.*;

public class Panel extends JDialog {
    private JPanel contentPane;
    private JTextField JtextRealA1;
    private JTextField Jtext1MnimoeB1;
    private JTextField JtextFieldUserNumb;
    private JTextArea textArgComlecsY;
    private JTextArea textModProvod;
    private JButton buttonOK;
    private JButton buttonCancel;

    public Panel() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);





        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        Panel dialog = new Panel();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

}
