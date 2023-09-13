public class ComplexNumber {
    public double realA1; // реальное значение
    public double mnimoeB1; // мнимое значение
    public double userNumb; // число от пользователя

    public ComplexNumber() {
        super();
        this.realA1 = realA1;
        this.mnimoeB1 = mnimoeB1;
        this.userNumb = userNumb;
    }
    /* метод ofMultiComplexOfNum
                считает произведение мнимого числа на чило от пользователя */
    public void ofMultiComplexOfNum() {
        String str = (realA1 * userNumb + " + " + mnimoeB1 * userNumb);
    }
    public void argumentCompleksNumb () {
        double argumentInRadians = (Math.atan2(realA1,mnimoeB1) * Math.PI)/180;
    }

}


