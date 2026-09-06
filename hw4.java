//4.Write a program that consumes pixel values and creates an image.
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;

public class hw4 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("output.txt"));
        int width = sc.nextInt();
        int height = sc.nextInt();
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int r = sc.nextInt();
                int g = sc.nextInt();
                int b = sc.nextInt();
                Color c = new Color(r, g, b);
                image.setRGB(x, y, c.getRGB());
            }
        }
        sc.close();
        ImageIO.write(image, "png", new File("output.png"));
    }
}
