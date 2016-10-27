// Chapter 6 Question 23

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Rpscissors extends JFrame
    implements ActionListener
{
  private final char moves[] = {'R', 'P', 'S'};
  private JRadioButton rock, paper, scissors;
  private JTextField display;

  public Rpscissors()
  {
    super("Rock, paper, Scissors");

    rock = new JRadioButton("   Rock   ", true);
    paper = new JRadioButton("   Paper  ");
    scissors = new JRadioButton(" Scissors ");

    ButtonGroup rpsButtons = new ButtonGroup();
    rpsButtons.add(rock);
    rpsButtons.add(paper);
    rpsButtons.add(scissors);

    JButton go = new JButton("         Go         ");
    go.addActionListener(this);

    display = new JTextField(25);
    display.setEditable(false);
    display.setBackground(Color.YELLOW);

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(rock);
    c.add(paper);
    c.add(scissors);
    c.add(go);
    c.add(display);
  }

  /** returns -1 if the player wins,
   *  0 if it's a tie, and 1 if the computer wins
   */
  private int nextPlay(char computerMove, char playerMove)
  {
      int diff = computerMove - playerMove;
      int result = 0;
      switch(diff)
      {
          case -3:
            result = -1;
            break;
          case -2:
            result = 1;
            break;
          case -1:
            result = 1;
            break;
          case 0:
            result = 0;
            break;
          case 1:
            result = -1;
            break;
          case 2:
            result = -1;
            break;
          case 3:
            result = 1;
            break;
      }
      return result;
  }

  public static void main(String[] args)
  {
    Rpscissors window = new Rpscissors();
    window.setBounds(300, 300, 300, 140);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setVisible(true);
  }
}