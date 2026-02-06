package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        var englishGreeting = object : HelloWorldGreeting {
            override fun greet(): String {
                return "Hello world"
            }

            override fun greetSomeone(someone: String): String {
                return "Hello $someone"
            }
        }

        var frenchGreeting = object : HelloWorldGreeting {
            override fun greet(): String {
                return "Salut tout le monde"
            }

            override fun greetSomeone(someone: String): String {
                return "Salut $someone"
            }
        }
        var spanishGreeting = object : HelloWorldGreeting {
            override fun greet(): String {
                return "Hola, mundo"
            }

            override fun greetSomeone(someone: String): String {
                return "Hola, $someone"
            }
        }

        val list = listOf(englishGreeting, frenchGreeting, spanishGreeting)
        val result : MutableList<String> = mutableListOf()
        result.addAll(list.map { it.greet() })
        for (name in names) {
            result.addAll(list.map { it.greetSomeone(name) })
        }
        return result
    }
}

fun main() {
    println(HelloWorldAnonymousClasses().sayHello(listOf("John", "Denise")))
}
