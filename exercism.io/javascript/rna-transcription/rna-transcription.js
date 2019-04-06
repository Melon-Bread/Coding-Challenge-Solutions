var DnaTranscriber = function() {};

DnaTranscriber.prototype.toRna = function toRna(input) {
    var DNA = ['G', 'C', 'T', 'A'];
    var RNA = ['C', 'G', 'A', 'U'];
    var conversion = "";

    for (var x = 0; x <= input.length -1; x++) {
        for (var y = 0; y <= DNA.length -1; y++) {
            if (input[x] == DNA[y]) {
                conversion += RNA[y];
            }
        }
    }
    if (conversion.length != input.length) {
        throw Error ("Invalid input");
    }
    else {
        return conversion;
    }
}

module.exports = DnaTranscriber;
