package co.edu.ufps;

import co.edu.ufps.commons.Converter;
import co.edu.ufps.core.ImageConverter;

import java.io.File;

public class Main {

    public Main() {}

    public File run (String formatInit, String formatEnd, File image) {
        Converter converter = new ImageConverter();
        converter.defineFormatImages(formatInit, formatEnd);
        converter.source(image);
        return converter.startProcess();
    }

    public static void main(String[] args) {
        File imageIn = new File("image.png");
        File imageOut = new Main().run("png", "jpg", imageIn);
        // 1. Definir el formato de la imagen inicial y el tipo de formato de la
        //    imagen final
        // 2. Recibir la imagen
        // 3. corvertirla
        // 4. devolver la imagen
    }

}
