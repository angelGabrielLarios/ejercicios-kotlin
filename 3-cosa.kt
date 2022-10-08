fun main() {
    var mes:Int = 3
    when(mes) {
        in 1, 2, 3, 4, 5, 6 -> print("Parte 1er Semestre")

        in 7, 8, 9, 10, 11, 12 ->println("Valor no valido")
    }
}