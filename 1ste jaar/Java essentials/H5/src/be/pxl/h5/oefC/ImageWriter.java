package be.pxl.h5.oefC;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ImageWriter {

    private static final String FORMAT = "jpg";

    public static void writeImage(Afbeelding afbeelding, String filename) {
        RGBPixel[][] pixels = afbeelding.getPixels();
        BufferedImage bufferedImage = new BufferedImage(afbeelding.getBreedte(), afbeelding.getHoogte(), BufferedImage.TYPE_INT_RGB);
        int rowIndex = 0;
        for (RGBPixel[] row : pixels) {
            int colIndex = 0;
            for (RGBPixel pixel : row) {
                bufferedImage.setRGB(colIndex, rowIndex, toRGB(pixel));
                colIndex++;
            }
            rowIndex++;
        }
        Path path = Paths.get("images/output/"+filename);

        try {
            ImageIO.write(bufferedImage, FORMAT, path.toFile());
        } catch (IOException e) {
            System.out.println("Afbeelding kon niet opgeslagen worden");
            e.printStackTrace();
        }
    }

    private static int toRGB(RGBPixel pixel) {
        int rgb = pixel.getRood();
        rgb = (rgb << 8) + pixel.getGroen();
        rgb = (rgb << 8) + pixel.getBlauw();
        return rgb;
    }
}
