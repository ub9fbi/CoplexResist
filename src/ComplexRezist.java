public class ComplexRezist extends ComplexNumber { // класс потомок для ComplexNumber
    public double resistZ; // комплексное спротивление
    public double modProvod; // модуль проводимости
    public double argComlecsY; // аргумент комплексной проводимости

    /* метод weComplexResist расчитывает комплексное сопротивление.
    Аргументы: сопротивление резистора(целая часть комплексного числа),
    индуктивность(мнимая часть коплексного числа), угловая частота */
    public void weComplexResist() {
        resistZ  = realA1 + (mnimoeB1 * userNumb);
    }
    /* Метод weModAndArg расчитывает модуль комплексной проводимости и аргумент
    * Аргументы: сопротивление резистора(целая часть комплексного числа),
    индуктивность(мнимая часть коплексного числа),
    угловая частота*/
    public void weModAndArg() {
        // модуль проводимости
        modProvod = 1 / Math.sqrt(Math.pow(realA1,2) + Math.pow(rezultMulty * mnimoeB1,2));
        // аргумент комплексной проводимости
        argComlecsY = Math.atan(rezultMulty * mnimoeB1/realA1) ;
    }
}
