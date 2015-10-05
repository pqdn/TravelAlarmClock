package app.travelalarmclock.navigation;

/**
 * GsmCoordinateGetter определяет местоположение пользователя мобильного
 * устройства по ближайшим точкам доступа Wi-Fi и мобильным сотам,
 * без использования GPS или других систем спутниковой навигации.
 *
 * Класс основан на взаимодействии с API Яндекс Локатор (https://tech.yandex.ru/locator/)
 *
 * @see CoordinatePoint
 *
 * @inheritDoc
 *
 * @author Бабанин Максим
 * @version 1.0
 */
public class GsmCoordinateGetter extends AbstractCoordinateGetter {

    // ererehfgdut7o9p

    @Override
    public boolean isWork() {
        return false;
    }

    @Override
    public void calculateCurrentPosition() {

    }
}
