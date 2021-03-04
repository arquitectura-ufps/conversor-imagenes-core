package co.edu.ufps;

import co.edu.ufps.commons.Converter;
import co.edu.ufps.commons.ImageFormat;
import co.edu.ufps.core.ImageConverter;

import java.io.File;

public class Main {

    public Main() {}

    public File run (ImageFormat formatInit, ImageFormat formatEnd, File image) {
        Converter converter = new ImageConverter();
        converter.defineFormatImages(formatInit, formatEnd);
        converter.source(image);
        return converter.startProcess();
    }

    public static void main(String[] args) {
        File imageIn = new File("image.png");
        File imageOutJpg = new Main().run(ImageFormat.PNP, ImageFormat.JPG, imageIn);        File imageOut = new Main().run(ImageFormat.PNP, ImageFormat.JPG, imageIn);
        File imageOutGif = new Main().run(ImageFormat.PNP, ImageFormat.GIF, imageIn);
        File imageOutBmp = new Main().run(ImageFormat.PNP, ImageFormat.BMP, imageIn);
    }

}
