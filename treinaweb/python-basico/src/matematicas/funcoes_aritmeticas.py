def somar(n1, n2):
    """Realiza a somatório de dois números"""
    print("{n1} + {n2} = {resultado}".format(n1=n1, n2=n2, resultado=n1+n2))


def subtrair(n1, n2):
    return n1 - n2


def multiplicar(n1, n2):
    return n1 * n2


def dividir(n1, n2):
    return (n1 // n2, n1 % n2)


def media_aritmetica(*numeros):
    return sum(numeros) / len(numeros)