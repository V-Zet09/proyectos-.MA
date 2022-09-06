"""
Algoritmo 1. Se utiliza un ciclo for para realizar la suma
"""
from time import time

class complejidad:
	def sumar(self, num):
		tiempo_inicial = time()
		suma = 0
		for x in range(1, num + 1):
			suma += x
		tiempo_final = time()
		tiempo_ejecucion = tiempo_final - tiempo_inicial
		print ('El tiempo de ejecucion fue: ', tiempo_ejecucion)
		return suma

def main():
	test = complejidad()
	a = test.sumar(10000)
	print ('La suma es: ', a)

if __name__==  '__main__':
	main()