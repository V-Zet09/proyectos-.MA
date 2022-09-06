"""
Algoritmo 2. Se utiliza la formula (n * (n + 1))/2 para realizar la suma
"""
from time import time
class complejidad:
    def sumar(self, n):
        tiempo_inicial = time()
        suma = (n * (n + 1)) / 2
        tiempo_final = time()
        tiempo_ejecucion = tiempo_final - tiempo_inicial
        print('El tiempo de ejecucion fue: ', tiempo_ejecucion)
        return suma

def main():
    test = complejidad()
    a = test.sumar(1000000000)
    print ('La suma es: ', a)

if __name__==  '__main__':
    main()