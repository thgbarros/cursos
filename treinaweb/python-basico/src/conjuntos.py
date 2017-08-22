linguagens = ["Python", "Java", "C#", "PHP"]
print("Eu gosto de", linguagens[0])
print("A linguagem que eu menos gosto é:", linguagens[-1])

lista_aninhada = [[1,2,3], [10, 20, 30]]
print(lista_aninhada[0][1])
print(lista_aninhada[1][-1])

lista_com_diferentes_tipos = ["TreinaWeb", 10, True]
print(lista_com_diferentes_tipos)

#Tuplas são mais rápidas do que as listas, mais os seus elementos são imutáveis
exemplo_tupla = ("Isso", "é", "uma", "tupla")
print(exemplo_tupla)

#slices
exemplo_slice = linguagens[1:3]
print(exemplo_slice)

#pesquisando dentro da lista
print("Python" in linguagens)
print("Perl" in linguagens)

#repeticoes em listas
print(linguagens * 3)

#Adicionando novos elementos
linguagens.append("Perl")
linguagens.append("OCaml")
print(linguagens)

#Adicionando mais de um elemento
linguagens.extend(["JavaScript", "C", "C++"])
linguagens.extend(("IronPython", "Ruby"))
print(linguagens)

linguagens += "R"
linguagens += ("Clipper", "Elixir")
print(linguagens)

#Extraindo elementos da lista
primeira_linguagem = linguagens.pop(0)
print(primeira_linguagem)
print(linguagens)

ultima_linguagem = linguagens.pop()
print(ultima_linguagem)
print(linguagens)

linguagens.remove("R")
print(linguagens)

linguagens.insert(0, "Python")
print(linguagens)