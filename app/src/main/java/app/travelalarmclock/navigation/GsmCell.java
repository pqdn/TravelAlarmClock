package app.travelalarmclock.navigation;

/**
 * Класс GsmCell содержит поля, которые соответствуют данным предастовляемые
 * мобильным устройством о сети мобильной связи.
 *
 * В классе определен метод экспортирования свойств мобильной сети в XML структуру
 *
 * Основны поля класса GsmCell:
 * countryCode - код страны (MCC, Mobile Country Code);
 * operatorId - код сети мобильной связи (MNC, Mobile Network Code);
 * cellId - код местоположения (LAC, Location area code);
 * signalStrength - идентификатор соты, к которой подключено мобильное устройство (CID, Cell identifier);
 * lac - уровень сигнала соты.
 *
 * @author Бабанин Максим
 * @version 1.0
 */
public class GsmCell implements XmlElement{
    private int countryCode;
    private int operatorId;
    private int cellId;
    private int signalStrength;
    private int lac;
    private int age;

    @Override
    public StringBuilder export2XML() {
        StringBuilder builder = new StringBuilder();

        builder.append("<countrycode>").append(countryCode).append("</countrycode>");
        builder.append("<operatorid>").append(operatorId).append("</operatorid>");
        builder.append("<cellid>").append(cellId).append("</cellid>");
        builder.append("<signalstrength>").append(signalStrength).append("</signalstrength>");
        builder.append("<lac>").append(lac).append("</lac>");
        builder.append("<age>").append(age).append("</age>");

        StringBuilder builder2 = new StringBuilder();
        builder2.append("<cell>").append(builder).append("</cell>");

        return builder2;
    }
}
