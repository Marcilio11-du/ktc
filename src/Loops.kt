
    fun main() {

        //Estrutura de repetição for

        for(i in 1..5) {
            println(i)
        }

        // Intervalo exclusivo (de 1 a 4, 5 não incluído)
        for (i in 1 until 5) {
            println(i) // Imprime: 1, 2, 3, 4
        }

        //Interação em ordem decrescente
        for (i in 5 downTo 1) {
            println(i) // Imprime: 5, 4, 3, 2, 1
        }
        //Definindo o passo que em que se pretende iterar
        for (i in 1..10 step 2) {
            println(i) // Imprime: 1, 3, 5, 7, 9
        }

        for (i in 10 downTo 1 step 3) {
            println(i) // Imprime: 10, 7, 4, 1
        }
        
        //Iteração sobre coleções e Arrays, como o foreach no JS

        val frutas = listOf("Maçã", "Banana", "Cereja")

        for (fruta in frutas) {
            println(fruta)
        }
        // Imprime:
        // Maçã
        // Banana
        // Cereja

        val numeros = arrayOf(10, 20, 30, 40)

        for (numero in numeros) {
            println(numero)
        }
        // Imprime:
        // 10
        // 20
        // 30
        // 40

        /**
        *Rótulos para "Loops" (Labels)
        *Kotlin permite que você rotule "loops" para controlar o comportamento de "break" e continue em "loops" aninhados.
        *Isso é útil quando você precisa sair de um "loop" externo a partir de um "loop" interno.
        * */

        loopExterno@ for (i in 1..3) {
            loopInterno@ for (j in 1..3) {
                println("i = $i, j = $j")
                if (i == 2 && j == 2) {
                    break@loopExterno // Sai completamente do loopExterno
                }
            }
        }
        // Imprime:
        // i = 1, j = 1
        // i = 1, j = 2
        // i = 1, j = 3
        // i = 2, j = 1
        // i = 2, j = 2 (e então o loop externo é quebrado)

    }

