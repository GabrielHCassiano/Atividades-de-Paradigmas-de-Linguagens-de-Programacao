class ContaBancaria:
    def __init__(self, __saldo, titular):
        self.__saldo = __saldo
        self.titular = titular

    def get_saldo(self):
        return self.__saldo
    
    def depositar(self, saldo):
        self.__saldo += saldo

    def sacar(self, saldo):
        try:
            if self.__saldo - saldo >= 0:
                self.__saldo -= saldo
            else:
                raise SaldoInsuficienteException("Error, saldo insuficiente")
        except SaldoInsuficienteException as e:
            print(e)

class SaldoInsuficienteException(Exception):
    pass 

conta1 = ContaBancaria(500, "titualar1")
print(conta1.get_saldo())
conta1.depositar(50)
print(conta1.get_saldo())
conta1.sacar(250)
print(conta1.get_saldo())

conta1.sacar(350)
print(conta1.get_saldo())