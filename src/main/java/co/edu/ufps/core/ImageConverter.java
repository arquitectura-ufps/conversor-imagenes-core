package co.edu.ufps.core;

import co.edu.ufps.commons.Converter;

import java.io.File;

public class ImageConverter implements Converter {

    private String formatInit;
    private String formatEnd;
    private File image;

    @Override
    public void defineFormatImages(String formatInit, String formatEnd) {
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

    public String getFormatInit() {
        return formatInit;
    }

    public void setFormatInit(String formatInit) {
        this.formatInit = formatInit;
    }
}
