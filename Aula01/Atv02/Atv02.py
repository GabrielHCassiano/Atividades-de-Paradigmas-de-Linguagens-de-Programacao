from funcao import reduçãoMinutos
from funcao import reduçãoDias


cigarro_por_dia = int(input("Quantidade de cigarros por dia: "))
anos_fumando = float(input("Quantidade de anos fumando: "))
redução_em_minutos = reduçãoMinutos(anos_fumando, cigarro_por_dia)

reduçãoDias(redução_em_minutos)