fun main() {
    var michelle = P51()
    println(michelle)

    println(michelle.engineStatus())

    michelle.start()

    michelle.increaseThrottle()
    michelle.increaseThrottle()

    println(michelle.engineStatus())
}

/*
C - Especializacion Y Especificacion
D - El super clase seria "Airplane" y el subclase es "P51". Airplane hereda de el interface "Engine"
E -
F -
 */