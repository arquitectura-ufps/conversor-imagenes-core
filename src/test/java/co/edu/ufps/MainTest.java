package co.edu.ufps;

import co.edu.ufps.commons.Converter;
import co.edu.ufps.commons.ConverterException;
import co.edu.ufps.commons.ImageFormat;
import co.edu.ufps.core.ImageConverter;

import java.io.File;

public class MainTest {
    public static void main(String[] args) {
        File image = new File("temp/perro.gif");

        Converter converter = new ImageConverter();
        converter.source(image);
        converter.setName("Pirulais");
        converter.setFolder("C:/Users/manuel.florez/Desktop");

        converter.defineFormatImages(ImageFormat.GIF, ImageFormat.PNG);
        run(converter);

        converter.defineFormatImages(ImageFormat.GIF, ImageFormat.BMP);
        run(converter);

        converter.defineFormatImages(ImageFormat.GIF, ImageFormat.JPG);
        run(converter);

    }

    public static void run(Converter converter) {
        try {
            File imageOut = converter.startProcess();
            System.out.println(imageOut.getAbsolutePath());
        } catch (ConverterException e) {
            e.printStackTrace();
        }
    }
}
