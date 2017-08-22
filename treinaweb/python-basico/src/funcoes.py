from matematicas import funcoes_aritmeticas as funcoes
#from funcoes_aritmeticas import somar, subtrair, multiplicar, dividir, media_aritmetica

numero1 = int(input("Digite o primeiro número: "))
operacao = input("Digite a operação: ")
numero2 = int(input("Digite o segundo número: "))
if operacao == "+":
    funcoes.somar(numero1, numero2)
elif operacao == "-":
    print("{n1} - {n2} = {resultado}"
            .format(n1=numero1, n2=numero2,
                    resultado=funcoes.subtrair(numero1, numero2)))
elif operacao == "*":
    print("{n1} * {n2} = {resultado}"
          .format(n1=numero1, n2=numero2,
                  resultado=funcoes.multiplicar(numero1, numero2)))
elif operacao == "/":
    quociente, resto = funcoes.dividir(n2=numero2, n1=numero1)
    print("O quociente é ", quociente, " e o resto é ", resto)

print("Média aritmética = {m}".format(m=funcoes.media_aritmetica(3, 4, 5)))

#Operador de descompactação da lista
numeros = [10, 20, 30, 50, 60]
print("Outra média aritmética = {m}".format(m=funcoes.media_aritmetica(*numeros)))