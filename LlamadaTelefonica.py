class llamadaTelefonica:
    __costosporllamada =float (0.0)
    __costoporminuto = int (0)
    __minutosdelallamada = int(0)

    def __init__(self, costoporminuto, minutosdelallamada):
        self.__costoporminuto = costoporminuto
        self.__minutosdelallamada = minutosdelallamada
        self.calcularCostoLlamadaTelefonica ()

    def calcularCostoTelefonoFijo (self, costoporminuto,minutosdelallamada):
        self.__costoporminuto=costoporminuto
        self.__costosporllamada=minutosdelallamada


    def get_calcularCostoLLamadaTelefonica(self):
        return self.__total

    def get_calcularCostoTelefonoFijo(self):
        return self.__total

    def calcularCostoLlamadaTelefonica(self):
        self.__total = self.__minutosdelallamada * self.__costoporminuto

    def calcularCostoTelefonoFijo(self):
        self.__total = self.__minutosdelallamada * self.__costoporminuto