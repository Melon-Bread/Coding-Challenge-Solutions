class RaindropConverter {

    String convert(int number) {
        String rainDrops = "";

        for (int i = 1; i <= 7; i++) {
            int factorCheck = number % i;
            if (i == 3 && factorCheck == 0)
                rainDrops += "Pling";
            else if(i == 5 && factorCheck == 0)
                rainDrops += "Plang";
            else if(i == 7 && factorCheck == 0)
                rainDrops += "Plong";
        }

        if (rainDrops.equals(""))
            return Integer.toString(number);
        else
            return rainDrops;
    }

}
