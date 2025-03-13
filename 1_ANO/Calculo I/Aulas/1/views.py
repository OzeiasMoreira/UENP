import numpy as np
import matplotlib.pyplot as plt

 valores = [2,4,6,8,10,12,14,16,18,20]
 resultados = [1,3,5,7,9,11,13,15,17,19]

line = np.linspace(0,20,10)

predict = np.poly1d(np.polyfit(valores , resultados,3))

plt.scatter(valores,resultados)
plt.plot(line,predict(line),c = "blue")
plt.show()