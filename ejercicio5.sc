def integracion(f: Double => Double, a: Double, b: Double): Double = {
  val xMedio = (a + b) / 2
  val resultado = ((b - a) / 6) * (f(a) + 4 * f(xMedio) + f(b))
  resultado
}
val f1 = (x: Double) => -x*x+8*x-12
val i1 = integracion(f1,3,5)

val f2 = (x: Double) => 3*x*x
val i2 = integracion(f2, 0, 2)

val f3 = (x: Double) => x+2*x*x-x*x*x+5*x*x*x*x
val i3 = integracion(f3,-1,1)

val f4 = (x: Double) => (2*x+1)/(x*x+x)
val i4 = integracion(f4,1,2)

val f5 = (x: Double) => Math.exp(x)
val I5 = integracion(f5, 0, 1)

val f6 = (x: Double) => 1 / Math.sqrt(x - 1)
val I6 = integracion(f6, 2, 3)

val f7 = (x: Double) => 1 / (1 + x*x)
val I7 = integracion(f7, 0, 1)

def error(valorReal: Double, valorAprox: Double): Double = {
  math.abs(valorReal - valorAprox)
}
println("Error 1 = " + error(7.33, i1))
println("Error 2 = " + error(8, i2))
println("Error 3 = " + error(3.333, i3))
println("Error 4 = " + error(1.09861, i4))
println("Error 5 = " + error(1.71828, I5))
println("Error 6 = " + error(0.828427, I6))
println("Error 7 = " + error(0.785398, I7))


