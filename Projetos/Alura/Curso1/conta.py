class Conta:

    def __init__(self, numero, titular, saldo, limite):
        print("Construindo objeto... {}".format(self))
        self.__numero = numero
        self.__titular = titular
        self.__saldo = saldo
        self.__limite = limite

    def extrato(self):
        print("Saldo: R${} do titular {}".format(self.__saldo, self.__titular))

    def deposita(self, valor):
        self.__saldo += valor

    def saca(self, valor):
        self.__saldo -= valor

    def transfere(self, valor, destino):
        if(self.__saldo > valor):
            self.saca(valor)
            destino.deposita(valor)
            print("Valor de R${} para {} feito com sucesso!".format(valor, destino.__titular))
        else:
            print("Você não tem saldo o suficiente.")
