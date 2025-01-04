package kyu_6.proteinogenic_amino_acids.java;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

enum AminoAcid {
    Ala, Arg, Asn, Asp, Cys, Glu, Gln, Gly, His, Ile, Leu,
    Lys, Met, Phe, Pro, Pyl, Sec, Ser, Thr, Trp, Tyr, Val;
}

public class Proteins {

    private final Map<Long, Set<AminoAcid>> proteins = new HashMap<>();

    public void addAminoAcids(long proteinId, String... aminoAcids) {
        Set<AminoAcid> set = proteins.computeIfAbsent(proteinId, id -> EnumSet.noneOf(AminoAcid.class));
        for (String aminoAcid: aminoAcids) {
            set.add(AminoAcid.valueOf(aminoAcid));
        }
    }

    public boolean containsAminoAcid(long proteinId, String aminoAcid) {
        Set<AminoAcid> set = proteins.get(proteinId);
        return set != null && set.contains(AminoAcid.valueOf(aminoAcid));
    }
}
