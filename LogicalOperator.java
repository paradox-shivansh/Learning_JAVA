// logical operator
class Main {
    public static void main(String[] args) {
        // && and operator
        // || OR operator
        // Switch "it checks multiple conditions"
        
        int day = 1; // 1 -> monday
        
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break; // breat is importaant beacuse it ensures that the exact value is printed 
            default:
                System.out.print("wed-sun");
        }
    }
}