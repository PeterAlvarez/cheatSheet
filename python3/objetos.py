class Persona:
    nombre = "Pepito"
    edad = 15
    pais = "Bolivia"

    def __init__( self, nombre, edad, pais):
        self.nombre = nombre
        self.edad = edad
        self.pais = pais

    def saludar( self ):
        return 'Mi nombre es {} y soy de {} y tengo {} años'.format( self.nombre, self.pais, self.edad )

    def despedida( self ):
        print("asta Luego")

    def comprar( self ):
        print("puedo comprar por que {}".format(self.saludar()))

#Herencia
#Si no hay constructor en el hijo agarra el constructor del padre
class Empleado:
    trabajo = ""
#Multi Herenrcia
# Si no hay constructor en la clase hijo toma el constructor del primer padre en la izquierda
class Estudiante( Persona, Empleado ):
    escuela = ""

estudiante = Estudiante("Pepito", 15, "Bolivia ")
print(estudiante.nombre, estudiante.edad, estudiante.pais)
#Llamndo metododentro de metodo
estudiante.comprar()
