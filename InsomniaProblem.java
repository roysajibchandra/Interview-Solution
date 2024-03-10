// Insomnia, which refers to the inability to sleep or maintain restful sleep, has become a significant problem in today's world, 
// especially among the youth population. The fast-paced, technology-driven lifestyle is the main reason behind insomnia.


// Now, you will be given sleep hours for the last three days of N persons. 
// You need to find which person has the lowest average sleep hours and show the sleeping hours of the last three days of that person.


// Input: An integer N that represents the number of persons, followed by n list of sleep hours, every 
// list contains three numbers that represent the sleeping hours of the past three days of that person.


// Output: The first line of the output will contain the average lowest sleep hours up to two decimal places. 
// The second output line will contain a comment according to average sleeping hours. 
// If the average sleeping hours is 8 or more hours then you will comment "Thik Ache Mama!", 
// if it is 6 to below 8 hours it will be "Aro Ghumaite Hobe Mama!", otherwise, you will comment "Beshidin Bachba Na Mama! Sabdhan."

// Sample Input
// 3
// 7 4.5 9
// 8 10 8
// 12 14 12

// Sample Output
// 6.83
// Aro Ghumaite Hobe Mama!



import java.util.Scanner;

public class InsomniaProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt(); // Number of persons
        
        double lowestAverage = Double.MAX_VALUE;
        int[] lowestSleepingHours = new int[3];
        
        for (int i = 0; i < N; i++) {
            int[] sleepHours = new int[3];
            double totalSleep = 0;
            for (int j = 0; j < 3; j++) {
                sleepHours[j] = scanner.nextInt();
                totalSleep += sleepHours[j];
            }
            double averageSleep = totalSleep / 3.0;
            if (averageSleep < lowestAverage) {
                lowestAverage = averageSleep;
                lowestSleepingHours = sleepHours.clone();
            }
        }
        
        System.out.printf("%.2f\n", lowestAverage);
        if (lowestAverage >= 8) {
            System.out.println("Thik Ache Mama!");
        } else if (lowestAverage >= 6 && lowestAverage < 8) {
            System.out.println("Aro Ghumaite Hobe Mama!");
        } else {
            System.out.println("Beshidin Bachba Na Mama! Sabdhan.");
        }
        
        scanner.close();
    }
}

