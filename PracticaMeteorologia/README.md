# Acceso_Datos_2Practica
## Realizado por Daniel Castellote y Alejandro Lopez Abad

Este proyecto esta basado en dos ficheros abiertos CSV sacados de los datos abiertos de la Comunidad de Madrid.
Ahora explicaremos nuestro proyecto paso a paso hasta donde hemos conseguido llegar:
- Primeramente instanciamos los archivos CSV previamente dados con JavaNio2.
- Despues creamos un Buffer que leera el CSV e ira metiendo los datos token a token con String tokenizer.
- Estos tokens se iran guardando en los elementos que vayamos creando para nuestros nuevos XML.
- A continuacion leeremos y procesaremos los XML con API stream y mapearemos los datos XML a un objeto medicion.
- Esta clase Medicion tendra los nuevos datos que sacaremos para el nuevo xml con los datos fusionados de los dos XML.


Para mas informacion de cada paso mirar el pdf entregado en el proyecto
Enlace a nuestro video de Youtube: https://youtu.be/lpnvnlMdMuw





