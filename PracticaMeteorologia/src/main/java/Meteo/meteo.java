package Meteo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class meteo {

    public static void main(String[] args) throws IOException {

        String DATOS_METEO_MES = "calidad_aire_datos_meteo_mes.csv";
        String DATOS_MES = "calidad_aire_datos_mes.csv";

        String WORKING_DIRECTORY = System.getProperty("user.dir");
        Path pathCont = Paths.get(WORKING_DIRECTORY + File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator + "Datos" +File.separator+ DATOS_METEO_MES);
        Path pathTemp = Paths.get(WORKING_DIRECTORY + File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator + "Datos" +File.separator+ DATOS_MES);

        RegistroMunicipios registro = new RegistroMunicipios();

        System.out.println("DATOS CARGADOS");
        registro.cargarDatosContaminantes(pathCont);
        registro.cargarDatosTemperatura(pathTemp);

        registro.sacarDatosContaminantes();
        registro.sacarDatosTemperatura();

        //registro.sacarMunicipio();



    }
}


