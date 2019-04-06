function reverseString(input) {
    var reverse = "";
    for (var i = input.length - 1; i >= 0; --i) {
        reverse += input[i];
    }
    return reverse;
};

module.exports = reverseString;