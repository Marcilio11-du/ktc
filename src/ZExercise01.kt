fun main() {
    val userNames: MutableList<String> = mutableListOf();
    val passwords: MutableList<String> = mutableListOf();
    //GUI
    fun exibirBarra() {
        println("=======================================================")
    }
    fun exibirMenuPrincipal() {
        exibirBarra()
        do {
            print("Insira 0 pra sair: ")
            var op: Int = readln().toInt()
        }while (op != 0)
        return

    }
    //Método pra autenticação
    fun autenticar(): Boolean {
        val lim = 3;
        var password: String;
        var name: String;
        var tentativas= 0;
        var acesso = false
            print("Insira o nome: ")
            name = readln()

            print("Insira agora a palavra passe: ")
            password = readln()

            for((userName, userPassword) in userNames.zip(passwords)) {
                if(name == userName && userPassword == password) {
                    acesso = true
                    break
                }
            }
        return acesso
    }
    //Método para criação de conta
    fun criarConta() {
        var password: String;
        var name: String;
        exibirBarra()
        print("Insira o seu nome: ")
        name= readln();

        do {
            print("Crie agora um senha(Deve conter no mínimo 6 caracteres, inclui[índo espaços)")
            password = readln();
        }while(password.length < 6)

        var existingPassword = false
        var existingName = false

        for(passwordX:String in passwords) {
             if(passwordX == password)
                 existingPassword = true;
        }

        for(nameX: String in userNames) {
            if(nameX == name)
                existingName = true
        }

        if(existingPassword || existingName) {
            println("Nome ou Senha já existentes!")
            return
        }
        else {
            userNames.add(name)
            passwords.add(password)
            println("Conta Criada com sucesso!!")
            exibirMenuPrincipal()
        }
    }

    fun exibirMenuInicial() {
        do {
            exibirBarra()
            println("     1 - Autenticar")
            println("     2 - Criar conta")
            println("     3 - Encerrar")
            exibirBarra()
            print("Insira um opção: ")
            var option: Int = readln().toInt();

            when(option) {
                1 -> if(autenticar()) exibirMenuPrincipal() else println("Credenciais inválidas")
                2 -> criarConta()
                3 -> print("Programa encerrado...")
                else -> print("Opção invalido!!")
            }
        }while(option != 3);
    }

    exibirMenuInicial()
}