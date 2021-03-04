package co.edu.ufps.commons;

import java.io.File;

public interface Converter {
    public void defineFormatImages(String formatInit, String formatEnd);
    public void source(File image);
    public File startProcess();
}
