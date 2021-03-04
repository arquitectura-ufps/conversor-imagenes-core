# Ejemplo de implementación

#### Uso del artefacto ImageConverter.
Se inicializa el artefacto

    Converter converter = new ImageConverter();
#### Se define el formato en que ingresa la imagen y el formato en que saldrá

    converter.defineFormatImages(formatInit, formatEnd);
#### se ingresa la imagen que se va a transformar

    converter.source(image);

#### se procesa y se obtiene la imagen en el nuevo formato

    File imageOut = converter.startProcess();
