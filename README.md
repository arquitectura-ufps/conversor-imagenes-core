# conversor-imagenes-core
Proyecto core el cual permite convertir tipos de imágenes (bmp, jpg, png, gif).

***

#### Reglas sobre formatos de imagenes aceptados

Formatos aceptados

| Formatos |
| :----------------: |
| JPG |
| PNG |
| GIF |
| BMP |


#### Ejemplo de uso
~~~
Converter converter = new ImageConverter();
converter.defineFormatImages("png", "jpg");

File image = new File("/Path...");
converter.source(image);

File imageOut = converter.startProcess();
~~~