package patterns.structure.composite.document;

import lombok.Data;

@Data
public class CustomerDocumentComponent implements IDocumentComponent {
    private int customerIdToGatherData;

    public CustomerDocumentComponent(int customerIdToGatherData) {
        this.customerIdToGatherData = customerIdToGatherData;
    }

    @Override
    public String gatherData() {

        String customerData;
        switch (customerIdToGatherData) {
            case 41:
                customerData = "Andriy Buday";
                break;
            case 42:
                customerData = "Taras Sluka";
                break;
            default:
                customerData = "Someone else";
                break;
        }

        return "\t<Customer>" + customerData + "</Customer>\n";
    }

    @Override
    public void addComponent(IDocumentComponent component) {
        System.out.println("Cannot add to leaf...");
    }
}
