from scipy import interpolate
from numpy import polynomial as P
import numpy as np
from scipy import linalg
import matplotlib.pyplot as plt

p1 = P.Polynomial ([1, 2, 3])
p1

p1.roots ()

p2 = P.Polynomial.fromroots([-1,1])
p2

p2.roots ()

p1.coef

p1.domain

p1.window

p1(np.array([1.5, 2.5, 3.5])) # substituição de valores de x

p3 = P.Polynomial.fromroots([1, 2, 3])
p3

p4= P.Polynomial.fromroots([2])
p4

p5 = p3//p4
p5

p5.roots()

x = np.array([0, 2.42, 4.6, 6.69, 8.71, 10.7, 12.66, 14.56, 16.43, 18.29, 20.13])
y = np.array([0, -2.42, -4.6, -6.69, -8.71, -10.7, -12.66, -14.56, -16.43, -18.29, -20.13])

deg = len(x) -1
deg

A = P.polynomial.polyvander(x,deg)
A

c = linalg.solve (A,y)
c

f1 = P.Polynomial (c)

A = P.chebyshev.chebvander(x, deg)
c = linalg.solve(A, y)
c

xx = np.linspace(x.min(), x.max(), 100) # supersampled [x[0], x[-1]] interval
fig, ax = plt.subplots(1, 1, figsize=(12, 4))
ax.plot(xx, f1(xx), 'b', lw=2, label='Power basis interp.')
ax.scatter(x, y, label='data points')
ax.legend(loc=4)
ax.set_xticks(x)
ax.set_ylabel(r"$y$", fontsize=18)
ax.set_xlabel(r"$x$", fontsize=18)

f1b = P.Polynomial.fit(x,y,deg)
f1b

xi = np.array([0,1,2,3], dtype='double')
yi = np.array([1,6,5,-8], dtype='double')

A = np.array([xi**3,xi**2,xi**1,xi**0]).transpose()

a = np.linalg.inv(A).dot(yi);a

xx = np.linspace(2.42,4.6);

plt.plot(xi,yi,'ro',xx,np.polyval(a,xx),'b-')
plt.grid();plt.show()

x = np.array([0, 2.42, 4.6, 6.69, 8.71, 10.7, 12.66, 14.56, 16.43, 18.29, 20.13])
y = np.array([0, -2.42, -4.6, -6.69, -8.71, -10.7, -12.66, -14.56, -16.43, -18.29, -20.13])

xx = np.linspace(x.min(), x.max(), 20)

vfig, ax = plt.subplots(figsize=(8, 4))
ax.scatter(x, y)
for n in [1, 2, 3, 5]:
    f = interpolate.interp1d(x, y, kind=n)
    ax.plot(xx, f(xx), label='order %d' % n)
ax.legend()
ax.set_ylabel(r"$y$", fontsize=20)
ax.set_xlabel(r"$x$", fontsize=20)

x = np.linspace(-1, 1, 11)

x = np.linspace(-1, 1, 11)