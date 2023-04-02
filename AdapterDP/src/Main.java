import CalendlyAPIs.GoogleMeetAPI;

public class Main {
    public static void main(String[] args) {
        GoogleMeetAPI googleMeetAPI = new GoogleMeetAPI();
        Calendly calendly = new Calendly(googleMeetAPI);
        calendly.showMeetingDetails();
    }
}