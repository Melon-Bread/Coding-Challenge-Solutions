const fs = require('fs');

var directory = process.argv[2];
var fileType = process.argv[3];
var dirListings = [];

function getListing(callback) {
  fs.readdir(directory, function(err, items) {
    for (var i = 0; i < items.length; i++) {
      if (items[i].includes("." + fileType)) {
        dirListings.push(items[i]);
      }
    }
    callback()
  });
};

function displayListing() {
  for (var f = 0; f < dirListings.length; f++) {
    console.log(dirListings[f]);
  }
};

getListing(displayListing);
