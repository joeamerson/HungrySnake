package Model;

import Model.Snake.Snake;

import javax.swing.*;
import java.awt.*;

public class Board extends JFrame  {

    private Shape shape ;
    private Snake snake;
    private initSnakeGame initSnakeGame;

    public int getBoardWidth() {
        return boardWidth;
    }

    public int getBoardHeight() {
        return boardHeight;
    }

    protected final int boardWidth = 300;
    protected final int boardHeight = 300;

    private void initBoard() {
        setBackground(Color.black);
        setFocusable(true);
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        shape.loadShape();
        initSnakeGame.initScreen();
    }
}
