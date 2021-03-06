package co.edu.ufps.core;

import co.edu.ufps.commons.Converter;
import co.edu.ufps.commons.ConverterException;
import co.edu.ufps.commons.ImageFormat;
import co.edu.ufps.core.converter.*;

import java.io.File;
import java.util.Objects;

public class ImageConverter implements Converter, IConverter {

    private ImageFormat formatInit;
    private ImageFormat formatEnd;
    private File image;
    private String folder;

    @Override
    public void defineFormatImages(ImageFormat formatInit, ImageFormat formatEnd) {
        this.formatInit = formatInit;
        this.formatEnd = formatEnd;
    }

    @Override
    public void source(File image) {
        this.image = image;
    }

    @Override
    public File startProcess() throws ConverterException {
        return start(image, formatEnd, myFolder());
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
}
