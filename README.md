# CajeroCliente
En la carpeta lib se encuentran dos librerias para el funcionamiento del cliente, la primera 'corebancario-ejb-1.jar' contiene las clases del servidor EJB, el mismo se encuentra en este link https://github.com/dennysq/CoreBancario, la segunda es 'appclient.jar', la cual contiene las librerias necesarias para ejecutar los EJB remotos en una aplicación StandAlone de Java.
Notas: Se usa glassfish 4.1, jdk 1.7.
Pasos:
1) Descomprimir el archivo appclient.jar en una dirección en el disco duro, preferiblemente sin espacios, como por ejemplo en el Disco C:
2) Agregar como dependencia del proyecto a 'corebancario-ejb-1.jar' y gf-client.jar (Este archivo se encuentra en ), 
