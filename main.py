from abstracta import*
from LlamadaTelefonica import *

def main ():
    resultado = llamadaTelefonica(12,20)
    print(resultado.get_calcularCostoLLamadaTelefonica())

    Costo=llamadaTelefonica(12,10)
    print(Costo.get_calcularCostoTelefonoFijo())


    print("Clase y método abstracto")
    print(llamadaAbstracta.calcularCostoLlamadaTelefonica(16, 8))


if __name__ == "__main__":
    main()