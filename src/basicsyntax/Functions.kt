package basicsyntax

fun main() {
    //Definição de funções em Kotlin

    fun calcMedium(grade1: Float, grade2: Float):Float {
        return (grade2 + grade1)/2
    }
    println(calcMedium(2f,4f))

    //Função de expressão única
    fun quadrado(number: Int) = number * number;// Depois da igualdade, apresenta a expressão que retorna certo valor
    println("Quadrado: ${quadrado(9)}")
}