from sympy import symbols, Matrix
import sympy as sp
from sympy import symbols, Matrix, solve

A = Matrix([
    [1, 0],
    [2, 1],
    [-1, 2]
])

B = Matrix([
    [2, 0, -1],
    [1, 1, 3]
])

A
B

A_transposta = A.T
A_transposta

B_transposta = B.T
B_transposta

M = (A + B_transposta)*(A_transposta - B)
M

A = Matrix([
    [-1, 0, 2],
    [1, 2, 4]
])
A

A_transposta = A.T
A_transposta

M = (A*A_transposta)
M

M.det()

x = symbols('x') # ATENÇÃO x é a lambda

# B - xI      B - a matriz identidade de lambda (x, 0, 0), (0, x, 0), (0, 0, x)

B = Matrix([
    [3-x, 0],-
    [8, -1-x]
])

B_det = B.det()
B_det

polinomioB = x**2 - 2*x - 3 # valor da det de B

autovaloresB = solve(polinomioB, x)
autovaloresB