var MongoClient = require('mongodb').MongoClient;
var ObjectID = require('mongodb').ObjectID;

var _idProcurado = new ObjectID('57467d0d3de1fb121e4aba80');

MongoClient.connect('mongodb://127.0.0.1:27017/contatooh',
    function (error, db){
        if (error) throw error;
        
        db.collection('contatos').findOne({_id: _idProcurado},
            function (error, contato) {
                if (error) throw error;
                console.log(contato);
            }
        );
    }
);
