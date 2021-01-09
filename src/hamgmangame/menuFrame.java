package hamgmangame;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class menuFrame extends JFrame{
    JButton opt1;
    JButton opt2;
    JButton opt3;
    JLabel title;
    public menuFrame(){
         opt1 = new JButton("Play Game");
         opt2 = new JButton("Instructions");
         opt3 = new JButton("Exit Game");
         title = new JLabel("HANGMAN");
         title.setFont(new Font("Serif", Font.BOLD, 24));
         setTitle("Hangman Game");
         setSize(300, 200);
         setResizable(false);
         setVisible(true);
         setLocationRelativeTo(null);
    }
    public void addComponent(){
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        c.gridx = 0;
        c.gridy = 0;
        c.weighty = 0.1;
        c.anchor = c.CENTER;
        add(title, c);
        
        c.gridx = 0;
        c.gridy = 1;
        c.fill = c.HORIZONTAL;
        add(opt1, c);
        
        c.gridx = 0;
        c.gridy = 2;
        c.fill = c.HORIZONTAL;
        add(opt2, c);
        
        c.gridx = 0;
        c.gridy = 3;
        c.fill = c.HORIZONTAL;
        add(opt3, c);
    }
}
