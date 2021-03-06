package co.edu.ufps.core.converter;

import co.edu.ufps.commons.ConverterException;
import co.edu.ufps.commons.ImageFormat;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

public interface IConverter {
    default public File start(File image, ImageFormat formatEnd, String folder) throws ConverterException {
        switch (formatEnd) {
            case PNG: return run(image, "png", folder);
            case GIF: return run(image, "gif", folder);
            case JPG: return run(image, "jpg", folder);
            case BMP: return run(image, "bmp", folder);
            default: throw new ConverterException("Error al convertir imagen: formato no valido");
        }
    }

    default File run(File image, String formatName, String folder) {
        final String name = UUID.randomUUID().toString();
        File imageEnd = new File(folder +"/" + name + "." + formatName);
        try {
            BufferedImage bufferedImage = ImageIO.read(image);
            ImageIO.write(bufferedImage, formatName, imageEnd);
            return imageEnd;
        } catch (IOException e) {
            throw new RuntimeException("Error al convertir imagen: " + e.getMessage());
        }
    }
}
