valor_a = 753.4
valor_b = 567.4

if santos:
  print('Santos maior do Brasil! ')

else:
    print('Santos melhor do Brasil! ')


horarioSofia = 22
horarioGabriel = 22
horarioAna = 22
meuHorario = 22

sofiaDisponivel = horarioSofia == meuHorario
gabrielDisponivel = horarioGabriel == meuHorario
anaDisponivel = horarioAna == meuHorario

if sofiaDisponivel and gabrielDisponivel and anaDisponivel:
  print('Vamos poder jogar! ')

else:
  print('Não vamos poder jogar')


carteira = 1.5
coxinha = 6
refrigerante = 4
empada = 3.5
brigadeiro = 2
pastel = 4


if carteira >= coxinha:
  print('Vou comprar uma coxinha! ')

  carteira = carteira - coxinha

elif carteira >= pastel:
  print('Vou comprar um pastel! ')

  carteira = carteira - pastel

elif carteira >= refrigerante:
  print('Vou comprar um refrigerante! ')

  carteira = carteira - refrigerante

elif carteira >= empada:
  print('Vou comprar uma empada! ')

  carteira = carteira - empada

elif carteira >= brigadeiro:
  print('Vou comprar um brigadeiro! ')

  carteira = carteira - brigadeiro

else:
  print('F, fiquei com fome')

print("Tenho: R$", carteira)


a = 3.2
b = 5.7
c = 4.3


if a <= b:
  if a > c:
    print('Primeiro "if" aninhado é verdadeiro!')

  else:
    print('Primeiro "if" aninhado é falso!')

else:
  print('Primeiro "if" é falso! ')