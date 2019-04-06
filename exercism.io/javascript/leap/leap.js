
var Year = function (input) {
  this.value = input;
};

Year.prototype.isLeap = function () {
  if (this.value % 4 === 0) {
    if(this.value % 100 === 0) {
      if (this.value % 400 === 0) {
        return true;
      }
      else {
          return false;
      }
    }
    else {
        return true;
    }
  }
  else {
    return false;
  }
};

module.exports = Year;
