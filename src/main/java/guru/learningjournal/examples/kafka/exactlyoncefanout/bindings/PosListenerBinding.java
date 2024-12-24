/**
 * 
 */
package guru.learningjournal.examples.kafka.exactlyoncefanout.bindings;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.cloud.stream.annotation.Input;

import guru.learningjournal.examples.kafka.model.PosInvoice;

/**
 * 
 */
public interface PosListenerBinding {

	@Input("pos-input-channel")
	KStream<String, PosInvoice> posInputStream();

}
