import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hourOfExam = Integer.parseInt(scan.nextLine());
        int minutesOfExam = Integer.parseInt(scan.nextLine());
        int hourOfArrival = Integer.parseInt(scan.nextLine());
        int minutesOfArrival = Integer.parseInt(scan.nextLine());
        double timeExamMinutes = (hourOfExam * 60) + minutesOfExam;
        double timeArrivalMinutes = (hourOfArrival * 60) + minutesOfArrival;
        double timeDifference = timeArrivalMinutes - timeExamMinutes;
        double timeDifferenceMinutes = 0;
        double timeDifferenceHours = 0;
        String status = "";

        if (timeExamMinutes == timeArrivalMinutes || timeExamMinutes - timeArrivalMinutes <= 30 && timeExamMinutes - timeArrivalMinutes >= 0) {
            status = "On time";
        } else if (timeExamMinutes - timeArrivalMinutes > 30) {
            status = "Early";

        } else if (timeArrivalMinutes > timeExamMinutes) {
            status = "Late";
        }
        System.out.println(status);

        if (timeExamMinutes - timeArrivalMinutes < 60 && timeExamMinutes - timeArrivalMinutes >= 1) {
            timeDifference = timeExamMinutes - timeArrivalMinutes;
            System.out.printf("%.0f minutes before the start" , timeDifference);
        } else if (timeExamMinutes - timeArrivalMinutes >= 60 && timeExamMinutes - timeArrivalMinutes >= 0) {
            timeDifference = timeExamMinutes - timeArrivalMinutes;
            timeDifferenceHours = Math.floor(timeDifference / 60);
            timeDifferenceMinutes = timeDifference % 60;
            if (timeDifferenceMinutes < 10) {
                System.out.printf("%.0f:0%.0f hours before the start", timeDifferenceHours, timeDifferenceMinutes);
            } else {
                System.out.printf("%.0f:%.0f hours before the start", timeDifferenceHours, timeDifferenceMinutes);
            }

        } else if (timeArrivalMinutes > timeExamMinutes && timeDifference < 60) {

            System.out.printf("%.0f minutes after the start", timeDifference);
        } else if (timeArrivalMinutes > timeExamMinutes && timeDifference >= 60) {
            timeDifferenceHours = Math.floor (timeDifference /60);
            timeDifferenceMinutes = timeDifference % 60;
            if (timeDifferenceMinutes < 10) {
             System.out.printf("%.0f:0%.0f hours after the start", timeDifferenceHours, timeDifferenceMinutes);
            } else {
                System.out.printf("%.0f:%.0f hours after the start", timeDifferenceHours, timeDifferenceMinutes);
            }

            }

        }
    }



