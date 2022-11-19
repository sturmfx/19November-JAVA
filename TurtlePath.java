package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class TurtlePath
{
    public ArrayList<Integer> x = new ArrayList();
    public ArrayList<Integer> y = new ArrayList();
    public ArrayList<Integer> color = new ArrayList();
    public TurtlePath()
    {

    }
    public void save() throws IOException
    {
        String mainPath = "src/test1.txt";
        Path path = Paths.get(mainPath);
        String result = "";
        for(int a = 0; a < x.size(); a++)
        {
            result = result + x.get(a).toString() + "," + y.get(a).toString() + "," + color.get(a) + System.lineSeparator();
        }
        byte[] bytes = result.getBytes();
        Files.write(path, bytes);
    }

    public void addPoint(int _x, int _y, int _color)
    {
        x.add(_x);
        y.add(_y);
        color.add(_color);
    }
}