import CalendlyAPIs.ZoomAPI;

public class ZoomAdapter implements CalendlyAdapter {

    private ZoomAPI zoomAPI;

    public ZoomAdapter() {
        this.zoomAPI = new ZoomAPI();
    }

    @Override
    public String getMeetingLink() {
        return zoomAPI.zoomLink();
    }

    @Override
    public String getMeetingCode() {
        return zoomAPI.zoomCode();
    }

    @Override
    public String getHelpLineContact() {
        return zoomAPI.zoomTeam();
    }
}
