

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String[] efespamKeywords = {
                "free", "urgent", "limited time", "act now", "double your", "exclusive offer",
                "money back", "discount", "guaranteed", "make money", "winner", "cash",
                "credit card", "debt", "earn", "extra income", "investment", "Lottery",
                "million", "mortgage", "opportunity", "prize", "profit", "refinance",
                "subscribe", "unlimited", "viagra", "weight loss", "work from home","valium","notspam"
                
        };							//EFEKAN EFE

        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter an email message: ");
        String emailMessage = scanner.nextLine().toLowerCase(); 
        
        int spamScore = 0;
        for (String i : efespamKeywords) {
            if (emailMessage.contains (i)) {
                spamScore++;
            }}
        
        double spamLikelihood =   100 * (double) (spamScore / (double) efespamKeywords.length) ;
        System.out.println("Spam Score: " + spamScore);
        System.out.println("Spam Likelihood: %" + spamLikelihood);
    }}

