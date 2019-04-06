const fs = require('fs');
const path = require('path');

module.exports = function (directory, fileType, callback) {
  fs.readdir(directory, function(err, items) {
    if (err) {
      return callback(err);
    }

    items = items.filter(function (item) {
      return path.extname(item) === '.' + fileType;
    });

    callback(null, items);
  });
};
