package patterns.structure.composite.document;

import lombok.Data;

@Data
public class OrderDocumentComponent implements IDocumentComponent {
    private int orderIdToGatherData;

    public OrderDocumentComponent(int orderIdToGatherData) {
        this.orderIdToGatherData = orderIdToGatherData;
    }

    @Override
    public String gatherData() {
        String orderData = "\t\t<order>";
        switch (orderIdToGatherData) {
            case 0:
                orderData += "Kindle;Book1;Book2";
                break;
            default:
                orderData += "Phone;Cable;Headset";
                break;
        }
        orderData += "</order>\n";
        return orderData;
    }

    @Override
    public void addComponent(IDocumentComponent component) {
        System.out.println("Cannot add to leaf...");
    }
}
