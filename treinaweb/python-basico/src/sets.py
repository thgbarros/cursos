set_treinaweb = set("Treinaweb Cursos")
print(set_treinaweb)

set_linguagens = set(["Python", "C#", "Java"])
print(set_linguagens)
set_linguagens.add("Lisp")
print(set_linguagens)

set_outras_linguagens = { "JavaScript", "C++", "Python"}
print(set_outras_linguagens)

print( set_linguagens.difference(set_outras_linguagens))
print(set_linguagens - set_outras_linguagens)

print(set_linguagens.union(set_outras_linguagens))
print(set_linguagens | set_outras_linguagens)

print(set_linguagens.intersection(set_outras_linguagens))
print(set_linguagens & set_outras_linguagens)

print(set_linguagens.isdisjoint(set_outras_linguagens))

set_linguagens.difference_update(set_outras_linguagens)
print(set_linguagens)