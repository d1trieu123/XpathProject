import java.util.List;
import java.util.ArrayList;
public class ProjectListenerImpl extends ProjectBaseListener{
    private String xmlFileName;
    private String fullFilter = "";
    private List<String> tagNames = new ArrayList<>();
    private List<String> relativePaths = new ArrayList<>();
    private String axis = "";
    private boolean firstPath = true;

    @Override
    public void enterXpath(ProjectParser.XpathContext ctx) {
        System.out.println("enterXpath " + ctx.getText());
    }
    @Override
    public void exitXpath(ProjectParser.XpathContext ctx) {
        System.out.println("exitXpath " + ctx.getText());
        
    }
    @Override
    public void enterAbsolutePath(ProjectParser.AbsolutePathContext ctx) {
        System.out.println("enterAbsolutePath "+ ctx.getText());
    }
    @Override
    public void exitAbsolutePath(ProjectParser.AbsolutePathContext ctx) {
        System.out.println("exitAbsolutePath " + ctx.getText());
    }
    @Override
    public void enterRelativePath(ProjectParser.RelativePathContext ctx) {
        
        System.out.println("enterRelativePath "+ ctx.getText());
        relativePaths.add(ctx.getText());
    }
    @Override
    public void enterFileName(ProjectParser.FileNameContext ctx) {
        xmlFileName = ctx.getText();
    }
    @Override
    public void enterTagName(ProjectParser.TagNameContext ctx) {
        if (firstPath) {
            firstPath = false;
            axis = ctx.getText();
        }
        tagNames.add(ctx.getText());
    }
    @Override
    public void enterPathFilter(ProjectParser.PathFilterContext ctx) {
        System.out.println("enterPathFilter "+ ctx.getText());
        
        
    }

    public String getXmlFileName() {
        return xmlFileName;
    }

    public List<String> getRelativePaths() {
        return relativePaths;
    }
    public String getAxis() {
        return axis;
    }
    public List<String> getTagNames() {
        return tagNames;
    }
    public String getPathFilters() {
        return fullFilter;
    }

}
