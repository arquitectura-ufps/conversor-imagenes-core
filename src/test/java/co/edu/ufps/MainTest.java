package co.edu.ufps;

import co.edu.ufps.commons.Converter;
import co.edu.ufps.commons.Exception.ConverterException;
import co.edu.ufps.commons.Exception.ValidationException;
import co.edu.ufps.commons.ImageFormat;
import co.edu.ufps.core.ImageConverter;

import java.io.File;

public class MainTest {
    public static void main(String[] args) {
        File image = new File("temp/caballo.jpg");

        Converter converter = new ImageConverter();
        converter.source(image);
        converter.setName("prrosCambi");
        converter.setFolder("C:/Users/manuel.florez/Desktop/img");

        String mimeType = null;
        try {
            mimeType = converter.validateMimeType();
        } catch (ValidationException e) {
            e.printStackTrace();
        }
        ImageFormat formatInit = converter.validateMetaDataMineType(mimeType);

        converter.defineFormatImages(formatInit, ImageFormat.PNG);
        run(converter);

        converter.defineFormatImages(formatInit, ImageFormat.BMP);
        run(converter);

        converter.defineFormatImages(formatInit, ImageFormat.JPG);
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
