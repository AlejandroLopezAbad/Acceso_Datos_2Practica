package Meteo;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LectorCSV {

    public static List<contaminantes> contaminantesCSV(Path p) throws IOException {
        try (Stream<String> stream = Files.lines(p, StandardCharsets.UTF_8)) {
            return stream
                    .filter(s->{
                        if(s.contains(null)){
                            stream.skip(1);
                        }
                        return Boolean.parseBoolean(s);
                    })
                    .map(v->v.replaceAll(",","."))
                    .map(s -> s.split(";"))
                    .skip(1)
                    .map(splitted ->{
                        int provincia= Integer.parseInt(splitted[0]);
                        int municipio= Integer.parseInt(splitted[1]);
                        int estacion= Integer.parseInt(splitted[2]);
                        int magnitud= Integer.parseInt(splitted[3]);
                        String puntoMuestreo= (splitted[4]);
                        int ano= Integer.parseInt(splitted[5]);
                        int mes= Integer.parseInt(splitted[6]);
                        int dia= Integer.parseInt(splitted[7]);
                        double h1 = Double.parseDouble(splitted[8]);
                        String v1 = splitted[9];
                        double h2 = Double.parseDouble(splitted[10]);
                        String v2 = splitted[11];
                        double h3 = Double.parseDouble(splitted[12]);
                        String v3 = splitted[13];
                        double h4 = Double.parseDouble(splitted[14]);
                        String v4 = splitted[15];
                        double h5 = Double.parseDouble(splitted[16]);
                        String v5 = splitted[17];
                        double h6 = Double.parseDouble(splitted[18]);
                        String v6 = splitted[19];
                        double h7 = Double.parseDouble(splitted[20]);
                        String v7 = splitted[21];
                        double h8 = Double.parseDouble(splitted[22]);
                        String v8 = splitted[23];
                        double h9 = Double.parseDouble(splitted[24]);
                        String v9 = splitted[25];
                        double h10 = Double.parseDouble(splitted[26]);
                        String v10 = splitted[27];
                        double h11 = Double.parseDouble(splitted[28]);
                        String v11 = splitted[29];
                        double h12 = Double.parseDouble(splitted[30]);
                        String v12 = splitted[31];
                        double h13 = Double.parseDouble(splitted[32]);
                        String v13 = splitted[33];
                        double h14 = Double.parseDouble(splitted[34]);
                        String v14 = splitted[35];
                        double h15 = Double.parseDouble(splitted[36]);
                        String v15 = splitted[37];
                        double h16 = Double.parseDouble(splitted[38]);
                        String v16 = splitted[39];
                        double h17 = Double.parseDouble(splitted[40]);
                        String v17 = splitted[41];
                        double h18 = Double.parseDouble(splitted[42]);
                        String v18 = splitted[43];
                        double h19 = Double.parseDouble(splitted[44]);
                        String v19 = splitted[45];
                        double h20 = Double.parseDouble(splitted[46]);
                        String v20 = splitted[47];
                        double h21 = Double.parseDouble(splitted[48]);
                        String v21 = splitted[49];
                        double h22 = Double.parseDouble(splitted[50]);
                        String v22 = splitted[51];
                        double h23 = Double.parseDouble(splitted[52]);
                        String v23 = splitted[53];
                        double h24 = Double.parseDouble(splitted[54]);
                        String v24 = splitted[55];

                        return new contaminantes(provincia,municipio,estacion,magnitud,puntoMuestreo,ano,mes,dia,h1,v1,h2,v2,h3,v3,h4,v4,h5,v5,h6,v6,h7,v7,h8,v8,h9,v9,h10,v10,h11,v11,h12,v12,h13,v13,h14,v14,h15,v15,h16,v16,h17,v17,h18,v18,h19,v19,h20,v20,h21,v21,h22,v22,h23,v23,h24,v24);
                    })
                    .collect(Collectors.toList());
        }
    }

    //----------------------------------------------------------------------------------------


    public static List<temperatura> temperaturasCSV(Path p) throws IOException {
        try (Stream<String> stream = Files.lines(p, StandardCharsets.UTF_8)) {
            return stream
                    .map(v->v.replaceAll(",","."))
                    //.map(t->t.replaceAll("\\s",""))
                    .map(s -> s.split(";"))
                    .skip(1)
                    .map(splitted ->{
                        int provincia= Integer.parseInt(splitted[0]);
                        int municipio= Integer.parseInt(splitted[1]);
                        int estacion= Integer.parseInt(splitted[2]);
                        int magnitud= Integer.parseInt(splitted[3]);
                        String puntoMuestreo= (splitted[4]);
                        int ano= Integer.parseInt(splitted[5]);
                        int mes= Integer.parseInt(splitted[6]);
                        int dia= Integer.parseInt(splitted[7]);
                        double h1 = Double.parseDouble(splitted[8]);
                        String v1 = splitted[9];
                        double h2 = Double.parseDouble(splitted[10]);
                        String v2 = splitted[11];
                        double h3 = Double.parseDouble(splitted[12]);
                        String v3 = splitted[13];
                        double h4 = Double.parseDouble(splitted[14]);
                        String v4 = splitted[15];
                        double h5 = Double.parseDouble(splitted[16]);
                        String v5 = splitted[17];
                        double h6 = Double.parseDouble(splitted[18]);
                        String v6 = splitted[19];
                        double h7 = Double.parseDouble(splitted[20]);
                        String v7 = splitted[21];
                        double h8 = Double.parseDouble(splitted[22]);
                        String v8 = splitted[23];
                        double h9 = Double.parseDouble(splitted[24]);
                        String v9 = splitted[25];
                        double h10 = Double.parseDouble(splitted[26]);
                        String v10 = splitted[27];
                        double h11 = Double.parseDouble(splitted[28]);
                        String v11 = splitted[29];
                        double h12 = Double.parseDouble(splitted[30]);
                        String v12 = splitted[31];
                        double h13 = Double.parseDouble(splitted[32]);
                        String v13 = splitted[33];
                        double h14 = Double.parseDouble(splitted[34]);
                        String v14 = splitted[35];
                        double h15 = Double.parseDouble(splitted[36]);
                        String v15 = splitted[37];
                        double h16 = Double.parseDouble(splitted[38]);
                        String v16 = splitted[39];
                        double h17 = Double.parseDouble(splitted[40]);
                        String v17 = splitted[41];
                        double h18 = Double.parseDouble(splitted[42]);
                        String v18 = splitted[43];
                        double h19 = Double.parseDouble(splitted[44]);
                        String v19 = splitted[45];
                        double h20 = Double.parseDouble(splitted[46]);
                        String v20 = splitted[47];
                        double h21 = Double.parseDouble(splitted[48]);
                        String v21 = splitted[49];
                        double h22 = Double.parseDouble(splitted[50]);
                        String v22 = splitted[51];
                        double h23 = Double.parseDouble(splitted[52]);
                        String v23 = splitted[53];
                        double h24 = Double.parseDouble(splitted[54]);
                        String v24 = splitted[55];

                        return new temperatura(provincia,municipio,estacion,magnitud,puntoMuestreo,ano,mes,dia,h1,v1,h2,v2,h3,v3,h4,v4,h5,v5,h6,v6,h7,v7,h8,v8,h9,v9,h10,v10,h11,v11,h12,v12,h13,v13,h14,v14,h15,v15,h16,v16,h17,v17,h18,v18,h19,v19,h20,v20,h21,v21,h22,v22,h23,v23,h24,v24);
                    })
                    .collect(Collectors.toList());
        }
    }
}





