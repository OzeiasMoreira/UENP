contador = 0

while contador <= 10:
  print(contador)
  contador = contador + 1

x = 0

while x < 100 and x != 20 :
  print("X está valendo" , x)
  x += 1

print("Saimos do laço")

somaTotal = 0
media = "Nenhuma media foi calculada"
quantNotas = 0
calculaMedia = True

while calculaMedia:
  nota = input("Informe sua nota(0 para encerrar)")

  if nota == '0' :
    calculaMedia = False

  else:
      somaTotal += float(nota)
      quantNotas += 1

media = somaTotal / quantNotas
print(f"Media:{media}")

dificuldade = int(input("Escolha a dificuldade de 1 a 10"))

if dificuldade > 10 or dificuldade < 1:
  quit()

tentativasPossiveis = 11 - dificuldade

palavra = input("Qual a palavra a ser decifrada?")

palavra = palavra.strip().lower()

if palavra.isalpha():
  print("Pode começar!")
  finalizado = False

else :
  print("Palavra Proibida!")
  finalizado = True

while not finalizado and tentativasPossiveis:
  chute = input("Chute uma palavra")

carrinho = ["tomates" ,"batatas", "ovos" , "paes" ,"doritão"]

item1 = "tomates"
item2 = "batatas"
item3 = "ovos"
item4 = "paes"
item5 = "doritão"

print(item4)

print(carrinho[0])

"batatas" in carrinho

"morango" in carrinho