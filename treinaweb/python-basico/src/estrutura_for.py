numero = int(input("Digite um número: "))
for i in range(11):
    print("{n} x {i} = {resultado}".format(n=numero, i=i, resultado=numero * i))
else:
    print(" **Processo concluído **")

capitais = {"SP": "São Paulo", "MG": "Belo Horizonte", "TO": "Palmas"}
print("Algumas capitais do Brasil são: ")
for sigla, capital in capitais.items():
    print(" - {sigla}: {capital}".format(sigla=sigla, capital=capital))