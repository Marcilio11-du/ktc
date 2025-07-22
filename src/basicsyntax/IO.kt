package basicsyntax

fun main() {

    //Exercício
    var age: Int;

    println("Insira o nome: ")
    val name: String = readln();
    println("Insira o ano de nascimento: ")
    val year: Int = readln().toInt();
    if(year > 2025 || year < 0)
        println("Ano de nascimento inválido")
    else{
        age = 2025 - year;
        if(age > 0 && age < 4)
            println("Seu nome é $name e você tem $age anos de idade. Você é um bebé")
        else if(age < 12)
            println("Seu nome é $name e você tem $age anos de idade. Você é criança")
        else if(age < 18)
            println("Seu nome é $name e você tem $age anos de idade. Você é adolescente")
        else if(age < 65)
            println("Seu nome é $name e você tem $age anos de idade. Você é adulto")
        else
            println("Seu nome é $name e você tem $age anos de idade. Você é idoso")
    }

    //Formatação de Saída de dados
    val pi = 3.1415926535
    println("PI formatado: %.2f".format(pi))  // "3.14"

}