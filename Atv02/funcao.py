def reduçãoMinutos(anos_fumando, cigarro_por_dia):
    resp = anos_fumando * 365 * cigarro_por_dia * 10
    return resp

def reduçãoDias(redução_em_minutos):
    resp = redução_em_minutos / (24 * 60)
    print("Redução do tempo de vida %8.2f dias." % resp)
    