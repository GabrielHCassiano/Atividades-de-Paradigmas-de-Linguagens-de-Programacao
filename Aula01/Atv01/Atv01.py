from funcao import calvalor
from funcao import calvalorpg

preço = float(input("Digite o preço da mercadoria: "))
desconto = float(input("Digite o percentual de desconto: "))
valdesc = calvalor(preço, desconto)
valpg = calvalorpg(preço, valdesc)
#valor_do_desconto = preço * desconto / 100
#a_pagar = preço - valor_do_desconto

print("Um desconto de %5.2f %% em mercadoria de R$ %7.2f" % (desconto, preço))
print("vale R$ %7.2f." % valdesc)
print("O valor a pagar é de R$ %7.2f" % valpg) 