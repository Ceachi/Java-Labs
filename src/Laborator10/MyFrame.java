package Laborator10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class MyFrame extends JFrame{
    private JButton exit = new JButton("exit");
    private JButton insert = new JButton("insert");

    private JTextField nume = new JTextField();

    private JLabel numeLabel = new JLabel("Nume: ");

    public MyFrame(){
        setTitle("insert");
        setSize(400,200);

        setLocation(100,100);
        setLayout(null);
        setResizable(false);

        initComponent();
        initEvent();
    }
    private void initComponent(){
        exit.setBounds(300,130,80,25);
        insert.setBounds(300,100,80,25);

        add(exit);
        add(insert);

        nume.setBounds(100,10, 100,20);
        numeLabel.setBounds(20,10,100,20);

        add(nume);
        add(numeLabel);
    }

    private void initEvent(){
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        insert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insert(e);
            }
        });
    }

    private void insert(ActionEvent e){
        try{
            String numeField = nume.getText();
            Connection con = DBUtil.getConnection(DBType.MYSQLDB);
            String sql = "insert into agenda values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, numeField);
            pstmt.setString(2, "");
            pstmt.setString(3, "");
            pstmt.setString(4, "");
            pstmt.setString(5, "");
            pstmt.setString(6, "");
            pstmt.setString(7, "");
            pstmt.setString(8, "");
            pstmt.setString(9, "");
            pstmt.execute();

            JOptionPane.showMessageDialog(null, "row successfully inserted", "Insert", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setVisible(true);
    }
}
