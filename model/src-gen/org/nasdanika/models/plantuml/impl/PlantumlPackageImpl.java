/**
 */
package org.nasdanika.models.plantuml.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.diagram.DiagramPackage;

import org.nasdanika.models.nxcore.NxcorePackage;

import org.nasdanika.models.plantuml.DiagramKind;
import org.nasdanika.models.plantuml.PlantUmlDiagram;
import org.nasdanika.models.plantuml.PlantUmlDocument;
import org.nasdanika.models.plantuml.PlantumlFactory;
import org.nasdanika.models.plantuml.PlantumlPackage;

import org.nasdanika.models.presentation.PresentationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlantumlPackageImpl extends EPackageImpl implements PlantumlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plantUmlDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plantUmlDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum diagramKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.plantuml.PlantumlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PlantumlPackageImpl() {
		super(eNS_URI, PlantumlFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PlantumlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PlantumlPackage init() {
		if (isInited) return (PlantumlPackage)EPackage.Registry.INSTANCE.getEPackage(PlantumlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPlantumlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PlantumlPackageImpl thePlantumlPackage = registeredPlantumlPackage instanceof PlantumlPackageImpl ? (PlantumlPackageImpl)registeredPlantumlPackage : new PlantumlPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		PresentationPackage.eINSTANCE.eClass();
		NxcorePackage.eINSTANCE.eClass();
		DiagramPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePlantumlPackage.createPackageContents();

		// Initialize created meta-data
		thePlantumlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePlantumlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PlantumlPackage.eNS_URI, thePlantumlPackage);
		return thePlantumlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlantUmlDocument() {
		return plantUmlDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlantUmlDiagram() {
		return plantUmlDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlantUmlDiagram_Kind() {
		return (EAttribute)plantUmlDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlantUmlDiagram_Source() {
		return (EAttribute)plantUmlDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlantUmlDiagram_BlockName() {
		return (EAttribute)plantUmlDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlantUmlDiagram_Parsed() {
		return (EAttribute)plantUmlDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDiagramKind() {
		return diagramKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlantumlFactory getPlantumlFactory() {
		return (PlantumlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		plantUmlDocumentEClass = createEClass(PLANT_UML_DOCUMENT);

		plantUmlDiagramEClass = createEClass(PLANT_UML_DIAGRAM);
		createEAttribute(plantUmlDiagramEClass, PLANT_UML_DIAGRAM__KIND);
		createEAttribute(plantUmlDiagramEClass, PLANT_UML_DIAGRAM__SOURCE);
		createEAttribute(plantUmlDiagramEClass, PLANT_UML_DIAGRAM__BLOCK_NAME);
		createEAttribute(plantUmlDiagramEClass, PLANT_UML_DIAGRAM__PARSED);

		// Create enums
		diagramKindEEnum = createEEnum(DIAGRAM_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PresentationPackage thePresentationPackage = (PresentationPackage)EPackage.Registry.INSTANCE.getEPackage(PresentationPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		plantUmlDocumentEClass.getESuperTypes().add(thePresentationPackage.getPresentation());
		plantUmlDiagramEClass.getESuperTypes().add(thePresentationPackage.getSlide());

		// Initialize classes, features, and operations; add parameters
		initEClass(plantUmlDocumentEClass, PlantUmlDocument.class, "PlantUmlDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(plantUmlDiagramEClass, PlantUmlDiagram.class, "PlantUmlDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlantUmlDiagram_Kind(), this.getDiagramKind(), "kind", null, 0, 1, PlantUmlDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlantUmlDiagram_Source(), theEcorePackage.getEString(), "source", null, 0, 1, PlantUmlDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlantUmlDiagram_BlockName(), theEcorePackage.getEString(), "blockName", null, 0, 1, PlantUmlDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlantUmlDiagram_Parsed(), theEcorePackage.getEBoolean(), "parsed", null, 0, 1, PlantUmlDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(diagramKindEEnum, DiagramKind.class, "DiagramKind");
		addEEnumLiteral(diagramKindEEnum, DiagramKind.SEQUENCE);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.CLASS);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.OBJECT);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.USE_CASE);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.ACTIVITY);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.COMPONENT);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.DEPLOYMENT);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.STATE);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.TIMING);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.ER);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.GANTT);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.MINDMAP);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.WBS);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.JSON);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.YAML);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.SALT);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.NETWORK);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.OTHER);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "21.0",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.models"
		   });
		addAnnotation
		  (plantUmlDiagramEClass,
		   source,
		   new String[] {
			   "documentation", " One @startuml ... @enduml block."
		   });
		addAnnotation
		  (getPlantUmlDiagram_Source(),
		   source,
		   new String[] {
			   "documentation", "Full source text of the block (without the @startuml/@enduml delimiters) \ufffd\nalways preserved; save re-emits it verbatim when structure was not modified."
		   });
		addAnnotation
		  (getPlantUmlDiagram_BlockName(),
		   source,
		   new String[] {
			   "documentation", " Value after @startuml, if any (block name)."
		   });
		addAnnotation
		  (getPlantUmlDiagram_Parsed(),
		   source,
		   new String[] {
			   "documentation", "Structural view (participants/classes/components as diagram nodes,\narrows as connections) populated by kind-specific parsers where implemented;\ninherited children/connections from Diagram are used for this.\n\'parsed\' indicates whether the structural view is authoritative."
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore",
			   "GenModel", "http://www.eclipse.org/emf/2002/GenModel",
			   "Nasdanika", "urn:org.nasdanika"
		   });
	}

} //PlantumlPackageImpl
