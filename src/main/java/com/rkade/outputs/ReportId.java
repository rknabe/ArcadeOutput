package com.rkade.outputs;

enum ReportId {
    ModeReportId(4);

    private final int id;

    ReportId(int id) {
        this.id = id;
    }

    public byte value() {
        return (byte) id;
    }
}
