import CalendlyAPIs.MicrosoftTeamsAPI;

public class MicrosoftTeamsAdapter implements CalendlyAdapter {

    private MicrosoftTeamsAPI microsoftTeamsAPI;

    public MicrosoftTeamsAdapter() {
        this.microsoftTeamsAPI = new MicrosoftTeamsAPI();
    }

    @Override
    public String getMeetingLink() {
        return microsoftTeamsAPI.MicrosoftTeamsLink();
    }

    @Override
    public String getMeetingCode() {
        return microsoftTeamsAPI.MicrosoftTeamsCode();
    }

    @Override
    public String getHelpLineContact() {
        return microsoftTeamsAPI.MicrosoftTeamsSupportTeam();
    }
}
