//数字の概念の定義

trait Nat
trait Zero extends Nat
trait Succ[N <: Nat] extends Nat

