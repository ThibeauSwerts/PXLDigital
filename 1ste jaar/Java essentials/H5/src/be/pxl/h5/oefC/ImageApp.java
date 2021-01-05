package be.pxl.h5.oefC;

public class ImageApp {
    public static void main(String[] args) {
        Afbeelding start = ImageReader.readImage("redpanda.jpg");
        start.inverteer();
        ImageWriter.writeImage(start, "invertpanda.jpg");
    }
}
