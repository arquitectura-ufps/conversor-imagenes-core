package co.edu.ufps.core;

import co.edu.ufps.commons.Converter;
import co.edu.ufps.commons.ImageFormat;

import java.io.File;

public class ImageConverter implements Converter {

    private ImageFormat formatInit;
    private ImageFormat formatEnd;
    private File image;

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
    public File startProcess() {
        throw new RuntimeException("Failed for implementation");
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
}
