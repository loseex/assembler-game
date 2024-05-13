package ru.loseex.cmd

data class Command(
  public val name: String,
  public val title: String,
  public val function: () -> Any
)
