package co.edu.ufps.core;

import co.edu.ufps.commons.Converter;
import co.edu.ufps.commons.Exception.ConverterException;
import co.edu.ufps.commons.Exception.ValidationException;
import co.edu.ufps.commons.IValidation;
import co.edu.ufps.commons.ImageFormat;
import co.edu.ufps.core.converter.*;
import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.util.Objects;

import static java.util.Objects.isNull;

public class ImageConverter implements Converter,
        IConverter, IValidation {

    private ImageFormat formatInit;
    private ImageFormat formatEnd;
    private File image;
    private String folder;
    private String nameFile;

    @Override
    public void defineFormat(ImageFormat formatEnd) {
        this.formatEnd = formatEnd;
    }

    @Override
    public void source(File image) {
        this.image = image;
    }

    @Override
    public File startProcess() throws ConverterException, ValidationException {
        validation();
        String destination = myFolder() + "/" + myNameFile();
        return start(image, formatEnd, destination);
    }

    @Override
    public ImageFormat validationExtension(String mimeType) throws ValidationException {
        if (mimeType.equals("jpeg"))
            return ImageFormat.JPG;

        return metaDataMimeType(mimeType);
    }

    private void validation() throws ValidationException {
        String mimeType = getMimeType(image);
        formatInit = metaDataMimeType(mimeType);
    }

    private String myNameFile() {
        return (isNull(nameFile) || nameFile.isEmpty()) ?
                FilenameUtils.removeExtension(image.getName()) :
                nameFile;
    }

    private String myFolder() {
        return Objects.isNull(folder) ? "/" : folder;
    }

    public ImageFormat getFormatInit() {
        return formatInit;
    }

    public void setFormatInit(ImageFormat formatInit) {
        this.formatInit = formatInit;
    }

    public void setFormatEnd(ImageFormat formatEnd) {
        this.formatEnd = formatEnd;
    }

    @Override
    public void setFolder(String folder) {
        this.folder = folder;
    }

    @Override
    public void setName(String nameFile) {
        this.nameFile = nameFile;
    }

}
