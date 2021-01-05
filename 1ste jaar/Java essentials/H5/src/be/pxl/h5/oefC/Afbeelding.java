package be.pxl.h5.oefC;

public class Afbeelding {
    private RGBPixel[][] pixels;


    public Afbeelding(RGBPixel[][] pixels) {
        this.pixels = pixels;
    }


    public RGBPixel[][] getPixels() {
        return pixels;
    }

    public int getHoogte() {
        return pixels.length;
    }

    public int getBreedte() {
        return pixels[0].length;
    }

    public void grijswaarde() {
        for (RGBPixel[] rij : pixels) {
            for (RGBPixel kolom : rij) {
                kolom.naarGrijswaarde();
            }
        }
    }

    public void inverteer() {
        for (RGBPixel[] rij : pixels) {
            for (RGBPixel kolom : rij) {
                kolom.naarInverse();
            }
        }
    }
}
