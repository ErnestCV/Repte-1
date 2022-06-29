public static boolean checkCoupon(String enteredCode, String correctCode, String currentDate, String expirationDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate current = LocalDate.parse(currentDate, formatter);
        LocalDate expiration = LocalDate.parse(expirationDate, formatter);
        return enteredCode.equals(correctCode) && current.compareTo(expiration) <= 0;
        }