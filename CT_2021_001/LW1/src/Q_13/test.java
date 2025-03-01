package Q_13;

import javax.swing.*;  // Import Swing library for GUI components

class SampleWindow {
    public static void main(String[] args) {
        // Declare a JFrame object
        JFrame myWindow;

        // Initialize the JFrame object
        myWindow = new JFrame();

        // set the size of the window to 500x250 pixels
        myWindow.setSize(500, 250);

        // set the title of the window to "UOK"
        myWindow.setTitle("UOK");

        // Make the window visible
        myWindow.setVisible(true);

        // pause execution for 500 milliseconds (0.5 seconds)
        try {
            Thread.sleep(500);
        } catch(Exception e) {
            // Exception handling for sleep interruption (ignored here)
        }

        // hide the window
        myWindow.setVisible(false);

        // pause execution again for 500 milliseconds
        try {
            Thread.sleep(500);
        } catch(Exception e) {
            // exception handling for sleep interruption (ignored here)
        }

        // make the window visible again
        myWindow.setVisible(true);
    }
}
