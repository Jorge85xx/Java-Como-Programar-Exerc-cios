package Capitulo4OperacoesDeAtribuicao.estudoDeCasoGUIs.exerciciosSobreGUIs.exercicio4_1.a;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        int x2 = 350;
        int y2 = 30;

        for (int i = 0; i < 15; i++){
            g.drawLine(0, 0, x2, y2);
            y2 += 30;
            x2 -= 24.02;
        }

    }
}
