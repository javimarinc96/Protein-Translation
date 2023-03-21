import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        List<String> res = new ArrayList<>();
        String[] codons = rnaSequence.split("(?<=\\G.{" + 3 + "})");
        for(String codon : codons){
            switch (codon){
                case "AUG":
                    res.add("Methionine");
                    break;
                case "UUU":case "UUC":
                    res.add("Phenylalanine");
                    break;
                case "UUA":case "UUG":
                    res.add("Leucine");
                    break;
                case "UCU":case "UCC": case "UCA": case "UCG":
                    res.add("Serine");
                    break;
                case "UAU": case"UAC":
                    res.add("Tyrosine");
                    break;
                case "UGU": case"UGC":
                    res.add("Cysteine");
                    break;
                case "UGG":
                    res.add("Tryptophan");
                    break;
                case "UAA": case"UAG": case "UGA":
                    return res;
                default:
                    break;

            }
        }
        return res;
    }
}
