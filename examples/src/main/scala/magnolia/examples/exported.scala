package magnolia.examples

import magnolia._

import scala.language.experimental.macros

class ExportedTypeclass[T]()

object ExportedTypeclass {
  type Typeclass[T] = ExportedTypeclass[T]
  case class Exported[T]() extends ExportedTypeclass[T]
  def combine[T](ctx: CaseClass[Typeclass, T]): Exported[T] = Exported()
  def dispatch[T](ctx: SealedTrait[Typeclass, T]): Exported[T] = Exported()

  implicit val intInstance: Typeclass[Int] = new ExportedTypeclass()
  implicit def seqInstance[T: Typeclass]: Typeclass[Seq[T]] = new ExportedTypeclass()
  def gen[T]: Exported[T] = macro Magnolia.gen[T]
}
