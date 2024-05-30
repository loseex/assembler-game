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
      try {
        println("Hello world!");
      } catch (err: RuntimeException) {
        this.exit(err.message);
      }
    }

    /**
     * ### Exit process.
     *
     * Метод который завершает работу программы.
     *
     * @param reason { String? }
     * */

    private fun exit(reason: String?): Unit {
      if (reason != null) throw Exception(reason);
      exitProcess(-1);
    }
  }
}