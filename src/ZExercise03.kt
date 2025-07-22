fun main() {

    //Variáveis de armazenamento
    var size: Int;
    var totalOfWords: Int;
    var greatestWord: String;


    println("Insira um texto aleatório: ")
    val texto: String = readln();

    //Tratamento do caso(Lógica)
    size = texto.length;
    val words = texto.split(",", " ")
    totalOfWords = words.size

    greatestWord = words[0]
    for(word in words) {
        if(word.length > greatestWord.length)
            greatestWord = word
    }

    //Saída final
    println("Total de caracteres do texto: $size")
    println("Total de Palavras: $totalOfWords")
    println("Palavra com maior número de caracteres: $greatestWord que possui caracteres")
}