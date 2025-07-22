package basicsyntax//Gestor de Estoque

fun main() {initialize()}

val products: MutableList<Triple<String, Int, Float>> = mutableListOf();

fun showSupBar() {
    println("========================================================")
}
fun initialize() {
    var option: Int
    do {
        showSupBar()
        println("   1 - Adicionar produto");
        println("   2 - Atualizar Produto");
        println("   3 - Listar todos os produtos");
        println("   4 - Sair");
        showSupBar()
        print("Opção: "); option = readln().toInt()

        when(option) {
            1 -> addProduct()
            2 -> updateProduct()
            3 -> listProducts()
            4 -> println("Programa encerrado...")
            else -> println("Opção Inválida!")
        }
    }while(option != 4)
}

//Função para adicionar produto
fun addProduct() {
    var amount: Int;
    var price: Float;

    showSupBar()
    println("Insira o nome do produto: ")
    val name: String = readln()
    do {
        println("Insira agora a sua quantidade: ")
        amount = readln().toInt()
    }while (amount <= 0)
    do {
        println("Insira por último o seu preço: ")
        price = readln().toFloat()
    }while(price <= 0)
    val product: Triple<String, Int, Float> = Triple(name, amount,price);
    products.add(product);
    println("Produto adicionado com Sucesso!!")
}

//Função para buscar produto
fun queryProduct(name: String): Triple<String, Int, Float> {
    var product: Triple<String, Int, Float> = Triple(name, 0, 0f)
    for(productX in products) {
        if(productX.first == name){
            product = productX;
            break
        }
    }
    return product
}

//Função que verifica se o produto existe da lista

fun productExist(name: String): Boolean {
    var exist = false
    for(productX in products) {
        if(productX.first == name){
            exist = true
            break
        }
        else{
           exist = false
            break
        }
    }
    return exist
}

//Função para atualizar produto
fun updateProduct() {
    println("Insira o nome do produto: ")
    val name = readln()

    if(productExist(name)){
        var product = queryProduct(name);
        var newAmount: Int;
        var newPrice: Float

        println("Insira o novo nome do produto(Enter se ñ quer atualizar): ")//Feature por melhorar
        val newName: String = readln()

        do {
            println("Insira a nova quantidade(Enter se ñ quer atualizar): ")//Feature por melhorar
            newAmount = readln().toInt()
        }while(newAmount <= 0)

        do {
            println("Insira o novo preço(Enter se ñ quer atualizar): ")//Feature por melhorar
            newPrice = readln().toFloat()
        }while(newPrice <= 0)

        product = Triple(newName, newAmount, newPrice)
        products[products.indexOf(queryProduct(name))] = product // Substitui o produto atualizado, utilizando o seu índice.
        println("Produto atualizado com sucesso!!!")
    }
    else{
        println("Produto não encontrado!!")
        return
    }
}

//Função para listar todos os produtos
fun listProducts() {
    showSupBar()
    for(product in products) {
        println("Nome: ${product.first} - Quantidade: ${product.second} - Preço: ${product.third}Kz")
    }
    var goBack: Int
    do {
        println("Voltar ao início(0): ")
         goBack = readln().toInt()
    }while(goBack != 0)
    return
}