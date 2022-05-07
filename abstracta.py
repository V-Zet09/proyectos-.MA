from abc import ABC, abstractmethod

class llamadaAbstracta(ABC):

    @staticmethod
    def calcularCostoLlamadaTelefonica (minutosdelallamada, costoporminuto):
        return minutosdelallamada*costoporminuto