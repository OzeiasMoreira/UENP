from sympy import symbols , Lambda, sin , cos , pi
from pylab import *
from pylab import xlabel,ylabel,title,grid,axhline,axvline

x = symbols("X")
f = Lambda(x, (x - 1)/(x**2 - 1))
f

f(0)

f(0.5)
f(0.6)
f(0.7)

f(1) #n existe esse valor

def calculaX(x):
  return (x - 1) / (x**2 - 1)

x = arange(0, 2)

y = calculaX(x)

plot(x , y)
xlabel("Variavel Independente")
ylabel("Função y = (x - 1)/(x**2 - 1)")
title("Visão geometrica do conceito limite")
grid(True)
axis([-0.1, 2 , 00.1])
axhline(y = 0, color = 'k')
axvline(x = 0, color = 'k')

f(0.9999)
