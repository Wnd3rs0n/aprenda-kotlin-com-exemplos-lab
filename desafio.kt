// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {





     //   TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    val conteudoEducacional1 = ConteudoEducacional("JAVA",60)
    val conteudoEducacional2 = ConteudoEducacional("KOTLIN",100)
    val conteudoEducacional3 = ConteudoEducacional("JAVA",120)

    val usuario = "Wanderson"
    println("Matricula efetuada: $usuario")


    val nivel = Nivel.INTERMEDIARIO
    val message = when (nivel){
        Nivel.BASICO -> println("Nivel Basico: $conteudoEducacional1")
        Nivel.INTERMEDIARIO -> println("Nivel Intermediario: $conteudoEducacional2")
        Nivel.AVANCADO -> println("Nivel Intermediario: $conteudoEducacional3")
    }




  //  TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
  //  TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}