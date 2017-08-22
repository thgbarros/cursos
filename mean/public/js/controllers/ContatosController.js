angular.module('contatooh').controller('ContatosController', 
    function ($scope,Contato){
        $scope.contatos = [];                      
        $scope.filtro = '';
        $scope.mensagem = {texto: ''};
        
        function buscaContatos() {
            Contato.query(
                function (contatos) {
                    $scope.contatos = contatos;
                    $scope.mensagem = {};
                }, 
                function (error) {
                    console.log(error);
                    $scope.mensagem = {
                        texto: "Não foi possivel obter a lista de contatos."
                    };
                }
            );   
        }
        buscaContatos();
        
        $scope.remove = function (contato) {
            Contato.delete({id: contato._id}, 
                buscaContatos, 
                function (error) {
                    console.log(error);
                    $scope.mensagem = {
                        texto: "Não foi possivel remover o contato."
                    };
                }
            );  
        };
        
});
