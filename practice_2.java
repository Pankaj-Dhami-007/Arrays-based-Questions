public class practice_2 {
    public static void main(String[] args) throws InterruptedException{
        String days[] = {"Monday", "Tuesday", "wednesday", "thirsday", "friday"};
        String[][] timeTable = {
            {"Math", "English", "Physics", "History", "PD"},
            {"Biology", "Math", "Chemistry", "Computer Science", "English"},
            {"History", "Math", "Geography", "Physics", "Biology"},
            {"Math", "English", "History", "Chemistry", "PD"},
            {"Geography", "Physics", "Computer Science", "Math", "Art"}
        };

        for (int i = 0; i < days.length; i++) {
            System.out.println("Timetable for "+days[i]+" : ");
            //Thread.sleep(2000);
            for (int j = 0; j < timeTable[i].length; j++) {
                System.out.print(timeTable[i][j]+" \t");
                //Thread.sleep(2000);
            }
            System.out.println();
        }
    }
}
