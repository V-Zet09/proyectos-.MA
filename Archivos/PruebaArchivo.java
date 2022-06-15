package Archivos;
import java.io.*;
import java.util.ArrayList;

public class PruebaArchivo {
    private ArrayList<String> contenidoArchivo = new ArrayList<>();
    private ArrayList<Telefonica> listaEntrada = new ArrayList<>();
    private final String rutaWindows = "C:\\Users\\hp\\IdeaProjects\\LlamadaTelofonica\\src\\Archivos\\Datos.txt";


    public ArrayList<String> getContenidoArchivo() {
        return contenidoArchivo;
    }

    public ArrayList<Telefonica> getListaEntrada() {
        return listaEntrada;
    }

    public void leerArchivo(){
        LeerArchivo leer = new LeerArchivo();
        this.contenidoArchivo =
                leer.leerArchivo(this.rutaWindows);
        for (int i=0; i < this.contenidoArchivo.size();i++){
            String linea = this.contenidoArchivo.get(i);
            String elementosLinea[] = linea.split("#");
            try {
                double minutosLlamada = Double.parseDouble(elementosLinea[0]);
                double costoPorminutos = Double.parseDouble(elementosLinea[1]);
                listaEntrada.add(new Telefonica(minutosLlamada,costoPorminutos));
            } catch (NumberFormatException ex){
                ex.printStackTrace();
                listaEntrada.add(new Telefonica(0,0.0));
            }
        }
    }

    public void escribirArchivo(ArrayList<Telefonica> lista){
        String archivo = "resultados.csv";
        File f = new File(archivo);
        //Escritura
        try{
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);
            wr.write("");
            wr.append("Minutos,CostoPorMinutos, Total a pagar\n");
            for (int i=0; i < lista.size(); i++){
                wr.append(lista.get(i).getMinutosLlamada() +
                        "," + lista.get(i).getCostoPorMinutos() +
                        "," + lista.get(i).getTotalApagar() + "\n");
            }
            wr.close();
            bw.close();
        }catch(IOException e){

        }
    }

    public static void main (String args[]){
        PruebaArchivo prueba = new PruebaArchivo();
        prueba.leerArchivo();
        for (int i=0; i < prueba.getListaEntrada().size(); i++){
            System.out.println(prueba.getListaEntrada().get(i).getMinutosLlamada() +
                    "\t" + prueba.getListaEntrada().get(i).getCostoPorMinutos() +
                    "\t" + prueba.getListaEntrada().get(i).getTotalApagar());
        }
        prueba.escribirArchivo(prueba.getListaEntrada());

    }
}

