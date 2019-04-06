def to_rna(dna_strand):
    rna_strand = ""
    for x in dna_strand:
        if x == 'G':
            rna_strand += 'C'
            pass
        elif x == 'C':
            rna_strand += 'G'
            pass
        elif x == 'T':
            rna_strand += 'A'
            pass
        elif x == 'A':
            rna_strand += 'U'
            pass
        pass
    return rna_strand
