package berlin.meshnet.cjdns.producer;

import com.squareup.otto.Bus;
import com.squareup.otto.Produce;

import berlin.meshnet.cjdns.model.Node;

/**
 * Abstract class that produces {@link berlin.meshnet.cjdns.model.Node.Me}.
 */
public abstract class MeProducer {

    public MeProducer(Bus bus) {
        bus.register(this);
    }

    /**
     * Produces {@link berlin.meshnet.cjdns.model.Node.Me} to any subscribers. Must be annotated with {@link @Produce}.
     *
     * @return A {@link berlin.meshnet.cjdns.model.Node.Me}.
     */
    public abstract Node.Me produce();

    /**
     * Mock implementation of a {@link berlin.meshnet.cjdns.producer.MeProducer}.
     */
    public static class Mock extends MeProducer {

        public Mock(Bus bus) {
            super(bus);
        }

        @Override
        @Produce
        public Node.Me produce() {
            return new Node.Me("Hyperborean", "Loremipsumdolorsitametpharetraeratestvivamusrisusi.k", "LoremipsumdolorsitametpraesentconsequatliberolacusmagnisEratgrav");
        }
    }
}
