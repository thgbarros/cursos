var MongoClient = require('mongodb').MongoClient;

var contatos = [
    {nome: "xyz1", email: "xyz1@email.com.br"}, 
    {nome: "xyz2", email: "xyz2@email.com.br"},
    {nome: "xyz3", email: "xyz3@email.com.br"}
];

MongoClient.connect('mongodb://127.0.0.1:27017/contatooh_test', function(error, db) {
    if (error) throw error;
    
    db.dropDatabase(function(error) {
        if (error) return console.log(error);
        console.log("Banco apagado com sucesso");
        db.collection('contatos').insert(contatos, function(error, inserted){
            if (error) return console.log(error);
            console.log('Banco populado com sucesso');
            process.exit(0); 
        });
    }); 
});