import numpy as np
import matplotlib.pyplot as plt
from scipy.optimize import linprog

# Coeficientes da função objetivo
c = [8, 9]  # 8 centavos por kg do ingrediente A, 9 centavos por kg do ingrediente B

# Coeficientes das restrições (A)
A = [
    [-1, -2.5],  # x + 2.5y >= 5  => -x - 2.5y <= -5
    [-1, -1.5],  # x + 1.5y >= 4  => -x - 1.5y <= -4
    [-3, -2]     # 3x + 2y >= 6  => -3x - 2y <= -6
]

# Lados direitos das restrições
b = [-5, -4, -6]

# Limites para as variáveis x e y
x_bounds = (0, None)  # x >= 0
y_bounds = (0, None)  # y >= 0

# Resolvendo o problema de programação linear
result = linprog(c, A_ub=A, b_ub=b, bounds=[x_bounds, y_bounds], method='highs')

# Exibindo os resultados
if result.success:
    x_opt = result.x[0]
    y_opt = result.x[1]
    cost_opt = result.fun
    print(f"Quantidade de ingrediente A (kg): {x_opt:.3f}")
    print(f"Quantidade de ingrediente B (kg): {y_opt:.3f}")
    print(f"Custo total (centavos): {cost_opt:.2f}")
else:
    print("Não foi possível encontrar uma solução ótima.")

# Plotando as restrições e a solução ótima
x = np.linspace(0, 5, 400)

# Restrições
y1 = (5 - x) / 2.5
y2 = (4 - x) / 1.5
y3 = (6 - 3 * x) / 2

plt.figure(figsize=(10, 8))

plt.plot(x, y1, label=r'$x + 2.5y \geq 5$')
plt.plot(x, y2, label=r'$x + 1.5y \geq 4$')
plt.plot(x, y3, label=r'$3x + 2y \geq 6$')

# Preenchendo a região viável
plt.fill_between(x, np.maximum(0, np.minimum(np.minimum(y1, y2), y3)), color='gray', alpha=0.3)

# Solução ótima
plt.plot(x_opt, y_opt, 'ro', label='Solução ótima')

# Adicionando as equações das restrições no gráfico
plt.text(4.5, y3[0], r'Restrição N3: $3x + 2y \geq 6$', fontsize=12, verticalalignment='top', horizontalalignment='right')
plt.text(4.5, y1[0], r'Restrição N1: $x + 2.5y \geq 5$', fontsize=12, verticalalignment='top', horizontalalignment='right')
plt.text(4.5, y2[0], r'Restrição N2: $x + 1.5y \geq 4$', fontsize=12, verticalalignment='top', horizontalalignment='right')

plt.xlim(0, 5)
plt.ylim(0, 5)
plt.xlabel('Quantidade do Ingrediente A (kg)')
plt.ylabel('Quantidade do Ingrediente B (kg)')
plt.title('Problema de Programação Linear')
plt.legend()
plt.grid(True)
plt.show()
