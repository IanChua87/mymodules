package sg.edu.rp.c346.id22024905.mymodules;


public class Module{
    private String moduleCode;
    private String moduleName;
    private int moduleYear;
    private int moduleSem;
    private int moduleCredit;
    private String Venue;

    public Module(String moduleCode, String moduleName, int moduleYear, int moduleSem, int moduleCredit, String Venue) {
        this.moduleCode = moduleCode;
        this.moduleName = moduleName;
        this.moduleYear = moduleYear;
        this.moduleSem = moduleSem;
        this.moduleCredit = moduleCredit;
        this.Venue = Venue;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public String getModuleName() {
        return moduleName;
    }

    public int getAcademicYear() {
        return moduleYear;
    }

    public int getModuleSem() {
        return moduleSem;
    }

    public int getModuleCredit() {
        return moduleCredit;
    }

    public String getVenue() {
        return Venue;
    }
}

