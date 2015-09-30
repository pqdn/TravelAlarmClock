package app.travelalarmclock.navigation;

/**
 * Класс WifiNetwork содержит поля, которые соответствуют данным предастовляемые
 * мобильным устройством о точки доступа Wi-Fi.
 *
 * В классе определен метод экспортирования свойств мобильной сети в XML структуру
 *
 * Основны поля класса WifiNetwork:
 * mac - MAC-адрес точки доступа;
 * signalStrength - идентификатор соты, к которой подключено мобильное устройство (CID, Cell identifier).
 *
 * @author Бабанин Максим
 * @version 1.0
 */
public class WifiNetwork implements XmlElement {
    private String mac;
    private int signalStrength;
    private int age;

    @Override
    public StringBuilder export2XML() {
        StringBuilder builder = new StringBuilder();

        builder.append("<mac>").append(mac).append("</mac>");
        builder.append("<signalstrength>").append(signalStrength).append("</signalstrength>");
        builder.append("<age>").append(age).append("</age>");

        StringBuilder builder2 = new StringBuilder();
        builder2.append("<network>").append(builder).append("</network>");

        return builder2;
    }
}
