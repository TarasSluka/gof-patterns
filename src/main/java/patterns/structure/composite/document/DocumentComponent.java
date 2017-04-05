package patterns.structure.composite.document;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DocumentComponent implements IDocumentComponent {
    private String name;
    private List<IDocumentComponent> documentComponents = new ArrayList<>();

    public DocumentComponent(String name) {
        this.name = name;
    }

    @Override
    public String gatherData() {
        StringBuilder builder = new StringBuilder();
        builder.append("<" + name + ">\n");
        for (IDocumentComponent component : documentComponents) {
//            s += "  " + component.gatherData();
            builder.append(component.gatherData());
        }
        builder.append("</" + name + ">\n");
        return builder.toString();
    }

    @Override
    public void addComponent(IDocumentComponent component) {
        documentComponents.add(component);
    }
}
