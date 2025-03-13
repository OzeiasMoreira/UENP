from sympy import *
x, y, z = symbols('x y z')
init_printing(use_unicode=True)
import sympy as sp

import numpy as np
import matplotlib.pyplot as plt

def f(x):
  return 0.0000177548197*x**5 - 0.0011574882874*x**4 + 0.029055251907*x**3 - 0.3915914962462*x**2 + 2.6805262028342*x + 0.0477329172169

f1 = 0.0000177548197*x**5 - 0.0011574882874*x**4 + 0.029055251907*x**3 - 0.3915914962462*x**2 + 2.6805262028342*x + 0.0477329172169
f2 = -0.0000220427939*x**5 + 0.0013849008827*x**4 -0.0333612675747*x**3 + 0.4263811405121*x**2 - 2.783376448761*x - 0.0937640225904

integralSuperior = sp.integrate(f1, x)
integralInferior = sp.integrate(f2, x)

areaTotal = integralSuperior + integralInferior

areaTotal

diferencaEntreLados = 106.175473567489 - 104.2229360369333
diferencaEntreLados

AreaBuraco = 104.2229360369333-(71.217891127615 + 16.1727946491397 + 10.2869817308818)

AreaBuraco

AreaTotal = 104.222936036933 + 106.1754373567489
AreaTotal

AreaTotal - AreaBuraco

areabaixo = 104.2229360369333 - 163.14272813674057
areabaixo

areacima = 483.523030249678 - (378+268.6657583864186)
areacima