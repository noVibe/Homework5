public class Main {
    public static void main(String[] args) {
//        =====Task 1=====
        System.out.println("=====Task 1=====");
        byte age = 18;
        if (age > 17) {
            System.out.println("Adult age greetings");
        } else System.out.println("Wait until 18");
//        =====Task 2=====
        System.out.println("=====Task 2=====");
        byte studentAge = 24;
        if (studentAge > 6 && studentAge < 18) {
            System.out.println("School student");
        }
        if (studentAge > 17 && studentAge < 24) {
            System.out.println("University student");
        }
        if (studentAge > 23) {
            System.out.println("Get a job");
        }
//        =====Task 3=====
        System.out.println("=====Task 3=====");
        byte vanCapacity = 102;
        byte sits = 60;
        byte passengerAmount = 60;
        if (passengerAmount < sits) {
            System.out.println("You can get a sitting place");
        }
        if (passengerAmount >= sits && passengerAmount < vanCapacity) {
            System.out.println("You can get a standing place");
        }
        if (passengerAmount >= vanCapacity) {
            System.out.println("The van is full");
        }
//      =====Task 2-1=====
        System.out.println("=====Task 2-1=====");
        byte manAge = 17;
        if (manAge > 17) {
            System.out.println("Adult greetings");
        } else {
            System.out.println("Get older kid");
        }
//      =====Task 2-2=====
        System.out.println("=====Task 2-2=====");
        byte ageStudent = 24;
        if (ageStudent > 6 && ageStudent < 18) {
            System.out.println("School student");
        } else if (ageStudent > 17 && ageStudent < 24) {
            System.out.println("University student");
        } else {
            System.out.println("Get a job");
        }
//        =====Task 2-3=====
        System.out.println("=====Task 2-3=====");
        byte capacityVan = 102;
        byte sittingPlaces = 60;
        byte passengers = 101;
        if (passengers < sittingPlaces) {
            System.out.println("Sitting place available");
        } else if (passengers >= capacityVan) {
            System.out.println("Tickets were sold out");
        } else {
            System.out.println("Standing place is available");
        }
//        =====Task 3-1=====
        System.out.println("=====Task 3-1=====");
        byte learnerAge = 24;
        if (learnerAge > 1 && learnerAge < 7) {
            System.out.println("Kindergarten");
        } else if (learnerAge > 6 && learnerAge < 18) {
            System.out.println("School");
        } else if (learnerAge > 18 && learnerAge < 24) {
            System.out.println("University");
        } else {
            System.out.println("Job");
        }
//        =====Task 3-2=====
        System.out.println("=====Task 3-2=====");
        byte visitorAge = 1;
        if (visitorAge < 5) {
            System.out.println("Kid can't ride the rides");
        } else if (visitorAge > 4 && visitorAge < 14) {
            System.out.println("Kid can ride the rides with adult");
        } else {
            System.out.println("Kid can ride the rides alone");
        }
//        =====Task 3-3=====
        System.out.println("=====Task 3-3=====");
        int one = 20;
        int two = 20;
        int free = 0;
        boolean allIsEqual = one == two && one == free;
        if (allIsEqual) {
            System.out.println("All numbers are equal");
        } else {
                if (one == two) {
                    if (one > free) {
                        System.out.println("One and Two are equal and the biggest");
                    } else {
                        System.out.println("Free is the biggest");
                    }
                } else if (one == free) {
                    if (one > two) {
                        System.out.println("One and Free are Equal and the biggest");
                    } else {
                        System.out.println("Two is the biggest");
                    }

                } else if (two == free) {
                    if (two > one) {
                        System.out.println("Two and Free are equal and the biggest");
                    } else {
                        System.out.println("One is the biggest");
                    }

                } else if (one > two && one > free) {
                    System.out.println("One is the biggest");
                } else if (two > free) {
                    System.out.println("Two is the biggest");
                } else {
                    System.out.println("Free is the biggest");
                }

            }
        }
    }