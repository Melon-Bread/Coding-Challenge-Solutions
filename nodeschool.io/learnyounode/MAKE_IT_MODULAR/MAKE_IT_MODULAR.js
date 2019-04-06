const dirList = require('./dir-module')
const directory = process.argv[2];
const fileType = process.argv[3];

dirList(directory, fileType, function (err, items) {
  if (err) {
    return console.error("There was an error: ", err);
  }

  items.forEach(function (item) {
    console.log(item);
  });
});
