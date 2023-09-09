package com.rkade.outputs;

public class Device {
    final static int UltimarcPacLedVendorId = 0XD209;
    final static int UltimarcPacLedProductId = 0x1500;
    private final String manufacturer;
    private final String productName;
    private final String serialNumber;
    private final int vendorId;
    private final int productId;

    Device(String manufacturer, String productName, String serialNumber, int vendorId, int productId) {
        this.manufacturer = manufacturer;
        this.productName = productName;
        this.serialNumber = serialNumber;
        this.vendorId = vendorId;
        this.productId = productId;
    }

    public boolean isPacLed() {
        return vendorId == UltimarcPacLedVendorId && productId == UltimarcPacLedProductId;
    }

    @Override
    public String toString() {
        return String.format("%s %s (#%s)", manufacturer, productName, serialNumber);
    }
}
