import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;

public class Display extends JFrame{

    private JPanel BottomPanel;
    private JTextField Input;
    private JLabel L1;
    private JLabel L10;
    private JLabel L11;
    private JLabel L12;
    private JLabel L13;
    private JLabel L14;
    private JLabel L15;
    private JLabel L16;
    private JLabel L17;
    private JLabel L18;
    private JLabel L19;
    private JLabel L2;
    private JLabel L20;
    private JLabel L21;
    private JLabel L22;
    private JLabel L23;
    private JLabel L24;
    private JLabel L25;
    private JLabel L26;
    private JLabel L3;
    private JLabel L4;
    private JLabel L5;
    private JLabel L6;
    private JLabel L7;
    private JLabel L8;
    private JLabel L9;
    private JPanel LetterDisplayPanel;
    private JPanel LetterHolder;
    private JLabel TitleLabel;
    private JPanel TitlePanel;
    private JLabel W1L1;
    private JLabel W1L2;
    private JLabel W1L3;
    private JLabel W1L4;
    private JLabel W1L5;
    private JLabel W2L1;
    private JLabel W2L2;
    private JLabel W2L3;
    private JLabel W2L4;
    private JLabel W2L5;
    private JLabel W3L1;
    private JLabel W3L2;
    private JLabel W3L3;
    private JLabel W3L4;
    private JLabel W3L5;
    private JLabel W4L1;
    private JLabel W4L2;
    private JLabel W4L3;
    private JLabel W4L4;
    private JLabel W4L5;
    private JLabel W5L1;
    private JLabel W5L2;
    private JLabel W5L3;
    private JLabel W5L4;
    private JLabel W5L5;
    private JLabel W6L1;
    private JLabel W6L2;
    private JLabel W6L3;
    private JLabel W6L4;
    private JLabel W6L5;

    private JLabel[] W1;
    private JLabel[] W2;
    private JLabel[] W3;
    private JLabel[] W4;
    private JLabel[] W5;
    private JLabel[] W6;

    JLabel[][] LetterDisplayLabels;

    public Display() throws Exception {
        initComponents();
    }

    /**
     * Initialize DisplayPanels and its components
     */
    private void initLetterDisplayPanel(){
        LetterDisplayPanel = new JPanel();
        W1L1 = new JLabel();
        W1L2 = new JLabel();
        W1L3 = new JLabel();
        W1L4 = new JLabel();
        W1L5 = new JLabel();

        W1 = new JLabel[]{W1L1, W1L2, W1L3, W1L4, W1L5};

        W2L1 = new JLabel();
        W2L2 = new JLabel();
        W2L3 = new JLabel();
        W2L4 = new JLabel();
        W2L5 = new JLabel();

        W2 = new JLabel[]{W2L1, W2L2, W2L3, W2L4, W2L5};

        W3L1 = new JLabel();
        W3L2 = new JLabel();
        W3L3 = new JLabel();
        W3L4 = new JLabel();
        W3L5 = new JLabel();

        W3 = new JLabel[]{W3L1, W3L2, W3L3, W3L4, W3L5};

        W4L1 = new JLabel();
        W4L2 = new JLabel();
        W4L3 = new JLabel();
        W4L4 = new JLabel();
        W4L5 = new JLabel();

        W4 = new JLabel[]{W4L1, W4L2, W4L3, W4L4, W4L5};

        W5L1 = new JLabel();
        W5L2 = new JLabel();
        W5L3 = new JLabel();
        W5L4 = new JLabel();
        W5L5 = new JLabel();

        W5 = new JLabel[]{W5L1, W5L2, W5L3, W5L4, W5L5};

        W6L1 = new JLabel();
        W6L2 = new JLabel();
        W6L3 = new JLabel();
        W6L4 = new JLabel();
        W6L5 = new JLabel();

        W6 = new JLabel[]{W6L1, W6L2, W6L3, W6L4, W6L5};

        LetterDisplayLabels = new JLabel[][]{W1, W2, W3, W4, W5, W6};

        for(JLabel[] a : LetterDisplayLabels) {
            for (JLabel b: a) {
                b.setBackground(new Color(102, 102, 102));
                b.setFont(new Font("Nirmala UI", 1, 36)); // NOI18N
                b.setHorizontalAlignment(SwingConstants.CENTER);
                b.setBorder(new javax.swing.border.LineBorder(new Color(102, 102, 102), 3, true));
                b.setOpaque(true);
                LetterDisplayPanel.add(b);
            }
        }

        LetterDisplayPanel.setBackground(new Color(153, 153, 153));
        LetterDisplayPanel.setMinimumSize(new Dimension(185, 150));
        LetterDisplayPanel.setPreferredSize(new Dimension(100, 75));
        LetterDisplayPanel.setLayout(new GridLayout(6, 5, 5, 5));

        getContentPane().add(LetterDisplayPanel, BorderLayout.CENTER);
    }

    /**
     * Initialize the alphabets panels and its components.
     */
    private void initLetterHolder(){
        LetterHolder = new JPanel();
        L1 = new JLabel();
        L2 = new JLabel();
        L3 = new JLabel();
        L4 = new JLabel();
        L5 = new JLabel();
        L6 = new JLabel();
        L7 = new JLabel();
        L8 = new JLabel();
        L9 = new JLabel();
        L10 = new JLabel();
        L11 = new JLabel();
        L12 = new JLabel();
        L13 = new JLabel();
        L14 = new JLabel();
        L15 = new JLabel();
        L16 = new JLabel();
        L17 = new JLabel();
        L18 = new JLabel();
        L19 = new JLabel();
        L20 = new JLabel();
        L21 = new JLabel();
        L22 = new JLabel();
        L23 = new JLabel();
        L24 = new JLabel();
        L25 = new JLabel();
        L26 = new JLabel();

        LetterHolder.setBackground(new Color(153, 153, 153));
        LetterHolder.setLayout(new GridLayout(3, 6, 3, 2));

        L1.setBackground(new Color(255, 255, 255));
        L1.setFont(new Font("Nirmala UI", 1, 36)); // NOI18N
        L1.setHorizontalAlignment(SwingConstants.CENTER);
        L1.setText("A");
        L1.setBorder(new javax.swing.border.LineBorder(new Color(102, 102, 102), 3, true));
        L1.setOpaque(true);
        LetterHolder.add(L1);

        L2.setBackground(new Color(255, 255, 255));
        L2.setFont(new Font("Nirmala UI", 1, 36)); // NOI18N
        L2.setHorizontalAlignment(SwingConstants.CENTER);
        L2.setText("B");
        L2.setBorder(new javax.swing.border.LineBorder(new Color(102, 102, 102), 3, true));
        L2.setOpaque(true);
        LetterHolder.add(L2);

        L3.setBackground(new Color(255, 255, 255));
        L3.setFont(new Font("Nirmala UI", 1, 36)); // NOI18N
        L3.setHorizontalAlignment(SwingConstants.CENTER);
        L3.setText("C");
        L3.setBorder(new javax.swing.border.LineBorder(new Color(102, 102, 102), 3, true));
        L3.setOpaque(true);
        LetterHolder.add(L3);

        L4.setBackground(new Color(255, 255, 255));
        L4.setFont(new Font("Nirmala UI", 1, 36)); // NOI18N
        L4.setHorizontalAlignment(SwingConstants.CENTER);
        L4.setText("D");
        L4.setBorder(new javax.swing.border.LineBorder(new Color(102, 102, 102), 3, true));
        L4.setOpaque(true);
        LetterHolder.add(L4);

        L5.setBackground(new Color(255, 255, 255));
        L5.setFont(new Font("Nirmala UI", 1, 36)); // NOI18N
        L5.setHorizontalAlignment(SwingConstants.CENTER);
        L5.setText("E");
        L5.setBorder(new javax.swing.border.LineBorder(new Color(102, 102, 102), 3, true));
        L5.setOpaque(true);
        LetterHolder.add(L5);

        L6.setBackground(new Color(255, 255, 255));
        L6.setFont(new Font("Nirmala UI", 1, 36)); // NOI18N
        L6.setHorizontalAlignment(SwingConstants.CENTER);
        L6.setText("F");
        L6.setBorder(new javax.swing.border.LineBorder(new Color(102, 102, 102), 3, true));
        L6.setOpaque(true);
        LetterHolder.add(L6);

        L7.setBackground(new Color(255, 255, 255));
        L7.setFont(new Font("Nirmala UI", 1, 36)); // NOI18N
        L7.setHorizontalAlignment(SwingConstants.CENTER);
        L7.setText("G");
        L7.setBorder(new javax.swing.border.LineBorder(new Color(102, 102, 102), 3, true));
        L7.setOpaque(true);
        LetterHolder.add(L7);

        L8.setBackground(new Color(255, 255, 255));
        L8.setFont(new Font("Nirmala UI", 1, 36)); // NOI18N
        L8.setHorizontalAlignment(SwingConstants.CENTER);
        L8.setText("H");
        L8.setBorder(new javax.swing.border.LineBorder(new Color(102, 102, 102), 3, true));
        L8.setOpaque(true);
        LetterHolder.add(L8);

        L9.setBackground(new Color(255, 255, 255));
        L9.setFont(new Font("Nirmala UI", 1, 36)); // NOI18N
        L9.setHorizontalAlignment(SwingConstants.CENTER);
        L9.setText("I");
        L9.setBorder(new javax.swing.border.LineBorder(new Color(102, 102, 102), 3, true));
        L9.setOpaque(true);
        LetterHolder.add(L9);

        L10.setBackground(new Color(255, 255, 255));
        L10.setFont(new Font("Nirmala UI", 1, 36)); // NOI18N
        L10.setHorizontalAlignment(SwingConstants.CENTER);
        L10.setText("J");
        L10.setBorder(new javax.swing.border.LineBorder(new Color(102, 102, 102), 3, true));
        L10.setOpaque(true);
        LetterHolder.add(L10);

        L11.setBackground(new Color(255, 255, 255));
        L11.setFont(new Font("Nirmala UI", 1, 36)); // NOI18N
        L11.setHorizontalAlignment(SwingConstants.CENTER);
        L11.setText("K");
        L11.setBorder(new javax.swing.border.LineBorder(new Color(102, 102, 102), 3, true));
        L11.setOpaque(true);
        LetterHolder.add(L11);

        L12.setBackground(new Color(255, 255, 255));
        L12.setFont(new Font("Nirmala UI", 1, 36)); // NOI18N
        L12.setHorizontalAlignment(SwingConstants.CENTER);
        L12.setText("L");
        L12.setBorder(new javax.swing.border.LineBorder(new Color(102, 102, 102), 3, true));
        L12.setOpaque(true);
        LetterHolder.add(L12);

        L13.setBackground(new Color(255, 255, 255));
        L13.setFont(new Font("Nirmala UI", 1, 36)); // NOI18N
        L13.setHorizontalAlignment(SwingConstants.CENTER);
        L13.setText("M");
        L13.setBorder(new javax.swing.border.LineBorder(new Color(102, 102, 102), 3, true));
        L13.setOpaque(true);
        LetterHolder.add(L13);

        L14.setBackground(new Color(255, 255, 255));
        L14.setFont(new Font("Nirmala UI", 1, 36)); // NOI18N
        L14.setHorizontalAlignment(SwingConstants.CENTER);
        L14.setText("N");
        L14.setBorder(new javax.swing.border.LineBorder(new Color(102, 102, 102), 3, true));
        L14.setOpaque(true);
        LetterHolder.add(L14);

        L15.setBackground(new Color(255, 255, 255));
        L15.setFont(new Font("Nirmala UI", 1, 36)); // NOI18N
        L15.setHorizontalAlignment(SwingConstants.CENTER);
        L15.setText("O");
        L15.setBorder(new javax.swing.border.LineBorder(new Color(102, 102, 102), 3, true));
        L15.setOpaque(true);
        LetterHolder.add(L15);

        L16.setBackground(new Color(255, 255, 255));
        L16.setFont(new Font("Nirmala UI", 1, 36)); // NOI18N
        L16.setHorizontalAlignment(SwingConstants.CENTER);
        L16.setText("P");
        L16.setBorder(new javax.swing.border.LineBorder(new Color(102, 102, 102), 3, true));
        L16.setOpaque(true);
        LetterHolder.add(L16);

        L17.setBackground(new Color(255, 255, 255));
        L17.setFont(new Font("Nirmala UI", 1, 36)); // NOI18N
        L17.setHorizontalAlignment(SwingConstants.CENTER);
        L17.setText("Q");
        L17.setBorder(new javax.swing.border.LineBorder(new Color(102, 102, 102), 3, true));
        L17.setOpaque(true);
        LetterHolder.add(L17);

        L18.setBackground(new Color(255, 255, 255));
        L18.setFont(new Font("Nirmala UI", 1, 36)); // NOI18N
        L18.setHorizontalAlignment(SwingConstants.CENTER);
        L18.setText("R");
        L18.setBorder(new javax.swing.border.LineBorder(new Color(102, 102, 102), 3, true));
        L18.setOpaque(true);
        LetterHolder.add(L18);

        L19.setBackground(new Color(255, 255, 255));
        L19.setFont(new Font("Nirmala UI", 1, 36)); // NOI18N
        L19.setHorizontalAlignment(SwingConstants.CENTER);
        L19.setText("S");
        L19.setBorder(new javax.swing.border.LineBorder(new Color(102, 102, 102), 3, true));
        L19.setOpaque(true);
        LetterHolder.add(L19);

        L20.setBackground(new Color(255, 255, 255));
        L20.setFont(new Font("Nirmala UI", 1, 36)); // NOI18N
        L20.setHorizontalAlignment(SwingConstants.CENTER);
        L20.setText("T");
        L20.setBorder(new javax.swing.border.LineBorder(new Color(102, 102, 102), 3, true));
        L20.setOpaque(true);
        LetterHolder.add(L20);

        L21.setBackground(new Color(255, 255, 255));
        L21.setFont(new Font("Nirmala UI", 1, 36)); // NOI18N
        L21.setHorizontalAlignment(SwingConstants.CENTER);
        L21.setText("U");
        L21.setBorder(new javax.swing.border.LineBorder(new Color(102, 102, 102), 3, true));
        L21.setOpaque(true);
        LetterHolder.add(L21);

        L22.setBackground(new Color(255, 255, 255));
        L22.setFont(new Font("Nirmala UI", 1, 36)); // NOI18N
        L22.setHorizontalAlignment(SwingConstants.CENTER);
        L22.setText("V");
        L22.setBorder(new javax.swing.border.LineBorder(new Color(102, 102, 102), 3, true));
        L22.setOpaque(true);
        LetterHolder.add(L22);

        L23.setBackground(new Color(255, 255, 255));
        L23.setFont(new Font("Nirmala UI", 1, 36)); // NOI18N
        L23.setHorizontalAlignment(SwingConstants.CENTER);
        L23.setText("W");
        L23.setBorder(new javax.swing.border.LineBorder(new Color(102, 102, 102), 3, true));
        L23.setOpaque(true);
        LetterHolder.add(L23);

        L24.setBackground(new Color(255, 255, 255));
        L24.setFont(new Font("Nirmala UI", 1, 36)); // NOI18N
        L24.setHorizontalAlignment(SwingConstants.CENTER);
        L24.setText("X");
        L24.setBorder(new javax.swing.border.LineBorder(new Color(102, 102, 102), 3, true));
        L24.setOpaque(true);
        LetterHolder.add(L24);

        L25.setBackground(new Color(255, 255, 255));
        L25.setFont(new Font("Nirmala UI", 1, 36)); // NOI18N
        L25.setHorizontalAlignment(SwingConstants.CENTER);
        L25.setText("Y");
        L25.setBorder(new javax.swing.border.LineBorder(new Color(102, 102, 102), 3, true));
        L25.setOpaque(true);
        LetterHolder.add(L25);

        L26.setBackground(new Color(255, 255, 255));
        L26.setFont(new Font("Nirmala UI", 1, 36)); // NOI18N
        L26.setHorizontalAlignment(SwingConstants.CENTER);
        L26.setText("Z");
        L26.setBorder(new javax.swing.border.LineBorder(new Color(102, 102, 102), 3, true));
        L26.setOpaque(true);
        LetterHolder.add(L26);

        BottomPanel.add(LetterHolder, BorderLayout.CENTER);

    }

    private void initComponents() throws Exception {

        initLetterDisplayPanel();

        TitlePanel = new JPanel();
        TitleLabel = new JLabel();

        BottomPanel = new JPanel();
        Input = new JTextField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(255, 255, 255));
        setLocation(new Point(0, 0));
        setName("MainFrame"); // NOI18N
        setPreferredSize(new Dimension(500, 750));
        setSize(new Dimension(500, 750));

        TitlePanel.setBackground(new Color(153, 153, 153));

        TitleLabel.setBackground(new Color(255, 255, 255));
        TitleLabel.setFont(new Font("Sitka Subheading", 1, 36)); // NOI18N
        TitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        TitleLabel.setText("BAODLE");
        TitleLabel.setBorder(new javax.swing.border.LineBorder(new Color(204, 255, 102), 3, true));
        TitlePanel.add(TitleLabel);

        getContentPane().add(TitlePanel, BorderLayout.PAGE_START);

        BottomPanel.setPreferredSize(new Dimension(10, 250));
        BottomPanel.setLayout(new BorderLayout(0, 1));

        Input.setBackground(new Color(153, 153, 153));
        Input.setFont(new Font("Segoe UI", 1, 18)); // NOI18N
        Input.setHorizontalAlignment(JTextField.CENTER);
        Input.setText("Enter 5 letter words");
        Input.setActionCommand("<Not Set>");
        Input.setBorder(BorderFactory.createLineBorder(new Color(204, 255, 102), 3));
        Input.setOpaque(true);
        Input.setPreferredSize(new Dimension(71, 30));
        BottomPanel.add(Input, BorderLayout.PAGE_START);

        initLetterHolder();

        getContentPane().add(BottomPanel, BorderLayout.PAGE_END);

        BaodlePicker baodle = new BaodlePicker();
        String myBaodleWord = baodle.getMyBaodle();
        System.out.println("The Baodle word is " + myBaodleWord);
        inputHandler myInput = new inputHandler(myBaodleWord);

        Input.addActionListener(evt -> {
            try {
                InputActionPerformed(evt, myInput, LetterDisplayLabels);
            } catch(FileNotFoundException e) {
                e.printStackTrace();
            }
        });

        pack();
    }

    private void InputActionPerformed(ActionEvent evt, inputHandler theInput, JLabel[][] myDisplay) throws FileNotFoundException {
        theInput.enterInput(Input.getText(), myDisplay[5-theInput.myTotalTries]);

    }

}
