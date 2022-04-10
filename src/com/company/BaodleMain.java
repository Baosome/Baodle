package com.company;

/**
 * Main called
 */
public class BaodleMain {
    public static void main(String[] theArgs) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Display().setVisible(true);
            } catch(Exception e) {
                e.printStackTrace();
            }
        });
    }

}
