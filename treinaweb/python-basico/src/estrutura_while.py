amigos = []
nome = ""

while nome != "parar":
    nome = input("Digite o nome de um amigo: ")
    if nome != "parar":
        amigos += [nome]
else:
    print("** Fim dos nomes dos amigos **")

print("Seus amigos são", amigos)
