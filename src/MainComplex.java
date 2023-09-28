import javax.swing.*;

public class MainComplex extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JButton button1;

    public MainComplex() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
    }

    public static void main(String[] args) {
        MainComplex dialog = new MainComplex();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
