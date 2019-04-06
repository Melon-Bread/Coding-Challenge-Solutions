const fs = require('fs');

var file = process.argv[2];
var fileBuffer = fs.readFileSync(file);
var fileContents = fileBuffer.toString();
var fileLineCount = fileContents.split("\n");

console.log(fileLineCount.length-1);
