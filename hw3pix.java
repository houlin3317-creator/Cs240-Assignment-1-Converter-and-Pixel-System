//3.Write a program that reads an image and prints its pixel values.

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.imageio.ImageIO;

public class hw3pix {
    public static void main(String[] args) throws IOException {
        BufferedImage image = ImageIO.read(new File("src/img.png"));
        int width = image.getWidth();
        int height = image.getHeight();
        PrintWriter output = new PrintWriter("output.txt");
        output.println(width + " " + height);

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Color c = new Color(image.getRGB(x, y));
                output.println(c.getRed() + " " + c.getGreen() + " " + c.getBlue());
            }
        }
        output.close();
    }
}
