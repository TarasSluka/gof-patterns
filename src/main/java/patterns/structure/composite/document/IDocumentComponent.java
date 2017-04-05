package patterns.structure.composite.document;

public interface IDocumentComponent {
    String gatherData();

    void addComponent(IDocumentComponent component);
}
