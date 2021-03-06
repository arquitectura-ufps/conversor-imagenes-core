package co.edu.ufps.commons;

import java.io.File;

public interface Converter {
    public void defineFormatImages(ImageFormat formatInit, ImageFormat formatEnd);
    public void source(File image);
    public void setFolder(String folder);
    public void setName(String nameFile);
    public File startProcess() throws ConverterException;
}
