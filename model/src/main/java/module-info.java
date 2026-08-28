import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.plantuml.capability.PlantumlArrayResourceContentsHandlerCapabilityFactory;
import org.nasdanika.models.plantuml.capability.PlantumlEPackageResourceSetCapabilityFactory;
import org.nasdanika.models.plantuml.capability.PlantumlResourceContentsHandlerCapabilityFactory;
import org.nasdanika.models.plantuml.capability.PlantumlResourceFactoryCapabilityFactory;

module org.nasdanika.models.plantuml {
	
	exports org.nasdanika.models.plantuml;
	exports org.nasdanika.models.plantuml.impl;
	exports org.nasdanika.models.plantuml.util;
//	exports org.nasdanika.models.plantuml.loader;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.models.presentation;
		
	provides CapabilityFactory with 
		PlantumlEPackageResourceSetCapabilityFactory,
		PlantumlResourceFactoryCapabilityFactory,
		PlantumlResourceContentsHandlerCapabilityFactory,
		PlantumlArrayResourceContentsHandlerCapabilityFactory;
	
}