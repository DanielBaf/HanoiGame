package Controller;

import View.Game;
import java.awt.Font;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 * @author Daniel
 */
public class Splash extends JDialog {

    private JLabel lblSplashScreen;
    private JProgressBar progressbar;
    private JLabel porcent;
    private JLabel porcent2;

    public Splash() {
        initialize();
        setSize(300, 150);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        setUndecorated(true);
        startThred();
    }

    private void initialize() {
        lblSplashScreen = new JLabel("Splash Screen");
        lblSplashScreen.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblSplashScreen.setBounds(49, 3, 147, 32);
        getContentPane().add(lblSplashScreen);

        progressbar = new JProgressBar();
        progressbar.setBounds(26, 30, 229, 32);
        getContentPane().add(progressbar);

        porcent = new JLabel("0%");
        porcent.setFont(new Font("Tahoma", Font.PLAIN, 14));
        porcent.setBounds(206, 30, 46, 14);
        getContentPane().add(porcent);

        porcent2 = new JLabel("0%");
        porcent2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        porcent2.setBounds(26, 97, 264, 14);
        getContentPane().add(porcent2);
    }

    private void startThred() {
        Thread thread = new Thread(new Runnable() {
            int x = 0;
            String cad = ".";

            @Override
            public void run() {
                try {
                    while (x <= 100) {
                        progressbar.setValue(x);
                        porcent.setText(x + "%");
                        porcent2.setText(cad + x + "%");
                        x += 2;
                        cad += ".";
                        Thread.sleep(20);
                    }
                    dispose();

                    Game game = new Game();
                    ControllerClass controller = new ControllerClass(game);
                    controller.begin();

                } catch (Exception e) {
                    System.out.println("Exception " + e.getMessage());
                }
            }
        });
        thread.start();
    }

}
