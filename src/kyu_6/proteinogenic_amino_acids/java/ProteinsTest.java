package kyu_6.proteinogenic_amino_acids.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProteinsTest {

    @Test
    public void test() {
        Proteins proteins = new Proteins();

        assertFalse(proteins.containsAminoAcid(12345L, "Gly"));
        assertFalse(proteins.containsAminoAcid(12345L, "Sec"));
        proteins.addAminoAcids(12345L, "Asn", "Gly", "Met", "Sec", "Ser", "Val");
        assertTrue(proteins.containsAminoAcid(12345L, "Gly"));
        assertTrue(proteins.containsAminoAcid(12345L, "Sec"));
        assertTrue(proteins.containsAminoAcid(12345L, "Val"));
        assertFalse(proteins.containsAminoAcid(12345L, "Lys"));
        assertFalse(proteins.containsAminoAcid(12345L, "Trp"));

        assertFalse(proteins.containsAminoAcid(67890L, "Ala"));
        assertFalse(proteins.containsAminoAcid(67890L, "Pyl"));
        proteins.addAminoAcids(67890L, "Ala", "Leu", "Tyr");
        assertTrue(proteins.containsAminoAcid(67890L, "Ala"));
        assertTrue(proteins.containsAminoAcid(67890L, "Tyr"));
        assertFalse(proteins.containsAminoAcid(67890L, "Asn"));
        assertFalse(proteins.containsAminoAcid(67890L, "Pyl"));
        proteins.addAminoAcids(67890L, "Gly", "Pyl", "Tyr");
        assertTrue(proteins.containsAminoAcid(67890L, "Leu"));
        assertTrue(proteins.containsAminoAcid(67890L, "Pyl"));
        assertTrue(proteins.containsAminoAcid(67890L, "Tyr"));
        assertFalse(proteins.containsAminoAcid(67890L, "Asn"));
        assertFalse(proteins.containsAminoAcid(67890L, "Pro"));

        proteins = new Proteins();
        assertFalse(proteins.containsAminoAcid(12345L, "Gly"));
        assertFalse(proteins.containsAminoAcid(12345L, "Sec"));
        assertFalse(proteins.containsAminoAcid(67890L, "Ala"));
        assertFalse(proteins.containsAminoAcid(67890L, "Pyl"));
    }
}

