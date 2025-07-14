
fun main() {
    val a = 5;
    val b = 6;
    val x = if(a < b) a else b; //
    println(x)

    val number:Double = 3.5; //Declara uma constante especificado o seu tipo

    //««««««««««««««««««««««««   Sobre o when   «««««««««««««««««««««««««««««««
    val y = 8
     println(when(y) {
        1 -> "Marcili"
        2 -> "Domingos"
        else -> "Não existe" //Expressão when que retorna um valor String
    })

    val grande = 5
    val classifyGrade: String = when(grande) {
        0,1, 2, 4 -> "Péssima"
        5,6,7,8,9 -> "Mal"
        10,11,12,13,14 -> "Bom"
        15, 16, 17 -> "Muito bom"
        18, 19, 20 -> "Excelente"
        else -> "Inválido"
    }
    print(classifyGrade)

    //Pode ainda ser utilizado para verificação do tipo de dado de certo valor com o operador "is"
    fun descreverValor(valor: Any): String {
        return when (valor) {
            is String -> "Texto com ${valor.length} caracteres"
            is Int -> "Número inteiro"
            is Double -> "Número decimal"
            else -> "Tipo desconhecido"
        }
    }

    println(descreverValor(3.14)) // "Número decimal"


    //when sem argumentos, que pode substituir if-else-if
    fun analisarTexto(texto: String): String {
        return when {
            texto.isEmpty() -> "Texto vazio"
            texto.isBlank() -> "Só espaços"
            texto.length > 10 -> "Texto longo (${texto.length} chars)"
            else -> "Texto normal"
        }
    }
    println(analisarTexto("   ")) // "Só espaços"
}