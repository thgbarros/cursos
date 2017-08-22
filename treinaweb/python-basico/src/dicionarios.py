nomes = {"João": "da Silva", "Maria": "Souza", "José": "dos Reis"}
print(nomes)

print("João", nomes["João"])

#pesquisando dentro do dicionario
print("João" in nomes)
print("Pedro" in nomes)

#Removendo o elemento
del nomes["João"]
print(nomes)

#Atribuindo um novo elemento
nomes["TreinaWeb"] = "Cursos"
print(nomes)