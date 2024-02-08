interface Vehiculo {
    var motorEncendido: Boolean
    var kmh : Int
    fun acelerar(vel: Int): String{
        kmh += vel
        return "Acelerando hasta $kmh Kilométros/Hora"
    }
    fun frenar(vel: Int): String{
        kmh -= vel
        return "Frenando hasta $kmh Kilométros/Hora"
    }
}