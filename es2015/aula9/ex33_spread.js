/*
* Toda função em javascript tem alguns métodos que definem comportamentos. 
* Um desses métodos de comportamentos é chamado de "apply". O apply é encarregado 
* de passar cada elemento de um array para cada parametro da função. 
* Caso o array tenha mais elementos do que o número de parâmetros
* na função, o javascript irá ignorar os elementos excedentes do array.
*/
function mediaAluno(p1, p2, p3) {
	return ((p1+p2+p3) / 3).toFixed(2);
}

var notasAlunos = [7.7, 7.3, 6.1, 0.0];
console.log(mediaAluno.apply(null, notasAlunos));