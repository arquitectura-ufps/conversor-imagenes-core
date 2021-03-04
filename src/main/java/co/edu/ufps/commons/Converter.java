package co.edu.ufps.commons;

import java.io.File;

public interface Converter {
    public void defineImages(String formatInit, String formatEnd);
    public void source(File image);
    public void startProcess();
    public void downloadImage();
}
