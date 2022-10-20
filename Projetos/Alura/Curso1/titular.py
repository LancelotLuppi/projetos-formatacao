class Titular:

    def __init__(self, nome, cpf, cep, conta):
        print("Construindo objeto --> {}".format(self))
        self.nome = nome
        self.cpf = cpf
        self.cep = cep
        self.conta = conta
    
    