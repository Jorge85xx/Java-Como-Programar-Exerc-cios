package Capitulo4OperacoesDeAtribuicao.estudoDeCasoGUIs.exerciciosSobreGUIs.exercicio4_1.b_v2;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int next = 0;

        while( height - next >= 0){

            //canto superior esquerdo
            g.drawLine(0, 0, next, height - next);

            //canto inferior direito
            g.drawLine(width, height, next, height - next);

            //canto superior direito
            g.drawLine(width, 0, next, next);

            //canto inferior esquerdo
            g.drawLine(0, height, next, next);

            next = next + 15;
        }
    }
}
