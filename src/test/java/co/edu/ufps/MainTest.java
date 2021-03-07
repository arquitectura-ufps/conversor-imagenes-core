package co.edu.ufps;

import co.edu.ufps.commons.Converter;
import co.edu.ufps.commons.Exception.ConverterException;
import co.edu.ufps.commons.Exception.ValidationException;
import co.edu.ufps.commons.ImageFormat;
import co.edu.ufps.core.ImageConverter;
import org.apache.commons.io.FilenameUtils;

import java.io.File;

public class MainTest {
    public static void main(String[] args) {

        File image = new File("temp/gato.bmp");
        Core converter = new Core();

        String formatImage = "png";
        String nameFile = "Pirulais";
        String destination = "C:/Users/manuel.florez/Desktop/img";

        try {
            // converter.converterImage(image, formatImage);
            // converter.converterImage(image, formatImage, nameFile);
            // converter.converterImage(image, formatImage, nameFile, destination);
            File imageOut = converter.converterImage(image, formatImage, nameFile, destination);
        } catch (ValidationException e) {
            e.printStackTrace();
        } catch (ConverterException e) {
            e.printStackTrace();
        }


    }

}
