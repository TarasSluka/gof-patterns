package patterns.structure.composite;

import patterns.structure.composite.document.*;

public class RunDocument {
    public static void main(String[] args) {
        IDocumentComponent document = new DocumentComponent("ComposableDocument");

        IDocumentComponent header = new HeaderDocumentComponent();
        IDocumentComponent body = new DocumentComponent("Body");

        document.addComponent(header);
        document.addComponent(body);

        IDocumentComponent customerDocumentSection = new CustomerDocumentComponent(41);

        IDocumentComponent orders = new DocumentComponent("Orders");
        IDocumentComponent order1 = new OrderDocumentComponent(0);
        IDocumentComponent order2 = new OrderDocumentComponent(1);

        orders.addComponent(order1);
        orders.addComponent(order2);

        body.addComponent(customerDocumentSection);
        body.addComponent(orders);

        System.out.println(document.gatherData());

    }
}
