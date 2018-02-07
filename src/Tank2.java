
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.net.URL;


/* <applet code = "test" width = 300 height = 300> </applet> */

public class Tank2
extends Applet
implements Runnable {
    AudioClip a;
   
    Color mycolor;
    Color color1;
    Thread t;
    int i = 0;

    @Override
    public void init() {
        this.t = new Thread(this);
        this.setLayout(null);
        this.setSize(1366, 786);
        this.mycolor = new Color(135, 206, 250);
        this.color1 = new Color(222, 184, 135);
        this.setBackground(this.color1);
        this.a = this.getAudioClip(this.getCodeBase(), "train_1.wav");
        this.a.play();
        this.t.start();
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 550, 1386, 10);
        g.fillRect(0, 560, 20, 7);
        g.fillRect(40, 560, 25, 7);
        g.fillRect(80, 560, 25, 7);
        g.fillRect(120, 560, 25, 7);
        g.fillRect(160, 560, 25, 7);
        g.fillRect(200, 560, 25, 7);
        g.fillRect(240, 560, 25, 7);
        g.fillRect(280, 560, 25, 7);
        g.fillRect(320, 560, 25, 7);
        g.fillRect(360, 560, 25, 7);
        g.fillRect(400, 560, 25, 7);
        g.fillRect(440, 560, 25, 7);
        g.fillRect(480, 560, 25, 7);
        g.fillRect(520, 560, 25, 7);
        g.fillRect(560, 560, 25, 7);
        g.fillRect(600, 560, 25, 7);
        g.fillRect(640, 560, 25, 7);
        g.fillRect(680, 560, 25, 7);
        g.fillRect(720, 560, 25, 7);
        g.fillRect(760, 560, 25, 7);
        g.fillRect(800, 560, 25, 7);
        g.fillRect(840, 560, 25, 7);
        g.fillRect(880, 560, 25, 7);
        g.fillRect(920, 560, 25, 7);
        g.fillRect(960, 560, 25, 7);
        g.fillRect(1000, 560, 25, 7);
        g.fillRect(1040, 560, 25, 7);
        g.fillRect(1080, 560, 25, 7);
        g.fillRect(1120, 560, 25, 7);
        g.fillRect(1160, 560, 25, 7);
        g.fillRect(1200, 560, 25, 7);
        g.fillRect(1240, 560, 25, 7);
        g.fillRect(1280, 560, 25, 7);
        g.fillRect(1320, 560, 25, 7);
        g.setColor(Color.yellow);
        g.fillRect(1060 + this.i, 260, 150, 250);
        g.setColor(Color.MAGENTA);
        g.fillRect(1030 + this.i, 250, 200, 10);
        g.setColor(Color.pink);
        g.fillRect(1070 + this.i, 270, 130, 90);
        g.setColor(Color.DARK_GRAY);
        g.fillOval(1100 + this.i, 460, 90, 90);
        g.fillOval(880 + this.i, 500, 50, 50);
        g.fillOval(970 + this.i, 500, 50, 50);
        g.setColor(Color.black);
        g.fillOval(1110 + this.i, 470, 70, 70);
        g.fillOval(887 + this.i, 507, 35, 35);
        g.fillOval(977 + this.i, 507, 35, 35);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(900 + this.i, 520, 100, 7);
        g.setColor(Color.cyan);
        g.fillRect(850 + this.i, 360, 210, 150);
        g.setColor(Color.gray);
        g.fillRect(857 + this.i, 367, 196, 75);
        int[] x = new int[]{800 + this.i, 850 + this.i, 850 + this.i};
        int[] y = new int[]{520, 450, 520};
        g.setColor(Color.red);
        g.fillPolygon(x, y, 3);
        g.setColor(Color.BLACK);
        g.fillArc(839 + this.i, 360, 20, 85, 90, 180);
        g.setColor(Color.black);
        g.fillRect(880 + this.i, 300, 20, 60);
        int[] a = new int[]{850 + this.i, 880 + this.i, 900 + this.i, 930 + this.i};
        int[] b = new int[]{260, 300, 300, 260};
        g.fillRect(930 + this.i, 340, 30, 20);
        g.fillRect(990 + this.i, 320, 30, 40);
        g.setColor(Color.pink);
        g.fillPolygon(a, b, 4);
        int[] l = new int[]{850 + this.i, 865 + this.i, 915 + this.i, 930 + this.i};
        int[] j = new int[]{260, 240, 240, 260};
        g.setColor(Color.BLUE);
        g.fillPolygon(l, j, 4);
        g.fillArc(930 + this.i, 335, 30, 10, 360, 180);
        g.fillArc(990 + this.i, 315, 30, 10, 360, 180);
        g.setColor(Color.green);
        g.fillArc(0, 590, 400, 10, 360, 180);
        g.fillArc(360, 590, 200, 15, 360, 180);
        g.fillArc(400, 590, 600, 15, 360, 180);
        g.fillArc(900, 590, 600, 25, 360, 180);
        g.fillRect(0, 600, 1366, 200);
        g.fillRect(0, 595, 925, 20);
        g.setColor(this.mycolor);
        g.fillArc(0, 170, 400, 10, 180, 180);
        g.fillArc(390, 168, 400, 15, 180, 180);
        g.fillArc(700, 168, 400, 15, 180, 180);
        g.fillArc(900, 168, 400, 15, 180, 180);
        g.fillArc(1100, 168, 400, 15, 180, 180);
        g.fillRect(0, 0, 1366, 170);
        g.fillRect(0, 170, 700, 5);
        g.fillRect(700, 170, 700, 5);
        g.setColor(Color.yellow);
        g.fillOval(600, 20, 50, 50);
        g.setColor(Color.black);
        g.drawArc(500 - this.i, 100 + this.i, 30, 30, 10, 120);
        g.drawArc(530 - this.i, 100 + this.i, 30, 30, 60, 120);
        g.drawArc(520 + this.i, 90 + this.i, 30, 30, 10, 120);
        g.drawArc(550 + this.i, 90 + this.i, 30, 30, 60, 120);
    }

    public void run() {
        try {
            while (this.i < 820) {
                this.repaint();
                Thread.sleep(200);
                this.i -= 10;
            }
        }
        catch (Exception var1_1) {
            // empty catch block
        }
    }
}
