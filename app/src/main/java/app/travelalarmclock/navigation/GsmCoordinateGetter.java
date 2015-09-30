package app.travelalarmclock.navigation;

/**
 * GsmCoordinateGetter определяет местоположение пользователя мобильного
 * устройства по ближайшим точкам доступа Wi-Fi и мобильным сотам,
 * без использования GPS или других систем спутниковой навигации.
 *
 * Класс основан на взаимодействии с API Яндекс Локатор (https://tech.yandex.ru/locator/)
 *
 * API-ключ: Получен 29.09.2015, валиден. Получен для сайта http://example.com/
 * <code>
 * APbFCVYBAAAAT7i3bgIAa3c9f50yGfLqZiI_kOo3YCHHQGoAAAAAAAAAAABlhxM4y7EZWdlRlftVK2MCUSMzxw==
 * </code>
 *
 * @see app.travelalarmclock.navigation.CoordinatePoint
 *
 * @inheritDoc
 *
 * @author Бабанин Максим
 * @version 1.0
 */
public class GsmCoordinateGetter extends AbstractCoordinateGetter {

    private static final String keyAPI = "APbFCVYBAAAAT7i3bgIAa3c9f50yGfLqZiI_kOo3YCHHQGoAAAAAAAAAAABlhxM4y7EZWdlRlftVK2MCUSMzxw==";

    @Override
    public boolean isWork() {
        return false;
    }

    @Override
    public void calculateCurrentPosition() {

    }
}
