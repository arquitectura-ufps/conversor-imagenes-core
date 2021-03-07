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
        Converter converter = new ImageConverter();
        String ext = FilenameUtils.getExtension(image.getName());

        if (!ext.equals("jpeg")){
            try {
                converter.validationMimeType(ext);
            } catch (ValidationException e) {
                e.printStackTrace();
            }
        }

        converter.source(image);
        converter.setName("prrosCambi");
        converter.setFolder("C:/Users/manuel.florez/Desktop/img");

        converter.defineFormat(ImageFormat.PNG);
        run(converter);

        converter.defineFormat(ImageFormat.BMP);
        run(converter);

        converter.defineFormat(ImageFormat.GIF);
        run(converter);

    }

    public static void run(Converter converter) {
        try {
            File imageOut = converter.startProcess();
            System.out.println(imageOut.getAbsolutePath());
        } catch (ConverterException | ValidationException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
