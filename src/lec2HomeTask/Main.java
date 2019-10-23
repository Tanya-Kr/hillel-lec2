package lec2HomeTask;

public class Main {

    public static void main(String[] args) {

//        Celsius to Fahrenheit
        double fahrenheit = 200;
        double celsius;
        double kelvin;

        celsius = 5.0/9.0 * (fahrenheit - 32);
        System.out.println("Celsius = " + celsius);

//        Fahrenheit to Celsius
        fahrenheit = (celsius * 9.0/5.0) + 32;
        System.out.println("Fahrenheit = " + fahrenheit);

//        Celsius to Kelvin
        kelvin = celsius + 273.16;
        System.out.println("Kelvin = " + kelvin);

//        Convert meters to inches. And reverse
        double meters = 100;
        double inches;
        inches = meters / 39.37;
        meters = 39.37 * inches;
        System.out.println("Inches = " + inches);
        System.out.println("Meters = " + meters);

//        Convert miles to kilometres. And reverse
        double miles = 100;
        double kilometres;
        kilometres = miles / 1.609;
        miles = 1.609 * kilometres;
        System.out.println("Kilometres = " + kilometres);
        System.out.println("Miles = " + miles);

//        Convert kilograms to pounds. And reverse
        double kilograms = 100;
        double pounds;
        pounds = kilograms / 2.2046;
        kilograms = 2.2046 * pounds;
        System.out.println("Pounds = " + pounds);
        System.out.println("Kilograms = " + kilograms);

//        Convert speed km/hr to mi/hr. And reverse
        double kmHr = 100;
        double miHr;
        miHr = kmHr / 0.6214;
        kmHr = 0.6214 * miHr;
        System.out.println("mi/hr = " + miHr);
        System.out.println("km/hr = " + kmHr);

//        Time calculations
//        1. convert time in seconds to days, hours, min and seconds or reverse
        int sec1 = 500000;
        int seconds = sec1 % 60;
        int min1 = sec1 / 60;
        int minutes = min1 % 60;
        int h1 = min1 / 60;
        int hours = h1 % 60;
        int days = h1 / 24;

        System.out.println("days " + days + " hours " + hours + " min " + minutes + " seconds " + seconds);

        int reversToSec = (days * 24 * 60 + hours * 60 + minutes) * 60 + seconds;

        System.out.println(reversToSec);

//        2. calculate the number seconds, minutes, hours, days, weeks, years you’ve been live
        int yearOfBirth = 1987;
        int yearToday = 2019;
        int dayOfBirth = 225;
        int dayToday = 296;
        int hourOfBirth = 9;
        int hourToday = 19;
        int minutesOfBirth = 2;
        int minutesToday = 32;
        int secondsOfBirth = 0;
        int secondsToday = 50;

//        First variant
        int yearsLive = yearToday - yearOfBirth;
        int daysLive = (dayToday - dayOfBirth) % 7;
        int weeksLive = (dayToday - dayOfBirth) / 7;
        int hoursLive = hourToday - hourOfBirth;
        int minutesLive = minutesToday - minutesOfBirth;
        int secondsLive = secondsToday - secondsOfBirth;

        System.out.println("I live " + yearsLive + " years " + weeksLive + " weeks " + daysLive + " days " + hoursLive + " hours " + minutesLive + " minutes " + secondsLive + " seconds");

//        Second variant
        weeksLive = yearsLive * 365 / 7 + weeksLive;
        daysLive = yearsLive * 365 + (dayToday - dayOfBirth);
        hoursLive = daysLive * 24 + hourToday;
        minutesLive = hoursLive * 60 + minutesToday;
        secondsLive = minutesLive * 60 + secondsToday;

        System.out.println("I live " + yearsLive + " years " + weeksLive + " weeks " + daysLive + " days " + hoursLive + " hours " + minutesLive + " minutes " + secondsLive + " seconds");

//        Marks conversions
        int totalTest = 10;
        int markedTest = 8;
        int result;

        result = markedTest * 100 / totalTest;
        System.out.println("Total in percents - " + result + "%");

//        Multiple choice test score
        int totalTest2 = 10;
        int passedTest = 3;
        int failedTest = 7;
        int resultPassed;
        int resultFailed;

        resultPassed = passedTest * 100 / totalTest2;
        resultFailed = failedTest * 100 / totalTest2;
        System.out.println("Total passed test in percents - " + resultPassed + "%");
        System.out.println("Total failed test in percents - " + resultFailed + "%");

        //        Math.abs()   // Returns the absolute value (module)
        //        Math.sin()   // Returns the trigonometric sine of an angle
        //        Math.asin()  // Returns the arc cosine of a value
        //        Math.cos()   // Returns the trigonometric cosine of an angle
        //        Math.acos()  // Returns the arc cosine of a value
        //        Math.tan()   // Returns the trigonometric tangent of an angle
        //        Math.atan()  // Returns the arc tangent of a value
        //        Math.PI      // PI number
        //        Math.E       // The base of the natural logarithms
        //        Math.sqrt()  // square root
        //        Math.cbrt()  // cube root
        //        Math.log()   // Returns the natural logarithm
        //        Math.log10() // Returns the base 10 logarithm
        //        Math.exp()   // Exponent
        //        Math.pow()   // Returns the value of the first argument raised to the power of the second argument

        double x10 = 25;
        double result10 = 1.0 / 3.0 * Math.sqrt(Math.abs(Math.sin(x10))) * Math.cbrt(Math.pow(Math.E, 0.12 * x10));
        System.out.println("Результат функции №10 = " + result10);

        double x11 = 25;
        double result11 = 2 * Math.PI * x11 - Math.abs(Math.sin(Math.sqrt(10.5 * x11))) * 1.0 / (Math.cbrt(Math.pow(x11,2)) + 1.0 / 7.0);
        System.out.println("Результат функции №11 = " + result11);

        double x12 = 25;
        double result12 = Math.log(Math.sqrt(Math.abs(2 - x12)) + 1.2) * 1 / (2 + Math.pow(Math.E, -x12)) + Math.cbrt(2 / x12);
        System.out.println("Результат функции №12 = " + result12);

        double x13 = 25;
        double result13 = Math.pow(Math.pow(Math.E, -2 + x13), 1.0/5) * 1 / Math.sqrt(Math.pow(x13, 2) + Math.pow(x13, 4) + Math.log(Math.abs(x13 - 3.14)));
        System.out.println("Результат функции №13 = " + result13);

        double x14 = 5;
        double result14 = (Math.sqrt(Math.pow(Math.sin(x14 / 2), 3)) + Math.cbrt(Math.pow(Math.E, 1.3 * x14) + Math.pow(Math.E, -1.3 * x14))) * 1 / Math.abs(x14 + 5 / 2);
        System.out.println("Результат функции №14 = " + result14);

        double x15 = 5;
        double result15 = (Math.abs(x15 * Math.log(x15) - 4) * Math.sqrt(x15)) * 1 / Math.pow(Math.pow(Math.E, 4*x15 -1), 1.0/5);
        System.out.println("Результат функции №15 = " + result15);

        double x16 = 5;
        double result16 = Math.cbrt(Math.pow(Math.E, 2 * x16) * Math.sqrt(x16) - (x16 + 1.0 / 3.0) / x16) * Math.abs(Math.cos(2.5 * x16));
        System.out.println("Результат функции №16 = " + result16);
    }
}
