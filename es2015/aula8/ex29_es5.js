/*
*	Toda função javascript tem implicitamente acesso a um array chamado
*	arguments. Nele contém os argumentos que foram passados para a função.
*/

function soma(a, b) {	
	a = (0 in arguments) ? a : 1; //Verifica se o elemento 0 do array de argumentos foi atribuido.
	b = (1 in arguments) ? b : 1; //Verifica se o elemento 1 do array de argumentos foi atribuido.
	return a + b;
}

console.log(soma(), soma(2, 3), soma(0));