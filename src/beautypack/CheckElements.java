package beautypack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckElements {

    // https://www.srokao.pl/2016/07/skadniki-ktorych-warto-unikac-bedac-w.html
    private String elements = "retinaldehyd, retinol, retinal, wit. A," +
            "Etylhexyl,Methoxycinnamate,Methoxycinnamat," +
            "Benzophenone,Methylbenzylidene Camphor,Octyl Dimethyl,PABA," +
            "Homosalate,Poliacrylamide,poliakrylamid," +
            "Diazolidinyl Urea,Imidazolidinyl Urea,Benzylhemiformal,2-Bromo,2-Nitropropane-1,3-Diol,Bronopol," +
            "5-Bromo-5-nitro-1,3-dioxane,Bronidox,DMDM Hydantoin,Quaternium–15,Sodium Hydroxymethylglycinate," +
            "Triethanolamine,TEA,trójetanoloamina,trietanolamina,trojetanoloamina," +
            "Paraben,Methylparaben,Ethylparaben,Isopropylparaben,Propylparaben,Butylparaben,Benzylparaben," +
            "Fenoksyetanol,Phenoxyethanol,PPD,p-fenylenodiamina,p-Phenylenediamine," +
            "Salicylic Acid,Glicolic Acid,Maic Acid,Lactic Acid,Tartaric Acid,Citric Acid,Mandelic Acid,fluor," +
            "Bimatoprost,Dechloro Dihydroxy Difluoro Ethylcloprostenolamide,Isopropyl Cloprostenate," +
            "Trifluoromethyl Dechloro Ethylprostenolamide,7-Phenyl Trinor Prostaglandin E2 Serinol Amide," +
            "Methylamido Dihydro Noralfaprostal, Acid, Triklosan, Diethyl phtalate, Diisodecyl phtalate, Diisononyl phtalate" +
            "DEP, Hydroquinone, Parfum, Dihydroxyacetone" +
            "Caffeine, Retinol, Retinal, Retinyl, Tretinoina, Tazaroten, Adapalen, Anozol, Tetracyklina, Poliacrylate" +
            "Glycine Soja Oil, Hydroquinone, benzeno-1,4-diol, SLS, SLES, ALS, EDTA, Izopropyl Palmitate, BHT, BHA, " +
            "Arbutin, Petroselinum, Rosmarinus, Bergama, Bergamia, Heliantus Annus, Thymus, Salvia, Lavandula, " +
            "Melissa, Majorana";

    private String dataIn = "Sodium Chloride, Glycerin, Glycereth-2 Cocoate, Maris Sal (Sea Salt), Helianthus Annuus " +
            "Seed Oil, Mangifera Indica Fruit Extract, Tocopherol, Sodium Citrate, Parfum, CI 16035, CI 47005, Linalool, Limonene";


    public List<String> listToLowerCase(List<String> s) {
        return s.stream().map(str -> str.trim().toLowerCase()).collect(Collectors.toList());
    }

    public void validate() {
        String[] base = elements.split(",");
        List<String> baseList = listToLowerCase(Arrays.asList(base));
        String[] data = dataIn.split(",");
        List<String> dataList = listToLowerCase(Arrays.asList(data));

        boolean isOk = true;
        for (String ingredient : dataList) {
            for (String b : baseList) {
                if (check(b, ingredient)) {
                    System.out.println("Found: " + b + ", " + ingredient);
                    isOk = false;
                }
            }
        }

        if (isOk) {
            System.out.println("It's OK!");
        }

    }

    private static boolean check(String base, String ingredient) {
        return ingredient.contains(base);
    }

    public static void main(String[] args) {
        CheckElements checkElements = new CheckElements();
        checkElements.validate();
    }


}
