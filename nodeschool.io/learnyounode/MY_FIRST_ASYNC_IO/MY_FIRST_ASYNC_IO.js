const fs = require('fs');

var file = process.argv[2];
var fileLineCount = 0;

function getContents(callback) {
  fs.readFile(file, 'utf8', function doneReading(err, fileContents) {
    fileLineCount = fileContents.split("\n");
    callback()
  });
};

function displayCount() {
  console.log(fileLineCount.length-1);
};

getContents(displayCount);
