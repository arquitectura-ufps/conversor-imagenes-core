package co.edu.ufps;

import org.apache.commons.io.FilenameUtils;
import org.junit.jupiter.api.Test;

class Test1 {

    @Test
    void run() {
        String file = "manuel.fefe.txt";
        System.out.println(FilenameUtils.removeExtension(file));
        System.out.println(FilenameUtils.getExtension(file));
    }
}
