package basicsyntax

fun main() {
    //Declaração de Arrays
    val array0 = arrayOf(1,2,3,4,5,6,7,8,9,10); //Inferência de tipo Array<Int>
    //val randArray = arrayOf("2", 4);
    val array2: Array<String> = arrayOf("A", "B", "C");
    var arrayPrimitivo: Array<Int> = array0;
    arrayPrimitivo = arrayOf(1,3,5,7,9);
    val arrayPrimitivo2 = intArrayOf(4,5,6,7,8);

    // Iteração com índice
    for (i in array2.indices) {//Indices é uma propriedade de Arrays em Kotlin
        println("Índice $i = ${array2[i]}")
    }

    print(arrayPrimitivo.indices)
}