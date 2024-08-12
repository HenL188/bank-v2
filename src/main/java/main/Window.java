package main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Window {
    public void createWindow() {
        JFrame frame = new JFrame("Bank");
        frame.setSize(800, 450);
        JPanel page = home();
        frame.getContentPane().add(page);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    protected JPanel home(){
        final String PAGE1 = "account";
        final String PAGE2 = "new user";
        final String HOME = "home";

        JPanel page = new JPanel(new CardLayout());

        JButton newUser = new JButton();
        newUser.setText("New User");
        newUser.setBorderPainted(false);
        newUser.setOpaque(false);
        newUser.setBackground(Color.white);
        newUser.addActionListener(e -> {
            CardLayout cl = (CardLayout) (page.getLayout());
            cl.show(page, PAGE2);
        });

        JButton submit = new JButton("Login");
        submit.addActionListener(e ->{
            CardLayout cl = (CardLayout) (page.getLayout());
            cl.show(page, PAGE1);
        });

        JPanel home = new JPanel();
        JTextField username = new JTextField("username",16);
        JTextField password = new JTextField("password",16);

        home.add(username);
        home.add(password);
        home.add(submit);
        home.add(newUser);

        JPanel account = account();
        JPanel user = newUser(page);

        page.add(home, HOME);
        page.add(account, PAGE1);
        page.add(user,PAGE2);
        /*
            todo
            make new user page
            make login page
        * */
        return  page;
    }

    protected JPanel account (){

        JPanel account = new JPanel();
        JLabel a = new JLabel("account");
        account.add(a);
        return account;
    }

    protected JPanel newUser (JPanel page){
        JButton back = new JButton("Back");
        back.addActionListener(e ->{
            CardLayout cl = (CardLayout) (page.getLayout());
            cl.show(page, "home");
        });
        JButton submit = new JButton("Login");
        submit.addActionListener(e ->{
            CardLayout cl = (CardLayout) (page.getLayout());
            cl.show(page, "account");
        });
        JPanel user = new JPanel();
        JLabel t = new JLabel("hi");
        user.add(t);
        user.add(submit);
        user.add(back);
        return user;
    }

}
