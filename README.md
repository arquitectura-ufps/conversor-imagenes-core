
# conversor-imagenes-core

**Diagnostico 0: Conversor de imagenes**


Proyecto core el cual permite convertir tipos de imágenes (bmp, jpg, png, gif).

El conversor- imagenes- core:  

* Con la clase  **Converter.java**

Declarando el metodo **Interface Converter**: definimos los formatos de imagen, el formato de imagen de entrada y el formato que se desea convertir la imagen; la imagen de tipo **File**, se define la ruta y el nombre con el que se desea guardar la nueva imagen, en caso contrario de no definir la ruta y nombre se guardara en la raiz principal y con el mismo nombre original pero con diferente extension. Con **File startProcess()** tomamos la informacion, se convierte  la imagen, la valida y devuelve la imagen ya convertida; con **ImageFormat validationExtension()** se  hace validación de las extensiones y la validación de la metadata con los  *mimeType*

**Converter.java** hace la implementacion con **ImageConverter.java**

**ImageConverter.java** usa una interfaz llamada **IConverter.java**

* En la clase **IConverter.java** con unos metodos predefinidos, en donde cada imagen trabaja de la misma manera, dependiendo el caso cambia su formato. Tambien hay unas clases personalizadas, por si llega a existir algun error al momento de convertir, escribir o leer la imagen, este entrega el error en cada metodo.
 
 
