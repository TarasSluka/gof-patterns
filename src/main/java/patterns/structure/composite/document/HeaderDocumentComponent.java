package patterns.structure.composite.document;

import java.util.Date;

public class HeaderDocumentComponent implements IDocumentComponent {
    @Override
    public String gatherData() {
        return "\t<header>" + "\n \t\t<MessageTime>" + new Date().toString() + "</MessageTime>" + "\n" + "\t</header>\n";
    }

    @Override
    public void addComponent(IDocumentComponent component) {
        System.out.println("Cannot add to leaf...");
    }
}
