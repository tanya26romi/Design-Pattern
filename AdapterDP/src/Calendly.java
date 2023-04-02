import CalendlyAPIs.GoogleMeetAPI;

public class Calendly {


    private CalendlyAdapter calendlyAdapter;
    private GoogleMeetAPI googleMeetAPI;

    public Calendly(Object obj) {
        this.calendlyAdapter = (CalendlyAdapter) obj;
    }

    void showMeetingDetails(){
        String meetLink = calendlyAdapter.getMeetingLink();
        String meetingCode = calendlyAdapter.getMeetingCode();

        System.out.println("Your Meeting Link : "+meetLink+" \n"+"Your Meeting Code : "+meetingCode);
    }

}
