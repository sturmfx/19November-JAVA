package com.company;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
public class Game
{
    public Turtle t;
    public Random r;
    public TurtlePath tp;
    public int x_limit = 200;
    public int y_limit = 200;
    public int number_of_iterations = 50;
    public ArrayList<Color> colors = new ArrayList();
    public Game()
    {
        colors.add(Color.RED);
        colors.add(Color.BLUE);
        colors.add(Color.BLACK);
        colors.add(Color.YELLOW);
        colors.add(Color.GREEN);
        r = new Random();
        t = new Turtle();
        tp = new TurtlePath();
        t.speed(200);

    }

    public static void main(String[] args) throws IOException
    {
        Game g = new Game();
        for(int a = 0; a < g.number_of_iterations; a++)
        {
            int x = g.r.nextInt(2 * g.x_limit) - g.x_limit;
            int y = g.r.nextInt(2 * g.y_limit) - g.y_limit;
            int new_color = g.r.nextInt(g.colors.size());

            g.tp.addPoint(x, y, new_color);
            g.t.penColor(g.colors.get(new_color));
            g.t.setPosition(x, y);

        }

        g.tp.save();
    }

}
