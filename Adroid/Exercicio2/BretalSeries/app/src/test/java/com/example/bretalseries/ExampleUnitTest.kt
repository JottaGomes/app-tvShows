package com.example.bretalseries

import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun increment_test() {
        assertEquals(2, increment(1))
    }

    @Test
    fun subtract_test() {
        assertEquals(1, subtract(2, 1))
    }

    @Test
    fun multiply_test() {
        assertEquals(16, multiply(4, 4))
    }

    @Test
    fun divide_test() {
        assertEquals(2, divide(10, 5))
    }

    @Test
    fun ellipsize_test() {
        assertEquals("A vaca está louca...", addEllipsis("A vaca está louca"))
    }

    @Test
    fun concatenate_test() {
        assertEquals("Geová69", concatenate("Geová", 69))
    }

    // Não editar ficheiro deste ponto para cima.
    // O código acima marcado como `@Test` são apenas testes.
    // Neste momento eles estão a falhar porque a implementação das funções abaixo não está certa.
    // Assim que vocês corrigirem estas funções, todos os testes deverão passar.

    // 1. Incrementar um dado número inteiro
    fun increment(number: Int): Int {
        return number + 1
    }

    // 2. Subtrair o `number2` ao `number1`
    fun subtract(number1: Int, number2: Int): Int {
        return number1 - number2

    }

    // 3.  Multiplicar o `number1` pelo `number2`
    fun multiply(number1: Int, number2: Int): Int {
        return number1 * number2
    }

    fun divide(number1: Int, number2: Int): Int {
        return number1/number2
    }


    // 4. Implementar a função `divide` que divide um `Int` por outro `Int` e retorna um `Int`
    // Exemplos:
    //      (4, 2) -> 2
    //      (10, 2) -> 5





    // 5. Implementar a função `addEllipsis` que recebe uma `String` e retorna a mesma `String`
    // com reticências no final.
    // Exemplos:
    //      ("A vaca está louca") -> "A vaca está louca..."
    //      ("Geová") -> "Geová..."

    fun addEllipsis(text_inicial: String): String {
        return text_inicial + "..."

    }


    fun concatenate (text: String, numero: Int): String {
        val numero_em_string: String = numero.toString()
        return numero_em_string + text

    }


// 6. Implementar a função `concatenate` que recebe uma `String` e um `Int` e retorna uma
    // `String` que é o resultado da soma dos mesmos.
    // Exemplos:
    //      ("Alberto", 6) -> "Alberto6"
    //      ("Geová", 69) -> "Geová69"

    @Test
    fun bertal () {
        val numeros: Array<Int> = arrayOf(1, 2, 3, 4, 5)
        numeros.forEach {
            //val conversor: String = it.toString() Opcional
            print(message = it.toString() + " ")
        }
    }
    @Test
    fun coisas () {
        val num: Array<Int> = arrayOf(1, 2, 3, 4, 5)
        num.forEach {
            print(it / 2.0)
        }

    }
    // \n - paragrafo
    @Test
    fun topp () {
        val top: Array<String> = arrayOf("Joao", "Ivo", "Gil", "Pedro", "Jose")
        top.forEachIndexed { index, classi ->
            val next_Index: Int = index + 1
            if (next_Index < top.size ) {
                // Quantas vezes é que o código passa por aqui;  R: 4
                // Qual é o valor do classi; "Joao", "Ivo", "Gil", "Pedro"
                // Qual é o valor do Index; 0,1,2,3
                // Qual é o valor do next_index 1,2,3,4
                val next_item: String = top.get(next_Index)
                print(next_Index.toString() + " " + classi + " >" + " " + next_item + "\n")
            } else {
               print(classi + " = ultimo")
                // Quantas vezes é que o código passa por aqui; 1
                // Qual é o valor do classi; Jose
                // Qual é o valor do Index; R: 4
                // Qual é o valor do next_index R: 5
            }
        }
    }
    @Test
    fun test1 () {
        assertEquals(100, transform(50))
        assertEquals(75, transform(150))
        assertEquals(10000, transform(100))



    }
    fun transform (coisa: Int): Int {
        if (coisa > 100) {
            return coisa / 2
        }
        else if (coisa < 100) {
            return coisa * 2
        } else {
            return coisa * coisa
        }

    }




    @Test
    fun novo () {
        assertArrayEquals(so_pares(arrayOf()), arrayOf())
        assertArrayEquals(so_pares(arrayOf(1, 2, 3, 4, 5)), arrayOf(2, 4))
        assertArrayEquals(so_pares(arrayOf(5, 4, 3, 2, 1)), arrayOf(4, 2))
        assertArrayEquals(so_pares(arrayOf(1, 3, 5)), arrayOf())
        assertArrayEquals(so_pares(arrayOf(2, 4)), arrayOf(2, 4))


    }

    fun so_pares (numeros:Array<Int>): Array<Int> {
        // criar um array vazio
        var numeros_pares: Array<Int> = arrayOf()
        // precurorrer lista de numeros
        numeros.forEach { numero ->

            // se o numero a dividir por 2 nao tiver casas decimais entao é par
            if (numero%2==0){
                // vai buscar os numeros pares e adiciona um numero
                numeros_pares = numeros_pares + numero
            }
        }
        return numeros_pares

    }



// 8/07/2020

    @Test
    fun square_test() {
        assertEquals(square(2), 4)
        assertEquals(square(3), 9)
        assertEquals(square(4), 16)
    }

    fun square (num: Int): Int {
        val num1: Int =  num * num
        return num1



    }
    @Test
    fun isPair_test() {
        assertEquals(isPair(2), true)
        assertEquals(isPair(3), false)
        assertEquals(isPair(4), true)
        assertEquals(isPair(5), false)
        // var x = Boolean = True
        // Var y = Boolean = False
    }
        fun isPair (num: Int): Boolean {

            if (num % 2 ==0){
                return true
            } else {
                return false
            }
        }

    @Test
    fun numberOfCharacters_test() {
        assertEquals(numberOfCharacters("huehuehu"), 8)
        assertEquals(numberOfCharacters("jasdkjh"), 7)
        assertEquals(numberOfCharacters("jasdkj"), 6)
        assertEquals(numberOfCharacters("jasdk"), 5)
    }

    fun numberOfCharacters (nome: String): Int {
        val length: Int
            return nome.length

    }
    @Test
    fun isCharacterNumberPair_test() {
        assertEquals(isCharacterNumberPair("huehuehu"), true)
        assertEquals(isCharacterNumberPair("jasdkjh"), false)
        assertEquals(isCharacterNumberPair("jasdkj"), true)
        assertEquals(isCharacterNumberPair("jasdk"), false)
    }

    fun isCharacterNumberPair (nomes: String): Boolean {
        val length: Int
        if (nomes.length % 2 ==0) {
        return true
        } else {
            return false
        }
    }

    @Test
    fun hasCharacter_test() {
        assertEquals(hasCharacter("abcde", 'a'), true)
        assertEquals(hasCharacter("abcde", 'c'), true)
        assertEquals(hasCharacter("abcde", 'f'), false)
        assertEquals(hasCharacter("abcde", 'b'), true)
        assertEquals(hasCharacter("abcde", '<'), false)
    }
    fun hasCharacter(cerveja: String, fino: Char): Boolean {
        var cerveja1: CharArray = cerveja.toCharArray()
        cerveja1.forEach {
            if (it == fino) {
            return true
            }
        }
        return false

    }

    }













        // Se o numero for < 100, vamos multiplicar por 2;
        // Se for > do que 100 vamos dividir por 2;
        // se for = 100 vai ser ao quadrado






    // topsize numero de itens que o array tem
//        top.get(it) + 1
//        val new_index = index
//            if (new_index < top.size) {
//   //top.get(index = + 1)
//            print(it.toString() + "\n")
//        }
//    }  else (new_index > top.size)

    //
//    }
//
//}
//
//











//@Test
//fun demo() {
//    val top: Array<String> = arrayOf("Ivo", "João", "Gil")
//    // Função para ir buscar elemento
//    top.get(index)
//    top.forEachIndexed { index, name ->
//        val nextIndex: Int = index + 1
//        if (nextIndex < top.size) {
//            // É executado se nextIndex for menor do que top.size
//     //   } else {
//            // É executado se nextIndex for maior ou igual a top.size
//        }
//    }
//    // Imprimir
//    // Ivo > João
//    // João > Gil
//    // Gil = Último

