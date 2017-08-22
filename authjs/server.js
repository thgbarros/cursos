var express = require('express')
    ,app = express()
    ,bodyParser = require('body-parser')
    ,mongoose = require('mongoose')
    ,jwt = require('jwt-simple');
    
    var db = 'mongodb://localhost:????/auth';
    
    app.use(bodyParser.urlencoded({extended: true}));
    app.use(bodyParser.json());
    var port = process.env.PORT || 8080;
    var router = express.Router();
    app.use('/api', router);
    
    mongoose.connect(db);
    app.lister(port);
    console.log('conectado a porta '+ porta);