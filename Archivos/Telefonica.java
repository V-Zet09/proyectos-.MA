package Archivos;

public class Telefonica  {
    private double minutosLlamada;                //minutos que tardo la llamada
    private double costoPorMinutos;        //costo por minuto de la llamada
    private int totalApagar;              //total a  pagar
/*
    Esta clase calcula el total a pagar
    por realizar una llamada telefonica
 */


    public Telefonica(double minutosLlamada, double costoPorminutos) {
        this.minutosLlamada=minutosLlamada;
        this.costoPorMinutos=costoPorminutos;
        this.calcularCostoLlamada();
    }


    public double getMinutosLlamada() {
        return minutosLlamada;
    }

    public void setMinutosLlamada(float minutosLlamada) {
        this.minutosLlamada = minutosLlamada;
    }

    public double getCostoPorMinutos() {
        return costoPorMinutos;
    }

    public void setCostoPorMinutos(float costoPorMinutos) {
        this.costoPorMinutos = costoPorMinutos;
    }

    public int getTotalApagar() {
        return totalApagar;
    }

    public void setTotalApagar(int totalApagar) {
        this.totalApagar = totalApagar;
    }

    public void calcularCostoLlamada() {
        this.totalApagar = (int) (this.minutosLlamada * this.costoPorMinutos);
        }



    public static void main(String[] args){
        Telefonica Telefonica  = new Telefonica(23,3);
        System.out.println(Telefonica.getTotalApagar());
        }
}