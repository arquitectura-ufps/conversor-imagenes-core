package co.edu.ufps.commons;

import co.edu.ufps.commons.Exception.ConverterException;
import co.edu.ufps.commons.Exception.ValidationException;

import java.io.File;

public interface Converter {
    public void defineFormat(ImageFormat formatEnd);
    public void source(File image);
    public void setFolder(String folder);
    public void setName(String nameFile);
    public File startProcess() throws ConverterException, ValidationException;
    public ImageFormat validationExtension(String mimeType) throws ValidationException;
}
