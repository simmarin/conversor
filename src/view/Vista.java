        package view;
        import javax.swing.*;
        import presenter.Presentador;
        import java.awt.event.ActionEvent;
        import java.awt.*;
        import java.awt.GridLayout;
        import java.awt.event.WindowAdapter;
        import java.awt.event.WindowEvent;
        import javax.swing.BorderFactory;
        import javax.swing.Box;
        import javax.swing.BoxLayout;
        import javax.swing.JButton;
        import javax.swing.JFrame;
        import javax.swing.JPanel;

public class Vista {
    private Presentador presenter;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel statusLabel;


    public Vista() {
        createUI();
    }

    private void createUI() {
        statusLabel = new JLabel("Kb-Mb");
        textField1= new JTextField(20);
        textField2= new JTextField(40);
        JButton button1 = new JButton("KB A MB");
        JButton button2 = new JButton("MB A KB");
        JButton button3 = new JButton("MB A GB");
        JButton button4 = new JButton("GB A MB");
        JButton button5 = new JButton("GB A TB");
        JButton button6 = new JButton("TB A GB");

        button1.addActionListener((ActionEvent e) -> {
            double n;
            n=Double.parseDouble(textField1.getText());
            presenter.division(n);
        });
        button2.addActionListener((ActionEvent e) -> {
            double n;
            n=Double.parseDouble(textField1.getText());
            presenter.multiplicacion(n);
        });

        button3.addActionListener((ActionEvent e) -> {
            double n;
            n=Double.parseDouble(textField1.getText());
            presenter.division(n);
        });

        button4.addActionListener((ActionEvent e) -> {
            double n;
            n=Double.parseDouble(textField1.getText());
            presenter.multiplicacion(n);
        });

        button5.addActionListener((ActionEvent e) -> {
            double n;
            n=Double.parseDouble(textField1.getText());
            presenter.division(n);
        });

        button6.addActionListener((ActionEvent e) -> {
            double n;
            n=Double.parseDouble(textField1.getText());
            presenter.multiplicacion(n);
        });



        JPanel p = new JPanel(new GridLayout(6, 1));

        JPanel p1 = new JPanel();
        Box box1 = new Box(BoxLayout.X_AXIS);
        box1.add(Box.createHorizontalStrut(5));
        box1.add(textField1);
        box1.add(Box.createHorizontalGlue());
        box1.add(button1);
        box1.add(Box.createHorizontalGlue());
        box1.add(Box.createHorizontalStrut(5));
        box1.add(textField2);
        p1.add(box1);
        p1.setBorder(BorderFactory.createRaisedBevelBorder());

        JPanel p2 = new JPanel();
        Box box2 = new Box(BoxLayout.X_AXIS);
        box2.add(Box.createHorizontalStrut(25));
        box2.add(button2);
        box2.add(Box.createHorizontalStrut(25));
        p2.add(box2);
        p2.setBorder(BorderFactory.createRaisedBevelBorder());

        JPanel p3 = new JPanel();
        Box box3 = new Box(BoxLayout.X_AXIS);
        box3.add(Box.createHorizontalStrut(25));
        box3.add(button3);
        box3.add(Box.createHorizontalGlue());
        p3.add(box3);
        p3.setBorder(BorderFactory.createRaisedBevelBorder());

        JPanel p4 = new JPanel();
        Box box4 = new Box(BoxLayout.X_AXIS);
        box4.add(Box.createHorizontalStrut(25));
        box4.add(button4);
        box4.add(Box.createHorizontalGlue());
        p4.add(box4);
        p4.setBorder(BorderFactory.createRaisedBevelBorder());

        JPanel p5 = new JPanel();
        Box box5 = new Box(BoxLayout.X_AXIS);
        box5.add(Box.createHorizontalStrut(25));
        box5.add(button5);
        box5.add(Box.createHorizontalGlue());
        p5.add(box5);
        p5.setBorder(BorderFactory.createRaisedBevelBorder());

        JPanel p6 = new JPanel();
        Box box6 = new Box(BoxLayout.X_AXIS);
        box6.add(Box.createHorizontalStrut(25));
        box6.add(button6);
        box6.add(Box.createHorizontalGlue());
        p6.add(box6);
        p6.setBorder(BorderFactory.createRaisedBevelBorder());

        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.add(p4);
        p.add(p5);
        p.add(p6);




        JFrame frame = new JFrame("CONVERSOR UDI");
        ((JPanel)frame.getContentPane()).setBackground(Color.white);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(p);

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }


    public void setPresenter(Presentador pres) {
        presenter = pres;
    }
    public void updateJtextfield2(String text) {
        textField2.setText(text);
    }
}
