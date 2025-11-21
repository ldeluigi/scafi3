package it.unibo.scafi.language.common.calculus

import it.unibo.scafi.language.foundation.AggregateFoundation

trait BranchingCalculus extends AggregateFoundation:
  def br[T](condition: Boolean)(th: => T)(el: => T): T
