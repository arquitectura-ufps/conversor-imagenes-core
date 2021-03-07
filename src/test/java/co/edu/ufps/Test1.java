package co.edu.ufps;

import co.edu.ufps.commons.Converter;
import co.edu.ufps.commons.Exception.ValidationException;
import co.edu.ufps.commons.IValidation;
import co.edu.ufps.core.ImageConverter;
import org.apache.commons.io.FilenameUtils;
import org.junit.jupiter.api.Test;

class Test1 {

    @Test
    void run() {
        String file = "manuel.fefe.txt";
        String ext1 = FilenameUtils.getExtension(file);
        Converter converter = new ImageConverter();

        try {
            converter.validationMimeType(ext1);
        } catch (ValidationException e) {
            e.printStackTrace();
        }
    }
}
