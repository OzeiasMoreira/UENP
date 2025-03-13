from sympy import symbols,Matrix,Rational,diag
import sympy
from sympy import zeros,ones,eye

A = Matrix([[1,2],[3,0],[-1,4]])
A
B = Matrix(2,3,[1,2,-1,3,0,4])
B
C = Matrix([[1,2,3]])
C
D = Matrix([1,2,3])
D
E = Matrix([[1,2,3],[3,0,-3],[-1,4,7]])
E
F = diag(1,2,3)
F
F[1,2]

a = list(A)
a

B.shape

x,y,z = symbols("x:z")

x, y, z = sympy.symbols("x y z")
AB = sympy.Matrix([[x, y, z], [x + 1, y + 1, z + 1]])
AB

BA = Matrix([x,y,z])

B + AB
B - AB

D = Matrix([[1,5,2],[-1,0,1],[3,2,4]])
E = Matrix([[6+2,1+2,3+2],[-1,1,2],[4,1,3]])
D
E

D - E

zeros(2)
ones(3)
eye(4)

teste = eye(15)
teste

teste.shape

v = (1,2,1)
vu = (2,5,0)
vd = (3,3,8)