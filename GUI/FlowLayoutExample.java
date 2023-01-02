package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FlowLayoutExample {

    private static JLabel lblHeading;
    private static JLabel lblName;
    private static JLabel lblAge;
    private static JLabel lblAddress;
    private static JLabel lblPhoneNumber;
    private static JLabel lblCheckBox;
    private static JLabel lblGender;
    private static JTextField txtBoxName;
    private static JTextField txtBoxAge;
    private static JTextField txtBoxAddress;
    private static JTextField txtBoxPhoneNumber;
    private static JCheckBox chkBoxReading;
    private static JCheckBox chkBoxWriting;
    private static JCheckBox chkBoxSports;
    private static JRadioButton rBtnMale;
    private static JRadioButton rBtnFemale;
    private static ButtonGroup btnGroup;
    private static JComboBox<String> cmboSection;
    private static JButton btnSubmit;
    private static JButton btnClear;

    public static void main(String[] args) {
        JFrame frame = new JFrame("VS Intl College");
        JPanel panel = new JPanel();

        panel.setLayout(null);

        lblHeading = new JLabel("Welcome to Student Management System");
        lblHeading.setBounds(120, 20, 460, 20);
        lblHeading.setFont(new Font("Serif", Font.BOLD, 20));

        lblName = new JLabel();
        lblName.setText("Name");
        lblName.setBounds(20, 50, 100, 20);

        lblAge = new JLabel("Age");
        lblAge.setBounds(320, 50, 100, 20);

        lblAddress = new JLabel("Address");
        lblAddress.setBounds(20, 120, 100, 20);

        lblPhoneNumber = new JLabel("Phone Number");
        lblPhoneNumber.setBounds(320, 120, 100, 20);


        lblCheckBox = new JLabel("Interests: ");
        lblCheckBox.setBounds(20, 180, 100, 10);

        lblGender = new JLabel("Gender: ");
        lblGender.setBounds(20, 230, 100, 20);

        // Creating TextBoxes
        txtBoxName = new JTextField();
        txtBoxName.setBounds(20, 80, 200, 20);

        txtBoxAge = new JTextField();
        txtBoxAge.setBounds(320, 80, 200, 20);

        txtBoxAddress = new JTextField();
        txtBoxAddress.setBounds(20, 150, 200, 20);

        txtBoxPhoneNumber = new JTextField();
        txtBoxPhoneNumber.setBounds(320, 150, 200, 20);

        chkBoxReading = new JCheckBox("Reading", true);
        chkBoxReading.setBounds(20, 200, 100, 20);
        
        chkBoxWriting = new JCheckBox("Writing");
        chkBoxWriting.setBounds(140, 200, 100, 20);

        chkBoxSports = new JCheckBox("Sports");
        chkBoxSports.setBounds(260, 200, 100, 20);

        rBtnMale = new JRadioButton("Male", true);
        rBtnMale.setBounds(20, 250, 100, 20);

        rBtnFemale = new JRadioButton("Female");
        rBtnFemale.setBounds(140, 250, 100, 20);

        btnGroup = new ButtonGroup();
        btnGroup.add(rBtnMale);
        btnGroup.add(rBtnFemale);

        cmboSection = new JComboBox<String>();
        cmboSection.addItem("Section 1");
        cmboSection.addItem("Section 2");
        cmboSection.addItem("Section 3");
        cmboSection.setBounds(320, 250, 100, 20);

        // Adding buttons
        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(130, 280, 100, 20);
        btnSubmit.setBackground(Color.BLUE);
        btnSubmit.setForeground(Color.white);

        btnClear = new JButton("Clear");
        btnClear.setBounds(330, 280, 100, 20);

        // Adding components
        panel.add(lblHeading);
        panel.add(lblName);
        panel.add(lblAge);
        panel.add(lblAddress);
        panel.add(lblPhoneNumber);
        panel.add(lblCheckBox);
        panel.add(lblGender);

        panel.add(txtBoxName);
        panel.add(txtBoxAge);
        panel.add(txtBoxAddress);
        panel.add(txtBoxPhoneNumber);

        panel.add(chkBoxReading);
        panel.add(chkBoxSports);
        panel.add(chkBoxWriting);

        panel.add(rBtnMale);
        panel.add(rBtnFemale);

        panel.add(cmboSection);

        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = txtBoxName.getText();
                int age = 0;
                try {
                    age = Integer.parseInt(txtBoxAge.getText());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid age", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                chkBoxReading.isSelected();
                cmboSection.getSelectedItem();
                String address = txtBoxAddress.getText();
                String phoneNumber = txtBoxPhoneNumber.getText();

                Person person = new Person(age, name, address, phoneNumber);
                System.out.println(person.toString());
                clearTextField();

                JOptionPane.showMessageDialog(frame, person.toString(), "Person Details", JOptionPane.INFORMATION_MESSAGE);

            }
        });

        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearTextField();
            }
        });

        // adding buttons
        panel.add(btnSubmit);
        panel.add(btnClear);

        frame.add(panel);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(600, 400);
        frame.setVisible(true);
    }

    public static void clearTextField() {
        txtBoxName.setText("");
        txtBoxAge.setText("");
        txtBoxAddress.setText("");
        txtBoxPhoneNumber.setText("");
    }

}
