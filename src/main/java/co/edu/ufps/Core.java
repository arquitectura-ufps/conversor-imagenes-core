package co.edu.ufps;

import co.edu.ufps.commons.Exception.ConverterException;
import co.edu.ufps.commons.Exception.ValidationException;
import co.edu.ufps.commons.ImageFormat;
import co.edu.ufps.core.ImageConverter;
import org.apache.commons.io.FilenameUtils;

import static java.util.Objects.isNull;

import java.io.File;

public class Core extends ImageConverter {

    public File converterImage(File image, String formatImage) throws ConverterException, ValidationException {
        instance(image, formatImage);
        return startProcess();
    }

    public File converterImage(File image, String formatImage, String nameFile) throws ConverterException, ValidationException {
        if (!isNull(nameFile) || !nameFile.isEmpty())
            setName(nameFile);
        instance(image, formatImage);
        return startProcess();
    }

    public File converterImage(File image, String formatImage, String nameFile, String destination)
            throws ValidationException, ConverterException {

        if (!isNull(nameFile) || !nameFile.isEmpty())
            setName(nameFile);

        if (!isNull(destination) || !destination.isEmpty())
            setFolder(destination);

        instance(image, formatImage);
        return startProcess();
    }

    private void instance(File image, String formatImage) throws ValidationException {
        String ext = FilenameUtils.getExtension(image.getName());
        validationExtension(ext);
        source(image);
        ImageFormat imageFormat = validationExtension(formatImage);
        defineFormat(imageFormat);
    }

}
