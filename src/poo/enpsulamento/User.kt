package poo.enpsulamento

class User(var name: String, var age: Int){
    override
    fun toString(): String {
        return "User(name='$name', age=$age)"
    }
}