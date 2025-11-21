package it.unibo.scafi.language.foundation

trait FieldMock:
  this: AggregateFoundation =>
  def mockField[T](items: Iterable[T]): SharedData[T]
