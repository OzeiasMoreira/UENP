from sympy import symbols, Matrix, Rational
from sympy import pi, cos, Symbol, Integer

x, y, z = symbols ("x:z")
A = Matrix([[1, 2, -3], [2, 3, 4], [4, 7, -1]])
B = Matrix([x, y, z])
C = Matrix([4, 5, 13])
A

A*B #Multiplicação de matrizes

A1 = A.inv() #Calcula a matriz inversa de ' A ' *Este comando será muito utilizado*
A1

A * A1 #Matriz identidade

A1 * C

A.det()

G = Matrix([[pi/2, pi/3, 0]])
G

G1 = G.applyfunc(cos)
G1

A = Matrix([[1, 2, 1], [2, 5, 0], [3, 3, 8]])
A

A[1, :] = -2*A[0, :] + A[1, :]
A

A.det()