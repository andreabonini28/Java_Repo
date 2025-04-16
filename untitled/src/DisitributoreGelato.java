public class DisitributoreGelato {
    String flavorindex;
    int temperatura, altezza;
    private final int altezza_max = 20;
    private final String [] Gusti ={"Cioccolato", "vaniglia","cocco","fragola", "menta"};
    public DisitributoreGelato (String flavorindex, int temperatura, int altezza){
        this.altezza = altezza;
        this.temperatura = temperatura;
        this.flavorindex = flavorindex;
    }
    public void simula()throws InterruptedException, CosmicSugarStormException, ThermodynamicViolationException, GelatoOverloadException{
        if(altezza < altezza_max) {
            System.out.println("Distributore in espansione");
            altezza += 5;
        }else{ throw new GelatoOverloadException("altezza massima superata, occhio!!!!");
        }
        double prob = Math.random();
        if(prob < 0.05){
            throw new ThermodynamicViolationException("Hai violato le leggi della termodinamica");
        }
        if(prob< 0.2){
            throw new CosmicSugarStormException("tempesta di zucchero spaziale in arrivo");
        }
        if(prob < 0.40){
            
        }
    }


}
