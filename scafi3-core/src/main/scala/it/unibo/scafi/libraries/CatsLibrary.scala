package it.unibo.scafi.libraries

/**
 * This library provides Cats type class instances and syntax extensions.
 */
object CatsLibrary:
  export cats.syntax.all.*
  export cats.instances.all.given
