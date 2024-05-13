package ru.loseex

import ru.loseex.cmd.CmdBuilder

/**
 * ## Игра Ассемблер
 *
 * @author <a href='https://github.com/loseex'>loseex</a>
 * */

fun main() {
  val cmdBuilder = CmdBuilder();

  cmdBuilder.add("add", "Add command", function = fun () {
    println("1")
  })

  cmdBuilder.add("remove", "Remove command", function = fun () {
    println("2")
  })

  cmdBuilder.print();
}