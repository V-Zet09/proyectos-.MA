package HERENCIA;


public class mainHERENCIA {
    public static void  main(String[]args) {
        System.out.println("costollamada");
        LlamadaTelefonica resultado = new LlamadaTelefonica(34,2);
        System.out.println(resultado.getCostoLlamada());

        System.out.println("TelefonoFijo");
        TelefonoFijo resultado2= new TelefonoFijo(35,2);
        System.out.println((resultado2.getTelefonoFijo()));
    }
}
