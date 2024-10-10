class Configuracao:
    instance = None

    def Instance(cls):
        if cls.instance == None:
            cls.instance = Configuracao()
        return cls.instance

configuracao1 = Configuracao().Instance()
