from Herencia import*

def main():
    print("costo Llamada Telefonica")
    costo=LlamadaTelefonica(20,3)
    print(costo.getCostoLLamadaTelefonica())

    print("Costo Telefono Fijo")
    costo2=TelefonoFijo(20,2)
    print(costo2.getCostoTelefonoFijo())

if __name__== "__main__":
    main()