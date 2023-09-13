public class ComplexRezist extends ComplexNumber { // класс потомок для ComplexNumber
    public double resistorResistance; // сопротивление резистора целая часть
    public double valueInductance; // индуктивность мнимая часть
    public double angylarFreq; // угловая частота
    public ComplexRezist() {
        super();
        this.realA1 = resistorResistance;
        this.mnimoeB1 = valueInductance;
        this.userNumb = angylarFreq;
    }
    /* метод weComplexResist расчитывает комплексное сопротивление.
    * Аргументы: сопротивление резистора(целая часть комплексного числа),
               индуктивность(мнимая часть коплексного числа),
               угловая частота */
    public void weComplexResist() {
        double resistZ = resistorResistance + (valueInductance * angylarFreq);
        System.out.println(resistZ);
    }
    /* Метод weModAndArg расчитывает модуль комплексной проводимости и аргумент
    * Аргументы: сопротивление резистора(целая часть комплексного числа),
               индуктивность(мнимая часть коплексного числа),
               угловая частота*/
    public void weModAndArg() {
        double wL = angylarFreq * valueInductance;
        double modProvod = 1 / Math.sqrt(Math.pow(resistorResistance,2) + Math.pow(wL,2)); // модуль проводимости
        // double Y = angylarFreq * valueInductance/resistorResistance;
        double argComlecsY = Math.atan(angylarFreq * valueInductance/resistorResistance) ; // аргумент комплексной проводимости
        System.out.print("Модуль проводимости: " + modProvod + "\n" +
                "Аргумент комплексной проводимости: " + argComlecsY);
    }






}
