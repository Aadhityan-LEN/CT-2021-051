package Q_02;
import javax.swing.*;
import java.util.*;

public class NameBind {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstname , lastname , fullname;
        System.out.println("Enter your firstname : ");
        firstname = scanner.next();
        System.out.println("Enter your lastname : ");
        lastname = scanner.next();
        fullname = firstname + " " + lastname ;
        //System.out.println(fullname);

        JFrame myWindow;
        myWindow = new JFrame();
        myWindow.setSize(800,600);
        myWindow.setTitle(fullname);
        myWindow.setVisible(true);
    }
}
