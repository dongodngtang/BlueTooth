package cn.com.jkcq.ble.mocks;

import cn.com.jkcq.ble.DeviceInfo;
import cn.com.jkcq.ble.DeviceScanner;
import cn.com.jkcq.ble.ScannerFactory;
import cn.com.jkcq.ble.mocks.MockDeviceAdapter;

/**
 * Created by edwardzhou on 2017/7/6.
 */
public class MockScannerFactory implements ScannerFactory {

    public DeviceScanner getScanner() {
        DeviceScanner scanner = new DeviceScanner();
        MockDeviceAdapter adapter = new MockDeviceAdapter();

        DeviceInfo deviceInfo = null;
        deviceInfo = new DeviceInfo();
        deviceInfo.deviceName = "Device A";
        adapter.getDeviceInfos().add(deviceInfo);

        scanner.setAdapter(adapter);
        return scanner;
    }
}
