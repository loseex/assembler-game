package ru.loseex.cmd

/**
 * ## Cmd Builder
 *
 * Сервис для управления терминалом.
 *
 * @author <a href='https://github.com/loseex'>loseex</a>
 * */

class CmdBuilder {

  /**
   * Перменная которая в себе хранит все актуальные комманды терминала.
   * */

  private val commands: MutableList<Command> = mutableListOf();

  /**
   * Переменная которая отвечает за выбраную команду в терминале.
   * */

  private val currentOption: Int = 0;

  /**
   * Добавление команды в терминал.
   *
   * @param name { String }
   * @param title { String }
   * @param function { Function<Void> }
   * */

  public fun add(name: String, title: String, function: () -> Any): Unit {
    this.commands.add(Command(name, title, function))
  }

  /**
   * Вывод терминала в консоль.
   * */

  public fun print(): Unit {
    println("Select:\n")
    for ((index, command) in this.commands.withIndex()) {
      if (index == this.currentOption) {
        println("› ${command.title}");
      } else {
        println(command.title)
      }
    }
  }
}