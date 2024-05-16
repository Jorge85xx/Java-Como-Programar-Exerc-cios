package Capitulo4OperacoesDeAtribuicao.estudoDeCasoGUIs.primeiroAplicativoDeDesenho;

import javax.swing.*;

public class DrawPanelTest {

    public static void main(String[] args) {
        // cria um painel que contem o desenho
        DrawPanel panel = new DrawPanel();

        //cria um novo quadro para armazenar o painel
        JFrame application = new JFrame();

        //configura o frame para ser encerrado quando ele é fechado
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);//adiciona o panel ao frame
        application.setSize(550, 550); //configura o tamanho do frame
        application.setVisible(true); // torna o frame visivel
        application.setLocation(500, 200); //para ela iniciar no meio

    }
}
