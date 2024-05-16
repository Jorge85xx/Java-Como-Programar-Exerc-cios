package Capitulo4OperacoesDeAtribuicao.estudoDeCasoGUIs.primeiroAplicativoDeDesenho;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    //desenha um x a partir dos cantos do painel
    public void paintComponent(Graphics graphics){
        //chama paintComponent para assegurar que o painel é exibido corretamente
        super.paintComponent(graphics);

        int width = getWidth();
        int height = getHeight();

        ///desenha uma linha a partir do canto superior esquerdo até o inferior direito
        graphics.drawLine(0, 0, width, height);
        //desenha uma linha a partir do canto inferior esquerdo até o superior direito
        graphics.drawLine(0, height, width, 0);


    }
}
