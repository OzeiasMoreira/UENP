import numpy as np
import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression
from sklearn.preprocessing import PolynomialFeatures

x = np.array([0, 2.42, 4.6, 6.69, 8.71, 10.7, 12.66, 14.56, 16.43, 18.29, 20.13])

# Transforme os recursos para incluir termos polinomiais de grau 2
poly_features = PolynomialFeatures(degree=2, include_bias=False)
X_poly = poly_features.fit_transform(x.reshape(-1, 1))

# Ajuste um modelo de regressão linear aos dados transformados
lin_reg = LinearRegression()
lin_reg.fit(X_poly, y.reshape(-1, 1))

# Gere dados para plotar a curva de regressão
X_new = np.linspace(0, 20, 100).reshape(-1, 1)
X_new_poly = poly_features.transform(X_new)
y_new = lin_reg.predict(X_new_poly)

# Plote os dados e a curva de regressão polinomial
plt.scatter(x, y, label='Dados de exemplo')
plt.plot(X_new, y_new, 'r-', label='Regressão polinomial (graude 2)')
plt.xlabel('X (cm)')
plt.ylabel('y (cm)')
plt.title('Curva de Regressão Polinomial')
plt.legend()
plt.show()

# Seus dados
x = np.array([0, 2.42, 4.6, 6.69, 8.71, 10.7, 12.66, 14.56, 16.43, 18.29, 20.13])
y = np.array([0, -2.42, -4.6, -6.69, -8.71, -10.7, -12.66, -14.56, -16.43, -18.29, -20.13])

# Transforme os recursos para incluir termos polinomiais de grau 3
poly_features = PolynomialFeatures(degree=3, include_bias=False)
X_poly = poly_features.fit_transform(x.reshape(-1, 1))

# Ajuste um modelo de regressão linear aos dados transformados
lin_reg = LinearRegression()
lin_reg.fit(X_poly, y.reshape(-1, 1))

# Gere dados para plotar a curva de regressão
X_new = np.linspace(0, 20, 100).reshape(-1, 1)
X_new_poly = poly_features.transform(X_new)
y_new = lin_reg.predict(X_new_poly)

# Plote os dados e a curva de regressão polinomial
plt.scatter(x, y, label='Dados de exemplo')
plt.plot(X_new, y_new, 'r-', label='Regressão polinomial (graude 3)')
plt.xlabel('X')
plt.ylabel('y')
plt.legend()
plt.show()

# Seus dados
x = np.array([0, 2.42, 4.6, 6.69, 8.71, 10.7, 12.66, 14.56, 16.43, 18.29, 20.13])
y = np.array([0, -2.42, -4.6, -6.69, -8.71, -10.7, -12.66, -14.56, -16.43, -18.29, -20.13])

# Transforme os recursos para incluir termos polinomiais de grau 2
poly_features = PolynomialFeatures(degree=2, include_bias=False)
X_poly = poly_features.fit_transform(x.reshape(-1, 1))

# Ajuste um modelo de regressão linear aos dados transformados
lin_reg = LinearRegression()
lin_reg.fit(X_poly, y.reshape(-1, 1))

# Gere dados para plotar a curva de regressão
X_new = np.linspace(0, 20, 100).reshape(-1, 1)
X_new_poly = poly_features.transform(X_new)
y_new = lin_reg.predict(X_new_poly)

# Plote os dados e a curva de regressão polinomial
plt.scatter(x, y, label='Dados de exemplo')
plt.plot(X_new, y_new, 'r-', label='Regressão polinomial (graude 2)')
plt.xlabel('X')
plt.ylabel('y')
plt.legend()
plt.show()

# Defina a expressão do polinômio
def polinomio(x):
    return 0.0000177548197*x**5 - 0.0011574882874*x**4 + 0.029055251907*x**3 - 0.3915914962462*x**2 + 2.6805262028342*x + 0.0477329172169

# Crie um conjunto de dados X
X = np.linspace(0, 20, 100)

# Calcule os valores correspondentes de Y usando a expressão do polinômio
Y = polinomio(X)

# Plote os dados
plt.plot(X, Y, label='Expressão do Polinômio')
plt.xlabel('X')
plt.ylabel('y')
plt.title('Curva de Regressão Polinomial')
plt.legend()
plt.show()

# Dados de exemplo
x = [0, 2.42, 4.6, 6.69, 8.71, 10.7, 12.66, 14.56, 16.43, 18.29, 20.13]

# Crie o gráfico
plt.plot(x, y, marker='o', linestyle='-', color='green')
plt.title('Gráfico de uma Folha')
plt.xlabel('Comprimento (cm)')
plt.ylabel('Largura (cm)')
plt.grid(True)
plt.show()

# Defina a expressão do polinômio
def polinomio(x):
    return 0.0000177548197*x**5 - 0.0011574882874*x**4 + 0.029055251907*x**3 - 0.3915914962462*x**2 + 2.6805262028342*x + 0.0477329172169

# Crie um conjunto de dados X
X = np.linspace(0, 20, 100)

# Calcule os valores correspondentes de Y usando a expressão do polinômio
Y = polinomio(X)

# Plote os dados
plt.plot(X, Y, label='Expressão do Polinômio')
plt.xlabel('X')
plt.ylabel('y')
plt.title('Curva de Regressão Polinomial')
plt.legend()
plt.show()
