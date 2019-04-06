var Pangram = function(input) {
  this.input = input;
};

var ALPHABET = "abcdefghijklmnopqrstuvwxyz";

Pangram.prototype.isPangram = function isPangram() {
  var alphaCount = [];
  for (var i = 0; i < ALPHABET.length; i++) {
    alphaCount[i] = 0;
  }

  if (this.input.length < ALPHABET.length) {
    return false;
  }
  else {
    for (var x = 0; x < this.input.length; x++) {
      for (var y = 0; y < ALPHABET.length; y++) {
        if (this.input[x] === " ") {
          break;
        }
        else if (this.input[x].toLowerCase() === ALPHABET[y]) {
          alphaCount[y]++;
          break;
        }
      }
    }
  }


  for (var a = 0; a < alphaCount.length; a++) {
    if (alphaCount[a] <= 0) {
      return false;
    }
  }
  return  true;
};

module.exports = Pangram;
