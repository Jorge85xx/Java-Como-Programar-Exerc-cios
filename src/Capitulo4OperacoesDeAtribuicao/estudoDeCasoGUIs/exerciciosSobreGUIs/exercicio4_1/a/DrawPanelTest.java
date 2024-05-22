package Capitulo4OperacoesDeAtribuicao.estudoDeCasoGUIs.exerciciosSobreGUIs.exercicio4_1.a;

import javax.swing.*;

public class DrawPanelTest{
    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(500, 500);
        application.setVisible(true);
        application.setLocation(500, 200);
    }
}
