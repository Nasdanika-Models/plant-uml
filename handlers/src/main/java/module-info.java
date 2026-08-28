import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.plantuml.handlers.PlantumlToEcoreArrayResourceContentsHandlerCapabilityFactory;
import org.nasdanika.models.plantuml.handlers.PlantumlToEcoreResourceContentsHandlerCapabilityFactory;

module org.nasdanika.models.plantuml.handlers {
	
	exports org.nasdanika.models.plantuml.handlers;
	opens org.nasdanika.models.plantuml.handlers to org.nasdanika.common; // For transformer
		
	requires transitive org.nasdanika.models.plantuml;
	requires org.apache.commons.lang3;
	requires org.eclipse.emf.ecore;
	
	provides CapabilityFactory with 
		PlantumlToEcoreArrayResourceContentsHandlerCapabilityFactory,
		PlantumlToEcoreResourceContentsHandlerCapabilityFactory;
	
}