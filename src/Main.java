/*import javax.swing.*;

public class MainComplex extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JButton button1;
    private JLabel JtextReal1;
    private JLabel JtextMnimoeB1;
    private JLabel JtextFieldUserNumb;

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
*/
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Complex Number Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Окно ввода для realA1
        final JTextField realA1Field = new JTextField(5);
        realA1Field.setText("0");

        // Окно ввода для mnimoeB1
        final JTextField mnimoeB1Field = new JTextField(5);
        mnimoeB1Field.setText("1");

        // Окно ввода для userNumb
        final JTextField userNumbField = new JTextField(5);
        userNumbField.setText("2");

        // Кнопка "Выполнить расчет"
        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(e -> {
            double realA1 = Double.parseDouble(realA1Field.getText());
            double mnimoeB1 = Double.parseDouble(mnimoeB1Field.getText());
            double userNumb = Double.parseDouble(userNumbField.getText());

            // Расчет комплексного числа
            ComplexNumber complexNumber = new ComplexNumber();
            complexNumber.ofMultiComplexOfNum();

            // Вывод результатов
            JOptionPane.showMessageDialog(null,
                    "Результат умножения: " + complexNumber.rezultMulty);
            JOptionPane.showMessageDialog(null, "Аргумент комплексного числа (в градусах): ");
            JOptionPane.showMessageDialog(null, "Аргумент комплексного числа (в радианах): ");
        });
        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));
        panel.add(new JLabel("realA1:"));
        panel.add(realA1Field);
        panel.add(new JLabel("mnimoeB1:"));
        panel.add(mnimoeB1Field);
        panel.add(new JLabel("userNumb:"));
        panel.add(userNumbField);
        panel.add(calculateButton);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

}

