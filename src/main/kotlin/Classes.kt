//ESPESCIALIZACION
abstract class Airplane : Engine {
    val minSpeed = 0
    abstract val maxSpeed: Int // KM/H
    abstract val seats: Short
    abstract val weight: Int // KG
}

open class P51: Airplane() {
    override var throttle: Byte = 0
    override val maxSpeed = 765
    override val seats: Short = 1
    override val engines: Byte = 1

    override var engineState = false
    override val engine = "V12"
    override val weight = 4175
    override fun decreaseThrottle() {
        if (throttle != 0.toByte() && engineState) {
            this.throttle = (throttle - 10).toByte()
        }
    }

    override fun increaseThrottle() {
        if (throttle != 100.toByte() && engineState) {
            throttle = (throttle + 10).toByte()
        }
    }

    override fun toString(): String {
        return "Max:$maxSpeed, Seats:$seats, Engines:$engines, Engine:$engine, Weight:$weight"
    }
}

//EXTENSION
class P51D: P51() {
    var bombs: Byte = 2

    fun dropBomb(): String {

        var status = if (bombs > 1) {
            bombs - 1
            "Bombs dropped"
        } else {
            "No bombs"
        }
        return status
    }
}


//ESPECEFICACION
interface Engine {
    var engineState:Boolean
    var throttle:Byte
    val engine: String
    val engines: Byte

    fun start() {
        engineState = true
    }

    fun stop() {
        engineState = false
    }

    fun increaseThrottle()
    fun decreaseThrottle()

    fun engineStatus() = "State:$engineState, Throttle:$throttle"

}

