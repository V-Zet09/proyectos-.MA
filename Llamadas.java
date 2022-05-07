package  HERENCIA;


public abstract class  Llamadas {
    protected float mintosdellamada;
    protected float costoporminutos;
    protected float costoLlamada;
    protected float minutosdelallamada2;
    protected float costoporminutos2;
    protected float TelefonoFijo;

    ///costructor de la clase padre
    public Llamadas(float mintosdellamada){
        this.mintosdellamada=mintosdellamada;
    }


    public void calcularCostoLlamada(){this.costoLlamada= this.mintosdellamada* this.costoporminutos;}

    public void caluclarTelefonoFijo(){this.TelefonoFijo=this.minutosdelallamada2* this.costoporminutos2;}



}


