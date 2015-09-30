package app.travelalarmclock.navigation.ya.locator.request;

import java.util.LinkedList;
import java.util.List;

/**
 * Класс XmlRequest содержит поля и XML структуры, необходимые
 * для формирования запроса к API Яндек Локатор.
 *
 * В классе определен метод экспортирования всех необходимых полей в XML структуру
 *
 * API-ключ: Получен 29.09.2015, валиден. Получен для сайта http://example.com/
 * <code>
 * APbFCVYBAAAAT7i3bgIAa3c9f50yGfLqZiI_kOo3YCHHQGoAAAAAAAAAAABlhxM4y7EZWdlRlftVK2MCUSMzxw==
 * </code>
 *
 * @author Бабанин Максим
 * @version 1.0
 */
public class XmlRequest implements XmlElement {

    private static final String keyAPI = "APbFCVYBAAAAT7i3bgIAa3c9f50yGfLqZiI_kOo3YCHHQGoAAAAAAAAAAABlhxM4y7EZWdlRlftVK2MCUSMzxw==";

    List<GsmCell> gsmCells = new LinkedList<GsmCell>();
    List<WifiNetwork> wifiNetworks = new LinkedList<WifiNetwork>();

    String address_v4;

    @Override
    public StringBuilder export2XML() {
        StringBuilder builder = new StringBuilder();

        builder.append("<common>");
        builder.append("<version>1.0</version>");
        builder.append("<api_key>").append(keyAPI).append("</api_key>");
        builder.append("</common>");

        builder.append("<gsm_cells>");
        for (GsmCell gsmCell : gsmCells) {
            builder.append(gsmCell.export2XML());
        }
        builder.append("</gsm_cells>");

        builder.append("<wifi_networks>");
        for (WifiNetwork wifiNetwork : wifiNetworks) {
            builder.append(wifiNetwork.export2XML());
        }
        builder.append("</wifi_networks>");

        builder.append("<ip>").append("<address_v4>").append(address_v4).append("</address_v4>").append("</ip>");

        StringBuilder builder2 = new StringBuilder();
        builder2.append("<ya_lbs_request>").append(builder).append("</ya_lbs_request>");

        return builder2;
    }
}
