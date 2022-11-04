public class VariablesTheme {
    public static void main(String[] args) {
        byte nuclear = 2;
        short priceSegment=32000;
        int price = 31599;
        long memoryD = 325058555904l;
        float frequence = 2.4f;
        double sysAs = 19044.2130d;
        char currency = 'R';
        boolean wrk = true;
        System.out.println("\n1. Создание переменных и вывод их значений на консоль\n"+
                "\nНоутбук: DEXP Aquilon" +
                "\nЦена:" + price +
                "\nЦеновая категория до: " + priceSegment + currency + "" +
                "\nКоличество ядер в процессоре: " + nuclear +
                "\nРазрядность CPU: " + frequence + "ГГц" +
                "\nСборка ОС: " + sysAs +
                "\nОбъём памяти диска D: " + memoryD);

        System.out.println("\n2. Расчёт стоимости товара со скидкой");
        int pencil = 100;
        int book = 200;
        int discountPercent = 11;
        int sumDiscount=(pencil+book) / 100 *discountPercent;
        System.out.println("\nСумма скидки: " + sumDiscount +
                "\nОбщая стоимость товаров со скидкой: " + (pencil + book - sumDiscount));

        System.out.println("\n3. Вывод на консоль слова JAVA\n" +
                "   J    a  v     v  a   \n" +
                "   J   a a  v   v  a a  \n" +
                "J  J  aaaaa  V V  aaaaa \n" +
                " JJ  a     a  V  a     a");

        System.out.println("\n4. Отображение min и max значений числовых типов данных");
        byte b=127;
        short s=32767;
        int i=2147483647;
        long l=9223372036854775807l;
        System.out.println("\nТип: byte" +
                "\nПервоначальное значение:" +b+
                "\nЗначение после инкремента: "+ ++b+
                "\nЗначение после декремента: "+ --b);
        System.out.println("\nТип: short"+"" +
                "\nПервоначальное значение: " + s+
                "\nЗначение после инкремента: " + ++s+
                "\nЗначение после декремента: " + --s);
        System.out.println("\nТип: int" +
                "\nПервоначальное значение: " + i +
                "\nЗначение после инкремента: " + ++i +
                "\nЗначение после декремента: " + --i
        );
        System.out.println("\nТип: long" +
                "\nПервоначальное значение: " + l +
                "\nЗначение после инкремента: " + ++l +
                "\nЗначение после декремента: "+ --l);

        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        System.out.println("\nI. C помощью третьей переменной");
        int temp = num2;
        num2 = num1;
        num1 = temp;
        System.out.println("\nПеременная num1 = " + num1 + "\nПеременная num2 = "+num2);

        System.out.println("\nII. C помощью арифметических операций");
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("\nПеременная num1 = " + num1 + "\nПеременная num2 = "+num2);

        System.out.println("\nIII.C помощью побитовой операции");
        num1 ^= num2;
        num2 = num2 ^ num1;
        num1 ^= num2;
        System.out.println("\nПеременная num1 = " + num1 + "\nПеременная num2 = "+num2);

        System.out.println("\n6. Вывод символов и их кодов");
        char ch1 = '#';
        char ch2 = '&';
        char ch3 = '@';
        char ch4 = '^';
        char ch5 = '_';
        System.out.println("\n35 "+ ch1+"\n38 "+ch2+"\n64 "+ch3+"\n94 "+ch4+"\n95 "+ch5);

        System.out.println("\n7. Вывод количества сотен, десятков и единиц числа");
        int srcNum =123;
        int dgtHundreds = srcNum / 100;
        int dgtTens = srcNum  / 10 % 10;
        int dgtUnits =  srcNum  % 10;
        System.out.println("\nЧисло " + srcNum  + " cодержит:" + "\n" + dgtHundreds + " сотню" +
                "\n" + dgtTens + " десятка" + "\n" + dgtUnits + " единицы");

        System.out.println("\n8. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char bracketOpen = '(';
        char bracketClose = ')';
        char underscore = '_';
        System.out.println( "\n    " + slash + backslash+
                            "\n   " + slash +"  " + backslash +
                            "\n  " + slash + underscore + bracketOpen + " " + bracketClose + backslash+
                            "\n " + slash + "      " + backslash+
                            "\n" + slash + underscore + underscore + underscore + underscore
                + slash + backslash + underscore + underscore + backslash);

        System.out.println("\n9. Вывод произведения и суммы цифр числа");
        srcNum =345;
        dgtHundreds = srcNum  / 100;
        dgtTens = srcNum  / 10 % 10;
        dgtUnits =  srcNum  % 10;
        System.out.println("сумма цифр числа 345 = " + (dgtHundreds + dgtTens + dgtUnits)+
                "\nих произведение = " + dgtHundreds * dgtTens * dgtUnits);

        System.out.println("\n10. Вывод времени в формате ЧЧ:ММ:СС");
        int timeLimit = 86399;
        int hours=timeLimit / 3600;
        int minutes=timeLimit % 3600 / 60;
        int seconds=timeLimit % 3600 % 60;
        System.out.println("\n" + hours + ":" + minutes + ":" + seconds);
    }
}
