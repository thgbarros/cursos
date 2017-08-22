var app = require('express')();
var http = require('http').createServer(app);
var io = require('socket.io').listen(http);

app.get('/', function(request, response) {
    response.sendFile(__dirname + '/index.html');
});

io.on('connection', function(socket) {
    socket.on('toServer', function(data){
        var msg = data.nome + ': ' + data.msg;
       socket.emit('toClient', msg);
       socket.broadcast.emit('toClient', msg);
    }); 
});

http.listen(3000, function() {
    console.log('litening on *: 3000');
});

