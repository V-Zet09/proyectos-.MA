from abc import ABC

import self as self


class Llamadas (ABC):

    _costosporllamada = float(0.0)
    _costoporminuto = int(0)
    _minutosdelallamada = int(0)

    #metodo constructor
    def __init__(self, costoporminuto,minutosdelallamada):
        self._costoporminuto=costoporminuto
        self._minutosdelallamada=minutosdelallamada

    @staticmethod
    def calcularCostoLLamadaTelefonica(self):
        pass

    @staticmethod
    def calcularTelefonoFijo(self):
        pass

    @staticmethod

    def get_CostoLLamadaTelefonica(self):
        pass

    @staticmethod
    def get_CostoTelefonoFijo(self):
        pass

class LlamadaTelefonica(Llamadas):
    _costosporllamada1 =float (0)

    def __init__(self,minutosdellamada,costoporminuto):
        Llamadas.__init__(self,minutosdellamada,costoporminuto)
        self.__costoporminutos=costoporminuto
        self.__minutosdellamada=minutosdellamada
        self.calcularCostoLlamadaTelefonica()

    def calcularCostoLlamadaTelefonica(self):
        self.__costosporllamada1 =self.__minutosdellamada * self.__costoporminutos

    def getCostoLLamadaTelefonica(self):
        return self.__costosporllamada1


class TelefonoFijo(Llamadas):
        _costosporllamada2 = float(0)

        def __init__(self,costoporminuto2,minutosdelallamada2):
            Llamadas.__init__(self,costoporminuto2,minutosdelallamada2)
            self.__costoporminuto2=costoporminuto2
            self.__minutosdelallamada2=minutosdelallamada2
            self.calcularTelefonoFijo()

        def calcularTelefonoFijo(self):
            self.__costoporllamada2= self.__minutosdelallamada2 * self.__costoporminuto2


        def getCostoTelefonoFijo(self):
            return self.__costoporllamada2







