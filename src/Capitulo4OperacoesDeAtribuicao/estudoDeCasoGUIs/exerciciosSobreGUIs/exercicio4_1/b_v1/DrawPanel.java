package Capitulo4OperacoesDeAtribuicao.estudoDeCasoGUIs.exerciciosSobreGUIs.exercicio4_1.b_v1;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        int x2 = 410;
        int y2 = 40;
        //left
        for (int i = 0; i < 13; i++){
            g.drawLine(0, 0, x2, y2);
            y2 += 33;
            x2 -= 30;
        }
        //right
        x2 = 48;
        y2 = 25;
        for (int i = 0; i < 13; i++) {
            g.drawLine(width, 0, x2, y2);
            y2 += 33;
            x2 += 30;
        }
        //left bottom
        x2 = 48;
        y2 = 25;
        for (int i = 0; i < 13; i++) {
            g.drawLine(0, height, x2, y2);
            x2 += 33;
            y2 += 32;
        }
        //right bottom
        x2 = 48;
        y2 = height-27;
        for (int i = 0; i < 13; i++) {
            g.drawLine(width, height, x2, y2);
            y2 -= 33;
            x2 += 30;
        }

/*        int passos = 0;


        while( height - passos >= 0){

            //canto superior esquerdo
            g.drawLine(0, 0, passos, height - passos);

            //canto inferior direito
            g.drawLine(width, height, passos, height - passos);

            //canto superior direito
            g.drawLine(width, 0, passos, passos);

            //canto inferior esquerdo
            g.drawLine(0, height, passos, passos);

            passos = passos + 15;}*/
    }
}
