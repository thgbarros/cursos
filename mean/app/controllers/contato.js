var sanitize = require('mongo-sanitize');

module.exports = function (app) {
    var controller = {};
    var Contato = app.models.contato;
    
    controller.listaContatos = function(request, response) {
        Contato.find().populate('emergencia').exec().then(
            function (contatos) {
                response.json(contatos);
            },
            function (error) {
                console.log(error);
                response.status(500).json(error);
            }
        )
    };
    
    controller.obtemContato = function(request, response){
        var _id = request.params.id;
        Contato.findById(_id).exec().then(
            function (contato) {
                if (!contato) throw new Error("Contato não encontrado");
                response.json(contato);
            },
            function (error) {
                console.log(error);
                response.status(404).json(error);
            }
        )
    };
    
    controller.removeContato = function (request, response) {
        var _id = sanitize(request.params.id);
        Contato.remove({"_id": _id}).exec().then(
            function () {
                response.status(204).end();
            },
            function (error) {
                return console.log(error);
            }
        )
    };
    
    controller.salvaContato = function (request, response) {
        var _id = request.body._id;
        
        var dados = {
            "nome" : request.body.nome,
            "email": request.body.email,
            "emergencia" : request.body.emergencia || null
        };
        
        if (_id) {
            Contato.findByIdAndUpdate(_id, dados).exec().then(
                function (contato) {
                    response.json(contato);
                },
                function (error) {
                    console.log(error);
                    response.status(500).json(error);
                }
            )
        } else {
            Contato.create(dados).then(
                function (contato) {
                    response.status(201).json(contato);
                },
                function (error) {
                    console.log(error);
                    response.status(500).json(error);
                }
            )
        }
    };
    
    return controller;
};