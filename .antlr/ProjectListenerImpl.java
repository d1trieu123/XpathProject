import java.util.List;
import java.util.ArrayList;
public class ProjectListenerImpl extends ProjectBaseListener{
    private String xmlFileName;
    private String fullFilter = "";
    private List<String> tagNames = new ArrayList<>();
    private String relativePath = "";
    private boolean relativePathBool = true;
    private String axis = "";
    private boolean firstPath = true;
    private String firstFilter = "";
    private boolean firstFilterBool = true;
    
    @Override public void enterDescendOrSelf(ProjectParser.DescendOrSelfContext ctx) {
        if (firstFilterBool) {
            firstFilter = ctx.getText();
            firstFilterBool = false;
        }
    }
    @Override public void enterChildNode(ProjectParser.ChildNodeContext ctx) {
        if(firstFilterBool) {
            firstFilter = ctx.getText();
            firstFilterBool = false;
        }
    }

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
        if(relativePathBool) {
            relativePath = ctx.getText();
            relativePathBool = false;
        }
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

    public String getRelativePath() {
        return relativePath;
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
    public String getFirstFilter() {
        return firstFilter;
    }

}
