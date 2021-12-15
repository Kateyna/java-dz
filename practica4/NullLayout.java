import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.String;

class NullLayout extends JFrame {
    private int l = 0;
    private int p = 0;

    JButton but1 = new JButton("AC Milan");
    ;
    JButton but2 = new JButton("Real Madrid");
    ;
    JLabel score = new JLabel("Result 0 x 0 ");
    ;
    JLabel ls = new JLabel("Last Scorer: ");
    ;
    Label fa = new Label("Winner: ");
    ;

    public NullLayout() {
        setLayout(null);
        score.setBounds(25, 80, 200, 20);
        ls.setBounds(25, 100, 200, 20);
        fa.setBounds(25, 120, 200, 20);

        but1.setBounds(25, 50, 100, 20); // added at 150,300 width = 100, height=20
        but1.addActionListener(new evt());
        but2.setBounds(175, 50, 150, 20); // added at 150,300 width = 100, height=20
// those two steps can be combined in one setBounds method call
        but2.addActionListener(new evt1());


        add(but1);
        add(but2);
        add(score);
        add(ls);
        add(fa);
        setSize(400, 500);
    }

    public void actsda() {
        if (l > p) {
            fa.setText("Winner: AC Milan");
        }
        if (l == p) {
            fa.setText("Winner: DRAW");
        }
        if (l < p) {
            fa.setText("Winner: Real Madrid");
        }

    }

    public static void main(String[] args) {

        new NullLayout().setVisible(true);
    }

    private class evt implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            l++;
            score.setText("Result " + l + " x " + p);
            ls.setText("Last Scorer: AC Milan");
            if (l>p){
                fa.setText("Winner: AC Milan");
            }
            if (l==p){
                fa.setText("Winner: DRAW");
            }
        }
    }

    private class evt1 implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            p++;
            score.setText("Result " + l + " x " + p);
            ls.setText("Last Scorer: Real Madrid");
            if (p>l){
                fa.setText("Winner: Real Madrid");
            }
            if (l==p){
                fa.setText("Winner: DRAW");
            }
        }
    }

}