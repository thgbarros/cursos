import sys

class NumeroCaracteresMenorQueTresError(Exception):
    pass

nomes = {"João":20, "Maria":25, "José":30}

try:
    nome = input("Digite um nome: ")
    if len(nome) < 3:
        raise NumeroCaracteresMenorQueTresError("O número de caracteres para pesquisa deve ser maior que três caracteres.")
    idade = nomes[nome]
    print(nome, " possui ", idade, " anos ")
except KeyError:
    print("Não existe essa pessoa no dicionário.")
except:
    print("Houve um erro ao localizar a pessoa.")
    tipo_excecao, valor_excecao, tracebak = sys.exc_info()
    print(tipo_excecao)
    print(valor_excecao)
    print(tracebak)
finally:
    print("Obrigado por usar o nosso software.")