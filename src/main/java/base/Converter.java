package base;

public class Converter {
    public String type;
    public int initialTemp;
    public int finalTemp;

    public void setType(String type) {
        this.type = type;
    }

    public void setInitialTemp(int initialTemp) {
        this.initialTemp = initialTemp;
    }

    public void setFinalTemp(int finalTemp) {
        this.finalTemp = finalTemp;
    }

    public String getType() {
        if(type.equals("C"))
            return "Fahrenheit";
        else
            return "Celsius";
    }

    public int getInitialTemp() {
        return initialTemp;
    }

    public void convert_FtoC()
    {
        int finalTemp = (initialTemp - 32) * 5/9;
        setFinalTemp(finalTemp);
     }
    public void convert_CtoF()
    {
        int finalTemp = (initialTemp * 9/5) + 32;
        setFinalTemp(finalTemp);
    }
}
