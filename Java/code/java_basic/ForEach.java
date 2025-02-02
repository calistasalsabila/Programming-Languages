public class ForEach {
    public static void main(String[] args) {
        
        String [] titleDokja = { "The Ugliest King", "Demon King of Salvation", "King of No Killing"};

        for(var i = 0 ; i < titleDokja.length ; i++) {
            System.out.println(titleDokja[i]);
        }

        // For Each
        String [] trioORV = {"Kim Dokja", "Yoo Junghyuk", "Han Sooyoung"};
        for (var value : trioORV) {
            System.out.println(value);
        }
    }
    
}
