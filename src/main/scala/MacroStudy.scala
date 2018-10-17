import scala.reflect.macros.blackbox.Context

object MacroStudy {
  def accesser(obj: Any, property: String): Any = macro impl_accesser

  def impl_accesser(c: Context)(obj: c.Expr[Any], property: c.Expr[String]) = {
    import c.universe._
    val Expr(Literal(Constant(propString: String))) = property
    q"${obj}.${TermName(propString)}"
  }
}
