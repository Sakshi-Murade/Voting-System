import java.util.Scanner;

class Vote{
    float BJP;
    float INC;
    float Shivsena;
    float NCP;


    
    static void result(int TotalVoters , int[] arr){
      
        Vote v = new Vote();
        float percent = 100/TotalVoters;
        v.BJP = v.INC = v.Shivsena = v.NCP = 0;
        for(int i = 0 ; i < TotalVoters ; i++){
            switch (arr[i]) {
                case 1:
                    (v.BJP)++;
                    break;
                case 2:
                    (v.INC)++;
                    break;
                case 3:
                    (v.Shivsena)++;
                    break;
                case 4:
                    (v.NCP)++;
                    break;
            }
        }

        System.out.println("\n\n");
        System.out.println("\t--Result--\n");
        System.out.println("BJP has: \t"+(v.BJP)*percent +"%");
        System.out.println("INC has:\t"+(v.INC)*percent +"%");
        System.out.println("Shivsena has:\t"+(v.Shivsena)*percent +"%");
        System.out.println("NCP has:\t"+(v.NCP)*percent +"%");
        System.out.println("\n\n");

	float maxVotes = Math.max(Math.max(v.BJP, v.INC), Math.max(v.Shivsena, v.NCP));
        int countMax = 0;
        if (maxVotes == v.BJP) countMax++;
        if (maxVotes == v.INC) countMax++;
        if (maxVotes == v.Shivsena) countMax++;
        if (maxVotes == v.NCP) countMax++;

        System.out.println("\n\n");
        System.out.println("\tWinner\n");
        if (countMax > 1) {
            String[] tiedParties = new String[countMax];
            int index = 0;
            if (maxVotes == v.BJP) tiedParties[index++] = "BJP";
            if (maxVotes == v.INC) tiedParties[index++] = "INC";
            if (maxVotes == v.Shivsena) tiedParties[index++] = "Shivsena";
            if (maxVotes == v.NCP) tiedParties[index] = "NCP";

            System.out.println("It's a tie between:");
            for (String party : tiedParties) {
                System.out.println(party);
            }
        } else {
            if (maxVotes == v.BJP) {
                System.out.println("BJP is the winner with " + (v.BJP) * percent + "% of votes.");
            } else if (maxVotes == v.INC) {
                System.out.println("INC is the winner with " + (v.INC) * percent + "% of votes.");
            } else if (maxVotes == v.Shivsena) {
                System.out.println("Shivsena is the winner with " + (v.Shivsena) * percent + "% of votes.");
            } else {
                System.out.println("NCP is the winner with " + (v.NCP) * percent + "% of votes.");
            }
        }
        System.out.println("\n\n");
    

    }



    public static void main(String arg[]){
        System.out.println("---!!!Voting System!!!---");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total numbers of voters::");
        int TotalVoters = sc.nextInt();
        int arr[] = new int[TotalVoters]; //store result of selected option
        for(int i = 0 ; i < TotalVoters ; i++){
            System.out.println("\n");
            System.out.println("Select any one options");
            System.out.println("1.BJP");
            System.out.println("2.INC");
            System.out.println("3.Shivsena");
            System.out.println("4.NCP");
            arr[i] = sc.nextInt();
        }



       
        result(TotalVoters, arr);

    }
}