import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class BookGUIView {
    private JFrame bookWindow;
    private JPanel panelNorth, panelSouth;
    private JLabel lbltitle, lblauthor, lblprice;
    private JTextField txttitle, txtauthor, txtprice;
    private JButton load, exit;
    private BookGUIView()
    {
        bookWindow = new JFrame("Bookstore MVC Example");
        bookWindow.setBounds(200,200, 300,400);
        panelSouth = new JPanel();
        load = new JButton("Load Data");
        exit = new JButton("Exit");
        panelSouth.add(load);
        panelSouth.add(exit);
        panelNorth = new JPanel();
        panelNorth.setLayout(new GridLayout(0,2));
        lbltitle =new JLabel("Title");
        txttitle = new JTextField(20);
        panelNorth.add(lbltitle);
        panelNorth.add(txttitle);
        txtauthor = new JTextField(20);
        lblauthor = new JLabel("Author");
        panelNorth.add(lblauthor);
        panelNorth.add(txtauthor);
        lblprice = new JLabel("Price");
        txtprice = new JTextField(20);
        panelNorth.add(lblprice);
        panelNorth.add(txtprice);
        bookWindow.getContentPane().add(panelNorth, BorderLayout.NORTH);
        bookWindow.getContentPane().add(panelSouth, BorderLayout.SOUTH);
        bookWindow.setDefaultCloseOperation(bookWindow.EXIT_ON_CLOSE);
        bookWindow.setVisible(true);
    }
    public static void main(String[] args)
    {
        new BookGUIView();
    }
}
