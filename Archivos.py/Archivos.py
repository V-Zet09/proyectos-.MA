class Archivos:
    def leerArchivo(self, archivo):
        file = open(archivo, 'r')
        lineas = []
        lineas_archivo = []
        for linea in file.readlines():
            lineas.append(linea.replace('\n', '').split('#'))
        file.close()
        #for f in range(0, len(lineas)):
        #    try:
        #        lineas_archivo.append([float(lineas[f][0]), float(lineas[f][1])])
        #    except ValueError:
        #        lineas_archivo.append([0.0,0.0])
        return lineas

    def guardarResultados(self, archivo, elementos, resultados):
        file = open(archivo, 'w')
        file.write('Encabezado\n')
        for a in range(0, len(elementos)):
            linea = str(elementos[a][0]) + ',' + str(elementos[a][1]) \
                    + ',' + str(resultados[a][0]) + ',' + str(resultados[a][1]) + '\n'
            file.write(linea)
        file.close()
        return 0