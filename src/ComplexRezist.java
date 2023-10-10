public class ComplexRezist extends ComplexNumber { // класс потомок для ComplexNumber
    public double resistZ; // комплексное спротивление
    public double modProvod; // модуль проводимости
    public double argComlecsY; // аргумент комплексной проводимости

    public ComplexRezist(double resistZ, double modProvod, double argComlecsY) {
        super();
        this.resistZ = resistZ;
        this.modProvod = modProvod;
        this.argComlecsY = argComlecsY;
    }
    /* Метод weModAndArg расчитывает модуль комплексной проводимости и аргумент
    * Аргументы: сопротивление резистора(целая часть комплексного числа),
    индуктивность(мнимая часть коплексного числа),
    угловая частота*/
    public void weModAndArg() {
        // расчет комплексного сопротивления.
        resistZ  = realA1 + (mnimoeB1 * userNumb);
        // модуль проводимости.
        modProvod = 1 / Math.sqrt(Math.pow(realA1,2) + Math.pow(rezultMulty * mnimoeB1,2));
        // аргумент комплексной проводимости.
        argComlecsY = Math.atan(rezultMulty * mnimoeB1/realA1) ;
    }
}
