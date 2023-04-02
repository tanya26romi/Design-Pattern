import CalendlyAPIs.GoogleMeetAPI;

public class GoogleMeetAdapter implements CalendlyAdapter {

    private GoogleMeetAPI googleMeetAPI;

    public GoogleMeetAdapter() {
        this.googleMeetAPI = new GoogleMeetAPI();
    }

    @Override
    public String getMeetingLink() {
        return googleMeetAPI.GoogleMeetLink();
    }

    @Override
    public String getMeetingCode() {
        return googleMeetAPI.GoogleMeetCode();
    }

    @Override
    public String getHelpLineContact() {
        return googleMeetAPI.GoogleMeetSupportTeam();
    }
}
