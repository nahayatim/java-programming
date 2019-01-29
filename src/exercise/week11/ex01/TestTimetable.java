package exercise.week11.ex01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.temporal.ChronoUnit;


public class TestTimetable {


    @Test
    void wakeUpTime() {
        //start the timetable counting from the 13th of March of 2003 at 10 o’clock in the morning.
        //He wakes up and stops his alarm. What time is it displayed in the format Hours:Minutes?
        //What day of the week is this?
        LocalDate startDay = LocalDate.parse("2003-03-13");
        LocalTime startTime = LocalTime.parse("10:00:00");
        LocalDateTime startDate = LocalDateTime.of(startDay, startTime);
        DayOfWeek dayOfWeek = startDay.getDayOfWeek();
        System.out.println("\nDay of week: " + dayOfWeek);
        System.out.println("start time: " + startTime);
        DayOfWeek day = DayOfWeek.THURSDAY;
        Assertions.assertEquals(day, dayOfWeek);

        //It takes him 37 minutes and 21 seconds to get ready to be picked up by the limousine. What
        //time is it displayed in the format Hours:Minutes:Seconds?
        LocalDateTime pickedUpDateTime = startDate
                .plusMinutes(37)
                .plusSeconds(21);
        System.out.println("\nPicked up time: " + pickedUpDateTime.toLocalTime());

        //The limousine arrives at the airport one and a half hours later because of traffic jam. At what
        //time do they arrive at the airport?
        LocalDateTime airportArrival = pickedUpDateTime
                .plusHours(1)
                .plusMinutes(30);
        System.out.println("\narrive time to airport: " + airportArrival.toLocalTime());

        //Mugatu checks the departure time of his flight and it says 11:04 am. Is this time before the
        //current one? Did he miss his flight?
        LocalTime departureTime = LocalTime.parse("11:04");
        boolean isBefore = departureTime.isBefore(airportArrival.toLocalTime());
        System.out.println("\nis before: " + isBefore);
        if (isBefore) {
            System.out.println("he miss his timeInLondon");
        }

        //He asks at the info desk when the next flight is. The next flight will be at 18:45. How many hours
        //and minutes does he have to wait?
        LocalDateTime nextFlight = LocalDateTime.of(startDay, LocalTime.parse("18:45"));
        Duration waitingTimeForNextFlight = Duration.between(nextFlight, airportArrival);
        System.out.println("\nHe have to wait: " + waitingTimeForNextFlight);

        //He finally gets in the plane and departs at 18:45 from London. It takes him 11 hours and 50 minutes
        //to land in Tokyo. What time is it in London? What date and time is it in Tokyo?
        LocalDateTime timeInLondon = nextFlight.plusHours(11).plusMinutes(50);
        System.out.println("\nLondon time: " + timeInLondon.toLocalTime());

        ZoneId london = ZoneId.of("Europe/London");
        ZonedDateTime inLondon = timeInLondon.atZone(london);

        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        ZonedDateTime timeInTokyo = inLondon.withZoneSameInstant(tokyoZone);
        LocalDateTime tokyoLocalDateTime = timeInTokyo.toLocalDateTime();
        System.out.println("\nTime in Tokyo: " + tokyoLocalDateTime);

        //After two hours he manages to arrive to his hotel in Tokyo and sleeps for 9 hours straight until he wakes
        //up abruptly. At what time is his manager hitting him in the head with the pillows to wake him up?
        LocalDateTime wakeupTime = tokyoLocalDateTime.plusHours(11);
        System.out.println("\nHis manager wake him up at: " + wakeupTime.toLocalTime());

        //They tell him that the advertisement shooting starts in 47 minutes. When is that exactly?
        LocalDateTime advertisementTime = wakeupTime.plusMinutes(47);
        System.out.println("\nAdvertisement shooting starts at: " + advertisementTime.toLocalTime());

        //They throw him with his clothes and make up set into the limousine and rush towards the studio arriving just
        // in time. However, Mugatu received a private phone call from his assistant Katinka that lasted 546 seconds.
        //How much time in minutes and seconds did Mugatu have to get prepared in the limousine?
        Duration prepatedTime = Duration.ofMinutes(47).minusSeconds(546);
        System.out.println("\nMaguta have to prepared in: " + prepatedTime);

        //After 7 hours the shooting is over. Lunch time is round 13:00 and dinner time is around 20:00. Should Mugatu
        //have lunch or dinner?
        LocalDateTime afterShooting = advertisementTime.plusHours(7);
        System.out.println("\nAfter shooting time: " + afterShooting.toLocalTime());


        LocalTime lunchTime = LocalTime.parse("13:00");


        boolean isAfter = afterShooting.toLocalTime().isAfter(lunchTime);
        if (isAfter) {
            System.out.println("He should to have dinner.");
        } else {
            System.out.println("\nHe should to have lunch.");
        }

        //After three days and 12 hours, Mugatu finally takes his flight back to London. After the 11 hours and
        //50 minutes of flight back, he lands in London. What time is it in Tokyo? What date is it in London?

        LocalDateTime tokyoTime = afterShooting
                .plusDays(3)
                .plusHours(12)
                .plusHours(11)
                .plusMinutes(50);
        System.out.println("\nTokyo time after back flight: " + tokyoTime.toLocalTime());

        //ZoneId london = ZoneId.of("Europe/London");
        ZonedDateTime inTokyo = tokyoTime.atZone(tokyoZone);

        // ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        ZonedDateTime backtimeInLondon = inTokyo.withZoneSameInstant(london);
        LocalDateTime londonLocalDateTime = backtimeInLondon.toLocalDateTime();
        System.out.println("\nDate in London: " + londonLocalDateTime);

        //At the airport he gets surrounded by 173 fans and it takes him 12 seconds to give each one of them an
        //autograph. How many hours and minutes did he spend dispatching his fans?
        int autographyTime = 173 * 12;
        LocalDateTime timeAfterAutography = londonLocalDateTime.plusSeconds(autographyTime);
        Duration spendingTimeWithFans = Duration.between(timeAfterAutography.toLocalTime(), londonLocalDateTime.toLocalTime());
        System.out.println("\nhe spend " + spendingTimeWithFans + " with his fans.");

        //Mugatu arrives at his hotel one hour later and decides to go to the sauna. This one is only open from 9:00 to 14:00
        // and from 16:00 to 20:00. Can he at least manage to stay in the sauna for half an hour?
        LocalDateTime arrivedHotel = timeAfterAutography.plusHours(1);
        System.out.println("\nhe arrived hotel at: " + arrivedHotel.toLocalTime());

        LocalTime openingTimeInMorning = LocalTime.parse("09:00");
        LocalTime closingTimeInMorning = LocalTime.parse("14:00");
        LocalTime openingTimeInAfternoon = LocalTime.parse("16:00");
        LocalTime closingTimeInAfternoon = LocalTime.parse("20:00");

        if (arrivedHotel.toLocalTime().isAfter(openingTimeInMorning)) {

            if (arrivedHotel.toLocalTime().plusMinutes(30).isBefore(closingTimeInMorning)) {
                System.out.println("He can use sauna in the morning.");
            } else {
                System.out.println("He can´t use sauna in the morning.");
            }
        }

        if (arrivedHotel.toLocalTime().isAfter(openingTimeInAfternoon)) {

            if (arrivedHotel.toLocalTime().plusMinutes(30).isBefore(closingTimeInAfternoon)) {
                System.out.println("He can use sauna in the afternoon.");
            }
        } else {
            System.out.println("\nHe can´t use sauna.");
        }

        //The special one-hour massage offered by the hotel is on Thursdays and Sundays, and if it is a leap year,
        //also on Saturdays. Can Mugatu be lucky enough to get one of those?
        boolean isLeapYaer = arrivedHotel.toLocalDate().isLeapYear();
        DayOfWeek dayOfWeek1 = arrivedHotel.getDayOfWeek();

        if (dayOfWeek1.equals("THURSDAY") || dayOfWeek1.equals("SUNDAY")) {
            System.out.println("He can use massage offered by the hotel.");
        } else {
            System.out.println("He cant´t use massage.");
        }

        if ((isLeapYaer) && dayOfWeek1.equals("THURSDAY") || dayOfWeek1.equals("SUNDAY") || dayOfWeek1.equals("SATURDAY")) {

            System.out.println("He can use masaage.");
        } else {
            System.out.println("He can´t use massage.");
        }

        //One week later, the advertisement is broadcasted at 18:30 in Tokyo’s time. When does Mugatu have to turn on
        //the TV in London to be able to see it?
        LocalDateTime londonAfterOneWeek = arrivedHotel
                .plusWeeks(1);
        System.out.println("\nA week later in london:" + londonAfterOneWeek);
        ZonedDateTime aWeekLaterLondon = londonAfterOneWeek.atZone(london);
        ZonedDateTime aWeekLaterTokyo = aWeekLaterLondon.withZoneSameInstant(tokyoZone);
        LocalDateTime advertisementTimeInTokyo = aWeekLaterTokyo.toLocalDateTime();
        System.out.println("A week later in Tokyo: " + aWeekLaterTokyo);
        LocalDateTime advertisementStartLondon = LocalDateTime.of(advertisementTimeInTokyo.toLocalDate()
                , LocalTime.of(18, 30));

        System.out.println("\nhe should to turn on the TV at: " + advertisementStartLondon.toLocalTime());

        //The advertisement lasts 29 seconds. Fifteen seconds afterwards his manager calls him on the phone to congratulate
        // him for his popularity increase. At what time exactly does this happen? What day of the week is this?
        LocalDateTime managerCallTime = advertisementStartLondon
                .plusSeconds(29)
                .plusSeconds(15);
        System.out.println("\nhis manager called at: " + managerCallTime.toLocalTime() + " Uhr.it was " + managerCallTime.getDayOfWeek());

        //How many days have passed by since he woke up at the beginning of the timetable?
        Period periodSinceBeginning = Period.between(startDay, managerCallTime.toLocalDate());
        int daysSinceBeginning = periodSinceBeginning.getDays();
        System.out.println("\nDays since beginning: " + daysSinceBeginning);

        //Mugatu gets paid for the timetable rights 1.39 Euro per minute of his privacy since the beginning of the
        //timetable until the end, except for the time of the private call that Mugatu had with Katinka. How much
        //is he paid for this reportage?

        long totalMinutesSpent = LocalDateTime.of(startDay, startTime).until(managerCallTime
                        .minusSeconds(546)
                , ChronoUnit.MINUTES);
        int moneyToPay = (int) (totalMinutesSpent * 1.39);
        System.out.println("\nTotal Money to pay: " + moneyToPay + "€");


    }


}

