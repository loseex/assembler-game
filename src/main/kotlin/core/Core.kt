package ru.loseex.core

import kotlin.system.exitProcess

/**
 * ## Core
 *
 * @author <a href='https://github.com/loseex'>loseex</a>
 * */

class Core {
  companion object {
    public fun start(): Unit {
      println("Hello world!");
    }

    public fun exit(): Unit {
      exitProcess(-1);
    }
  }
}