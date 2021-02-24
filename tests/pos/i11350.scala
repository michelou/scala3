case class A[T](action: A[T] ?=> String) // error

class A1[T](action: A1[T] ?=> String = (_: A1[T]) ?=> "") // works
case class A2[T](action: A2[?] ?=> String) // works
case class A3[T](action: A3[T] => String) // works as well
