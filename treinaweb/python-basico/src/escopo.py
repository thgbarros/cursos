def teste():
    mensagem = "Agora estou dentro da função"
    print(id(mensagem))
    print(mensagem)


mensagem = "Agora estou fora da função"
print(id(mensagem))
print(mensagem)

teste()