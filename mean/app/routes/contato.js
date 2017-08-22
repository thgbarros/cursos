function verificaAutenticacao(request, response, next) {
    if (request.isAuthenticated()) {
        return next();
    } else {
        response.status(401).json('Não autorizado');
    }
}

module.exports = function(app) {
    var controller = app.controllers.contato;
    
    //Antes do Express 4
    // app.get('/contatos', controller.listaContatos);
    // app.get('/contatos/:id', controller.obtemContato);
    // app.delete('/contatos/:id', controller.removeContato);
    
    //Depois do Express 4   
    app.route('/contatos')
        .get(verificaAutenticacao, controller.listaContatos)
        .post(verificaAutenticacao, controller.salvaContato);
        
    app.route('/contatos/:id')
        .get(verificaAutenticacao, controller.obtemContato)
        .delete(verificaAutenticacao, controller.removeContato);    
        
};