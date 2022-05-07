package HERENCIA;

public class TelefonoFijo extends HERENCIA.Llamadas {

    public TelefonoFijo(float minutosdelallamada2, float costoporminutos2){
            super(minutosdelallamada2);
            this.minutosdelallamada2=minutosdelallamada2;
            this.costoporminutos2=costoporminutos2;
            this.caluclarTelefonoFijo();


        }
        public void calcularTelefonoFijo(){
            this.TelefonoFijo= this.minutosdelallamada2*costoporminutos2;}

        public float getTelefonoFijo(){return this.TelefonoFijo;}



            }








