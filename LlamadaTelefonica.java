package HERENCIA;

public class LlamadaTelefonica extends HERENCIA.Llamadas {
    public LlamadaTelefonica(float minutosdelaLlamada, float costoporminutos){
        super(minutosdelaLlamada);
        this.mintosdellamada=minutosdelaLlamada;
        this.costoporminutos=costoporminutos;
        this.calcularCostoLlamada();

    }
    public float getCostoLlamada(){
        return this.costoLlamada;
    }



    }




