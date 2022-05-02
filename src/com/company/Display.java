package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;

public class Display extends JFrame{

    private JPanel BottomPanel;
    private JTextField Input;

    JLabel[][] LetterDisplayLabels;

    JLabel[] LetterHolderLabels;

    public Display() {
        initComponents();
    }

    /**
     * Initialize DisplayPanels and its components
     */
    private void initLetterDisplayPanel(){
        JPanel letterDisplayPanel = new JPanel();
        JLabel w1L1 = new JLabel();
        JLabel w1L2 = new JLabel();
        JLabel w1L3 = new JLabel();
        JLabel w1L4 = new JLabel();
        JLabel w1L5 = new JLabel();

        JLabel[] w1 = new JLabel[]{w1L1, w1L2, w1L3, w1L4, w1L5};

        JLabel w2L1 = new JLabel();
        JLabel w2L2 = new JLabel();
        JLabel w2L3 = new JLabel();
        JLabel w2L4 = new JLabel();
        JLabel w2L5 = new JLabel();

        JLabel[] w2 = new JLabel[]{w2L1, w2L2, w2L3, w2L4, w2L5};

        JLabel w3L1 = new JLabel();
        JLabel w3L2 = new JLabel();
        JLabel w3L3 = new JLabel();
        JLabel w3L4 = new JLabel();
        JLabel w3L5 = new JLabel();

        JLabel[] w3 = new JLabel[]{w3L1, w3L2, w3L3, w3L4, w3L5};

        JLabel w4L1 = new JLabel();
        JLabel w4L2 = new JLabel();
        JLabel w4L3 = new JLabel();
        JLabel w4L4 = new JLabel();
        JLabel w4L5 = new JLabel();

        JLabel[] w4 = new JLabel[]{w4L1, w4L2, w4L3, w4L4, w4L5};

        JLabel w5L1 = new JLabel();
        JLabel w5L2 = new JLabel();
        JLabel w5L3 = new JLabel();
        JLabel w5L4 = new JLabel();
        JLabel w5L5 = new JLabel();

        JLabel[] w5 = new JLabel[]{w5L1, w5L2, w5L3, w5L4, w5L5};

        JLabel w6L1 = new JLabel();
        JLabel w6L2 = new JLabel();
        JLabel w6L3 = new JLabel();
        JLabel w6L4 = new JLabel();
        JLabel w6L5 = new JLabel();

        JLabel[] w6 = new JLabel[]{w6L1, w6L2, w6L3, w6L4, w6L5};

        LetterDisplayLabels = new JLabel[][]{w1, w2, w3, w4, w5, w6};

        for(JLabel[] a : LetterDisplayLabels) {
            for (JLabel b: a) {
                b.setBackground(new Color(102, 102, 102));
                b.setFont(new Font("Nirmala UI", Font.BOLD, 36)); // NOI18N
                b.setHorizontalAlignment(SwingConstants.CENTER);
                b.setBorder(new javax.swing.border.LineBorder(new Color(102, 102, 102), 3, true));
                b.setOpaque(true);
                letterDisplayPanel.add(b);
            }
        }

        letterDisplayPanel.setBackground(new Color(153, 153, 153));
        letterDisplayPanel.setMinimumSize(new Dimension(185, 150));
        letterDisplayPanel.setPreferredSize(new Dimension(100, 75));
        letterDisplayPanel.setLayout(new GridLayout(6, 5, 5, 5));

        getContentPane().add(letterDisplayPanel, BorderLayout.CENTER);
    }

    /**
     * Initialize the alphabets panels and its components.
     */
    private void initLetterHolder(){
        JPanel letterHolder = new JPanel();
        JLabel l1 = new JLabel();
        JLabel l2 = new JLabel();
        JLabel l3 = new JLabel();
        JLabel l4 = new JLabel();
        JLabel l5 = new JLabel();
        JLabel l6 = new JLabel();
        JLabel l7 = new JLabel();
        JLabel l8 = new JLabel();
        JLabel l9 = new JLabel();
        JLabel l10 = new JLabel();
        JLabel l11 = new JLabel();
        JLabel l12 = new JLabel();
        JLabel l13 = new JLabel();
        JLabel l14 = new JLabel();
        JLabel l15 = new JLabel();
        JLabel l16 = new JLabel();
        JLabel l17 = new JLabel();
        JLabel l18 = new JLabel();
        JLabel l19 = new JLabel();
        JLabel l20 = new JLabel();
        JLabel l21 = new JLabel();
        JLabel l22 = new JLabel();
        JLabel l23 = new JLabel();
        JLabel l24 = new JLabel();
        JLabel l25 = new JLabel();
        JLabel l26 = new JLabel();

        LetterHolderLabels = new JLabel[]{l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22, l23, l24, l25, l26};

        letterHolder.setBackground(new Color(153, 153, 153));
        letterHolder.setLayout(new GridLayout(3, 6, 3, 2));

        int counter = 65;
        for(JLabel a : LetterHolderLabels) {
            a.setBackground(new Color(255, 255, 255));
            a.setFont(new Font("Nirmala UI", Font.BOLD, 36)); // NOI18N
            a.setHorizontalAlignment(SwingConstants.CENTER);
            a.setText(Character.toString((char) counter));
            a.setBorder(new javax.swing.border.LineBorder(new Color(102, 102, 102), 3, true));
            a.setOpaque(true);
            letterHolder.add(a);
            counter++;
        }

        BottomPanel.add(letterHolder, BorderLayout.CENTER);

    }

    private void initComponents() {

        initLetterDisplayPanel();

        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel();

        BottomPanel = new JPanel();
        Input = new JTextField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(255, 255, 255));
        setLocation(new Point(0, 0));
        setName("MainFrame"); // NOI18N
        setPreferredSize(new Dimension(500, 750));
        setSize(new Dimension(500, 750));
        setLocationRelativeTo(null);

        titlePanel.setBackground(new Color(153, 153, 153));

        titleLabel.setBackground(new Color(255, 255, 255));
        titleLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 36)); // NOI18N
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setText("BAODLE");
        titleLabel.setBorder(new javax.swing.border.LineBorder(new Color(204, 255, 102), 3, true));
        titlePanel.add(titleLabel);

        getContentPane().add(titlePanel, BorderLayout.PAGE_START);

        BottomPanel.setPreferredSize(new Dimension(10, 250));
        BottomPanel.setLayout(new BorderLayout(0, 1));

        Input.setBackground(new Color(153, 153, 153));
        Input.setFont(new Font("Segoe UI", Font.BOLD, 18)); // NOI18N
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

        //Event Listener for when enter is pressed
        Input.addActionListener(evt -> {
            try {
                InputActionPerformed(myInput, LetterDisplayLabels, LetterHolderLabels);
            } catch(FileNotFoundException e) {
                e.printStackTrace();
            }
        });

        //Event listener for when a key is pressed
        Input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt2) {
                InputKeyReleased(myInput, LetterDisplayLabels);
            }
        });

        pack();
    }

    /**
     * Submit the input into the Inputhandler to update this display and run game
     *  logic
     * @param theInput InputHandler
     * @param myDisplay The current display
     * @param theLetters The letter that gets gray out when they are wrong
     * @throws FileNotFoundException For when no file is found
     */
    private void InputActionPerformed(inputHandler theInput, JLabel[][] myDisplay, JLabel[] theLetters) throws FileNotFoundException {
        theInput.submitInput(Input.getText(), myDisplay[5-theInput.myTotalTries], theLetters);
        Input.setText(null);
    }

    /**
     * Display input onto my display in the current roll.
     * @param theInput The input Handler
     * @param myDisplay The current display
     */
    private void InputKeyReleased(inputHandler theInput, JLabel[][] myDisplay){
        if (Input.getText().length() < 6) {
            if(Input.getText().length() == 0 ) {
                clearMyDisplayRow(myDisplay[5-theInput.myTotalTries]);
                Input.setText(null);
            } else{
                clearMyDisplayRow(myDisplay[5-theInput.myTotalTries]);
                theInput.pressedInput(Input.getText(), myDisplay[5-theInput.myTotalTries]);
                System.out.println("My Current key pressed " +  Input.getText());
            }
        }
    }

    /**
     * A helper method to clear the JLabel rows
     * @param myDisplayRow the current myDisplay row.
     */
    private void clearMyDisplayRow(JLabel[] myDisplayRow) {
        for(JLabel a : myDisplayRow) {
            a.setText(null);
        }
    }

}
