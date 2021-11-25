package fr.ensea.project2A;

import javax.swing.*;
import java.awt.* ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {
    static protected Drawing d = new Drawing();


    public Window(String Title, int x, int y) {
        super(Title);
        this.setSize(x, y);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Container contentPanel = this.getContentPane();

        JMenuBar m = new JMenuBar();

        JMenu menu1 = new JMenu("File");
        JMenuItem new1 = new JMenuItem("New");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem quit = new JMenuItem("Quit");
        menu1.add(new1);
        menu1.add(open);
        menu1.add(save);
        menu1.add(quit);
        open.addActionListener(this);
        save.addActionListener(this);
        new1.addActionListener(this);
        quit.addActionListener(this);
        m.add(menu1);


        JMenu menu2 = new JMenu("A propos");
        JMenuItem autors = new JMenuItem("Auteurs");
        menu2.add(autors);
        autors.addActionListener(this);
        m.add(menu2);
        contentPanel.add(m,"North");


        JPanel DownPanel=new JPanel();
        DownPanel.setLayout(new GridLayout(1,2));


        JPanel DownLeftPanel=new JPanel();
        JButton BlackButton = new JButton("Noir");
        BlackButton.setBackground(Color.black);
        BlackButton.setForeground(Color.white);
        DownLeftPanel.add(BlackButton);
        JButton RedButton = new JButton("Rouge");
        RedButton.setBackground(Color.red);
        DownLeftPanel.add(RedButton);
        JButton GreenButton = new JButton("Vert");
        GreenButton.setBackground(Color.green);
        DownLeftPanel.add(GreenButton);
        JButton BlueButton = new JButton("Bleu");
        BlueButton.setBackground(Color.blue);
        BlueButton.setForeground(Color.white);
        DownLeftPanel.add(BlueButton);
        JButton YellowButton = new JButton("Jaune");
        YellowButton.setBackground(Color.yellow);
        DownLeftPanel.add(YellowButton);
        JButton PinkButton = new JButton("Rose");
        PinkButton.setBackground(Color.pink);
        DownLeftPanel.add(PinkButton);
        JButton MagentaButton = new JButton("Magenta");
        MagentaButton.setBackground(Color.magenta);
        DownLeftPanel.add(MagentaButton);
        JButton OrangeButton = new JButton("Orange");
        OrangeButton.setBackground(Color.orange);
        DownLeftPanel.add(OrangeButton);
        DownLeftPanel.setLayout(new GridLayout(2,4));

        BlackButton.addActionListener(this);
        RedButton.addActionListener(this);
        GreenButton.addActionListener(this);
        BlueButton.addActionListener(this);
        YellowButton.addActionListener(this);
        PinkButton.addActionListener(this);
        MagentaButton.addActionListener(this);
        OrangeButton.addActionListener(this);


        JPanel DownRightPanel=new JPanel();
        JButton EllipseButton = new JButton("Ellipse");
        EllipseButton.setBackground(Color.lightGray);
        DownRightPanel.add(EllipseButton);
        JButton CircleButton = new JButton("Cercle");
        CircleButton.setBackground(Color.lightGray);
        DownRightPanel.add(CircleButton);
        JButton RectangleButton = new JButton("Rectangle");
        RectangleButton.setBackground(Color.lightGray);
        DownRightPanel.add(RectangleButton);
        JButton SquareButton = new JButton("Carre");
        SquareButton.setBackground(Color.lightGray);
        DownRightPanel.add(SquareButton);
        DownRightPanel.setLayout(new GridLayout(2,2));

        EllipseButton.addActionListener(this);
        CircleButton.addActionListener(this);
        RectangleButton.addActionListener(this);
        SquareButton.addActionListener(this);

        DownPanel.add(DownLeftPanel);
        DownPanel.add(DownRightPanel);

        setJMenuBar(m);
        contentPanel.add(new JTextArea(""),"Center");
        contentPanel.add(DownPanel,"South");
        contentPanel.add(d, "Center");

        this.setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        switch (cmd) {
            case "Rouge":
                d.setColor(Color.red);
                break;
            case "Vert":
                d.setColor(Color.green);
                break;
            case "Noir":
                d.setColor(Color.black);
                break;
            case "Bleu":
                d.setColor(Color.blue);
                break;
            case "Jaune":
                d.setColor(Color.yellow);
                break;
            case "Rose":
                d.setColor(Color.pink);
                break;
            case "Magenta":
                d.setColor(Color.magenta);
                break;
            case "Orange":
                d.setColor(Color.orange);
                break;
            case "Rectange":
                d.setNameFigure("Rectangle");
                break;
            case "Carre":
                d.setNameFigure("Carre");
                break;
            case "Ellipse":
                d.setNameFigure("Ellipse");
                break;
            case "Cercle":
                d.setNameFigure("Cercle");
                break;
            case "New":
                d.erase();
                break;
            case "Auteurs":
                JOptionPane jop = new JOptionPane();
                jop.showInternalMessageDialog(jop, "Auteur : Royston Winson", "information", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Quit":
                System.exit(0);
                break;
            default:
                System.out.println("Action : " + cmd);
                break;
        }
    }


    public static void main(String args[]){
        Window win=new Window("Paint",800,600);
    }
}
