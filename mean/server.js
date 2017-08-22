var config = require('./config/config')();
var http = require('http');
var express = require('express');
var app = require('./config/express')();
require('./config/passport')();
require('./config/database')(config.db);

http.createServer(app).listen(app.get('port'), function () {
    console.log('Express server escutando a porta '+ app.get('port'));
});
