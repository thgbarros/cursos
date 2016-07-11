var nome = 'Bia', anoNascimento = 1981;
function idade() {
	return new Date().getFullYear() - this.anoNascimento;
}
var pessoa = {
	nome,           										//nome: nome,
	anoNascimento,  										//anoNascimento: anoNascimento,
	idade,          										//idade: idade, 
	toString(){return `${this.nome} = ${this.idade()}`; }   //toString: function(){ return `${nome} = ${idade}`;}
};
console.log(pessoa.toString());

