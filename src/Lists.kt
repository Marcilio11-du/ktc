fun main() {
    /*
    * Características das listas
    *   Tamanho Dinâmico
    *   Mutável e Imitável
    */

    //Listas Imutáveis(List)
    val frutas = listOf("Manga", "Banana");
    val numbers = listOf(1,2,3,4);

    //Métodos importantes

    println(frutas.first())//Retorna o valor da primeira posição
    println(frutas.last())//Retorna o valor da última posição

    println(numbers[0])

    // Operações (não modificam a lista original)
    val novaLista = frutas + "Abacaxi"  // Cria uma lista nova
    //Por ser imutável, não possui um método add(). Utiliza-se o operador "+" criando uma nova lista
    val filtradas = numbers.filter { it % 2 == 0 }  // [2, 4]

    println(filtradas)

    //Mutable(MutableList)

    val cidades = mutableListOf("Luanda", "Lisboa", "Londres")
    val numbers2 = mutableListOf(2,3,4,56,78,-1,5,1)
    cidades.add("Washington DC")//Por ser mutável, possui o método pra adicionar, add()
    cidades.remove("Luanda")
    cidades.add("Porto")
    cidades.add("Cabinda")
    print(cidades[0])
    cidades.sort()
    numbers2.add(-444)
    numbers2.remove(2)
    numbers2.sort()
    println(numbers2)
    print(cidades)


    //Uma lista mutável possui ainda um método pra ordenar em ordem alfabética ou numérica, dependendo do tipo de lista. sort()

    val numerosMutaveis = mutableListOf(10, 20, 30)
    // Operações avançadas
    numerosMutaveis.apply {
        removeIf { it < 25 }     // Remove números < 25
        addAll(listOf(40, 50))   // Adiciona múltiplos
    }

    println(numerosMutaveis)  // [30, 40, 50]

    // Array → Lista
    val array = arrayOf("X", "Y", "Z")
    val listaFromArray = array.toList()        // List imutável
    val mutableFromArray = array.toMutableList() // MutableList

// Lista → Array
    val lista = listOf(1.5, 2.5, 3.5)
    val arrayFromList = lista.toTypedArray()   // Array<Double>


    

}