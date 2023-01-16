fun main() {
    val michelle = P51()
    println(michelle)

    println(michelle.engineStatus())

    michelle.start()

    michelle.increaseThrottle()
    michelle.increaseThrottle()

    println(michelle.engineStatus())
}

/*
C - Especializacion y Especificacion

D - El super clase seria "Airplane" y el subclase es "P51". Airplane hereda de el interface "Engine"

E - No entitendo la pregunta

F - Las ventajas de especificacion comparada a la de especializacion  es que en el case de especificacion te deja crear
una plantilla de metodos y attrtibutos abstractos que se podria implementar el todos los casos cuando sea necesario.
Cuando no es rpeciso que los metodos o attrributos pertenezcan unicamente al clase que implementa.
 */